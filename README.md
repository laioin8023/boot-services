# spring-boot+mybatis+redis+mysql
# 这里是，多个server，多个web 接口

 1. 基础包名：com.laioin (需要注入spring)
 
 2.项目结构：
    
    document ： 平常用到的文档
    laioin-services-common ： 基础包，包括工具类，枚举，错误码等
    laioin-gateway-common : 接口公共包
    laioin-user-service ： 商家服务，搜索，列表，酒水等
    laioin-pay-service : 支付服务，生成订单，订单列表，等
    laioin-user-gateway ：（user 服务接口） 
    laioin-order-gateway ：（order 服务接口） 
   
    
3.规范
    
    接口请求：POST ，RequestBody，对应一个Param类，这里的参数也不能用数据表对应的实体类
          
          定义一个基础请求类：id，token
                
    接口返回：封装一个 Dto，不能直接返回，数据库表对应的实体类
    
    mybatis : 多个service 包名规范
        com.laioin.*.service.mapper  - > mapper 接口
        com.laioin.*.service.entry   - > entry 数据对象
        