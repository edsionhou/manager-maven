package com.hou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: edison
 * @Date: 2020/1/31 12时04分
 * @Description:
 */
@Controller
public class PageController {
    /**
     * 此类的作用只是为了转发
     * 任何请求进来，使用{page}接受，
     * 转发给/WEB-INF/jsp/page.jsp
     * 所以addUser会转到jsp
     * 我想多了
     * 但这样的话，我们的静态资源无法获取，
     * 比如aa.html
     * 测试 <mvc:default-servlet-handler/>
     * 不行，无效，服务器优先走PageController
     *
     *
     */
    @RequestMapping(value = {"/{page}"})
    public String showPage(@PathVariable("page") String page){
       return page;

    }
}
