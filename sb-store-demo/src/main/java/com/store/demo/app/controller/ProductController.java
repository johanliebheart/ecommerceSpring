package com.store.demo.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.store.demo.app.models.entity.Product;
import com.store.demo.app.models.service.IProductService;

@RestController
@CrossOrigin(origins = "http://yipitest.com:4200") 
@RequestMapping(path = "products")
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	private byte[] bytes;
	
	@GetMapping("/get")
	public List<Product> getProduct(){
		return productService.findAll();
	}
	@PostMapping("/upload")
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}
	
	@PostMapping("/add")
	public void createProduct(@RequestBody Product product) throws IOException{
		product.setPicByte(this.bytes);
		productService.save(product);
		this.bytes = null;
	}
	
	@DeleteMapping(path= {"/{id}"})
	public Product deleteProduct(@PathVariable("id") int id) {
		Product product = productService.findOne(id);
		productService.delete(id);
		return product;
	}
	
	@PutMapping("/update")
	public void updateProduct(@RequestBody Product product) {
		productService.save(product);
	}

}
