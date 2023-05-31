package com.mall4j.cloud.product.vo.app;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class CBVO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("创建时间")
    private Date create_time;

    @ApiModelProperty("更新时间")
    private Date update_time;

    @ApiModelProperty("品牌id")
    private Long brand_id;

    @ApiModelProperty("分类id")
    private Long category_id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "CBVO{" +
                "create_time=" + create_time +
                ", update_time=" + update_time +
                ", brand_id=" + brand_id +
                ", category_id=" + category_id +
                '}';
    }
}
