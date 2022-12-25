package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class DataWarehouseorder {
	public String sTableDir="Cms";
	public String sTableName="warehouseorder";
	public String t="warehouseorder";
	public String sColumnHead="whot";
	public String sColumnHead1="";
	public String c="whot";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//whotID
	private Integer whotID;
	private Boolean whotID_isset=false;
	private String whotID_orderby;
	private Boolean whotID_hascolumn=false;
	private String whotID_operators;
	public Integer getWhotID() { return whotID; }
	public void setWhotID(Integer whotID) { this.whotID=whotID; this.whotID_isset=true; }
	public void setWhotID_Fix(String whotID) { this.whotID=this.sApp_Code.ToInt32(whotID,0); this.whotID_isset=true; }
	//whotNumCode
	private String whotNumCode;
	private Boolean whotNumCode_isset=false;
	private String whotNumCode_orderby;
	private Boolean whotNumCode_hascolumn=false;
	private String whotNumCode_operators;
	public String getWhotNumCode() { return whotNumCode; }
	public void setWhotNumCode(String whotNumCode) { this.whotNumCode=whotNumCode; this.whotNumCode_isset=true; }
	public void setWhotNumCode_Fix(String whotNumCode) { this.whotNumCode=whotNumCode; this.whotNumCode_isset=true; }
	//whotType
	private Integer whotType;
	private Boolean whotType_isset=false;
	private String whotType_orderby;
	private Boolean whotType_hascolumn=false;
	private String whotType_operators;
	public Integer getWhotType() { return whotType; }
	public void setWhotType(Integer whotType) { this.whotType=whotType; this.whotType_isset=true; }
	public void setWhotType_Fix(String whotType) { this.whotType=this.sApp_Code.ToInt32(whotType,0); this.whotType_isset=true; }
	//whotWarehouseID
	private Integer whotWarehouseID;
	private Boolean whotWarehouseID_isset=false;
	private String whotWarehouseID_orderby;
	private Boolean whotWarehouseID_hascolumn=false;
	private String whotWarehouseID_operators;
	public Integer getWhotWarehouseID() { return whotWarehouseID; }
	public void setWhotWarehouseID(Integer whotWarehouseID) { this.whotWarehouseID=whotWarehouseID; this.whotWarehouseID_isset=true; }
	public void setWhotWarehouseID_Fix(String whotWarehouseID) { this.whotWarehouseID=this.sApp_Code.ToInt32(whotWarehouseID,0); this.whotWarehouseID_isset=true; }
	//whotProductID
	private Integer whotProductID;
	private Boolean whotProductID_isset=false;
	private String whotProductID_orderby;
	private Boolean whotProductID_hascolumn=false;
	private String whotProductID_operators;
	public Integer getWhotProductID() { return whotProductID; }
	public void setWhotProductID(Integer whotProductID) { this.whotProductID=whotProductID; this.whotProductID_isset=true; }
	public void setWhotProductID_Fix(String whotProductID) { this.whotProductID=this.sApp_Code.ToInt32(whotProductID,0); this.whotProductID_isset=true; }
	//whotCount
	private Integer whotCount;
	private Boolean whotCount_isset=false;
	private String whotCount_orderby;
	private Boolean whotCount_hascolumn=false;
	private String whotCount_operators;
	public Integer getWhotCount() { return whotCount; }
	public void setWhotCount(Integer whotCount) { this.whotCount=whotCount; this.whotCount_isset=true; }
	public void setWhotCount_Fix(String whotCount) { this.whotCount=this.sApp_Code.ToInt32(whotCount,0); this.whotCount_isset=true; }
	//whotCreateBy
	private Integer whotCreateBy;
	private Boolean whotCreateBy_isset=false;
	private String whotCreateBy_orderby;
	private Boolean whotCreateBy_hascolumn=false;
	private String whotCreateBy_operators;
	public Integer getWhotCreateBy() { return whotCreateBy; }
	public void setWhotCreateBy(Integer whotCreateBy) { this.whotCreateBy=whotCreateBy; this.whotCreateBy_isset=true; }
	public void setWhotCreateBy_Fix(String whotCreateBy) { this.whotCreateBy=this.sApp_Code.ToInt32(whotCreateBy,0); this.whotCreateBy_isset=true; }
	//whotCreateTime
	private Date whotCreateTime;
	private Boolean whotCreateTime_isset=false;
	private String whotCreateTime_orderby;
	private Boolean whotCreateTime_hascolumn=false;
	private String whotCreateTime_operators;
	public Date getWhotCreateTime() { return whotCreateTime; }
	public void setWhotCreateTime(Date whotCreateTime) { this.whotCreateTime=whotCreateTime; this.whotCreateTime_isset=true; }
	public void setWhotCreateTime_Fix(String whotCreateTime) { this.whotCreateTime=this.sApp_Code.ToDatetime(whotCreateTime,this.sDateFormat.format(new Date())); this.whotCreateTime_isset=true; }
	//whotModifyBy
	private Integer whotModifyBy;
	private Boolean whotModifyBy_isset=false;
	private String whotModifyBy_orderby;
	private Boolean whotModifyBy_hascolumn=false;
	private String whotModifyBy_operators;
	public Integer getWhotModifyBy() { return whotModifyBy; }
	public void setWhotModifyBy(Integer whotModifyBy) { this.whotModifyBy=whotModifyBy; this.whotModifyBy_isset=true; }
	public void setWhotModifyBy_Fix(String whotModifyBy) { this.whotModifyBy=this.sApp_Code.ToInt32(whotModifyBy,0); this.whotModifyBy_isset=true; }
	//whotModifyTime
	private Date whotModifyTime;
	private Boolean whotModifyTime_isset=false;
	private String whotModifyTime_orderby;
	private Boolean whotModifyTime_hascolumn=false;
	private String whotModifyTime_operators;
	public Date getWhotModifyTime() { return whotModifyTime; }
	public void setWhotModifyTime(Date whotModifyTime) { this.whotModifyTime=whotModifyTime; this.whotModifyTime_isset=true; }
	public void setWhotModifyTime_Fix(String whotModifyTime) { this.whotModifyTime=this.sApp_Code.ToDatetime(whotModifyTime,this.sDateFormat.format(new Date())); this.whotModifyTime_isset=true; }




	/* column text extend */
	//whotID_Text
	private String whotID_Text;
	public String getWhotID_Text() { if(this.whotID==null){ this.whotID_Text=""; } if(this.whotID_Text==null){ this.whotID_Text=this.whotID.toString(); } return this.whotID_Text; }
	public void setWhotID_Text(String whotID_Text) { this.whotID_Text=whotID_Text; }
	//whotType_Text
	private String whotType_Text;
	public String getWhotType_Text() { if(this.whotType==null){ this.whotType_Text=""; } if(this.whotType_Text==null){ this.whotType_Text=this.whotType.toString(); } return this.whotType_Text; }
	public void setWhotType_Text(String whotType_Text) { this.whotType_Text=whotType_Text; }
	//whotWarehouseID_Text
	private String whotWarehouseID_Text;
	public String getWhotWarehouseID_Text() { if(this.whotWarehouseID==null){ this.whotWarehouseID_Text=""; } if(this.whotWarehouseID_Text==null){ this.whotWarehouseID_Text=this.whotWarehouseID.toString(); } return this.whotWarehouseID_Text; }
	public void setWhotWarehouseID_Text(String whotWarehouseID_Text) { this.whotWarehouseID_Text=whotWarehouseID_Text; }
	//whotProductID_Text
	private String whotProductID_Text;
	public String getWhotProductID_Text() { if(this.whotProductID==null){ this.whotProductID_Text=""; } if(this.whotProductID_Text==null){ this.whotProductID_Text=this.whotProductID.toString(); } return this.whotProductID_Text; }
	public void setWhotProductID_Text(String whotProductID_Text) { this.whotProductID_Text=whotProductID_Text; }
	//whotCount_Text
	private String whotCount_Text;
	public String getWhotCount_Text() { if(this.whotCount==null){ this.whotCount_Text=""; } if(this.whotCount_Text==null){ this.whotCount_Text=this.whotCount.toString(); } return this.whotCount_Text; }
	public void setWhotCount_Text(String whotCount_Text) { this.whotCount_Text=whotCount_Text; }
	//whotCreateBy_Text
	private String whotCreateBy_Text;
	public String getWhotCreateBy_Text() { if(this.whotCreateBy==null){ this.whotCreateBy_Text=""; } if(this.whotCreateBy_Text==null){ this.whotCreateBy_Text=this.whotCreateBy.toString(); } return this.whotCreateBy_Text; }
	public void setWhotCreateBy_Text(String whotCreateBy_Text) { this.whotCreateBy_Text=whotCreateBy_Text; }
	//whotModifyBy_Text
	private String whotModifyBy_Text;
	public String getWhotModifyBy_Text() { if(this.whotModifyBy==null){ this.whotModifyBy_Text=""; } if(this.whotModifyBy_Text==null){ this.whotModifyBy_Text=this.whotModifyBy.toString(); } return this.whotModifyBy_Text; }
	public void setWhotModifyBy_Text(String whotModifyBy_Text) { this.whotModifyBy_Text=whotModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setWhotID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setWhotNumCode_Fix(pValue);
		}else if(pKey.equals("Type")){ this.setWhotType_Fix(pValue);
		}else if(pKey.equals("WarehouseID")){ this.setWhotWarehouseID_Fix(pValue);
		}else if(pKey.equals("ProductID")){ this.setWhotProductID_Fix(pValue);
		}else if(pKey.equals("Count")){ this.setWhotCount_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setWhotCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setWhotCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setWhotModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setWhotModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getWhotID()+"";
		}else if(pKey.equals("NumCode")){ return this.getWhotNumCode()+"";
		}else if(pKey.equals("Type")){ return this.getWhotType()+"";
		}else if(pKey.equals("WarehouseID")){ return this.getWhotWarehouseID()+"";
		}else if(pKey.equals("ProductID")){ return this.getWhotProductID()+"";
		}else if(pKey.equals("Count")){ return this.getWhotCount()+"";
		}else if(pKey.equals("CreateBy")){ return this.getWhotCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getWhotCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getWhotModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getWhotModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whotID_isset;
		}else if(pKey.equals("NumCode")){ return this.whotNumCode_isset;
		}else if(pKey.equals("Type")){ return this.whotType_isset;
		}else if(pKey.equals("WarehouseID")){ return this.whotWarehouseID_isset;
		}else if(pKey.equals("ProductID")){ return this.whotProductID_isset;
		}else if(pKey.equals("Count")){ return this.whotCount_isset;
		}else if(pKey.equals("CreateBy")){ return this.whotCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.whotCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.whotModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.whotModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whotID_orderby;
		}else if(pKey.equals("NumCode")){ return this.whotNumCode_orderby;
		}else if(pKey.equals("Type")){ return this.whotType_orderby;
		}else if(pKey.equals("WarehouseID")){ return this.whotWarehouseID_orderby;
		}else if(pKey.equals("ProductID")){ return this.whotProductID_orderby;
		}else if(pKey.equals("Count")){ return this.whotCount_orderby;
		}else if(pKey.equals("CreateBy")){ return this.whotCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.whotCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.whotModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.whotModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whotID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.whotNumCode_hascolumn;
		}else if(pKey.equals("Type")){ return this.whotType_hascolumn;
		}else if(pKey.equals("WarehouseID")){ return this.whotWarehouseID_hascolumn;
		}else if(pKey.equals("ProductID")){ return this.whotProductID_hascolumn;
		}else if(pKey.equals("Count")){ return this.whotCount_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.whotCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.whotCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.whotModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.whotModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whotID_operators;
		}else if(pKey.equals("NumCode")){ return this.whotNumCode_operators;
		}else if(pKey.equals("Type")){ return this.whotType_operators;
		}else if(pKey.equals("WarehouseID")){ return this.whotWarehouseID_operators;
		}else if(pKey.equals("ProductID")){ return this.whotProductID_operators;
		}else if(pKey.equals("Count")){ return this.whotCount_operators;
		}else if(pKey.equals("CreateBy")){ return this.whotCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.whotCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.whotModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.whotModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
