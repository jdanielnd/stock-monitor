package br.com.tectoid.sm.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import br.com.tectoid.sm.client.model.StockData;

public class DataAcquisition {
	private String mainAddress= "http://finance.yahoo.com/d/quotes.csv?";
	private String stocksList="s=";
	private String defaultOptions="&f=d1l1c1p2nohgpvx"; //Date Last Trade Price change Change% Name Open High Low Close Volume Stock Exchange
	private String address;
	private List<String> symbols;
	
	public DataAcquisition(List<String> symbols) {
		
		for(String stock : symbols) {
			stocksList = stocksList + stock + "+";
		}
		stocksList= stocksList.substring(0, stocksList.length()-1);
		this.address = mainAddress + stocksList + defaultOptions;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public List<StockData> getData() throws IOException {
		URL url = new URL(this.address);
		InputStreamReader in = new InputStreamReader(url.openStream());
		BufferedReader buff = new BufferedReader(in);
		CSVReader reader = new CSVReader(buff);
		List<String[]> resultado = reader.readAll();
		List<StockData> dados = new ArrayList<StockData>();
		for(String[] linha : resultado){
			StockData dado = new StockData();
			dado.setDate(linha[0]);
			dado.setPrice(Double.parseDouble(linha[1]));
			dado.setChange(linha[2]);
			dado.setChangePercentage(linha[3]);
			dado.setSymbol(linha[4]);
			dado.setClose(Double.parseDouble(linha[5]));
			dado.setOpen(Double.parseDouble(linha[6]));
			dado.setVolume(Double.parseDouble(linha[7]));
			dado.setHigh(Double.parseDouble(linha[8]));
			dado.setLow(Double.parseDouble(linha[9]));
			dados.add(dado);
			
		}
		return dados;

	}
	
	public static void main(String[] args) {
		List<String> stocks = new ArrayList<String>();
		stocks.add("GOOG");
		stocks.add("ABV");
		DataAcquisition da = new DataAcquisition(stocks);
		System.out.println(da.getAddress());
		try {
			List<StockData> sd = da.getData();
			for(StockData dado : sd){
				System.out.println(dado.getPrice());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
