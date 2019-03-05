package com.ecp.entity;

import com.ecp.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "tb_upload")
@Entity
public class Upload extends BaseEntity {

    private String name;

    private String suffix;

    private Long size;

    private String content;

}
