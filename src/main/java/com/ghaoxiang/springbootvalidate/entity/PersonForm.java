/*
* 文件名: com.ghaoxiang.springbootvalidate.entity
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 18:11
* 修改人:
* 修改时间: 2019年01月08日 18:11
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.springbootvalidate.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title PersonForm
 * @Description
 * @date 2019年01月08日 18:11
 * @since V1.0
 */
public class PersonForm {

    @NotNull(message = "用户名不能为空")
    @Size(min=2, max=30, message = "用户名最少2字节，最多30字节")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄不能低于18岁")
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
