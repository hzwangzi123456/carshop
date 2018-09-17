package com.alibaba.edas.carshop.itemcenter.service;


import com.alibaba.edas.carshop.itemcenter.model.Item;
import org.springframework.stereotype.Service;

/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public Item getItemById(long id ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
	@Override
	public Item getItemByName( String name ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
}
