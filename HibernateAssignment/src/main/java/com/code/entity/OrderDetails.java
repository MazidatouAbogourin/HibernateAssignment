package com.code.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="orderDetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderDetailsId")
	private int orderDetailsId;
	@Column(name="quantity", nullable=false)
	private int quantity;
	@Column(name="unitPrice", nullable=false)
	private double unitPrice;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Orders order;
	
	@ManyToOne 
	@JoinColumn(name="productId")
	private Product product;
	
	public OrderDetails() {
		this.quantity =0 ;
		this.unitPrice=0;
		this.order=null;
		this.product=null;
		
	}

	public OrderDetails(int quantity, double unitPrice, Orders order, Product product) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.order = order;
		this.product = product;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", order=" + order + ", product=" + product + "]";
	}
	
	

	

	
	
	
}
