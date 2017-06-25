package com.daniel.onepage.bean.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhangchengxi on 2017/6/25.
 */
@Getter
@Setter
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long id;

    @Column(name = "isDeleted", columnDefinition = "Bit default '0'")
    protected boolean isDeleted = false;

    @Column(name = "createTime")
    private String createTime;

    @Column(name = "updateTime")
    private Date updateTime;


    public static void main(String[] args) {
       new BaseEntity().getId();
       Page.builder().build().getId();
    }


}
