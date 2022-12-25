package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.warehouse.dao.Warehouse.WarehouseorderdetailDao;
import com.nets.productorder.coreentity.entity.Warehouseorderdetail;
import com.nets.productorder.warehouse.service.Warehouse.WarehouseorderdetailService;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class WarehouseorderdetailServiceImpl implements WarehouseorderdetailService{
	@Autowired
	private WarehouseorderdetailDao sDao;
	public Warehouseorderdetail sPOJO;
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
	public int OnAdd(Warehouseorderdetail pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Warehouseorderdetail pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Warehouseorderdetail> getFindAll(){

		List<Warehouseorderdetail> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Warehouseorderdetail OnNormal(String pId){

		List<Warehouseorderdetail> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Warehouseorderdetail();
		}

		return (Warehouseorderdetail) tmpList.get(0);
	}
	


}
