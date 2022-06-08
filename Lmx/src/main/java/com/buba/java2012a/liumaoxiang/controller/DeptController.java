package com.buba.java2012a.liumaoxiang.controller;

import com.buba.java2012a.liumaoxiang.dao.DeptDao;
import com.buba.java2012a.liumaoxiang.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ClassName：DeptController
 * autho："祥"
 * Package： com.buba.java2012a.liumaoxiang.controller
 * data：2022/6/1
 */
@Controller
public class DeptController {

    @Autowired
    private DeptDao service;

    @RequestMapping("/zeng")
    public String zeng(){
        return "bumenzeng";
    }


    @RequestMapping(value = "/cha")
    public String cha(Dept dept){
//        service.insertDept(dept);
        return "forward:/all";
    }

    @RequestMapping(value = "/all")
    public String chaall(HttpServletRequest request){
        List<Dept> dept1 =service.selectDept();
        request.setAttribute("dept1",dept1);
        return "bumencha";
    }

    @RequestMapping(value = "/del/{id}")
    public String del(@PathVariable Integer id){
       service.deleteDept(id);
        return "redirect:/dels";
    }

    @RequestMapping(value = "/dels")
    public String dels(HttpServletRequest request){
        List<Dept> dept1 =service.selectDept();
        request.setAttribute("dept1",dept1);
        return "bumencha";
    }

    @RequestMapping(value = "/gai/{id}")
    public String upda(HttpServletRequest request,@PathVariable int id){
        Dept ids = service.seleteid(id);
        request.setAttribute("ids",ids);
      return "bumengai";
    }

    @RequestMapping(value = "/up" )
    public String up(Dept dept){
        service.updateDept(dept);
        return "forward:/all?id=";
    }

    @RequestMapping("/delss")
    public String deletes(HttpServletRequest r){
        String[] s = r.getParameterValues("check");
        System.out.println(s);
        for (int i=0;i<s.length;i++){
            int a = Integer.parseInt(s[i]);
            service.deleteDept(a);
        }
        return "forward:/all";
    }




}
