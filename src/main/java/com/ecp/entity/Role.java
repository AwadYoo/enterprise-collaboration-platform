package com.ecp.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_role")
public class Role implements Serializable {
}
