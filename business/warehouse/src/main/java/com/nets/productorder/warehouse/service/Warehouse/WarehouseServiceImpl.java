package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.warehouse.dao.Warehouse.WarehouseDao;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.coreentity.entity.Warehouse;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class WarehouseServiceImpl implements WarehouseService{
	@Autowired
	private WarehouseDao sDao;
	public Warehouse sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/***/
	@Value("${productorder.warehouse.name}")
	public String sConfigRestModule;
	@Autowired
	public RestTemplate sRestTemplate;
	public netsTokenEntity sTokenEntity;

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }
	@Override
	public void setTokenEntity(netsTokenEntity pTokenEntity){ this.sTokenEntity=pTokenEntity; return; }

	@Override
	public int OnAdd(Warehouse pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Warehouse pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Warehouse> getFindAll(){

		List<Warehouse> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Warehouse OnNormal(String pId){

		List<Warehouse> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Warehouse();
		}

		return (Warehouse) tmpList.get(0);
	}

	/***/
	@Override
	public List<Map<String,Object>> searchByFirstId(){
		return this.sDao.searchByFirstId();
	}



}
