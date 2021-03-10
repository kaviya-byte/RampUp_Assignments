create table ORDERS
(
  ID               VARCHAR(50) not null,
  AMOUNT           double precision not null,
  CUSTOMER_ADDRESS VARCHAR(255) not null,
  CUSTOMER_EMAIL   VARCHAR(128) not null,
  CUSTOMER_NAME    VARCHAR(255) not null,
  CUSTOMER_PHONE   VARCHAR(128) not null,
  ORDER_DATE       datetime not null,
  ORDER_NUM        INTEGER not null
) ;
alter table ORDERS
  add primary key (ID) ;
alter table ORDERS
  add constraint ORDER_UK unique (ORDER_NUM) ;