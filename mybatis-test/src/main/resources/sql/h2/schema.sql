CREATE TABLE w_user (
  user_id bigint(20) NOT NULL AUTO_INCREMENT ,
  user_name varchar(200) NOT NULL ,
  user_age int(3) NOT NULL DEFAULT 0,
  PRIMARY KEY (user_id)
);