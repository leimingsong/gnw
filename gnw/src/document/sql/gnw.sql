/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/11/4 ����һ 19:27:15                       */
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
   area_id              varchar(36) not null comment '��ַ��ţ���������uuid�������',
   area_name            varchar(32) comment '��ַ����',
   par_area_id          varchar(36) comment '�ϼ���ַ��ţ���������������area_id�ֶΣ�',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (area_id)
);

alter table area comment '�������������������Ϣ����ַ��ţ���ַ���֣��ϼ���ַ���';

/*==============================================================*/
/* Table: carousel                                              */
/*==============================================================*/
create table carousel
(
   caro_id              varchar(36) not null comment '�ֲ�ͼ��ţ���������uuid�������',
   caro_url             varchar(64) comment '�ֲ�ͼ��ַ',
   caro_status          varchar(32) comment '�ֲ�״̬',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (caro_id)
);

alter table carousel comment '�ֲ������������ֲ�ͼ�������Ϣ���ֲ���ţ��ֲ�url���ֲ�״̬';

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category
(
   cate_id              varchar(36) not null comment '����ţ���������uuid�Զ�����',
   par_cate_id          varchar(36) comment '�ϼ�����ţ���������������cate_id�ֶΣ�,��uuid���������',
   cate_name            varchar(32) comment '�������',
   cate_status          varchar(32) comment '���״̬',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (cate_id)
);

alter table category comment '��������������Ʒ�������Ϣ������ţ��ϼ�����ţ�������ƣ�״̬';

/*==============================================================*/
/* Table: details_img                                           */
/*==============================================================*/
create table details_img
(
   deta_img_id          varchar(36) not null comment '����ҳͼƬ��ţ���������uuid�������',
   prod_details_id      varchar(36) comment '��Ʒ�����ţ����������product_details���prod_etails_id�ֶΣ�����uuid�������',
   deta_img_url         varchar(64) comment '����ҳͼƬUrl',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (deta_img_id)
);

alter table details_img comment '����ҳͼƬ����������ͼƬ����Ҫ��Ϣ';

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              varchar(36) not null comment '�˵���ţ���������uuid�Զ�����',
   menu_name            varchar(32) comment '�˵�����',
   menu_address         varchar(64) comment 'url��ַ',
   par_menu_id          varchar(36) comment '�ϼ��˵�����������������menuId�ֶΣ�����uuid���������',
   menu_status          varchar(32) comment '�˵�״̬',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (menu_id)
);

alter table menu comment '�˵�����������˵���Ϣ���˵���ţ��˵����֣�url��ַ���ϼ��˵�,�˵�״̬';

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table "order"
(
   order_id             varchar(36) not null comment '������ţ���������uuid����',
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   total_price          varchar(32) comment '��Ʒ�ܼ�',
   order_time           datetime comment '��¼��������ʱ��',
   order_count          int comment '��������',
   order_state          varchar(32) comment '����״̬',
   per_address_id       varchar(36) comment '���˵�ַ��ţ����������perAddress���perAddressId�ֶΣ�����uuid���������',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (order_id)
);

alter table "order" comment '�������������涩������Ҫ��Ϣ��������ţ��û���ţ��ܼۣ�ʱ�䣬��������������״̬���ջ����';

/*==============================================================*/
/* Table: order_details                                         */
/*==============================================================*/
create table order_details
(
   order_details_id     varchar(36) not null comment '���������ţ���������uuid�������',
   order_id             varchar(36) comment '������ţ����������order���order_id�ֶΣ�����uuid����',
   prod_id              varchar(36) comment '��Ʒ��ţ����������product���prod_id�ֶΣ�����uuid�������',
   pre_price            varchar(32) comment '����',
   prod_count           int comment '��Ʒ����',
   total_price          varchar(32) comment '�ܼ�',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (order_details_id)
);

alter table order_details comment '����������������涩������ϸ��Ϣ�����������ţ�������ţ���Ʒ��ţ����ۣ���Ʒ�������ܼ�';

