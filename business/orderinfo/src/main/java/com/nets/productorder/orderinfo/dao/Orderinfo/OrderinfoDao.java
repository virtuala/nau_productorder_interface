package com.nets.productorder.orderinfo.dao.Orderinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Orderinfo;

public interface OrderinfoDao {

	List<Orderinfo> findAll();
	List<Orderinfo> search(@Param("pPojo")Orderinfo pPojo);
	List<Orderinfo> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Orderinfo pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Orderinfo pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/






}
