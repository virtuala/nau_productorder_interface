package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.*;
import com.nets.productorder.userinfo.dao.Userinfo.WarehousestockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.ProductDao;
import com.nets.productorder.userinfo.service.Userinfo.ProductService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao sDao;
	@Autowired
	private WarehousestockDao sDaoStock;
	public Product sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Product pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Product pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Product> getFindAll(){

		List<Product> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Product OnNormal(String pId){

		List<Product> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Product();
		}

		return (Product) tmpList.get(0);
	}

	/**/
	@Override
	public List<Map<String,Object>> searchWithWarehouse(){
		int Coun0;
		int tmpId;
		Map<String ,Object> tmpMapRow;
		List<Map<String ,Object>> tmpListStock;
		Map<String ,Object> tmpMapStock;

		List<Map<String,Object>> tmpListReturn=this.sDao.searchWithWarehouse();

		Coun0=0;
		while(tmpListReturn.size()>Coun0){
			tmpMapRow=tmpListReturn.get(Coun0);
			tmpId=this.sApp_Code.ToInt32(tmpMapRow.get("shstID").toString(),0);
			tmpListStock=this.sDaoStock.searchCount(tmpId);
			if(tmpListStock.size()>0) {
				tmpMapStock=tmpListStock.get(0);
				if(tmpMapStock==null){
					tmpMapRow.put("whstCount","0");
				}else {
					tmpMapRow.put("whstCount", this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpMapStock.get("ACount")), 0));
				}
			}
			tmpListReturn.set(Coun0,tmpMapRow);
			Coun0++;
		}

		return tmpListReturn;
	}


}
