package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product) ; 
	void update(Product product) ; 
	void delete(Product product) ; 
	
	Product get(int id) ; 
	List<Product> getAll() ; 
	// Product[] getAll() ; -------> kullanılamaz. ürün eklemek istendiğinde patlayacaktır.  
	//Array sabit yaplardır. Bir arraya 3 eleman eklediniz. 
	// 4. eleman eklerken array tamamen uçar gider.
}
