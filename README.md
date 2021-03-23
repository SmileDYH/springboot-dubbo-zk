## SpringBoot+Dubbo+Zookeeper

### 主要包含：

公共模块 common
生产者模块 provider
消费者模块 consumer

### 启动流程：

##### 1、启动ZK

 ZK包下，zkServer.cmd脚本启动ZK

##### 2、启动Dubbo

**启动dubbo-admin**（dubbo-admin-develop项目）

① 启动dubbo-admin-server服务（SpringBoot服务），端口号和前端调用的相同

② 启动前端

1）安装node.js，配置环境变量

2）dubbo-admin-ui目录下载依赖包：**npm install**

3）启动项目：**npm run dev**

浏览器访问urlhttp://localhost:8083/#/service（前端的端口号）

**启动provider（生产者）**- （springboot-dubbo-zk项目）

**启动consumer（消费者）**- （springboot-dubbo-zk项目）



参考：

https://www.cnblogs.com/gaopengfirst/p/9555240.html

https://www.cnblogs.com/ycs0403/p/12405178.html

https://blog.csdn.net/noob9527/article/details/89446591

https://www.cnblogs.com/ysocean/p/9860529.html

https://blog.csdn.net/qq_38366063/article/details/93495348