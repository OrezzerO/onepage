package com.daniel.onepage.service;

import com.daniel.onepage.bean.entity.Page;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
public interface PageService {

    Iterable<Page> queryAll();

    Page findByTitle(String title);

    Page save(Page page);
}
