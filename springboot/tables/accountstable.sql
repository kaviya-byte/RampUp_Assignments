create table ACCOUNTS
(
  USER_NAME VARCHAR(20) not null,
  ACTIVE    BIT not null,
  ENCRYTED_PASSWORD  VARCHAR(128) not null,
  USER_ROLE VARCHAR(20) not null
) ;

alter table ACCOUNTS
  add primary key (USER_NAME) ;