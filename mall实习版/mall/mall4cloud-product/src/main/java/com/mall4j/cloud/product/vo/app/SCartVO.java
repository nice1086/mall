package com.mall4j.cloud.product.vo.app;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mall4j.cloud.api.product.vo.CategoryVO;
import com.mall4j.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class SCartVO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long cart_item_id;

    @ApiModelProperty("创建时间")
    private Date create_time;

    @ApiModelProperty("更新时间")
    private Date update_time;

    @ApiModelProperty("店铺ID")
    private Long shop_id;

    @ApiModelProperty("产品ID")
    private Long spu_id;

    @ApiModelProperty("SkuID")
    private Long sku_id;

    @ApiModelProperty("用户ID")
    private Long user_id;

    @ApiModelProperty("购物车产品个数")
    private int count;

    @ApiModelProperty("售价，加入购物车时的商品价格")
    private Long price_fee;

    @ApiModelProperty("是否已勾选")
    private Boolean is_checked;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCart_item_id() {
        return cart_item_id;
    }

    public void setCart_item_id(Long cart_item_id) {
        this.cart_item_id = cart_item_id;
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

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public Long getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(Long spu_id) {
        this.spu_id = spu_id;
    }

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getPrice_fee() {
        return price_fee;
    }

    public void setPrice_fee(Long price_fee) {
        this.price_fee = price_fee;
    }

    public Boolean getIs_checked() {
        return is_checked;
    }

    public void setIs_checked(Boolean is_checked) {
        this.is_checked = is_checked;
    }

    @Override
    public String toString() {
        return "SCartVO{" +
                "cart_item_id=" + cart_item_id +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", shop_id=" + shop_id +
                ", spu_id=" + spu_id +
                ", sku_id=" + sku_id +
                ", user_id=" + user_id +
                ", count=" + count +
                ", price_fee=" + price_fee +
                ", is_checked=" + is_checked +
                '}';
    }
}
