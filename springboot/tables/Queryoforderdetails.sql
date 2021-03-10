
alter table ORDER_DETAILS
  add primary key (ID) ;
alter table ORDER_DETAILS
  add constraint ORDER_DETAIL_ORD_FK foreign key (ORDER_ID)
  references ORDERS (ID);
alter table ORDER_DETAILS
  add constraint ORDER_DETAIL_PROD_FK foreign key (PRODUCT_ID)
  references PRODUCTS (CODE);