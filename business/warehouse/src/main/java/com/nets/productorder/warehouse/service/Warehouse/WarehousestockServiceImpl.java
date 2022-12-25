package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.warehouse.dao.Warehouse.WarehousestockDao;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.coreentity.entity.Warehousestock;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class WarehousestockServiceImpl implements WarehousestockService{
	@Autowired
	private WarehousestockDao sDao;
	public Warehousestock sPOJO;
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
	public int OnAdd(Warehousestock pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Warehousestock pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Warehousestock> getFindAll(){

		List<Warehousestock> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Warehousestock OnNormal(String pId){

		List<Warehousestock> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Warehousestock();
		}

		return (Warehousestock) tmpList.get(0);
	}

	/***/
	@Override
	public List<Map<String ,Object>> searchCount(int pProductID){
		return this.sDao.searchCount(pProductID);
	}
	@Override
	public List<Map<String ,Object>> searchByProductID(int pProductID){
		return this.sDao.searchByProductID(pProductID);
	}
	@Override
	public List<Map<String ,Object>> searchByProductIDWarehouseID(int pProductID,int pWarehouseID){
		return this.sDao.searchByProductIDWarehouseID(pProductID,pWarehouseID);
	}


}
