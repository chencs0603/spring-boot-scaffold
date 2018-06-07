DROP DATABASE IF EXISTS scaffold_db;
CREATE DATABASE scaffold_db CHARSET = UTF8;
USE scaffold_db;

# 日志表
CREATE TABLE log(
	id BIGINT AUTO_INCREMENT COMMENT '主键，自增',
	ip VARCHAR(32) NOT NULL COMMENT 'ip地址',
	url VARCHAR(128) NOT NULL COMMENT '访问URL',
	method VARCHAR(64) NOT NULL COMMENT '处理方法名',
	params VARCHAR(2048) NOT NULL COMMENT '请求参数',
	result VARCHAR(2048) NOT NULL COMMENT '输出结果',
	spend_time INT NOT NULL COMMENT '处理时间，单位毫秒',
	create_time DATETIME NOT NULL COMMENT '记录时间',
	PRIMARY KEY (id)
);

# 创建用户并授权
GRANT ALL ON scaffold_db.* TO 'scaffold_server'@'%' IDENTIFIED BY '123456';