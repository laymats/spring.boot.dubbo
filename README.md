#Spring boot dubbo 集成模板项目

环境需求：<br/>
JDK：12 <br/>
Maven：3.6+<br/>
dubbo: 2.7+

#template project 结构
> root 
>> dubbo-template (root项目)
>>> modules
>>>> api-framework (公共库)
>>>> dubbo-porivuder (服务提供者)
>>>> dubbo-consumer (服务消费者)

#template 介绍
本项目提供了基础的dubbo服务提供类以及消费服务类，使用zookeeper进行服务协调，为了方便初学者上手
该框架，本项目已将zookeeper服务组件包含在了项目中，位于项目[zookeeper-3.4.14]目录中。

#template 运行
首先打开项目[zookeeper-3.4.14]目录，进入zookeeper-3.4.14\bin目录，使用cmd启动[zkServer.cmd]，
使zookeeper服务运行，OS系统使用[zkServer.sh]进行启动，启动成功后zk服务将运行在本机 127.0.0.1:2181
端口，如果成功则如图所示；
<img src="/git-img/0002.jpg">
然后加载本项目至idea环境，先启动dubbo-porivuder项目，启动完毕后，再启动dubbo-consumer项目，两个项目
都启动成功后，请求url[http://127.0.0.1:5002/order?orderID=1111]测试，如果测试出现如下结果，则表示
项目启动成功。
<img src="/git-img/0001.png">

# 交流群
<img src="/git-img/qq-qun.jpg">