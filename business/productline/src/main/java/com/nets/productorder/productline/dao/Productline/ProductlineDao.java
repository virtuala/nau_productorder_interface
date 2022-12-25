package com.nets.productorder.productline.dao.Productline;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Productline;

public interface ProductlineDao {

	List<Productline> findAll();
	List<Productline> search(@Param("pPojo")Productline pPojo);
	List<Productline> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Productline pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Productline pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Map<String,Object>> searchWithProductlineorderdetail();
	List<Map<String,Object>> searchById(@Param("pId")int pId);






}
