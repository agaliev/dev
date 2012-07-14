package de.galiev.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	protected List<Ware> items;
	protected Long id;
	protected float total;
	protected WareDAO wareDAO;
	
	public Cart(){
		items = new ArrayList<Ware>();
		wareDAO = new WareDAOImpl();
	}
	
	public List<Ware> getItems() {
		return items;
	}

	public void setItems(List<Ware> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void addItem(Ware position){
		items.add(position);
		total = total + position.getPrice();
	}
}
