package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.WarehouseDao;
import com.nets.productorder.coreentity.entity.Warehouse;
import com.nets.productorder.userinfo.service.Userinfo.WarehouseService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class WarehouseServiceImpl implements WarehouseService{
	@Autowired
	private WarehouseDao sDao;
	public Warehouse sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

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
	


}
