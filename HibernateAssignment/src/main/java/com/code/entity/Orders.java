package com.code.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="orders")
public class Orders {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int order_id;
	@Column(name="orderDate", nullable=false)
	private String orderDate;
	@Column(name="totalAmount", nullable= false)
	private double totalAmount;
	//Foreign key
	@ManyToOne
	@JoinColumn(name="userId")
	private Users user;
	
	
	
	public Orders() {
		
		this.orderDate=null;
		this.totalAmount=0;
		this.user = null;
	}



	public Orders(String orderDate, double totalAmount, Users user) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.user = user;
	}



	public int getId() {
		return order_id;
	}



	public void setId(int id) {
		this.order_id = id;
	}



	public String getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}



	public double getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Orders [id=" + order_id + ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + ", user=" + user
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
