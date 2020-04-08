package cn.itcast.ssm.po;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cn.itcast.ssm.controller.validation.ValidGroup1;

public class MItems {
    private Integer id;
    
    //校验名称在1到30字符中间
    //message是提示校验出错显示信息
    //groups:此校验属于哪个分组,groups可以定义多个分组
    @Size(min=1,max=30,message="{items.name.length.error}",groups= {ValidGroup1.class})
    private String name;

    private Integer price;

    private String detail;

    private String pic;

    //非空检验
    @NotNull(message="{items.createtime.isNull}")
    private Date createtime;

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}