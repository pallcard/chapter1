-- 清空表中数据
truncate customer;

insert into 'customer' (name, contact, telephone, email, remark)
values ('customer1', 'zhangsan', '18113131313', 'zhangsan@qq.com', null);

insert into 'customer' (name, contact, telephone, email, remark)
values ('customer2', 'lisi', '18113131314', 'lisi@qq.com', null);