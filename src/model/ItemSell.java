package model;

public class ItemSell {
	private Product product;
	private int quantity;
	private double totalValue;
	
	public ItemSell(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		
		amountValue(product, quantity);
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalValue() {
		return totalValue;
	}

	private void amountValue(Product product, int quantity) {
		totalValue = product.getPrice() * quantity;
	}
}
