




drop table if exists corenets_userinfo;
create table corenets_userinfo
(
   uitID                int(11) not null auto_increment  comment 'ID',
   uitName              varchar(180) default '' comment '用户名',
   uitNumCode              varchar(180) default '' comment '用户编号',
   uitUserrole              int(11) default 0 comment '用户角色',
   uitPxd               varchar(180) default '' comment '密码',
   uitMobile            varchar(42) default '' comment '手机号',
   uitEmail             varchar(90) default '' comment '邮箱',
   uitCreateBy        int(11) default 0 comment '创建人',
   uitCreateTime      datetime comment '创建时间',
   uitModifyBy        int(11) default 0 comment '修改人',
   uitModifyTime      datetime comment '修改时间',

   primary key (uitID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_userinfo comment '用户信息';

INSERT INTO `corenets_userinfo` (uitName,uitNumCode,uitUserrole,uitPxd,uitMobile,uitEmail) VALUES ('admin', 'N_2022111509280157432', '1', '4297f44b13955235245b2497399d7a93', '15800000000', '110410524@qq.com');






drop table if exists corenets_userrole;
create table corenets_userrole
(
   uirtID                int(11) not null auto_increment comment 'ID',
   uirtName              varchar(180) default '' comment '角色名',
   uirtNumCode              varchar(80) default '' comment '角色编号',
   uirtType               int(5) default 0 comment '角色类型',
   uirtPower               varchar(250) default '' comment '权限配置',
   uirtCreateBy        int(11) default 0 comment '创建人',
   uirtCreateTime      datetime comment '创建时间',
   uirtModifyBy        int(11) default 0 comment '修改人',
   uirtModifyTime      datetime comment '修改时间',

   primary key (uirtID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_userrole comment '用户角色';


INSERT INTO corenets_userrole(uirtName,uirtNumCode,uirtType,uirtCreateBy,uirtCreateTime)VALUES('超级管理员','N_20202031211',1,1,now());
INSERT INTO corenets_userrole(uirtName,uirtNumCode,uirtType,uirtCreateBy,uirtCreateTime)VALUES('商品品类管理员','N_20202031212',2,1,now());
INSERT INTO corenets_userrole(uirtName,uirtNumCode,uirtType,uirtCreateBy,uirtCreateTime)VALUES('订单管理员','N_20202031213',3,1,now());
INSERT INTO corenets_userrole(uirtName,uirtNumCode,uirtType,uirtCreateBy,uirtCreateTime)VALUES('仓库管理员','N_20202031214',4,1,now());
INSERT INTO corenets_userrole(uirtName,uirtNumCode,uirtType,uirtCreateBy,uirtCreateTime)VALUES('生产管理员','N_20202031215',5,1,now());








drop table if exists corenets_orderinfo;
create table corenets_orderinfo
(
   shsotID              int(11) not null auto_increment comment 'ID',
   shsotNumCode         varchar(80) default '' comment '订单号',
   shsotCreateBy        int(11) default 0 comment '创建人',
   shsotCreateTime      datetime comment '创建时间',
   shsotModifyBy        int(11) default 0 comment '修改人',
   shsotModifyTime      datetime comment '修改时间',

   primary key (shsotID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_orderinfo comment '订单信息';

drop table if exists corenets_orderinfodetail;
create table corenets_orderinfodetail
(
   shsodtID              int(11) not null auto_increment comment 'ID',
   shsodtNumCode         varchar(80) default '' comment '订单明细编号',

   shsodtState        int(5) comment '订单明细状态',
   shsodtOrderinfoID        int(11) default 0 comment '所属订单ID',
   shsodtProductID        int(11) default 0 comment '产品ID',
   shsodtProductlineID        int(11) default 0 comment '生产线ID',
   shsodtCount        int(11) default 0 comment '数量',
   shsodtProductCount        int(11) default 0 comment '生产数量',

   shsodtCreateBy        int(11) default 0 comment '创建人',
   shsodtCreateTime      datetime comment '创建时间',
   shsodtModifyBy        int(11) default 0 comment '修改人',
   shsodtModifyTime      datetime comment '修改时间',

   primary key (shsodtID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_orderinfodetail comment '订单明细';







drop table if exists corenets_product;
create table corenets_product
(
   shstID              int(11) not null auto_increment comment 'ID',
   shstName         varchar(180) default '' comment '产品名称',
   shstNumCode              varchar(80) default '' comment '产品编号',
   shstPrice              decimal(9,2) default 0.00 comment '售价',
   shstCost              decimal(9,2) default 0.00 comment '成本价',
   shstTimeStandard              decimal(9,2) default 0.00 comment '生产标准时间',
   shstCreateBy        int(11) default 0 comment '创建人',
   shstCreateTime      datetime comment '创建时间',
   shstModifyBy        int(11) default 0 comment '修改人',
   shstModifyTime      datetime comment '修改时间',

   primary key (shstID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_product comment '商品品类';

INSERT INTO corenets_product(shstName,shstNumCode,shstPrice,shstCost,shstTimeStandard,shstCreateBy,shstCreateTime)VALUES('手机支架','N_20202233333211',30.00,15.00,2.00,1,now());





drop table if exists corenets_warehouse;
create table corenets_warehouse
(
   whtID              int(11) not null auto_increment comment 'ID',
   whtName         varchar(180) default '' comment '仓库名称',
   whtNumCode         varchar(80) default '' comment '仓库编号',

   whtCreateBy        int(11) default 0 comment '创建人',
   whtCreateTime      datetime comment '创建时间',
   whtModifyBy        int(11) default 0 comment '修改人',
   whtModifyTime      datetime comment '修改时间',

   primary key (whtID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_warehouse comment '仓库';

INSERT INTO corenets_warehouse(whtName,whtNumCode,whtCreateBy,whtCreateTime)VALUES('武汉第一仓','N_20202233333211',1,now());
INSERT INTO corenets_warehouse(whtName,whtNumCode,whtCreateBy,whtCreateTime)VALUES('北京第二仓','N_20202233333212',1,now());

drop table if exists corenets_warehousestock;
create table corenets_warehousestock
(
   whstID              int(11) not null auto_increment comment 'ID',
   whstNumCode         varchar(80) default '' comment '库存编号',


   whstWarehouseID         int(11) default 0 comment '仓库ID',
   whstProductID         int(11) default 0 comment '商品品类ID',
   whstCount         int(11) default 0 comment '库存数量',



   whstCreateBy        int(11) default 0 comment '创建人',
   whstCreateTime      datetime comment '创建时间',
   whstModifyBy        int(11) default 0 comment '修改人',
   whstModifyTime      datetime comment '修改时间',

   primary key (whstID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_warehousestock comment '库存';


drop table if exists corenets_warehouseorder;
create table corenets_warehouseorder
(
   whotID              int(11) not null auto_increment comment 'ID',
   whotNumCode         varchar(80) default '' comment '库存编号',


   whotType         int(2) default 0 comment '类型：0入库、1出库、2转库',

   whotWarehouseID         int(11) default 0 comment '仓库ID',
   whotProductID         int(11) default 0 comment '产品ID',
   whotCount         int(11) default 0 comment '数量',


   whotCreateBy        int(11) default 0 comment '创建人',
   whotCreateTime      datetime comment '创建时间',
   whotModifyBy        int(11) default 0 comment '修改人',
   whotModifyTime      datetime comment '修改时间',

   primary key (whotID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_warehouseorder comment '出入库记录';

drop table if exists corenets_warehouseorderdetail;
create table corenets_warehouseorderdetail
(
   whodetID              int(11) not null auto_increment comment 'ID',
   whodetNumCode         varchar(80) default '' comment '库存编号',


   whodetWarehouseorderID         int(2) default 0 comment '所属调库单',
   whodetWarehousedetailID         int(11) default 0 comment '库存ID',
   whodetCount         int(11) default 0 comment '库存数量',



   whodetCreateBy        int(11) default 0 comment '创建人',
   whodetCreateTime      datetime comment '创建时间',
   whodetModifyBy        int(11) default 0 comment '修改人',
   whodetModifyTime      datetime comment '修改时间',

   primary key (whodetID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_warehouseorderdetail comment '出入库记录明细';






drop table if exists corenets_productline;
create table corenets_productline
(
   pltID              int(11) not null auto_increment comment 'ID',
   pltName         varchar(180) default '' comment '生产线名称',
   pltNumCode         varchar(80) default '' comment '生产线编号',

   pltProductivity         decimal(9,2) default 0.00 comment '生产力系数',

   pltCreateBy        int(11) default 0 comment '创建人',
   pltCreateTime      datetime comment '创建时间',
   pltModifyBy        int(11) default 0 comment '修改人',
   pltModifyTime      datetime comment '修改时间',

   primary key (pltID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_productline comment '用户信息';

INSERT INTO corenets_productline(pltName,pltNumCode,pltProductivity,pltCreateBy,pltCreateTime)VALUES('塑料第一产线','N_20202233333211',1.1,1,now());
INSERT INTO corenets_productline(pltName,pltNumCode,pltProductivity,pltCreateBy,pltCreateTime)VALUES('混合第二产线','N_20202233333212',1.6,1,now());







drop table if exists corenets_productlineorderdetail;
create table corenets_productlineorderdetail
(
   plodtID              int(11) not null auto_increment comment 'ID',
   plodtNumCode         varchar(80) default '' comment '生产单据明细编号',


   plodtProductID              int(11) default 0 comment '商品品类ID',
   plodtProductlineID              int(11) default 0 comment '生成线ID',
   plodtOrderdetailID              int(11) default 0 comment '订单明细ID',
   plodtStatus              int(2) default 0 comment '完成状态',
   plodtCount              int(11) default 0 comment '数量',
   plodtCompleteTime              datetime comment '完成时间',


   plodtCreateBy        int(11) default 0 comment '创建人',
   plodtCreateTime      datetime comment '创建时间',
   plodtModifyBy        int(11) default 0 comment '修改人',
   plodtModifyTime      datetime comment '修改时间',

   primary key (plodtID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table corenets_productlineorderdetail comment '生产单据明细';




