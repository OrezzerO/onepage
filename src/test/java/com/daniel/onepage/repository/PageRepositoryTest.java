package com.daniel.onepage.repository;

import com.daniel.onepage.OnePageApplicationTests;
import com.daniel.onepage.bean.entity.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangchengxi on 2017/6/26.
 */
public class PageRepositoryTest extends OnePageApplicationTests {

    @Autowired
    private PageRepository pageRepository;


    @Test
    public void testFindAll() {
        Iterable<Page> all = pageRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testFuzzySearch(){
        Iterable<Page> t = pageRepository.findByTitleContaining("t");
        System.out.println(t);
    }
}
