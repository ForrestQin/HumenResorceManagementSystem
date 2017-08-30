package com.forrest.domian;

import java.io.Serializable;

//部门类
public class Dept implements Serializable {
	private Integer id;
	private String name;
	private String remark;	//详细描述
	public Dept() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
