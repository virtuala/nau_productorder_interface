package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Warehouseorderdetail {
	public String sTableDir="Cms";
	public String sTableName="warehouseorderdetail";
	public String t="warehouseorderdetail";
	public String sColumnHead="whodet";
	public String sColumnHead1="";
	public String c="whodet";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//whodetID
	private Integer whodetID;
	private Boolean whodetID_isset=false;
	private String whodetID_orderby;
	private Boolean whodetID_hascolumn=false;
	private String whodetID_operators;
	public Integer getWhodetID() { return whodetID; }
	public void setWhodetID(Integer whodetID) { this.whodetID=whodetID; this.whodetID_isset=true; }
	public void setWhodetID_Fix(String whodetID) { this.whodetID=this.sApp_Code.ToInt32(whodetID,0); this.whodetID_isset=true; }
	//whodetNumCode
	private String whodetNumCode;
	private Boolean whodetNumCode_isset=false;
	private String whodetNumCode_orderby;
	private Boolean whodetNumCode_hascolumn=false;
	private String whodetNumCode_operators;
	public String getWhodetNumCode() { return whodetNumCode; }
	public void setWhodetNumCode(String whodetNumCode) { this.whodetNumCode=whodetNumCode; this.whodetNumCode_isset=true; }
	public void setWhodetNumCode_Fix(String whodetNumCode) { this.whodetNumCode=whodetNumCode; this.whodetNumCode_isset=true; }
	//whodetWarehouseorderID
	private Integer whodetWarehouseorderID;
	private Boolean whodetWarehouseorderID_isset=false;
	private String whodetWarehouseorderID_orderby;
	private Boolean whodetWarehouseorderID_hascolumn=false;
	private String whodetWarehouseorderID_operators;
	public Integer getWhodetWarehouseorderID() { return whodetWarehouseorderID; }
	public void setWhodetWarehouseorderID(Integer whodetWarehouseorderID) { this.whodetWarehouseorderID=whodetWarehouseorderID; this.whodetWarehouseorderID_isset=true; }
	public void setWhodetWarehouseorderID_Fix(String whodetWarehouseorderID) { this.whodetWarehouseorderID=this.sApp_Code.ToInt32(whodetWarehouseorderID,0); this.whodetWarehouseorderID_isset=true; }
	//whodetWarehousedetailID
	private Integer whodetWarehousedetailID;
	private Boolean whodetWarehousedetailID_isset=false;
	private String whodetWarehousedetailID_orderby;
	private Boolean whodetWarehousedetailID_hascolumn=false;
	private String whodetWarehousedetailID_operators;
	public Integer getWhodetWarehousedetailID() { return whodetWarehousedetailID; }
	public void setWhodetWarehousedetailID(Integer whodetWarehousedetailID) { this.whodetWarehousedetailID=whodetWarehousedetailID; this.whodetWarehousedetailID_isset=true; }
	public void setWhodetWarehousedetailID_Fix(String whodetWarehousedetailID) { this.whodetWarehousedetailID=this.sApp_Code.ToInt32(whodetWarehousedetailID,0); this.whodetWarehousedetailID_isset=true; }
	//whodetCount
	private Integer whodetCount;
	private Boolean whodetCount_isset=false;
	private String whodetCount_orderby;
	private Boolean whodetCount_hascolumn=false;
	private String whodetCount_operators;
	public Integer getWhodetCount() { return whodetCount; }
	public void setWhodetCount(Integer whodetCount) { this.whodetCount=whodetCount; this.whodetCount_isset=true; }
	public void setWhodetCount_Fix(String whodetCount) { this.whodetCount=this.sApp_Code.ToInt32(whodetCount,0); this.whodetCount_isset=true; }
	//whodetCreateBy
	private Integer whodetCreateBy;
	private Boolean whodetCreateBy_isset=false;
	private String whodetCreateBy_orderby;
	private Boolean whodetCreateBy_hascolumn=false;
	private String whodetCreateBy_operators;
	public Integer getWhodetCreateBy() { return whodetCreateBy; }
	public void setWhodetCreateBy(Integer whodetCreateBy) { this.whodetCreateBy=whodetCreateBy; this.whodetCreateBy_isset=true; }
	public void setWhodetCreateBy_Fix(String whodetCreateBy) { this.whodetCreateBy=this.sApp_Code.ToInt32(whodetCreateBy,0); this.whodetCreateBy_isset=true; }
	//whodetCreateTime
	private Date whodetCreateTime;
	private Boolean whodetCreateTime_isset=false;
	private String whodetCreateTime_orderby;
	private Boolean whodetCreateTime_hascolumn=false;
	private String whodetCreateTime_operators;
	public Date getWhodetCreateTime() { return whodetCreateTime; }
	public void setWhodetCreateTime(Date whodetCreateTime) { this.whodetCreateTime=whodetCreateTime; this.whodetCreateTime_isset=true; }
	public void setWhodetCreateTime_Fix(String whodetCreateTime) { this.whodetCreateTime=this.sApp_Code.ToDatetime(whodetCreateTime,this.sDateFormat.format(new Date())); this.whodetCreateTime_isset=true; }
	//whodetModifyBy
	private Integer whodetModifyBy;
	private Boolean whodetModifyBy_isset=false;
	private String whodetModifyBy_orderby;
	private Boolean whodetModifyBy_hascolumn=false;
	private String whodetModifyBy_operators;
	public Integer getWhodetModifyBy() { return whodetModifyBy; }
	public void setWhodetModifyBy(Integer whodetModifyBy) { this.whodetModifyBy=whodetModifyBy; this.whodetModifyBy_isset=true; }
	public void setWhodetModifyBy_Fix(String whodetModifyBy) { this.whodetModifyBy=this.sApp_Code.ToInt32(whodetModifyBy,0); this.whodetModifyBy_isset=true; }
	//whodetModifyTime
	private Date whodetModifyTime;
	private Boolean whodetModifyTime_isset=false;
	private String whodetModifyTime_orderby;
	private Boolean whodetModifyTime_hascolumn=false;
	private String whodetModifyTime_operators;
	public Date getWhodetModifyTime() { return whodetModifyTime; }
	public void setWhodetModifyTime(Date whodetModifyTime) { this.whodetModifyTime=whodetModifyTime; this.whodetModifyTime_isset=true; }
	public void setWhodetModifyTime_Fix(String whodetModifyTime) { this.whodetModifyTime=this.sApp_Code.ToDatetime(whodetModifyTime,this.sDateFormat.format(new Date())); this.whodetModifyTime_isset=true; }




	/* column text extend */
	//whodetID_Text
	private String whodetID_Text;
	public String getWhodetID_Text() { if(this.whodetID==null){ this.whodetID_Text=""; } if(this.whodetID_Text==null){ this.whodetID_Text=this.whodetID.toString(); } return this.whodetID_Text; }
	public void setWhodetID_Text(String whodetID_Text) { this.whodetID_Text=whodetID_Text; }
	//whodetWarehouseorderID_Text
	private String whodetWarehouseorderID_Text;
	public String getWhodetWarehouseorderID_Text() { if(this.whodetWarehouseorderID==null){ this.whodetWarehouseorderID_Text=""; } if(this.whodetWarehouseorderID_Text==null){ this.whodetWarehouseorderID_Text=this.whodetWarehouseorderID.toString(); } return this.whodetWarehouseorderID_Text; }
	public void setWhodetWarehouseorderID_Text(String whodetWarehouseorderID_Text) { this.whodetWarehouseorderID_Text=whodetWarehouseorderID_Text; }
	//whodetWarehousedetailID_Text
	private String whodetWarehousedetailID_Text;
	public String getWhodetWarehousedetailID_Text() { if(this.whodetWarehousedetailID==null){ this.whodetWarehousedetailID_Text=""; } if(this.whodetWarehousedetailID_Text==null){ this.whodetWarehousedetailID_Text=this.whodetWarehousedetailID.toString(); } return this.whodetWarehousedetailID_Text; }
	public void setWhodetWarehousedetailID_Text(String whodetWarehousedetailID_Text) { this.whodetWarehousedetailID_Text=whodetWarehousedetailID_Text; }
	//whodetCount_Text
	private String whodetCount_Text;
	public String getWhodetCount_Text() { if(this.whodetCount==null){ this.whodetCount_Text=""; } if(this.whodetCount_Text==null){ this.whodetCount_Text=this.whodetCount.toString(); } return this.whodetCount_Text; }
	public void setWhodetCount_Text(String whodetCount_Text) { this.whodetCount_Text=whodetCount_Text; }
	//whodetCreateBy_Text
	private String whodetCreateBy_Text;
	public String getWhodetCreateBy_Text() { if(this.whodetCreateBy==null){ this.whodetCreateBy_Text=""; } if(this.whodetCreateBy_Text==null){ this.whodetCreateBy_Text=this.whodetCreateBy.toString(); } return this.whodetCreateBy_Text; }
	public void setWhodetCreateBy_Text(String whodetCreateBy_Text) { this.whodetCreateBy_Text=whodetCreateBy_Text; }
	//whodetModifyBy_Text
	private String whodetModifyBy_Text;
	public String getWhodetModifyBy_Text() { if(this.whodetModifyBy==null){ this.whodetModifyBy_Text=""; } if(this.whodetModifyBy_Text==null){ this.whodetModifyBy_Text=this.whodetModifyBy.toString(); } return this.whodetModifyBy_Text; }
	public void setWhodetModifyBy_Text(String whodetModifyBy_Text) { this.whodetModifyBy_Text=whodetModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setWhodetID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setWhodetNumCode_Fix(pValue);
		}else if(pKey.equals("WarehouseorderID")){ this.setWhodetWarehouseorderID_Fix(pValue);
		}else if(pKey.equals("WarehousedetailID")){ this.setWhodetWarehousedetailID_Fix(pValue);
		}else if(pKey.equals("Count")){ this.setWhodetCount_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setWhodetCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setWhodetCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setWhodetModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setWhodetModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getWhodetID()+"";
		}else if(pKey.equals("NumCode")){ return this.getWhodetNumCode()+"";
		}else if(pKey.equals("WarehouseorderID")){ return this.getWhodetWarehouseorderID()+"";
		}else if(pKey.equals("WarehousedetailID")){ return this.getWhodetWarehousedetailID()+"";
		}else if(pKey.equals("Count")){ return this.getWhodetCount()+"";
		}else if(pKey.equals("CreateBy")){ return this.getWhodetCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getWhodetCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getWhodetModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getWhodetModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whodetID_isset;
		}else if(pKey.equals("NumCode")){ return this.whodetNumCode_isset;
		}else if(pKey.equals("WarehouseorderID")){ return this.whodetWarehouseorderID_isset;
		}else if(pKey.equals("WarehousedetailID")){ return this.whodetWarehousedetailID_isset;
		}else if(pKey.equals("Count")){ return this.whodetCount_isset;
		}else if(pKey.equals("CreateBy")){ return this.whodetCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.whodetCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.whodetModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.whodetModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whodetID_orderby;
		}else if(pKey.equals("NumCode")){ return this.whodetNumCode_orderby;
		}else if(pKey.equals("WarehouseorderID")){ return this.whodetWarehouseorderID_orderby;
		}else if(pKey.equals("WarehousedetailID")){ return this.whodetWarehousedetailID_orderby;
		}else if(pKey.equals("Count")){ return this.whodetCount_orderby;
		}else if(pKey.equals("CreateBy")){ return this.whodetCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.whodetCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.whodetModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.whodetModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whodetID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.whodetNumCode_hascolumn;
		}else if(pKey.equals("WarehouseorderID")){ return this.whodetWarehouseorderID_hascolumn;
		}else if(pKey.equals("WarehousedetailID")){ return this.whodetWarehousedetailID_hascolumn;
		}else if(pKey.equals("Count")){ return this.whodetCount_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.whodetCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.whodetCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.whodetModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.whodetModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whodetID_operators;
		}else if(pKey.equals("NumCode")){ return this.whodetNumCode_operators;
		}else if(pKey.equals("WarehouseorderID")){ return this.whodetWarehouseorderID_operators;
		}else if(pKey.equals("WarehousedetailID")){ return this.whodetWarehousedetailID_operators;
		}else if(pKey.equals("Count")){ return this.whodetCount_operators;
		}else if(pKey.equals("CreateBy")){ return this.whodetCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.whodetCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.whodetModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.whodetModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
