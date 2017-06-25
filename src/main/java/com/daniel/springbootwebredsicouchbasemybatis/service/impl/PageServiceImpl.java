package com.daniel.springbootwebredsicouchbasemybatis.service.impl;

import com.daniel.springbootwebredsicouchbasemybatis.bean.entity.Page;
import com.daniel.springbootwebredsicouchbasemybatis.repository.PageRepository;
import com.daniel.springbootwebredsicouchbasemybatis.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
@Component
public class PageServiceImpl implements PageService{


    @Autowired
    private PageRepository pageRepository;

    @Override
    public Iterable<Page> queryAll() {
        return pageRepository.findAll();
    }

    @Override
    public Page findByTitle(String title){
        return pageRepository.findByTitle(title);
    }
}
