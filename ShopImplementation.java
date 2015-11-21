package uk.ac.cam.gla23.oopjava.supervision2;

import java.util.ArrayList;
import uk.ac.cam.gla23.oopjava.supervision2.employees.DepartmentManager;
import uk.ac.cam.gla23.oopjava.supervision2.employees.ShopAssistant;
import uk.ac.cam.gla23.oopjava.supervision2.employees.StoreManager;

public class ShopImplementation {

	public static void main(String[] args) {
		ShopAssistant baker1 = new ShopAssistant("bob",20000F);
		ShopAssistant baker2 = new ShopAssistant("jim",20000F);
		ShopAssistant sa1 = new ShopAssistant("fred",20000F);
		ShopAssistant sa2 = new ShopAssistant("harry",20000F);
		
		Product product1     = new Product("bread","0101010101",1F,0.2F);
		Product product2     = new Product("pasta","0101010102",1F,0.2F);
		Product product3     = new Product("juice","0101010103",1F,0.2F);
		Product product4     = new Product("milk" ,"0101012345",1F,0.2F);
		
		ArrayList<Product> l1 = new ArrayList<Product>();
		ArrayList<Product> l2 = new ArrayList<Product>();
		l1.add(product1);
		l2.add(product2);
		l2.add(product3);
		l2.add(product4);
		
		ArrayList<ShopAssistant> l3 = new ArrayList<ShopAssistant>();
		ArrayList<ShopAssistant> l4 = new ArrayList<ShopAssistant>();
		l3.add(baker1);
		l3.add(baker2);
		l4.add(sa1);
		l4.add(sa2);
		
		Department bakery  = new Department("Bakery"    , new DepartmentManager("Top Baker",30000F)          , l3, l1);
		Department mainBit = new Department("Main Store", new DepartmentManager("Chief ShelfStacker",300000F), l4, l2);
		ArrayList<Department> depts = new ArrayList<Department>();
		depts.add(bakery);
		depts.add(mainBit);
		Store sainsburies = new Store(depts, new StoreManager("Mr. Sainsbury", 10000000000F));
		
		System.out.println(sainsburies);
		
	}

}
