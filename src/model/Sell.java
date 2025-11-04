package model;

import java.util.List;

public class Sell {
	private List<ItemSell> sells;
	private double totalSelled;
	
	public Sell(List<ItemSell> sells) {
		this.sells = sells;
		amountSelled(sells);
	}

	public List<ItemSell> getISells() {
		return sells;
	}
	
	public double getTotalSelled() {
		return totalSelled;
	}

	private void amountSelled(List<ItemSell> sells) {
		double value = 0;
		for(ItemSell s : sells) {
			value += s.getTotalValue();
		}
		totalSelled = value;
	}
	
	@Override
	public String toString() {
		String a = null;
		for(ItemSell s : sells) {
			a = s.getProduct().getName() + "---" + s.getQuantity() + "---" + s.getProduct().getPrice() + "---" + s.getTotalValue();
		}
		return a;
	}
}
