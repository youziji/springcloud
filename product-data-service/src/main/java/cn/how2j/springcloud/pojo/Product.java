package cn.how2j.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int id;
	private String name;
	private int price;
	
//	public Product() {
//		
//	}
//	
//	public Product(int id,String name,int price) {
//		this.id=id;
//		this.name=name;
//		this.price=price;
//	}
//	
//	public void setId(int id) {
//		this.id=id;
//	}
//	
//	public int getId() {
//		return this.id;
//	}
//	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public void setPrice(int price) {
//		this.price=price;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}

}
