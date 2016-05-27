
public class Product {

	private String name;
	private String size;
	private String color;
	
	private Product(Builder builder) {
		super();
		this.name = builder.name;
		this.size = builder.size;
		this.color = builder.color;
	}
	
	public String toString(){
		return String.format("%s %s %s", name, size, color);
	}
	
	public static class Builder{
		private String name = "";
		private String size = "";
		private String color = "";
		
		public Builder(String name){
			this.name = name;
		}
		
		public Builder color(String color){
			this.color = color;
			return this;
		}
		
		public Builder size(String size){
			this.size = size;
			return this;
		}
		
		public Product build(){
			return new Product(this);
		}
	}
	
	public static void main(String[] args) {
		Product p = new Product.Builder("Chair").size("Large").color("Yellow").build();
		System.out.println(p);
		
	}
	
}
