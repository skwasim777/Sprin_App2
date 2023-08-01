package com.ioccontainer.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cache.interceptor.AbstractFallbackCacheOperationSource;
import org.springframework.core.io.ClassPathResource;

import com.customer.app.Customer;
import com.order.app.Order;
import com.product.app.Product;

public class IOCContainer {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("order-proccessing.xml"));
		Customer cs = (Customer) factory.getBean("customer");
		System.out.println("Customer Details Are\t");
		System.out.println("====================================================================");
//		System.out.println(cs.hashCode());
		System.out.println(cs.toString());
		System.out.println("====================================================================");

		System.out.println();

		System.out.println("Product Details Are\t");
		System.out.println("====================================================================");
		Product product = (Product) factory.getBean("product");
//		System.out.println(product.hashCode());
		System.out.println(product.toString());
		System.out.println();
		System.out.println("========================================================================");
		Order order = (Order) factory.getBean("order");
		System.out.println(order.toString());
	}
}
