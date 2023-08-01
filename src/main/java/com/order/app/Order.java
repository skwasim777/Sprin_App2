package com.order.app;

import com.customer.app.Customer;
import com.product.app.Product;

public class Order {
		private String orderId;
		private Product product;
		private Customer customr;
		private double netPrice;
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public Customer getCustomr() {
			return customr;
		}
		public void setCustomr(Customer customr) {
			this.customr = customr;
		}
		public double getNetPrice() {
			return netPrice;
		}
		public void setNetPrice(double netPrice) {
			this.netPrice = netPrice;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", product=" + product + ", customr=" + customr + ", netPrice="
					+ netPrice + "]";
		}
		
		
}
