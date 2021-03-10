create table ORDER_DETAILS
(
  ID         VARCHAR(50) not null,
  AMOUNT     double precision not null,
  PRICE      double precision not null,
  QUANITY    INTEGER not null,
  ORDER_ID   VARCHAR(50) not null,
  PRODUCT_ID VARCHAR(20) not null
) ;
