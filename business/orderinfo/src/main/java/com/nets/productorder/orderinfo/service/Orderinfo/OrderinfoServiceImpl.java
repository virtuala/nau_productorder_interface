package com.nets.productorder.orderinfo.service.Orderinfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.*;
import com.nets.productorder.orderinfo.dao.Orderinfo.OrderinfoDao;
import com.nets.productorder.orderinfo.dao.Orderinfo.OrderinfodetailDao;
import com.nets.productorder.orderinfo.rest.Productline.ProductlineRestTemplate;
import com.nets.productorder.orderinfo.rest.Productline.ProductlineorderdetailRestTemplate;
import com.nets.productorder.orderinfo.rest.Warehouse.WarehouseorderRestTemplate;
import com.nets.productorder.orderinfo.rest.Warehouse.WarehousestockRestTemplate;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderinfoServiceImpl implements OrderinfoService{
	@Autowired
	private OrderinfodetailDao sDaoOrderinfodetail;
	@Autowired
	private OrderinfoDao sDao;
	public Orderinfo sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/***/
	@Value("${productorder.warehouse.name}")
	public String sConfigModuleWarehouse;
	@Value("${productorder.productline.name}")
	public String sConfigModuleProductline;
	@Autowired
	public RestTemplate sRestTemplate;
	public netsTokenEntity sTokenEntity;

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }
	@Override
	public void setTokenEntity(netsTokenEntity pTokenEntity){ this.sTokenEntity=pTokenEntity; return; }

	@Override
	public int OnAdd(Orderinfo pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Orderinfo pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Orderinfo> getFindAll(){

		List<Orderinfo> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Orderinfo OnNormal(String pId){

		List<Orderinfo> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Orderinfo();
		}

		return (Orderinfo) tmpList.get(0);
	}

	/**/
	@Override
	public int OnAddJson(Object pJson){
		Map<String,String> tmpRow0;
		Map<String,Object> tmpRowStock;
		Map<String,Object> tmpRowProductline;
		Map<String,Object> tmpRowProductlineorderdetail;
		int tmpInt;
		long tmpTime;
		double tmpTimeDouble;
		Date tmpDateStart;
		int tmpCount;
		int tmpCountOrder;
		int tmpCountTemp;
		int tmpProductCount;
		int tmpIdStock;
		boolean tmpBoolCanDetailA=true;
		boolean tmpBoolCanDetailB=true;
		boolean tmpBoolHasDetail=false;
		String tmpStrSql;
		List tmpList0=(List)pJson;
		List<Map<String,Object>> tmpData0;
		List<Map<String,Object>> tmpData1;
		Map<String,Object> tmpMap1;
		SimpleDateFormat tmpDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Orderinfo tmpPojoOrderinfo;
		Orderinfodetail tmpPojoOrderinfodetail;
		List<Productline> tmpListProductline;
		Productline tmpPojoProductline;
		List<Productlineorderdetail> tmpListOrderdetail;
		Productlineorderdetail tmpPojoProductlineorderdetail;
		Productlineorderdetail tmpPojoProductlineorderdetailSearch;
		List<Warehousestock> tmpListWarehousestock;
		Warehousestock tmpPojoWarehousestock;
		Warehouseorder tmpPojoWarehouseorder;

		Integer tmpIdProductlineorderdetail;
		Integer tmpIdOrderinfodetail;
		Integer tmpIdOrderinfo;
		List<Integer> tmpListIdsOrderinfo=new ArrayList<Integer>();

		WarehousestockRestTemplate tmpRestStock=new WarehousestockRestTemplate();
		WarehouseorderRestTemplate tmpRestWarehouseorder=new WarehouseorderRestTemplate();
		ProductlineRestTemplate tmpRestProductline=new ProductlineRestTemplate();
		ProductlineorderdetailRestTemplate tmpRestProductlineorderdetail=new ProductlineorderdetailRestTemplate();

		tmpRestStock.Initail(this.sRestTemplate,this.sConfigModuleWarehouse,"warehousestock","","");
		tmpRestStock.InitailTokenEntity(this.sTokenEntity);
		tmpRestWarehouseorder.Initail(this.sRestTemplate,this.sConfigModuleWarehouse,"warehouseorder","","");
		tmpRestWarehouseorder.InitailTokenEntity(this.sTokenEntity);
		tmpRestProductline.Initail(this.sRestTemplate,this.sConfigModuleProductline,"productline","","");
		tmpRestProductline.InitailTokenEntity(this.sTokenEntity);
		tmpRestProductlineorderdetail.Initail(this.sRestTemplate,this.sConfigModuleProductline,"productlineorderdetail","","");
		tmpRestProductlineorderdetail.InitailTokenEntity(this.sTokenEntity);

		for (Object Row0 : tmpList0){
			tmpRow0=(Map<String,String>)Row0;
			tmpCount=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("Count")),0);
			tmpProductCount=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("ProductCount")),0);
			tmpIdProductlineorderdetail=0;
			tmpIdOrderinfodetail=0;

			if(tmpCount>0){
				//新增出库单，修改库存
				tmpData0=tmpRestStock.searchByProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("shstID")),0));
				tmpCountOrder=tmpCount;
				for (Object RowStock : tmpData0){
					tmpRowStock = (Map<String, Object>) RowStock;
					if(tmpCountOrder>0 && this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowStock.get("whstCount")),0)>0) {
						tmpPojoWarehouseorder=new Warehouseorder();
						tmpPojoWarehousestock=new Warehousestock();
						tmpPojoWarehouseorder.setWhotType(1);
						tmpPojoWarehouseorder.setWhotWarehouseID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowStock.get("whstWarehouseID")),0));
						tmpPojoWarehouseorder.setWhotProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("shstID")),0));

						tmpIdStock=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowStock.get("whstID")),0);

						tmpCountTemp=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowStock.get("whstCount")),0);
						if(tmpCountTemp>=tmpCountOrder){
							//库存足够
							tmpPojoWarehouseorder.setWhotCount(tmpCountOrder); //足够，设置单据数量为总请求数

							tmpCountTemp=tmpCountTemp-tmpCountOrder;
							tmpPojoWarehousestock.setWhstCount(tmpCountTemp); //足够，设置库存数量为减去总请求数的数量
						}else{
							//库存不足
							tmpPojoWarehouseorder.setWhotCount(tmpCountTemp); //不足，设置单据数量为当前库存数
							tmpCountOrder=tmpCountOrder-tmpCountTemp; //设置下一数量，为请求总数减去当前库存数

							tmpPojoWarehousestock.setWhstCount(0); //设置当前库存为0

						}
						//生成出库单
						tmpRestWarehouseorder.OnAdd(tmpPojoWarehouseorder);
						//更新库存
						tmpRestStock.OnModify(tmpPojoWarehousestock,tmpIdStock);

					}
				}
				tmpBoolCanDetailA=true;
			}
			if(tmpProductCount>0){
				//新增生产单据
				tmpData0=tmpRestProductline.searchById(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("pltID")),0));
				if(tmpData0.size()>0){
					tmpRowProductline=(Map<String,Object>)tmpData0.get(0);

					tmpListOrderdetail=tmpRestProductlineorderdetail.searchLastComplete(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("shstID")),0));
					tmpDateStart=new Date();
					if(tmpListOrderdetail.size()>0){
						/*
						tmpPojoProductlineorderdetailSearch=tmpListOrderdetail.get(0);
						tmpDateStart=tmpPojoProductlineorderdetailSearch.getPlodtCompleteTime();
						*/
						tmpMap1=(Map<String, Object>) tmpListOrderdetail.get(0);
						tmpDateStart=this.sApp_Code.ToDatetime(this.sApp_Code.ObjectToString(tmpMap1.get("plodtCompleteTime")),tmpDateFormat.format(new Date()));;
					}

					//计算完成时间
					tmpTime=this.sApp_Code.DateToInt(tmpDateStart);
					tmpTimeDouble=Math.ceil(
							this.sApp_Code.ToDouble(this.sApp_Code.ObjectToString(tmpRow0.get("ProductCount")),0.00f)*
									this.sApp_Code.ToDouble(this.sApp_Code.ObjectToString(tmpRow0.get("shstTimeStandard")),0.00f)*
									this.sApp_Code.ToDouble(this.sApp_Code.ObjectToString(tmpRowProductline.get("pltProductivity")),0.00f)
					);
					tmpTime=tmpTime+new Double(tmpTimeDouble).longValue()*86400000;

					tmpPojoProductlineorderdetail=new Productlineorderdetail();
					tmpPojoProductlineorderdetail.setPlodtProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("shstID")),0));
					tmpPojoProductlineorderdetail.setPlodtProductlineID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowProductline.get("pltID")),0));
					tmpPojoProductlineorderdetail.setPlodtCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("ProductCount")),0));
					tmpPojoProductlineorderdetail.setPlodtStatus(0);
					tmpPojoProductlineorderdetail.setPlodtCompleteTime(this.sApp_Code.IntToDate(tmpTime));
					tmpIdProductlineorderdetail=tmpRestProductlineorderdetail.OnAdd(tmpPojoProductlineorderdetail);
				}
				tmpBoolCanDetailB=true;
			}
			if(tmpBoolCanDetailA || tmpBoolCanDetailB){
				//新增订单明细
				tmpPojoOrderinfodetail=new Orderinfodetail();
				tmpPojoOrderinfodetail.setShsodtProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("shstID")),0));
				tmpPojoOrderinfodetail.setShsodtCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("Count")),0));
				tmpPojoOrderinfodetail.setShsodtProductlineID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("pltID")),0));
				tmpPojoOrderinfodetail.setShsodtProductCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("ProductCount")),0));
				tmpIdOrderinfodetail=this.sDaoOrderinfodetail.add(tmpPojoOrderinfodetail,"N_");
				tmpListIdsOrderinfo.add(tmpIdOrderinfodetail);
				tmpBoolHasDetail=true;
			}
			if(tmpBoolCanDetailB){
				tmpPojoProductlineorderdetail=new Productlineorderdetail();
				tmpPojoProductlineorderdetail.setPlodtOrderdetailID(tmpIdOrderinfodetail);
				tmpRestProductlineorderdetail.OnModify(tmpPojoProductlineorderdetail,tmpIdProductlineorderdetail);
			}


		}
		if(tmpBoolHasDetail){
			//新增订单主体
			tmpPojoOrderinfo=new Orderinfo();
			tmpIdOrderinfo=this.sDao.add(tmpPojoOrderinfo,"N_");

			for(Integer RowInt : tmpListIdsOrderinfo){
				tmpPojoOrderinfodetail=new Orderinfodetail();
				tmpPojoOrderinfodetail.setShsodtOrderinfoID(tmpIdOrderinfo);
				this.sDaoOrderinfodetail.modify(tmpPojoOrderinfodetail,RowInt);
			}
		}


		return 0;
	}

}
