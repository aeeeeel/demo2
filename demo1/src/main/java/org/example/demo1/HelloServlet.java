package org.example.demo1;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.*;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/index1")
public class HelloServlet extends HttpServlet {

//    TemplateEngine engine;
//    @Override
//    public void init() throws ServletException {
//        engine = new TemplateEngine();
//        ClassLoaderTemplateResolver r = new ClassLoaderTemplateResolver();
//        engine.setTemplateResolver(r);
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
//        Context context = new Context();
//        context.setVariable("title", "我是标题");
//        engine.process("test.html", context, resp.getWriter());
//    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Context context = new Context();
        context.setVariable("eval", true);
        //EngineUtil.getEngine().process("test1.html", context, resp.getWriter());

        context.setVariable("list", Arrays.asList("伞兵事迹", "卡布奇诺", "玩戏要着", "牌前的电脑屏幕"));
        EngineUtil.getEngine().process("test1.html", context, resp.getWriter());
    }
//    public void destroy() {
//    }

}