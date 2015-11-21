package uk.ac.cam.gla23.oopjava.supervision2;

import java.util.ArrayList;
import java.util.List;

import uk.ac.cam.gla23.oopjava.supervision2.employees.StoreManager;

public class Store {
	
	List<Department> dapartments;
	StoreManager manager;
	
	public Store(ArrayList<Department> dapartments, StoreManager manager) {
		super();
		this.dapartments = dapartments;
		this.manager = manager;
	}

	public List<Department> getDapartments() {
		return dapartments;
	}

	public void addDepartment(Department department) {
		this.dapartments.add(department);
	}
	
	public void removeDepartment(Department department) {
		this.dapartments.remove(department);
	}
	
}
