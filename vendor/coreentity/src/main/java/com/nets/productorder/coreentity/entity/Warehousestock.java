package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Warehousestock {
	public String sTableDir="Cms";
	public String sTableName="warehousestock";
	public String t="warehousestock";
	public String sColumnHead="whst";
	public String sColumnHead1="";
	public String c="whst";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//whstID
	private Integer whstID;
	private Boolean whstID_isset=false;
	private String whstID_orderby;
	private Boolean whstID_hascolumn=false;
	private String whstID_operators;
	public Integer getWhstID() { return whstID; }
	public void setWhstID(Integer whstID) { this.whstID=whstID; this.whstID_isset=true; }
	public void setWhstID_Fix(String whstID) { this.whstID=this.sApp_Code.ToInt32(whstID,0); this.whstID_isset=true; }
	//whstNumCode
	private String whstNumCode;
	private Boolean whstNumCode_isset=false;
	private String whstNumCode_orderby;
	private Boolean whstNumCode_hascolumn=false;
	private String whstNumCode_operators;
	public String getWhstNumCode() { return whstNumCode; }
	public void setWhstNumCode(String whstNumCode) { this.whstNumCode=whstNumCode; this.whstNumCode_isset=true; }
	public void setWhstNumCode_Fix(String whstNumCode) { this.whstNumCode=whstNumCode; this.whstNumCode_isset=true; }
	//whstWarehouseID
	private Integer whstWarehouseID;
	private Boolean whstWarehouseID_isset=false;
	private String whstWarehouseID_orderby;
	private Boolean whstWarehouseID_hascolumn=false;
	private String whstWarehouseID_operators;
	public Integer getWhstWarehouseID() { return whstWarehouseID; }
	public void setWhstWarehouseID(Integer whstWarehouseID) { this.whstWarehouseID=whstWarehouseID; this.whstWarehouseID_isset=true; }
	public void setWhstWarehouseID_Fix(String whstWarehouseID) { this.whstWarehouseID=this.sApp_Code.ToInt32(whstWarehouseID,0); this.whstWarehouseID_isset=true; }
	//whstProductID
	private Integer whstProductID;
	private Boolean whstProductID_isset=false;
	private String whstProductID_orderby;
	private Boolean whstProductID_hascolumn=false;
	private String whstProductID_operators;
	public Integer getWhstProductID() { return whstProductID; }
	public void setWhstProductID(Integer whstProductID) { this.whstProductID=whstProductID; this.whstProductID_isset=true; }
	public void setWhstProductID_Fix(String whstProductID) { this.whstProductID=this.sApp_Code.ToInt32(whstProductID,0); this.whstProductID_isset=true; }
	//whstCount
	private Integer whstCount;
	private Boolean whstCount_isset=false;
	private String whstCount_orderby;
	private Boolean whstCount_hascolumn=false;
	private String whstCount_operators;
	public Integer getWhstCount() { return whstCount; }
	public void setWhstCount(Integer whstCount) { this.whstCount=whstCount; this.whstCount_isset=true; }
	public void setWhstCount_Fix(String whstCount) { this.whstCount=this.sApp_Code.ToInt32(whstCount,0); this.whstCount_isset=true; }
	//whstCreateBy
	private Integer whstCreateBy;
	private Boolean whstCreateBy_isset=false;
	private String whstCreateBy_orderby;
	private Boolean whstCreateBy_hascolumn=false;
	private String whstCreateBy_operators;
	public Integer getWhstCreateBy() { return whstCreateBy; }
	public void setWhstCreateBy(Integer whstCreateBy) { this.whstCreateBy=whstCreateBy; this.whstCreateBy_isset=true; }
	public void setWhstCreateBy_Fix(String whstCreateBy) { this.whstCreateBy=this.sApp_Code.ToInt32(whstCreateBy,0); this.whstCreateBy_isset=true; }
	//whstCreateTime
	private Date whstCreateTime;
	private Boolean whstCreateTime_isset=false;
	private String whstCreateTime_orderby;
	private Boolean whstCreateTime_hascolumn=false;
	private String whstCreateTime_operators;
	public Date getWhstCreateTime() { return whstCreateTime; }
	public void setWhstCreateTime(Date whstCreateTime) { this.whstCreateTime=whstCreateTime; this.whstCreateTime_isset=true; }
	public void setWhstCreateTime_Fix(String whstCreateTime) { this.whstCreateTime=this.sApp_Code.ToDatetime(whstCreateTime,this.sDateFormat.format(new Date())); this.whstCreateTime_isset=true; }
	//whstModifyBy
	private Integer whstModifyBy;
	private Boolean whstModifyBy_isset=false;
	private String whstModifyBy_orderby;
	private Boolean whstModifyBy_hascolumn=false;
	private String whstModifyBy_operators;
	public Integer getWhstModifyBy() { return whstModifyBy; }
	public void setWhstModifyBy(Integer whstModifyBy) { this.whstModifyBy=whstModifyBy; this.whstModifyBy_isset=true; }
	public void setWhstModifyBy_Fix(String whstModifyBy) { this.whstModifyBy=this.sApp_Code.ToInt32(whstModifyBy,0); this.whstModifyBy_isset=true; }
	//whstModifyTime
	private Date whstModifyTime;
	private Boolean whstModifyTime_isset=false;
	private String whstModifyTime_orderby;
	private Boolean whstModifyTime_hascolumn=false;
	private String whstModifyTime_operators;
	public Date getWhstModifyTime() { return whstModifyTime; }
	public void setWhstModifyTime(Date whstModifyTime) { this.whstModifyTime=whstModifyTime; this.whstModifyTime_isset=true; }
	public void setWhstModifyTime_Fix(String whstModifyTime) { this.whstModifyTime=this.sApp_Code.ToDatetime(whstModifyTime,this.sDateFormat.format(new Date())); this.whstModifyTime_isset=true; }




	/* column text extend */
	//whstID_Text
	private String whstID_Text;
	public String getWhstID_Text() { if(this.whstID==null){ this.whstID_Text=""; } if(this.whstID_Text==null){ this.whstID_Text=this.whstID.toString(); } return this.whstID_Text; }
	public void setWhstID_Text(String whstID_Text) { this.whstID_Text=whstID_Text; }
	//whstWarehouseID_Text
	private String whstWarehouseID_Text;
	public String getWhstWarehouseID_Text() { if(this.whstWarehouseID==null){ this.whstWarehouseID_Text=""; } if(this.whstWarehouseID_Text==null){ this.whstWarehouseID_Text=this.whstWarehouseID.toString(); } return this.whstWarehouseID_Text; }
	public void setWhstWarehouseID_Text(String whstWarehouseID_Text) { this.whstWarehouseID_Text=whstWarehouseID_Text; }
	//whstProductID_Text
	private String whstProductID_Text;
	public String getWhstProductID_Text() { if(this.whstProductID==null){ this.whstProductID_Text=""; } if(this.whstProductID_Text==null){ this.whstProductID_Text=this.whstProductID.toString(); } return this.whstProductID_Text; }
	public void setWhstProductID_Text(String whstProductID_Text) { this.whstProductID_Text=whstProductID_Text; }
	//whstCount_Text
	private String whstCount_Text;
	public String getWhstCount_Text() { if(this.whstCount==null){ this.whstCount_Text=""; } if(this.whstCount_Text==null){ this.whstCount_Text=this.whstCount.toString(); } return this.whstCount_Text; }
	public void setWhstCount_Text(String whstCount_Text) { this.whstCount_Text=whstCount_Text; }
	//whstCreateBy_Text
	private String whstCreateBy_Text;
	public String getWhstCreateBy_Text() { if(this.whstCreateBy==null){ this.whstCreateBy_Text=""; } if(this.whstCreateBy_Text==null){ this.whstCreateBy_Text=this.whstCreateBy.toString(); } return this.whstCreateBy_Text; }
	public void setWhstCreateBy_Text(String whstCreateBy_Text) { this.whstCreateBy_Text=whstCreateBy_Text; }
	//whstModifyBy_Text
	private String whstModifyBy_Text;
	public String getWhstModifyBy_Text() { if(this.whstModifyBy==null){ this.whstModifyBy_Text=""; } if(this.whstModifyBy_Text==null){ this.whstModifyBy_Text=this.whstModifyBy.toString(); } return this.whstModifyBy_Text; }
	public void setWhstModifyBy_Text(String whstModifyBy_Text) { this.whstModifyBy_Text=whstModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setWhstID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setWhstNumCode_Fix(pValue);
		}else if(pKey.equals("WarehouseID")){ this.setWhstWarehouseID_Fix(pValue);
		}else if(pKey.equals("ProductID")){ this.setWhstProductID_Fix(pValue);
		}else if(pKey.equals("Count")){ this.setWhstCount_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setWhstCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setWhstCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setWhstModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setWhstModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getWhstID()+"";
		}else if(pKey.equals("NumCode")){ return this.getWhstNumCode()+"";
		}else if(pKey.equals("WarehouseID")){ return this.getWhstWarehouseID()+"";
		}else if(pKey.equals("ProductID")){ return this.getWhstProductID()+"";
		}else if(pKey.equals("Count")){ return this.getWhstCount()+"";
		}else if(pKey.equals("CreateBy")){ return this.getWhstCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getWhstCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getWhstModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getWhstModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whstID_isset;
		}else if(pKey.equals("NumCode")){ return this.whstNumCode_isset;
		}else if(pKey.equals("WarehouseID")){ return this.whstWarehouseID_isset;
		}else if(pKey.equals("ProductID")){ return this.whstProductID_isset;
		}else if(pKey.equals("Count")){ return this.whstCount_isset;
		}else if(pKey.equals("CreateBy")){ return this.whstCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.whstCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.whstModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.whstModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whstID_orderby;
		}else if(pKey.equals("NumCode")){ return this.whstNumCode_orderby;
		}else if(pKey.equals("WarehouseID")){ return this.whstWarehouseID_orderby;
		}else if(pKey.equals("ProductID")){ return this.whstProductID_orderby;
		}else if(pKey.equals("Count")){ return this.whstCount_orderby;
		}else if(pKey.equals("CreateBy")){ return this.whstCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.whstCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.whstModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.whstModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whstID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.whstNumCode_hascolumn;
		}else if(pKey.equals("WarehouseID")){ return this.whstWarehouseID_hascolumn;
		}else if(pKey.equals("ProductID")){ return this.whstProductID_hascolumn;
		}else if(pKey.equals("Count")){ return this.whstCount_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.whstCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.whstCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.whstModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.whstModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whstID_operators;
		}else if(pKey.equals("NumCode")){ return this.whstNumCode_operators;
		}else if(pKey.equals("WarehouseID")){ return this.whstWarehouseID_operators;
		}else if(pKey.equals("ProductID")){ return this.whstProductID_operators;
		}else if(pKey.equals("Count")){ return this.whstCount_operators;
		}else if(pKey.equals("CreateBy")){ return this.whstCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.whstCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.whstModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.whstModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
