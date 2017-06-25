package com.daniel.onepage;

import com.daniel.onepage.bean.entity.Page;
import com.daniel.onepage.repository.PageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnePageApplicationTests {

	@Autowired
	PageRepository pageService;


	@Test
	public void testSave(){
		Page page = Page.builder().title("title").url("url").build();
		Page save = pageService.save(page);
		System.out.println(save);
	}

	@Test
	public void contextLoads() {
	}

}
