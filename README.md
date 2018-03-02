# H2 Database source code learning
forked from [codefollower/H2-Research](https://github.com/codefollower/H2-Research)  

[H2数据库](http://www.h2database.com/html/main.html)源代码学习研究(包括代码注释、文档、用于代码分析的测试用例)

## todo

- [ ] 存储结构   
- [ ] 索引结构   
- [ ] 关系管理   
- [ ] 扩容处理   
- [ ] SQL解析 
- [ ] join实现 
- [ ] 查询计划 
- [ ] 事务管理、回滚、ACID  
- [ ] 并发控制  
- [ ] jdbc驱动  
- [ ] 网络io、复制、同步  

## 运行或调试H2

- my/test/MyServer.java文件  
直接执行main()方法


## 测试

- my.test包中的类几乎都可直接运行


# Welcome to H2, the Java SQL database. [![Build Status](https://travis-ci.org/h2database/h2database.svg?branch=master)](https://travis-ci.org/h2database/h2database)

## The main features of H2 are:

1. Very fast, open source, JDBC API
2. Embedded and server modes; in-memory databases
3. Browser based Console application
4. Small footprint: around 1.5 MB jar file size

More information: http://h2database.com

## Features

| | [H2](http://www.h2database.com/) | [Derby](http://db.apache.org/derby) | [HSQLDB](http://hsqldb.org) | [MySQL](http://mysql.com) | [PostgreSQL](http://www.postgresql.org) |
|---------------------------|-------|-------|-------|-------|-------|
| Pure Java                 | Yes   | Yes   | Yes   | No    | No    |
| Memory Mode               | Yes   | Yes   | Yes   | No    | No    |
| Encrypted Database        | Yes   | Yes   | Yes   | No    | No    |
| ODBC Driver               | Yes   | No    | No    | Yes   | Yes   |
| Fulltext Search           | Yes   | No    | No    | Yes   | Yes   |
| Multi Version Concurrency | Yes   | No    | Yes   | Yes   | Yes   |
| Footprint (jar/dll size)  | ~1 MB | ~2 MB | ~1 MB | ~4 MB | ~6 MB | 
