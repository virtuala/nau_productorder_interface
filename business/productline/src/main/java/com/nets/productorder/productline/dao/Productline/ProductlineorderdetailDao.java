package com.nets.productorder.productline.dao.Productline;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Productlineorderdetail;

public interface ProductlineorderdetailDao {

	List<Productlineorderdetail> findAll();
	List<Productlineorderdetail> search(@Param("pPojo")Productlineorderdetail pPojo);
	List<Productlineorderdetail> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Productlineorderdetail pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Productlineorderdetail pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Productlineorderdetail> searchLastComplete(@Param("pProductlineID")int pProductlineID);
	List<Map<String,Object>> searchById(@Param("pId")int pId);






}
