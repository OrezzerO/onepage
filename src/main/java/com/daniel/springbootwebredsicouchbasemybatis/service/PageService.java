package com.daniel.springbootwebredsicouchbasemybatis.service;

import com.daniel.springbootwebredsicouchbasemybatis.bean.entity.Page;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
public interface PageService {

    Iterable<Page> queryAll();

    Page findByTitle(String title);

    Page save(Page page);
}
