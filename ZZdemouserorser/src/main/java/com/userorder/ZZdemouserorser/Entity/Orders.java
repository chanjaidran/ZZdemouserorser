package com.userorder.ZZdemouserorser.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String productname;
	int price;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "userorders",joinColumns = @JoinColumn(name="orderid",referencedColumnName = "id"),
	
	inverseJoinColumns = @JoinColumn(name="userid",referencedColumnName = "id"))
	@JsonIgnore
	private Endusers endusers;
	
	
	
	
	
	public Orders() {
		super();
		
	}
	
	
	
	

	

}
