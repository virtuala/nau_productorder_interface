package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Product;

public interface ProductDao {

	List<Product> findAll();
	List<Product> search(@Param("pPojo")Product pPojo);
	List<Product> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Product pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Product pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Map<String,Object>> searchWithWarehouse();






}
