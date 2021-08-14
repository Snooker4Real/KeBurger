package io.github.juneau001.burgers.services;

import java.util.List;

public interface IService <T>{
	public T getItem(Long id);
	public List<T> getList();
}
