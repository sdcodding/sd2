package project_one;

import java.util.HashSet;

public class Product {
	private String name;
	private int price;
	
	public Product(String name){
		this.name=name;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Product pd=(Product)obj;
		return pd.name.equals(this.name);
		
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
		
	}
	
	
	public static void main(String[] args) {
		Product pd1=new Product("pen");
		Product pd2=new Product("pen");
		pd1=new Product("pen");
		
		System.out.println(pd1);
		System.out.println(pd2);
		System.out.println("pd1 hashcode = "+pd1.hashCode());
		System.out.println("pd2 hashcode = "+pd2.hashCode());
		
		System.out.println(pd1.equals(pd2));
		
		HashSet<Product> pd=new HashSet<>();
		pd.add(pd1);
		pd.add(pd2);
		System.out.println(pd);
		
			
	}

}
