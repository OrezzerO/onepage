package com.daniel.springbootwebredsicouchbasemybatis.controller;

import com.daniel.springbootwebredsicouchbasemybatis.bean.entity.Page;
import com.daniel.springbootwebredsicouchbasemybatis.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    private PageService pageService;

    @RequestMapping("/show")
    public String show(){
        return "show";
    }


    @RequestMapping("/queryAll")
    public Iterable<Page> queryAll(){
        return pageService.queryAll();
    }

    @RequestMapping(path = "/findByTitle", method = RequestMethod.POST)
    public Page findByTitle(@RequestBody Page page){
        return pageService.findByTitle(page.getTitle());
    }

}
