package com.ecp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
//@Entity
@Table(name = "tb_dept")
public class Dept implements Serializable {
}
