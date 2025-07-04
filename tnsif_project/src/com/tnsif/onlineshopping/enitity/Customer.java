package com.tnsif.onlineshopping.enitity;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User  {
	    private String address;
		private ShoppingCart shoppingCart;
		private List<Order> orders;
		
		public Customer(int userId, String username, String email,String address) {
			super(userId, username, email);
			this.address=address;
			this.shoppingCart=new ShoppingCart();
			this.orders=new ArrayList<>();
			
			}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public ShoppingCart getShoppingCart() {
			return shoppingCart;
		}
		public List<Order> getOrders() {
			return orders;
		}
		public void addOrders(Order order) {
			
			orders.add(order);
		}
		
	
	
	
	
}
