package com.daniel.onepage.repository;

import com.daniel.onepage.bean.entity.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
public interface PageRepository extends PagingAndSortingRepository<Page,Integer> {

    Page findByTitle(String title);

    Iterable<Page> findByTitleContaining(String title);
}
