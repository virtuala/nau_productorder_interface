package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class DataOrderinfodetail {
	public String sTableDir="Cms";
	public String sTableName="orderinfodetail";
	public String t="orderinfodetail";
	public String sColumnHead="shsodt";
	public String sColumnHead1="";
	public String c="shsodt";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//shsodtID
	private Integer shsodtID;
	private Boolean shsodtID_isset=false;
	private String shsodtID_orderby;
	private Boolean shsodtID_hascolumn=false;
	private String shsodtID_operators;
	public Integer getShsodtID() { return shsodtID; }
	public void setShsodtID(Integer shsodtID) { this.shsodtID=shsodtID; this.shsodtID_isset=true; }
	public void setShsodtID_Fix(String shsodtID) { this.shsodtID=this.sApp_Code.ToInt32(shsodtID,0); this.shsodtID_isset=true; }
	//shsodtNumCode
	private String shsodtNumCode;
	private Boolean shsodtNumCode_isset=false;
	private String shsodtNumCode_orderby;
	private Boolean shsodtNumCode_hascolumn=false;
	private String shsodtNumCode_operators;
	public String getShsodtNumCode() { return shsodtNumCode; }
	public void setShsodtNumCode(String shsodtNumCode) { this.shsodtNumCode=shsodtNumCode; this.shsodtNumCode_isset=true; }
	public void setShsodtNumCode_Fix(String shsodtNumCode) { this.shsodtNumCode=shsodtNumCode; this.shsodtNumCode_isset=true; }
	//shsodtState
	private Integer shsodtState;
	private Boolean shsodtState_isset=false;
	private String shsodtState_orderby;
	private Boolean shsodtState_hascolumn=false;
	private String shsodtState_operators;
	public Integer getShsodtState() { return shsodtState; }
	public void setShsodtState(Integer shsodtState) { this.shsodtState=shsodtState; this.shsodtState_isset=true; }
	public void setShsodtState_Fix(String shsodtState) { this.shsodtState=this.sApp_Code.ToInt32(shsodtState,0); this.shsodtState_isset=true; }
	//shsodtOrderinfoID
	private Integer shsodtOrderinfoID;
	private Boolean shsodtOrderinfoID_isset=false;
	private String shsodtOrderinfoID_orderby;
	private Boolean shsodtOrderinfoID_hascolumn=false;
	private String shsodtOrderinfoID_operators;
	public Integer getShsodtOrderinfoID() { return shsodtOrderinfoID; }
	public void setShsodtOrderinfoID(Integer shsodtOrderinfoID) { this.shsodtOrderinfoID=shsodtOrderinfoID; this.shsodtOrderinfoID_isset=true; }
	public void setShsodtOrderinfoID_Fix(String shsodtOrderinfoID) { this.shsodtOrderinfoID=this.sApp_Code.ToInt32(shsodtOrderinfoID,0); this.shsodtOrderinfoID_isset=true; }
	//shsodtProductID
	private Integer shsodtProductID;
	private Boolean shsodtProductID_isset=false;
	private String shsodtProductID_orderby;
	private Boolean shsodtProductID_hascolumn=false;
	private String shsodtProductID_operators;
	public Integer getShsodtProductID() { return shsodtProductID; }
	public void setShsodtProductID(Integer shsodtProductID) { this.shsodtProductID=shsodtProductID; this.shsodtProductID_isset=true; }
	public void setShsodtProductID_Fix(String shsodtProductID) { this.shsodtProductID=this.sApp_Code.ToInt32(shsodtProductID,0); this.shsodtProductID_isset=true; }
	//shsodtProductlineID
	private Integer shsodtProductlineID;
	private Boolean shsodtProductlineID_isset=false;
	private String shsodtProductlineID_orderby;
	private Boolean shsodtProductlineID_hascolumn=false;
	private String shsodtProductlineID_operators;
	public Integer getShsodtProductlineID() { return shsodtProductlineID; }
	public void setShsodtProductlineID(Integer shsodtProductlineID) { this.shsodtProductlineID=shsodtProductlineID; this.shsodtProductlineID_isset=true; }
	public void setShsodtProductlineID_Fix(String shsodtProductlineID) { this.shsodtProductlineID=this.sApp_Code.ToInt32(shsodtProductlineID,0); this.shsodtProductlineID_isset=true; }
	//shsodtCount
	private Integer shsodtCount;
	private Boolean shsodtCount_isset=false;
	private String shsodtCount_orderby;
	private Boolean shsodtCount_hascolumn=false;
	private String shsodtCount_operators;
	public Integer getShsodtCount() { return shsodtCount; }
	public void setShsodtCount(Integer shsodtCount) { this.shsodtCount=shsodtCount; this.shsodtCount_isset=true; }
	public void setShsodtCount_Fix(String shsodtCount) { this.shsodtCount=this.sApp_Code.ToInt32(shsodtCount,0); this.shsodtCount_isset=true; }
	//shsodtProductCount
	private Integer shsodtProductCount;
	private Boolean shsodtProductCount_isset=false;
	private String shsodtProductCount_orderby;
	private Boolean shsodtProductCount_hascolumn=false;
	private String shsodtProductCount_operators;
	public Integer getShsodtProductCount() { return shsodtProductCount; }
	public void setShsodtProductCount(Integer shsodtProductCount) { this.shsodtProductCount=shsodtProductCount; this.shsodtProductCount_isset=true; }
	public void setShsodtProductCount_Fix(String shsodtProductCount) { this.shsodtProductCount=this.sApp_Code.ToInt32(shsodtProductCount,0); this.shsodtProductCount_isset=true; }
	//shsodtCreateBy
	private Integer shsodtCreateBy;
	private Boolean shsodtCreateBy_isset=false;
	private String shsodtCreateBy_orderby;
	private Boolean shsodtCreateBy_hascolumn=false;
	private String shsodtCreateBy_operators;
	public Integer getShsodtCreateBy() { return shsodtCreateBy; }
	public void setShsodtCreateBy(Integer shsodtCreateBy) { this.shsodtCreateBy=shsodtCreateBy; this.shsodtCreateBy_isset=true; }
	public void setShsodtCreateBy_Fix(String shsodtCreateBy) { this.shsodtCreateBy=this.sApp_Code.ToInt32(shsodtCreateBy,0); this.shsodtCreateBy_isset=true; }
	//shsodtCreateTime
	private Date shsodtCreateTime;
	private Boolean shsodtCreateTime_isset=false;
	private String shsodtCreateTime_orderby;
	private Boolean shsodtCreateTime_hascolumn=false;
	private String shsodtCreateTime_operators;
	public Date getShsodtCreateTime() { return shsodtCreateTime; }
	public void setShsodtCreateTime(Date shsodtCreateTime) { this.shsodtCreateTime=shsodtCreateTime; this.shsodtCreateTime_isset=true; }
	public void setShsodtCreateTime_Fix(String shsodtCreateTime) { this.shsodtCreateTime=this.sApp_Code.ToDatetime(shsodtCreateTime,this.sDateFormat.format(new Date())); this.shsodtCreateTime_isset=true; }
	//shsodtModifyBy
	private Integer shsodtModifyBy;
	private Boolean shsodtModifyBy_isset=false;
	private String shsodtModifyBy_orderby;
	private Boolean shsodtModifyBy_hascolumn=false;
	private String shsodtModifyBy_operators;
	public Integer getShsodtModifyBy() { return shsodtModifyBy; }
	public void setShsodtModifyBy(Integer shsodtModifyBy) { this.shsodtModifyBy=shsodtModifyBy; this.shsodtModifyBy_isset=true; }
	public void setShsodtModifyBy_Fix(String shsodtModifyBy) { this.shsodtModifyBy=this.sApp_Code.ToInt32(shsodtModifyBy,0); this.shsodtModifyBy_isset=true; }
	//shsodtModifyTime
	private Date shsodtModifyTime;
	private Boolean shsodtModifyTime_isset=false;
	private String shsodtModifyTime_orderby;
	private Boolean shsodtModifyTime_hascolumn=false;
	private String shsodtModifyTime_operators;
	public Date getShsodtModifyTime() { return shsodtModifyTime; }
	public void setShsodtModifyTime(Date shsodtModifyTime) { this.shsodtModifyTime=shsodtModifyTime; this.shsodtModifyTime_isset=true; }
	public void setShsodtModifyTime_Fix(String shsodtModifyTime) { this.shsodtModifyTime=this.sApp_Code.ToDatetime(shsodtModifyTime,this.sDateFormat.format(new Date())); this.shsodtModifyTime_isset=true; }




	/* column text extend */
	//shsodtID_Text
	private String shsodtID_Text;
	public String getShsodtID_Text() { if(this.shsodtID==null){ this.shsodtID_Text=""; } if(this.shsodtID_Text==null){ this.shsodtID_Text=this.shsodtID.toString(); } return this.shsodtID_Text; }
	public void setShsodtID_Text(String shsodtID_Text) { this.shsodtID_Text=shsodtID_Text; }
	//shsodtState_Text
	private String shsodtState_Text;
	public String getShsodtState_Text() { if(this.shsodtState==null){ this.shsodtState_Text=""; } if(this.shsodtState_Text==null){ this.shsodtState_Text=this.shsodtState.toString(); } return this.shsodtState_Text; }
	public void setShsodtState_Text(String shsodtState_Text) { this.shsodtState_Text=shsodtState_Text; }
	//shsodtOrderinfoID_Text
	private String shsodtOrderinfoID_Text;
	public String getShsodtOrderinfoID_Text() { if(this.shsodtOrderinfoID==null){ this.shsodtOrderinfoID_Text=""; } if(this.shsodtOrderinfoID_Text==null){ this.shsodtOrderinfoID_Text=this.shsodtOrderinfoID.toString(); } return this.shsodtOrderinfoID_Text; }
	public void setShsodtOrderinfoID_Text(String shsodtOrderinfoID_Text) { this.shsodtOrderinfoID_Text=shsodtOrderinfoID_Text; }
	//shsodtProductID_Text
	private String shsodtProductID_Text;
	public String getShsodtProductID_Text() { if(this.shsodtProductID==null){ this.shsodtProductID_Text=""; } if(this.shsodtProductID_Text==null){ this.shsodtProductID_Text=this.shsodtProductID.toString(); } return this.shsodtProductID_Text; }
	public void setShsodtProductID_Text(String shsodtProductID_Text) { this.shsodtProductID_Text=shsodtProductID_Text; }
	//shsodtProductlineID_Text
	private String shsodtProductlineID_Text;
	public String getShsodtProductlineID_Text() { if(this.shsodtProductlineID==null){ this.shsodtProductlineID_Text=""; } if(this.shsodtProductlineID_Text==null){ this.shsodtProductlineID_Text=this.shsodtProductlineID.toString(); } return this.shsodtProductlineID_Text; }
	public void setShsodtProductlineID_Text(String shsodtProductlineID_Text) { this.shsodtProductlineID_Text=shsodtProductlineID_Text; }
	//shsodtCount_Text
	private String shsodtCount_Text;
	public String getShsodtCount_Text() { if(this.shsodtCount==null){ this.shsodtCount_Text=""; } if(this.shsodtCount_Text==null){ this.shsodtCount_Text=this.shsodtCount.toString(); } return this.shsodtCount_Text; }
	public void setShsodtCount_Text(String shsodtCount_Text) { this.shsodtCount_Text=shsodtCount_Text; }
	//shsodtProductCount_Text
	private String shsodtProductCount_Text;
	public String getShsodtProductCount_Text() { if(this.shsodtProductCount==null){ this.shsodtProductCount_Text=""; } if(this.shsodtProductCount_Text==null){ this.shsodtProductCount_Text=this.shsodtProductCount.toString(); } return this.shsodtProductCount_Text; }
	public void setShsodtProductCount_Text(String shsodtProductCount_Text) { this.shsodtProductCount_Text=shsodtProductCount_Text; }
	//shsodtCreateBy_Text
	private String shsodtCreateBy_Text;
	public String getShsodtCreateBy_Text() { if(this.shsodtCreateBy==null){ this.shsodtCreateBy_Text=""; } if(this.shsodtCreateBy_Text==null){ this.shsodtCreateBy_Text=this.shsodtCreateBy.toString(); } return this.shsodtCreateBy_Text; }
	public void setShsodtCreateBy_Text(String shsodtCreateBy_Text) { this.shsodtCreateBy_Text=shsodtCreateBy_Text; }
	//shsodtModifyBy_Text
	private String shsodtModifyBy_Text;
	public String getShsodtModifyBy_Text() { if(this.shsodtModifyBy==null){ this.shsodtModifyBy_Text=""; } if(this.shsodtModifyBy_Text==null){ this.shsodtModifyBy_Text=this.shsodtModifyBy.toString(); } return this.shsodtModifyBy_Text; }
	public void setShsodtModifyBy_Text(String shsodtModifyBy_Text) { this.shsodtModifyBy_Text=shsodtModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setShsodtID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setShsodtNumCode_Fix(pValue);
		}else if(pKey.equals("State")){ this.setShsodtState_Fix(pValue);
		}else if(pKey.equals("OrderinfoID")){ this.setShsodtOrderinfoID_Fix(pValue);
		}else if(pKey.equals("ProductID")){ this.setShsodtProductID_Fix(pValue);
		}else if(pKey.equals("ProductlineID")){ this.setShsodtProductlineID_Fix(pValue);
		}else if(pKey.equals("Count")){ this.setShsodtCount_Fix(pValue);
		}else if(pKey.equals("ProductCount")){ this.setShsodtProductCount_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setShsodtCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setShsodtCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setShsodtModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setShsodtModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getShsodtID()+"";
		}else if(pKey.equals("NumCode")){ return this.getShsodtNumCode()+"";
		}else if(pKey.equals("State")){ return this.getShsodtState()+"";
		}else if(pKey.equals("OrderinfoID")){ return this.getShsodtOrderinfoID()+"";
		}else if(pKey.equals("ProductID")){ return this.getShsodtProductID()+"";
		}else if(pKey.equals("ProductlineID")){ return this.getShsodtProductlineID()+"";
		}else if(pKey.equals("Count")){ return this.getShsodtCount()+"";
		}else if(pKey.equals("ProductCount")){ return this.getShsodtProductCount()+"";
		}else if(pKey.equals("CreateBy")){ return this.getShsodtCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getShsodtCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getShsodtModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getShsodtModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsodtID_isset;
		}else if(pKey.equals("NumCode")){ return this.shsodtNumCode_isset;
		}else if(pKey.equals("State")){ return this.shsodtState_isset;
		}else if(pKey.equals("OrderinfoID")){ return this.shsodtOrderinfoID_isset;
		}else if(pKey.equals("ProductID")){ return this.shsodtProductID_isset;
		}else if(pKey.equals("ProductlineID")){ return this.shsodtProductlineID_isset;
		}else if(pKey.equals("Count")){ return this.shsodtCount_isset;
		}else if(pKey.equals("ProductCount")){ return this.shsodtProductCount_isset;
		}else if(pKey.equals("CreateBy")){ return this.shsodtCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.shsodtCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.shsodtModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.shsodtModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsodtID_orderby;
		}else if(pKey.equals("NumCode")){ return this.shsodtNumCode_orderby;
		}else if(pKey.equals("State")){ return this.shsodtState_orderby;
		}else if(pKey.equals("OrderinfoID")){ return this.shsodtOrderinfoID_orderby;
		}else if(pKey.equals("ProductID")){ return this.shsodtProductID_orderby;
		}else if(pKey.equals("ProductlineID")){ return this.shsodtProductlineID_orderby;
		}else if(pKey.equals("Count")){ return this.shsodtCount_orderby;
		}else if(pKey.equals("ProductCount")){ return this.shsodtProductCount_orderby;
		}else if(pKey.equals("CreateBy")){ return this.shsodtCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.shsodtCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.shsodtModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.shsodtModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsodtID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.shsodtNumCode_hascolumn;
		}else if(pKey.equals("State")){ return this.shsodtState_hascolumn;
		}else if(pKey.equals("OrderinfoID")){ return this.shsodtOrderinfoID_hascolumn;
		}else if(pKey.equals("ProductID")){ return this.shsodtProductID_hascolumn;
		}else if(pKey.equals("ProductlineID")){ return this.shsodtProductlineID_hascolumn;
		}else if(pKey.equals("Count")){ return this.shsodtCount_hascolumn;
		}else if(pKey.equals("ProductCount")){ return this.shsodtProductCount_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.shsodtCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.shsodtCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.shsodtModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.shsodtModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsodtID_operators;
		}else if(pKey.equals("NumCode")){ return this.shsodtNumCode_operators;
		}else if(pKey.equals("State")){ return this.shsodtState_operators;
		}else if(pKey.equals("OrderinfoID")){ return this.shsodtOrderinfoID_operators;
		}else if(pKey.equals("ProductID")){ return this.shsodtProductID_operators;
		}else if(pKey.equals("ProductlineID")){ return this.shsodtProductlineID_operators;
		}else if(pKey.equals("Count")){ return this.shsodtCount_operators;
		}else if(pKey.equals("ProductCount")){ return this.shsodtProductCount_operators;
		}else if(pKey.equals("CreateBy")){ return this.shsodtCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.shsodtCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.shsodtModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.shsodtModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
