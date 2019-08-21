create table 'customer' (
    'id' bigint(20) not null auto_increment comment 'ID',
    'name' varchar(255) default null comment '名称',
    'contact' varchar(255) default null comment '联系人',
    'telephone' varchar(255) default null comment '电话',
    'email' varchar(255) default null comment '邮箱',
    'remark' text comment '备注',
    primary key ('id')
) engine=InnoDB default charset=utf8;

insert into 'customer' (name, contact, telephone, email, remark)
values ('customer1', 'zhangsan', '18113131313', 'zhangsan@qq.com', null);

insert into 'customer' (name, contact, telephone, email, remark)
values ('customer2', 'lisi', '18113131314', 'lisi@qq.com', null);