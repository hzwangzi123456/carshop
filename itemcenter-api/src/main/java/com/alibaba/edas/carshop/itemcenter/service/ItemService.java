package com.alibaba.edas.carshop.itemcenter.service;

import com.alibaba.edas.carshop.itemcenter.model.Item;

/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public interface ItemService {

	public Item getItemById(long id );
	
	public Item getItemByName( String name );
	
}
