# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id                        bigint auto_increment not null,
  label                     varchar(255),
  constraint pk_task primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  label                     varchar(255),
  jayson                    varchar(255),
  y_sayi                    integer,
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table task;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

