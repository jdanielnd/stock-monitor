package br.com.tectoid.sm.client;

import br.com.tectoid.sm.client.view.StockMonitorView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Stock_monitor implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootPanel.get().add(new StockMonitorView());
	}
}
