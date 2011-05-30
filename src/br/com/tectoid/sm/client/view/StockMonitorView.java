package br.com.tectoid.sm.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class StockMonitorView extends Composite {

	private static StockMonitorViewUiBinder uiBinder = GWT
			.create(StockMonitorViewUiBinder.class);

	interface StockMonitorViewUiBinder extends
			UiBinder<Widget, StockMonitorView> {
	}

	@UiField Label title;
	@UiField Label stockNameLabel;
	@UiField TextBox stockName;
	@UiField Button addButton;
	@UiField FlexTable stocksTable;

	public StockMonitorView() {
		initWidget(uiBinder.createAndBindUi(this));
		title.setText("Stocks Monitor");
		addButton.setText("Add");
		stockNameLabel.setText("Stock Code:");
		stocksTable.setText(0, 0, "Name");
	}

	@UiHandler("addButton")
	void onClick(ClickEvent e) {
		stocksTable.setText(stocksTable.getRowCount(), 0, stockName.getText());
	}


}
