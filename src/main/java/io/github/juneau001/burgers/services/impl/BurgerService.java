package io.github.juneau001.burgers.services.impl;

import io.github.juneau001.burgers.business.Burger;
import io.github.juneau001.burgers.services.IService;

import java.util.ArrayList;
import java.util.List;

public class BurgerService implements IService<Burger> {
	
	private static List<Burger> items = new ArrayList<>();
	public BurgerService() {
	}

	public static void init() {
		items.add(new Burger("Burger Guacamole", 6.5f));
		items.add(new Burger("Quarter-Pounder", 5.1f));
		items.add(new Burger("BBQ-Burger", 7f));
		items.add(new Burger("Cheeseburger", 2f));
	}
	
	@Override
	public Burger getItem(Long id) {
		 for (Burger item : items) {
             if (item.getId().equals(id)) {
                    return item;
             }
		 }	
		 return null;
		
	}

	@Override
	public List<Burger> getList() {
		// TODO Auto-generated method stub
		return items;
	}

}
