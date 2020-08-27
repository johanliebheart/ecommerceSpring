package com.store.demo.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	private String name;
	
	private float price;
	
	private int stock;
	
	@Column(name = "picByte", length = 1000)
	private byte[] picByte;

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProducto) {
		this.idProduct = idProducto;
	}

	public String getName() {
		return name;
	}

	public void setName(String nombre) {
		this.name = nombre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float precio) {
		this.price = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	
	
	
}
