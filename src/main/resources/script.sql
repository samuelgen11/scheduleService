-- table feignMethods--

create table url(
id_method serial primary key,
api_method_name varchar(50),
url_string varchar(50)
);

create table cron_table(
id_cron_trigger int primary key,
cron_string varchar(50)
);

create table schedule_process(
id_schedule serial primary key,
api_method_name varchar(50),
status varchar(50),
beginning_date timestamp	
);