/*==============================================================*/
/* Table: per_address                                           */
/*==============================================================*/
create table per_address
(
   per_address_id       varchar(36) not null comment '���˵�ַ��ţ���������uuid���������',
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   per_address          varchar(255) comment '���˵�ַ',
   postcode             varchar(16) comment '�ʱ�',
   tel                  varchar(32) comment '��ϵ�绰��һ������Ч��11Ϊ�绰����',
   post_name            varchar(32) comment '�ջ�������',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (per_address_id)
);

alter table per_address comment '�����ջ���ַ�����������û�������ջ���Ϣ����ַ��ţ��û���ţ���ַ���ʱ࣬��ϵ�绰���ջ�������';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   prod_id              varchar(36) not null comment '��Ʒ��ţ���������uuid�������',
   prod_details_id      varchar(36) comment '��Ʒ�����ţ����������product_details���prod_details_id�ֶΣ�����uuid�������',
   prod_status          varchar(32) comment '��Ʒ״̬',
   update_time          datetime comment '����ʱ��',
   real_price           varchar(32) comment '��Ʒʵ�ʼ۸�',
   sale_price           varchar(32) comment '���ۼ۸�',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_id)
);

alter table product comment '��Ʒ������������Ʒ����Ҫ��Ϣ����Ʒ��ţ���Ʒ������ţ���Ʒ״̬������ʱ�䣬ʵ�ʼ۸����ۼ۸�';

/*==============================================================*/
/* Table: product_details                                       */
/*==============================================================*/
create table product_details
(
   prod_details_id      varchar(36) not null comment '��Ʒ�����ţ���������uuid�������',
   cate_id              varchar(36) comment '����ţ����������category���cate_id�ֶΣ�����uuid�Զ�����',
   prod_details_name    varchar(32) comment '��Ʒ����',
   prod_details_comment varchar(255) comment '��Ʒ����',
   show_img_url         varchar(64) comment 'չʾͼƬUrl',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_details_id)
);

alter table product_details comment '��Ʒ���������������Ʒ����ϸ��Ϣ����Ʒ�����ţ�����ţ���Ʒ���ƣ���Ʒ������չʾͼƬURL	';

/*==============================================================*/
/* Table: product_feedback                                      */
/*==============================================================*/
create table product_feedback
(
   prod_feedback_id     varchar(36) not null comment '��Ʒ������ţ���������uuid�������',
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   prod_id              varchar(36) comment '��Ʒ��ţ����������product���pro_id�ֶΣ�����uuid�������',
   feedback_time        datatime comment '����ʱ��',
   feedback_content     varchar(255) comment '��������',
   par_feedback_id      varchar(36) comment '�ϼ�������ţ���������������prod_feedback_id���ֶΣ�',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (prod_feedback_id)
);

alter table product_feedback comment '��Ʒ����������������Ʒ�ķ�����Ϣ����Ʒ������ţ��û���ţ���Ʒ��ţ�����ʱ�䣬�������ݣ��ϼ��������';

/*==============================================================*/
/* Table: right                                                 */
/*==============================================================*/
create table right
(
   right_id             varchar(36) not null comment 'Ȩ�ޱ�ţ���������uuid���������',
   right_name           varchar(32) comment 'Ȩ������',
   right_comment        varchar(255) comment 'Ȩ��������Ϣ',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (right_id)
);

alter table right comment 'Ȩ�ޱ����ڱ���Ȩ����Ϣ��Ȩ�ޱ�ţ�Ȩ�����֣�Ȩ������';

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   role_id              varchar(36) not null comment '��ɫ��ţ���������uuid���������',
   role_name            varchar(32) comment '��ɫ����',
   role_comment         varchar(255) comment '��ɫ��������Ϣ',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (role_id)
);

alter table role comment '��ɫ�����ڱ����ɫ�����Ϣ����ɫ��ţ���ɫ���֣���ɫ����';

