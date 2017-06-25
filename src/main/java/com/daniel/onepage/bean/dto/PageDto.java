package com.daniel.onepage.bean.dto;

/**
 * Created by zhangchengxi on 2017/6/25.
 */

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageDto {
    private String url;
    private String title;
    private String titleId;
    private List<String> imageUrl = Lists.newArrayList();
    private int page;



}
