package io.github.juneau001.burgers.services.impl;

import io.github.juneau001.burgers.business.Sauce;
import io.github.juneau001.burgers.services.IService;

import java.util.ArrayList;
import java.util.List;

public class SauceService implements IService<Sauce> {
	
	private static List<Sauce> items = new ArrayList<>();
	
	public SauceService() {
	}

	public static void init() {
		items.add(new Sauce("Ketchup"));
		items.add(new Sauce("Mayo"));
		items.add(new Sauce("Samouraï"));
	}
	
	@Override
	public Sauce getItem(Long id) {
		 for (Sauce item : items) {
             if (item.getId().equals(id)) {
                    return item;
             }
		 }	
		 return null;
		
	}

	@Override
	public List<Sauce> getList() {
		// TODO Auto-generated method stub
		return items;
	}

}
