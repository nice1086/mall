package com.mall4j.cloud.product.vo.app;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class SkuStockVO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("库存id")
    private Long stock_id;

    @ApiModelProperty("创建时间")
    private Date create_time;

    @ApiModelProperty("更新时间")
    private Date update_time;

    @ApiModelProperty("SKU ID")
    private Long sku_id;

    @ApiModelProperty("实际库存")
    private Integer actual_stock;

    @ApiModelProperty("锁定库存")
    private Integer lock_stock;

    @ApiModelProperty("可售卖库存")
    private Integer stock;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getStock_id() {
        return stock_id;
    }

    public void setStock_id(Long stock_id) {
        this.stock_id = stock_id;
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

    public Long getSku_id() {
        return sku_id;
    }

    public void setSku_id(Long sku_id) {
        this.sku_id = sku_id;
    }

    public Integer getActual_stock() {
        return actual_stock;
    }

    public void setActual_stock(Integer actual_stock) {
        this.actual_stock = actual_stock;
    }

    public Integer getLock_stock() {
        return lock_stock;
    }

    public void setLock_stock(Integer lock_stock) {
        this.lock_stock = lock_stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "SkuStockVO{" +
                "stock_id=" + stock_id +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", sku_id=" + sku_id +
                ", actual_stock=" + actual_stock +
                ", lock_stock=" + lock_stock +
                ", stock=" + stock +
                '}';
    }
}
