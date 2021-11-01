package com.company.controller; /**
 * @ClassName ${NAME}
 * @company 公司
 * @version 1.0
 * @Description TODO
 * @createTime 2021年11月01日 13:55:55
 */

import com.company.entity.Student;
import com.company.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author 苏东坡
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


      request.setCharacterEncoding("UTF-8");
      String strId = request.getParameter("id");
      String strName = request.getParameter("name");
      String strEmail = request.getParameter("email");
      String strAge = request.getParameter("age");

      //创建spring的容器对象
      //String config= "spring.xml";
      //ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
      WebApplicationContext ctx = null;
      //获取ServletContext中的容器对象，创建好的容器对象，拿来就用
        /*String key =  WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        Object attr  = getServletContext().getAttribute(key);
        if( attr != null){
            ctx = (WebApplicationContext)attr;
        }*/

      //创建spring容器
//       String  config = "spring.xml";
//      ApplicationContext  applicationContext = new ClassPathXmlApplicationContext(config);

      ServletContext servletContext = getServletContext();
      ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
      System.out.println("容器对象的信息=========" +ctx);



      StudentService studentService = (StudentService) ctx.getBean("studentService");
      Student student = new Student();
      student.setId(Integer.parseInt(strId));
      student.setName(strName);
      student.setEmail(strEmail);
      student.setAge(Integer.valueOf(strAge));
      studentService.addUsers(student);


      //给一个页面
      request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

}
