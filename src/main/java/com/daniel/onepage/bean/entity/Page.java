package com.daniel.onepage.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zhangchengxi on 2017/6/25.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_page")
@SQLDelete(sql = "Update AppNamespace set isDeleted = 1 where id = ?")
@Where(clause = "isDeleted = 0")
public class Page extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column
    private int pageType;

    @Column
    private int sourceId;

    @Column(nullable = false)
    private String url;

    @Column
    private Boolean isAvailable;
}
