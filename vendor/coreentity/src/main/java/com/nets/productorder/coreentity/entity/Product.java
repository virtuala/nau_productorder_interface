package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Product {
	public String sTableDir="Cms";
	public String sTableName="product";
	public String t="product";
	public String sColumnHead="shst";
	public String sColumnHead1="";
	public String c="shst";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//shstID
	private Integer shstID;
	private Boolean shstID_isset=false;
	private String shstID_orderby;
	private Boolean shstID_hascolumn=false;
	private String shstID_operators;
	public Integer getShstID() { return shstID; }
	public void setShstID(Integer shstID) { this.shstID=shstID; this.shstID_isset=true; }
	public void setShstID_Fix(String shstID) { this.shstID=this.sApp_Code.ToInt32(shstID,0); this.shstID_isset=true; }
	//shstName
	private String shstName;
	private Boolean shstName_isset=false;
	private String shstName_orderby;
	private Boolean shstName_hascolumn=false;
	private String shstName_operators;
	public String getShstName() { return shstName; }
	public void setShstName(String shstName) { this.shstName=shstName; this.shstName_isset=true; }
	public void setShstName_Fix(String shstName) { this.shstName=shstName; this.shstName_isset=true; }
	//shstNumCode
	private String shstNumCode;
	private Boolean shstNumCode_isset=false;
	private String shstNumCode_orderby;
	private Boolean shstNumCode_hascolumn=false;
	private String shstNumCode_operators;
	public String getShstNumCode() { return shstNumCode; }
	public void setShstNumCode(String shstNumCode) { this.shstNumCode=shstNumCode; this.shstNumCode_isset=true; }
	public void setShstNumCode_Fix(String shstNumCode) { this.shstNumCode=shstNumCode; this.shstNumCode_isset=true; }
	//shstPrice
	private Float shstPrice;
	private Boolean shstPrice_isset=false;
	private String shstPrice_orderby;
	private Boolean shstPrice_hascolumn=false;
	private String shstPrice_operators;
	public Float getShstPrice() { return shstPrice; }
	public void setShstPrice(Float shstPrice) { this.shstPrice=shstPrice; this.shstPrice_isset=true; }
	public void setShstPrice_Fix(String shstPrice) { this.shstPrice=this.sApp_Code.ToFloat(shstPrice,0.00F); this.shstPrice_isset=true; }
	//shstCost
	private Float shstCost;
	private Boolean shstCost_isset=false;
	private String shstCost_orderby;
	private Boolean shstCost_hascolumn=false;
	private String shstCost_operators;
	public Float getShstCost() { return shstCost; }
	public void setShstCost(Float shstCost) { this.shstCost=shstCost; this.shstCost_isset=true; }
	public void setShstCost_Fix(String shstCost) { this.shstCost=this.sApp_Code.ToFloat(shstCost,0.00F); this.shstCost_isset=true; }
	//shstTimeStandard
	private Float shstTimeStandard;
	private Boolean shstTimeStandard_isset=false;
	private String shstTimeStandard_orderby;
	private Boolean shstTimeStandard_hascolumn=false;
	private String shstTimeStandard_operators;
	public Float getShstTimeStandard() { return shstTimeStandard; }
	public void setShstTimeStandard(Float shstTimeStandard) { this.shstTimeStandard=shstTimeStandard; this.shstTimeStandard_isset=true; }
	public void setShstTimeStandard_Fix(String shstTimeStandard) { this.shstTimeStandard=this.sApp_Code.ToFloat(shstTimeStandard,0.00F); this.shstTimeStandard_isset=true; }
	//shstCreateBy
	private Integer shstCreateBy;
	private Boolean shstCreateBy_isset=false;
	private String shstCreateBy_orderby;
	private Boolean shstCreateBy_hascolumn=false;
	private String shstCreateBy_operators;
	public Integer getShstCreateBy() { return shstCreateBy; }
	public void setShstCreateBy(Integer shstCreateBy) { this.shstCreateBy=shstCreateBy; this.shstCreateBy_isset=true; }
	public void setShstCreateBy_Fix(String shstCreateBy) { this.shstCreateBy=this.sApp_Code.ToInt32(shstCreateBy,0); this.shstCreateBy_isset=true; }
	//shstCreateTime
	private Date shstCreateTime;
	private Boolean shstCreateTime_isset=false;
	private String shstCreateTime_orderby;
	private Boolean shstCreateTime_hascolumn=false;
	private String shstCreateTime_operators;
	public Date getShstCreateTime() { return shstCreateTime; }
	public void setShstCreateTime(Date shstCreateTime) { this.shstCreateTime=shstCreateTime; this.shstCreateTime_isset=true; }
	public void setShstCreateTime_Fix(String shstCreateTime) { this.shstCreateTime=this.sApp_Code.ToDatetime(shstCreateTime,this.sDateFormat.format(new Date())); this.shstCreateTime_isset=true; }
	//shstModifyBy
	private Integer shstModifyBy;
	private Boolean shstModifyBy_isset=false;
	private String shstModifyBy_orderby;
	private Boolean shstModifyBy_hascolumn=false;
	private String shstModifyBy_operators;
	public Integer getShstModifyBy() { return shstModifyBy; }
	public void setShstModifyBy(Integer shstModifyBy) { this.shstModifyBy=shstModifyBy; this.shstModifyBy_isset=true; }
	public void setShstModifyBy_Fix(String shstModifyBy) { this.shstModifyBy=this.sApp_Code.ToInt32(shstModifyBy,0); this.shstModifyBy_isset=true; }
	//shstModifyTime
	private Date shstModifyTime;
	private Boolean shstModifyTime_isset=false;
	private String shstModifyTime_orderby;
	private Boolean shstModifyTime_hascolumn=false;
	private String shstModifyTime_operators;
	public Date getShstModifyTime() { return shstModifyTime; }
	public void setShstModifyTime(Date shstModifyTime) { this.shstModifyTime=shstModifyTime; this.shstModifyTime_isset=true; }
	public void setShstModifyTime_Fix(String shstModifyTime) { this.shstModifyTime=this.sApp_Code.ToDatetime(shstModifyTime,this.sDateFormat.format(new Date())); this.shstModifyTime_isset=true; }




	/* column text extend */
	//shstID_Text
	private String shstID_Text;
	public String getShstID_Text() { if(this.shstID==null){ this.shstID_Text=""; } if(this.shstID_Text==null){ this.shstID_Text=this.shstID.toString(); } return this.shstID_Text; }
	public void setShstID_Text(String shstID_Text) { this.shstID_Text=shstID_Text; }
	//shstCreateBy_Text
	private String shstCreateBy_Text;
	public String getShstCreateBy_Text() { if(this.shstCreateBy==null){ this.shstCreateBy_Text=""; } if(this.shstCreateBy_Text==null){ this.shstCreateBy_Text=this.shstCreateBy.toString(); } return this.shstCreateBy_Text; }
	public void setShstCreateBy_Text(String shstCreateBy_Text) { this.shstCreateBy_Text=shstCreateBy_Text; }
	//shstModifyBy_Text
	private String shstModifyBy_Text;
	public String getShstModifyBy_Text() { if(this.shstModifyBy==null){ this.shstModifyBy_Text=""; } if(this.shstModifyBy_Text==null){ this.shstModifyBy_Text=this.shstModifyBy.toString(); } return this.shstModifyBy_Text; }
	public void setShstModifyBy_Text(String shstModifyBy_Text) { this.shstModifyBy_Text=shstModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setShstID_Fix(pValue);
		}else if(pKey.equals("Name")){ this.setShstName_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setShstNumCode_Fix(pValue);
		}else if(pKey.equals("Price")){ this.setShstPrice_Fix(pValue);
		}else if(pKey.equals("Cost")){ this.setShstCost_Fix(pValue);
		}else if(pKey.equals("TimeStandard")){ this.setShstTimeStandard_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setShstCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setShstCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setShstModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setShstModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getShstID()+"";
		}else if(pKey.equals("Name")){ return this.getShstName()+"";
		}else if(pKey.equals("NumCode")){ return this.getShstNumCode()+"";
		}else if(pKey.equals("Price")){ return this.getShstPrice()+"";
		}else if(pKey.equals("Cost")){ return this.getShstCost()+"";
		}else if(pKey.equals("TimeStandard")){ return this.getShstTimeStandard()+"";
		}else if(pKey.equals("CreateBy")){ return this.getShstCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getShstCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getShstModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getShstModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shstID_isset;
		}else if(pKey.equals("Name")){ return this.shstName_isset;
		}else if(pKey.equals("NumCode")){ return this.shstNumCode_isset;
		}else if(pKey.equals("Price")){ return this.shstPrice_isset;
		}else if(pKey.equals("Cost")){ return this.shstCost_isset;
		}else if(pKey.equals("TimeStandard")){ return this.shstTimeStandard_isset;
		}else if(pKey.equals("CreateBy")){ return this.shstCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.shstCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.shstModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.shstModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shstID_orderby;
		}else if(pKey.equals("Name")){ return this.shstName_orderby;
		}else if(pKey.equals("NumCode")){ return this.shstNumCode_orderby;
		}else if(pKey.equals("Price")){ return this.shstPrice_orderby;
		}else if(pKey.equals("Cost")){ return this.shstCost_orderby;
		}else if(pKey.equals("TimeStandard")){ return this.shstTimeStandard_orderby;
		}else if(pKey.equals("CreateBy")){ return this.shstCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.shstCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.shstModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.shstModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shstID_hascolumn;
		}else if(pKey.equals("Name")){ return this.shstName_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.shstNumCode_hascolumn;
		}else if(pKey.equals("Price")){ return this.shstPrice_hascolumn;
		}else if(pKey.equals("Cost")){ return this.shstCost_hascolumn;
		}else if(pKey.equals("TimeStandard")){ return this.shstTimeStandard_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.shstCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.shstCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.shstModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.shstModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shstID_operators;
		}else if(pKey.equals("Name")){ return this.shstName_operators;
		}else if(pKey.equals("NumCode")){ return this.shstNumCode_operators;
		}else if(pKey.equals("Price")){ return this.shstPrice_operators;
		}else if(pKey.equals("Cost")){ return this.shstCost_operators;
		}else if(pKey.equals("TimeStandard")){ return this.shstTimeStandard_operators;
		}else if(pKey.equals("CreateBy")){ return this.shstCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.shstCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.shstModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.shstModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
