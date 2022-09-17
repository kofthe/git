package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
		private ProductDao productDao ; 
		
	private LoggerService loggerservice; 
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
			super();
			this.productDao = productDao;
			this.loggerservice = loggerService ; 
			
		}

	public void add(Product product) {
		// iş kodları yazılacak burada. 
		if(product.getCategoryId()==1) {
			System.out.println("Bu Kategoride Ürün Kabul Edilmemektedir.");
			return; 
		}
	
		this.productDao.add(product);
		this.loggerservice.logToSystem("Ürün Eklendi "+product.getName()) ; 
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
