package com.offcn.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Accessors(chain=true) //存取器。通过该注解可以控制getter和setter方法的形式
public class Dept implements Serializable {//必须序列化
    @Id
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    public Dept(String dname){
        super();
        this.dname = dname;
    }
}
