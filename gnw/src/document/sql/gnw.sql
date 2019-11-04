/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/11/4 星期一 19:27:15                       */
/*==============================================================*/


drop table if exists area;

drop table if exists carousel;

drop table if exists category;

drop table if exists details_img;

drop table if exists menu;

drop table if exists "order";

drop table if exists order_details;

drop table if exists per_address;

drop table if exists product;

drop table if exists product_details;

drop table if exists product_feedback;

drop table if exists right;

drop table if exists role;

drop table if exists role_right;

drop table if exists shop_car;

drop table if exists user;

drop table if exists userDetails;

drop table if exists user_role;

drop table if exists watch;

/*==============================================================*/
/* Table: area                                                  */
/*==============================================================*/
create table area
(
   area_id              varchar(36) not null comment '地址编号，主键，用uuid随机生成',
   area_name            varchar(32) comment '地址名字',
   par_area_id          varchar(36) comment '上级地址编号，外键（关联本表的area_id字段）',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (area_id)
);

alter table area comment '地区表，用来保存地区信息，地址编号，地址名字，上级地址编号';

/*==============================================================*/
/* Table: carousel                                              */
/*==============================================================*/
create table carousel
(
   caro_id              varchar(36) not null comment '轮播图编号，主键，用uuid随机生成',
   caro_url             varchar(64) comment '轮播图地址',
   caro_status          varchar(32) comment '轮播状态',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (caro_id)
);

alter table carousel comment '轮播表，用来保存轮播图的相关信息，轮播编号，轮播url，轮播状态';

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category
(
   cate_id              varchar(36) not null comment '类别编号，主键，用uuid自动生成',
   par_cate_id          varchar(36) comment '上级类别编号，外键（关联本表的cate_id字段）,用uuid来随机生成',
   cate_name            varchar(32) comment '类别名称',
   cate_status          varchar(32) comment '类别状态',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (cate_id)
);

alter table category comment '类别表，用来保存商品的类别信息，类别编号，上级类别编号，类别名称，状态';

/*==============================================================*/
/* Table: details_img                                           */
/*==============================================================*/
create table details_img
(
   deta_img_id          varchar(36) not null comment '详情页图片编号，主键，用uuid随机生成',
   prod_details_id      varchar(36) comment '商品详情编号，外键（关联product_details表的prod_etails_id字段），用uuid随机生成',
   deta_img_url         varchar(64) comment '详情页图片Url',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (deta_img_id)
);

alter table details_img comment '详情页图片表，用来保存图片的主要信息';

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              varchar(36) not null comment '菜单编号，主键，用uuid自动生成',
   menu_name            varchar(32) comment '菜单名字',
   menu_address         varchar(64) comment 'url地址',
   par_menu_id          varchar(36) comment '上级菜单，外键（关联本表的menuId字段），用uuid来随机生成',
   menu_status          varchar(32) comment '菜单状态',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (menu_id)
);

alter table menu comment '菜单表，用来保存菜单信息，菜单编号，菜单名字，url地址，上级菜单,菜单状态';

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table "order"
(
   order_id             varchar(36) not null comment '订单编号，主键，用uuid生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   total_price          varchar(32) comment '物品总价',
   order_time           datetime comment '记录订单生成时间',
   order_count          int comment '订单数量',
   order_state          varchar(32) comment '订单状态',
   per_address_id       varchar(36) comment '个人地址编号，外键（关联perAddress表的perAddressId字段），用uuid来随机生成',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (order_id)
);

alter table "order" comment '订单表，用来保存订单的主要信息，订单编号，用户编号，总价，时间，订单数量，订单状态，收货编号';

/*==============================================================*/
/* Table: order_details                                         */
/*==============================================================*/
create table order_details
(
   order_details_id     varchar(36) not null comment '订单详情编号，主键，用uuid随机生成',
   order_id             varchar(36) comment '订单编号，外键（关联order表的order_id字段），用uuid生成',
   prod_id              varchar(36) comment '商品编号，外键（关联product表的prod_id字段），用uuid随机生成',
   pre_price            varchar(32) comment '单价',
   prod_count           int comment '商品数量',
   total_price          varchar(32) comment '总价',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (order_details_id)
);

alter table order_details comment '订单详情表，用来保存订单的详细信息，订单详情编号，订单编号，商品编号，单价，商品数量，总价';

/*==============================================================*/
/* Table: per_address                                           */
/*==============================================================*/
create table per_address
(
   per_address_id       varchar(36) not null comment '个人地址编号，主键，用uuid来随机生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   per_address          varchar(255) comment '个人地址',
   postcode             varchar(16) comment '邮编',
   tel                  varchar(32) comment '联系电话，一般是有效的11为电话号码',
   post_name            varchar(32) comment '收货人姓名',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (per_address_id)
);

alter table per_address comment '个人收货地址表，用来保存用户的相关收获信息，地址编号，用户编号，地址，邮编，联系电话，收货人姓名';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   prod_id              varchar(36) not null comment '商品编号，主键，用uuid随机生成',
   prod_details_id      varchar(36) comment '商品详情编号，外键（关联product_details表的prod_details_id字段），用uuid随机生成',
   prod_status          varchar(32) comment '商品状态',
   update_time          datetime comment '更新时间',
   real_price           varchar(32) comment '商品实际价格',
   sale_price           varchar(32) comment '销售价格',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_id)
);

alter table product comment '商品表，用来保存商品的主要信息，商品编号，商品详情表编号，商品状态，更新时间，实际价格，销售价格';

