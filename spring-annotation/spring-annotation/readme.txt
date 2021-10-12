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