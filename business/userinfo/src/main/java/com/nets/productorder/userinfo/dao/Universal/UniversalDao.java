package com.nets.productorder.userinfo.dao.Universal;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UniversalDao {

	List<Map<String,Object>> Search(@Param("pSQL")String pSQL);
	int Execute(@Param("pSQL")String pSQL);

	/***/






}
