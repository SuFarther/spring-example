通过spring注解完成java对象的创建,属性。代替xml文件

@Component: 创建对象的,等同于<bean>的功能
  属性: value就是对象的名称,也就是bean的id值,value的值是唯一的,创建的对象在整个spring容器中就一个
  位置: 在类的上面

 @Component（value="myStudent")等同于
 <bean id="myStudent" class="com.company.xx.Student"/>

 声明组件扫描器(component-scan)，组件就是java对象
 base-package： 指定注解在你的项目中的包名
 component-scan工作方式: spring会扫描遍历bas-package指定的包
 把包和子包中的所有类，找到类中的注解,按照注解的功能创建对象,或给属性赋值


<context:component-scan base-package="com.company.entity" />

spring中和@Component功能一致,创建对象的注解还有:
1、@Repository（用在持久层类的上面）: 放在dao的实现类上面,表示创建dao对象,dao对象是能访问数据库的
2、@Service（用在业务层类的上面）: 放在service的实现类上面,创建service对象,service对象是做业务处理,可以有事务等功能
3、@Controller(用在控制器上面)：放在控制器(处理器)类的上面,创建控制器对象的,控制器对象,能够接收用户提交的参数,显示请求的处理结果


以上三个注解的语法和@Component一样的。都能创建对象,但是这三个注解还有额外的功能
@Repository、@Service、@Controller是给项目的对象分层的

指定多个包的三种方式
第一种方式: 使用多次组件扫描器,指定不同的包
<context:component-scan base-package="com.company.entity" />
<context:component-scan base-package="com.company.entity2" />

第二种方式: 使用分隔包(;或1,)分隔多个包名
<context:component-scan base-package="com.company.entity;com.company.entity2" />


第三种方式: 指定父包
<context:component-scan base-package="com.company" />

@Value: 简单类型的属性赋值
属性: 1、value是String类型的,表示简单类型的属性值
位置: 2、在set方法的上面


引用类型
@Autowired: spring框架提供的注解,实现引用类型的赋值
spring中通过注解给引用类型赋值,使用的是自动注入原理,支持byName,byName，byType
@Autowire:默认使用的是byType自动注入


如果要使用byName方式,需要做的是:
1、在属性上面加入@Autowired
2、在属性上面加入@Qualifier(value="bean的id"): 表示使用指定名称的bean完成赋值

@Autowired
属性: required,是一个boolean类型的,默认true
required=true: 表示引用类型赋值失败,程序报错,并终止执行(推荐)
required=false: 表示引用类型赋值失败,程序正常执行,引用类型是null

@Autowired(required = false)
    @Qualifier("school1")


 @Resource
 来自jdk中的注解,spring框架提供了对这个注解的功能支持,可以使用它给引用类型赋值
 使用的也是自动注入原理,支持byName,byType,默认是byName
 位置: 1、在属性定义的上面,无需set方法,推荐使用
      2、在set方法的上面


      默认是byName：先使用byName自动注入,如果byName赋值失败,再使用byType

      @Resource只使用byName,需要增加一个属性name
      name的值是bean的id(名称)

      经常改的用配置文件

      加载属性配置文件
      <context:property-placeholder location="classpath:test.properties" />