package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;

import nLayeredDemo.entities.concretes.Product;

public class Main {
// Test için kullanılacak. Console uygulaması olarak düşünebilirsin. Klasörleme mantığı.
	//Kodları parçalamak için paketleme mantığını kullanıyoruz. Manager olan veya tek başına producy plan yapıyı burada kullanacağız.
	public static void main(String[] args) {
		
		//Spring IoC ile çözüklecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter()) ;
		
		Product product = new Product(1,2,"Elma",12,50) ; 
		productService.add(product);

	}

}