/*==============================================================*/
/* Table: product_details                                       */
/*==============================================================*/
create table product_details
(
   prod_details_id      varchar(36) not null comment '商品详情编号，主键，用uuid随机生成',
   cate_id              varchar(36) comment '类别编号，外键（关联category表的cate_id字段），用uuid自动生成',
   prod_details_name    varchar(32) comment '商品名称',
   prod_details_comment varchar(255) comment '商品描述',
   show_img_url         varchar(64) comment '展示图片Url',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_details_id)
);

alter table product_details comment '商品详情表，用来保存商品的详细信息，商品详情编号，类别编号，商品名称，商品描述，展示图片URL	';

/*==============================================================*/
/* Table: product_feedback                                      */
/*==============================================================*/
create table product_feedback
(
   prod_feedback_id     varchar(36) not null comment '商品反馈编号，主键，用uuid随机生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   prod_id              varchar(36) comment '商品编号，外键（关联product表的pro_id字段），用uuid随机生成',
   feedback_time        datatime comment '反馈时间',
   feedback_content     varchar(255) comment '反馈内容',
   par_feedback_id      varchar(36) comment '上级反馈编号，外键（关联本表的prod_feedback_id的字段）',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_feedback_id)
);

alter table product_feedback comment '商品反馈表，用来保存商品的反馈信息，商品反馈编号，用户编号，商品编号，反馈时间，反馈内容，上级反馈编号';

/*==============================================================*/
/* Table: right                                                 */
/*==============================================================*/
create table right
(
   right_id             varchar(36) not null comment '权限编号，主键，用uuid来随机生成',
   right_name           varchar(32) comment '权限名字',
   right_comment        varchar(255) comment '权限描述信息',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (right_id)
);

alter table right comment '权限表，用于保存权限信息，权限编号，权限名字，权限描述';

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   role_id              varchar(36) not null comment '角色编号，主键，用uuid来随机生成',
   role_name            varchar(32) comment '角色名字',
   role_comment         varchar(255) comment '角色的描述信息',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (role_id)
);

alter table role comment '角色表，用于保存角色相关信息，角色编号，角色名字，角色描述';

/*==============================================================*/
/* Table: role_right                                            */
/*==============================================================*/
create table role_right
(
   role_id              varchar(36) comment '角色编号，外键（关联role表的role_id字段），用uuid来随机生成',
   right_id             varchar(36) comment '权限编号，外键（关联right表的right_id字段），用uuid来随机生成',
   spare1               varchar(64) comment '备用字段1',
   spare2               varchar(64) comment '备用字段2',
   spare3               varchar(64) comment '备用字段3'
);

alter table role_right comment '角色权限表，用来保存角色及权限的信息';

/*==============================================================*/
/* Table: shop_car                                              */
/*==============================================================*/
create table shop_car
(
   shop_carId           varchar(36) not null comment '购物车编号，主键，用uuid随机生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   prod_id              varchar(36) comment '商品编号，外键（关联product表的prod_id字段），用uuid随机生成',
   count                int(16) comment '购物车数量',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (shop_carId)
);

alter table shop_car comment '购物车表，用来保存购物车的信息，购物车编号，用户编号，商品编号，数量';

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_id              varchar(36) not null comment '用户编号，主键,用uuid来随机生成',
   account              varchar(32) comment '用户账号，唯一，可以是手机号或者邮箱',
   nickname             varchar(64) comment '用户昵称，用户自定义的名字，比如“我是韩再我超帅”',
   password             varchar(64) comment '用户密码,使用md5加密后的字符串',
   role_id              varchar(36) comment '角色编号，外键（关联role表的roleId字段），用uuid来随机生成',
   user_status          varchar(16) comment '用户状态',
   spare1               varchar(64) comment '备用字段',
   spare2               varchar(64) comment '备用字段',
   spare3               varchar(64) comment '备用字段',
   primary key (user_id),
   key AK_account (user_id, account)
);

alter table user comment '用户表，用来保存用户主要信息，用户编号，账号，昵称，密码，角色编号，用户状态';

/*==============================================================*/
/* Table: userDetails                                           */
/*==============================================================*/
create table userDetails
(
   uDetails_id          varchar(36) not null comment '用户基本信息编号，主键，用uuid来随机生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的userId字段）,用uuid来随机生成',
   realname             varchar(16) comment '用户的真实姓名，比如“张三”',
   tel                  varchar(16) comment '用户联系方式，一般是有效的11为电话号码',
   gender               int(2) comment '用户性别，“0”表示“男”，“1”表示“女”',
   age                  int(4) comment '用户年龄',
   email                varchar(32) comment '用户邮箱',
   idCard               varchar(18),
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (uDetails_id)
);

alter table userDetails comment '基本信息编号，用户编号（外键），真实姓名，联系方式，性别，年龄，邮箱，身份证号码';

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   role_id              varchar(36) comment '角色编号，外键（关联role表的role_id字段），用uuid来随机生成',
   spare1               varchar(64) comment '备用字段',
   spare2               varchar(64) comment '备用字段',
   spare3               varchar(64) comment '备用字段',
   primary key ()
);

alter table user_role comment '用户角色表，用来保存用户以及角色信息';

/*==============================================================*/
/* Table: watch                                                 */
/*==============================================================*/
create table watch
(
   watch_id             varchar(36) not null comment '关注编号，主键，用uuid自动生成',
   user_id              varchar(36) comment '用户编号，外键（关联user表的user_id字段）,用uuid来随机生成',
   prod_id              varchar(36) comment '商品编号，外键，（关联product表的proid_id字段）用uuid随机生成',
   watch_type           varchar(32) comment '关注类别',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (watch_id)
);

alter table watch comment '关注表，用来保存用户关注信息，关注编号，用户编号，商品编号， 关注类别';