/*==============================================================*/
/* Table: role_right                                            */
/*==============================================================*/
create table role_right
(
   role_id              varchar(36) comment '��ɫ��ţ����������role���role_id�ֶΣ�����uuid���������',
   right_id             varchar(36) comment 'Ȩ�ޱ�ţ����������right���right_id�ֶΣ�����uuid���������',
   spare1               varchar(64) comment '�����ֶ�1',
   spare2               varchar(64) comment '�����ֶ�2',
   spare3               varchar(64) comment '�����ֶ�3'
);

alter table role_right comment '��ɫȨ�ޱ����������ɫ��Ȩ�޵���Ϣ';

/*==============================================================*/
/* Table: shop_car                                              */
/*==============================================================*/
create table shop_car
(
   shop_carId           varchar(36) not null comment '���ﳵ��ţ���������uuid�������',
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   prod_id              varchar(36) comment '��Ʒ��ţ����������product���prod_id�ֶΣ�����uuid�������',
   count                int(16) comment '���ﳵ����',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (shop_carId)
);

alter table shop_car comment '���ﳵ���������湺�ﳵ����Ϣ�����ﳵ��ţ��û���ţ���Ʒ��ţ�����';

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_id              varchar(36) not null comment '�û���ţ�����,��uuid���������',
   account              varchar(32) comment '�û��˺ţ�Ψһ���������ֻ��Ż�������',
   nickname             varchar(64) comment '�û��ǳƣ��û��Զ�������֣����硰���Ǻ����ҳ�˧��',
   password             varchar(64) comment '�û�����,ʹ��md5���ܺ���ַ���',
   role_id              varchar(36) comment '��ɫ��ţ����������role���roleId�ֶΣ�����uuid���������',
   user_status          varchar(16) comment '�û�״̬',
   spare1               varchar(64) comment '�����ֶ�',
   spare2               varchar(64) comment '�����ֶ�',
   spare3               varchar(64) comment '�����ֶ�',
   primary key (user_id),
   key AK_account (user_id, account)
);

alter table user comment '�û������������û���Ҫ��Ϣ���û���ţ��˺ţ��ǳƣ����룬��ɫ��ţ��û�״̬';

/*==============================================================*/
/* Table: userDetails                                           */
/*==============================================================*/
create table userDetails
(
   uDetails_id          varchar(36) not null comment '�û�������Ϣ��ţ���������uuid���������',
   user_id              varchar(36) comment '�û���ţ����������user���userId�ֶΣ�,��uuid���������',
   realname             varchar(16) comment '�û�����ʵ���������硰������',
   tel                  varchar(16) comment '�û���ϵ��ʽ��һ������Ч��11Ϊ�绰����',
   gender               int(2) comment '�û��Ա𣬡�0����ʾ���С�����1����ʾ��Ů��',
   age                  int(4) comment '�û�����',
   email                varchar(32) comment '�û�����',
   idCard               varchar(18),
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (uDetails_id)
);

alter table userDetails comment '������Ϣ��ţ��û���ţ����������ʵ��������ϵ��ʽ���Ա����䣬���䣬���֤����';

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   role_id              varchar(36) comment '��ɫ��ţ����������role���role_id�ֶΣ�����uuid���������',
   spare1               varchar(64) comment '�����ֶ�',
   spare2               varchar(64) comment '�����ֶ�',
   spare3               varchar(64) comment '�����ֶ�',
   primary key ()
);

alter table user_role comment '�û���ɫ�����������û��Լ���ɫ��Ϣ';

/*==============================================================*/
/* Table: watch                                                 */
/*==============================================================*/
create table watch
(
   watch_id             varchar(36) not null comment '��ע��ţ���������uuid�Զ�����',
   user_id              varchar(36) comment '�û���ţ����������user���user_id�ֶΣ�,��uuid���������',
   prod_id              varchar(36) comment '��Ʒ��ţ������������product���proid_id�ֶΣ���uuid�������',
   watch_type           varchar(32) comment '��ע���',
   spare1               varchar(64),
   spare2               varchar(64),
   spare3               varchar(64),
   primary key (watch_id)
);

alter table watch comment '��ע�����������û���ע��Ϣ����ע��ţ��û���ţ���Ʒ��ţ� ��ע���';

