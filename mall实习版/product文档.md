# 接口文档

**Version**:1.1


[TOC]






# admin-spu信息


## 获取spu信息


**接口地址**:`/mall4cloud_product/admin/spu`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据spuId获取spu信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuId|spuId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«SpuVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||SpuVO|SpuVO|
|&emsp;&emsp;brand|品牌信息|BrandVO|BrandVO|
|&emsp;&emsp;&emsp;&emsp;brandId|brand_id|integer||
|&emsp;&emsp;&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;brandId|品牌ID|integer(int64)||
|&emsp;&emsp;category|分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;categoryId|分类ID|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;detail|商品详情|string||
|&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有|integer(int32)||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔|string||
|&emsp;&emsp;mainImgUrl|商品介绍主图|string||
|&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer(int64)||
|&emsp;&emsp;name|spu名称|string||
|&emsp;&emsp;priceFee|售价，整数方式保存|integer(int64)||
|&emsp;&emsp;referenceId|分组商品关联id|integer(int64)||
|&emsp;&emsp;saleNum|商品销量|integer(int32)||
|&emsp;&emsp;sellingPoint|卖点|string||
|&emsp;&emsp;seq|序号|integer(int32)||
|&emsp;&emsp;shopCategory|店铺分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;shopCategoryId|店铺分类ID|integer(int64)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;shopName|店铺名称|string||
|&emsp;&emsp;skus|sku列表|array|SkuVO|
|&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔|string||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;modelId|商品条形码|string||
|&emsp;&emsp;&emsp;&emsp;partyCode|商品编码|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id|integer||
|&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|当前sku规格列表|array|SpuSkuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;volume|商品体积|number||
|&emsp;&emsp;&emsp;&emsp;weight|商品重量|number||
|&emsp;&emsp;spuAttrValues|规格属性|array|SpuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称|string||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;searchType|搜索类型 0:不需要，1:需要|integer||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;spuId|spu id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|&emsp;&emsp;totalStock|总库存|integer(int32)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"brand": {
			"brandId": 0,
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"firstLetter": "",
			"imgUrl": "",
			"name": "",
			"seq": 0,
			"status": 0,
			"updateTime": ""
		},
		"brandId": 0,
		"category": {},
		"categoryId": 0,
		"createTime": "",
		"detail": "",
		"hasSkuImg": 0,
		"imgUrls": "",
		"mainImgUrl": "",
		"marketPriceFee": 0,
		"name": "",
		"priceFee": 0,
		"referenceId": 0,
		"saleNum": 0,
		"sellingPoint": "",
		"seq": 0,
		"shopCategory": {},
		"shopCategoryId": 0,
		"shopId": 0,
		"shopName": "",
		"skus": [
			{
				"attrs": "",
				"createTime": "",
				"imgUrl": "",
				"marketPriceFee": 0,
				"modelId": "",
				"partyCode": "",
				"priceFee": 0,
				"skuId": 0,
				"skuName": "",
				"spuId": 0,
				"spuSkuAttrValues": [
					{
						"attrId": 0,
						"attrName": "",
						"attrValueId": 0,
						"attrValueName": "",
						"createTime": "",
						"skuId": 0,
						"spuId": 0,
						"spuSkuAttrId": 0,
						"status": 0,
						"updateTime": ""
					}
				],
				"status": 0,
				"stock": 0,
				"updateTime": "",
				"volume": 0,
				"weight": 0
			}
		],
		"spuAttrValues": [
			{
				"attrId": 0,
				"attrName": "",
				"attrValueId": 0,
				"attrValueName": "",
				"createTime": "",
				"searchType": 0,
				"spuAttrValueId": 0,
				"spuId": 0,
				"updateTime": ""
			}
		],
		"spuId": 0,
		"status": 0,
		"totalStock": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


## 保存spu信息


**接口地址**:`/mall4cloud_product/admin/spu`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存spu信息</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryId": 0,
  "changeStock": 0,
  "detail": "",
  "hasSkuImg": 0,
  "imgUrls": "",
  "mainImgUrl": "",
  "marketPriceFee": 0,
  "name": "",
  "priceFee": 0,
  "sellingPoint": "",
  "seq": 0,
  "shopCategoryId": 0,
  "shopId": 0,
  "skuList": [
    {
      "attrs": "",
      "changeStock": 0,
      "imgUrl": "",
      "marketPriceFee": 0,
      "modelId": "",
      "partyCode": "",
      "priceFee": 0,
      "skuId": 0,
      "skuName": "",
      "spuId": 0,
      "spuSkuAttrValues": [
        {
          "attrId": 0,
          "attrName": "",
          "attrValueId": 0,
          "attrValueName": "",
          "skuId": 0,
          "spuId": 0,
          "spuSkuAttrId": 0,
          "status": 0
        }
      ],
      "status": 0,
      "stock": 0,
      "volume": 0,
      "weight": 0
    }
  ],
  "spuAttrValues": [
    {
      "attrId": 0,
      "attrName": "",
      "attrValueId": 0,
      "attrValueName": "",
      "spuAttrValueId": 0,
      "spuId": 0
    }
  ],
  "spuId": 0,
  "spuIds": [],
  "status": 0,
  "tagId": 0,
  "totalStock": 0,
  "video": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuDTO|spuDTO|body|true|SpuDTO|SpuDTO|
|&emsp;&emsp;brandId|品牌ID||false|integer(int64)||
|&emsp;&emsp;categoryId|分类ID||false|integer(int64)||
|&emsp;&emsp;changeStock|更新时，变化的库存||false|integer(int32)||
|&emsp;&emsp;detail|商品详情||false|string||
|&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有||false|integer(int32)||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔||false|string||
|&emsp;&emsp;mainImgUrl|商品主图||false|string||
|&emsp;&emsp;marketPriceFee|市场价||false|integer(int64)||
|&emsp;&emsp;name|spu名称||false|string||
|&emsp;&emsp;priceFee|售价||false|integer(int64)||
|&emsp;&emsp;sellingPoint|卖点||false|string||
|&emsp;&emsp;seq|序号||false|integer(int32)||
|&emsp;&emsp;shopCategoryId|店铺分类ID||false|integer(int64)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;skuList|商品规格列表||false|array|SkuDTO|
|&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔||false|string||
|&emsp;&emsp;&emsp;&emsp;changeStock|更新时，变化的库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片||false|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;modelId|商品条形码||false|string||
|&emsp;&emsp;&emsp;&emsp;partyCode|商品编码||false|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|规格列表||false|array|SpuSkuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable||false|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;volume|商品体积||false|number||
|&emsp;&emsp;&emsp;&emsp;weight|商品重量||false|number||
|&emsp;&emsp;spuAttrValues|商品属性值列表||false|array|SpuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id||false|integer||
|&emsp;&emsp;spuId|spuId||false|integer(int64)||
|&emsp;&emsp;spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)||false|array|integer|
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||
|&emsp;&emsp;tagId|分组id||false|integer(int64)||
|&emsp;&emsp;totalStock|总库存||false|integer(int32)||
|&emsp;&emsp;video|商品视频||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新spu信息


**接口地址**:`/mall4cloud_product/admin/spu`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新spu信息</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryId": 0,
  "changeStock": 0,
  "detail": "",
  "hasSkuImg": 0,
  "imgUrls": "",
  "mainImgUrl": "",
  "marketPriceFee": 0,
  "name": "",
  "priceFee": 0,
  "sellingPoint": "",
  "seq": 0,
  "shopCategoryId": 0,
  "shopId": 0,
  "skuList": [
    {
      "attrs": "",
      "changeStock": 0,
      "imgUrl": "",
      "marketPriceFee": 0,
      "modelId": "",
      "partyCode": "",
      "priceFee": 0,
      "skuId": 0,
      "skuName": "",
      "spuId": 0,
      "spuSkuAttrValues": [
        {
          "attrId": 0,
          "attrName": "",
          "attrValueId": 0,
          "attrValueName": "",
          "skuId": 0,
          "spuId": 0,
          "spuSkuAttrId": 0,
          "status": 0
        }
      ],
      "status": 0,
      "stock": 0,
      "volume": 0,
      "weight": 0
    }
  ],
  "spuAttrValues": [
    {
      "attrId": 0,
      "attrName": "",
      "attrValueId": 0,
      "attrValueName": "",
      "spuAttrValueId": 0,
      "spuId": 0
    }
  ],
  "spuId": 0,
  "spuIds": [],
  "status": 0,
  "tagId": 0,
  "totalStock": 0,
  "video": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuDTO|spuDTO|body|true|SpuDTO|SpuDTO|
|&emsp;&emsp;brandId|品牌ID||false|integer(int64)||
|&emsp;&emsp;categoryId|分类ID||false|integer(int64)||
|&emsp;&emsp;changeStock|更新时，变化的库存||false|integer(int32)||
|&emsp;&emsp;detail|商品详情||false|string||
|&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有||false|integer(int32)||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔||false|string||
|&emsp;&emsp;mainImgUrl|商品主图||false|string||
|&emsp;&emsp;marketPriceFee|市场价||false|integer(int64)||
|&emsp;&emsp;name|spu名称||false|string||
|&emsp;&emsp;priceFee|售价||false|integer(int64)||
|&emsp;&emsp;sellingPoint|卖点||false|string||
|&emsp;&emsp;seq|序号||false|integer(int32)||
|&emsp;&emsp;shopCategoryId|店铺分类ID||false|integer(int64)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;skuList|商品规格列表||false|array|SkuDTO|
|&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔||false|string||
|&emsp;&emsp;&emsp;&emsp;changeStock|更新时，变化的库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片||false|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;modelId|商品条形码||false|string||
|&emsp;&emsp;&emsp;&emsp;partyCode|商品编码||false|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|规格列表||false|array|SpuSkuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable||false|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;volume|商品体积||false|number||
|&emsp;&emsp;&emsp;&emsp;weight|商品重量||false|number||
|&emsp;&emsp;spuAttrValues|商品属性值列表||false|array|SpuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id||false|integer||
|&emsp;&emsp;spuId|spuId||false|integer(int64)||
|&emsp;&emsp;spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)||false|array|integer|
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||
|&emsp;&emsp;tagId|分组id||false|integer(int64)||
|&emsp;&emsp;totalStock|总库存||false|integer(int32)||
|&emsp;&emsp;video|商品视频||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除spu信息


**接口地址**:`/mall4cloud_product/admin/spu`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据spu信息id删除spu信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuId|spuId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 获取spu信息列表


**接口地址**:`/mall4cloud_product/admin/spu/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取spu信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|brandId|品牌ID|query|false|integer(int64)||
|categoryId|分类ID|query|false|integer(int64)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|createTimeSort|创建时间排序 0：倒序 1：顺序|query|false|integer(int32)||
|marketPriceFeeSort|市场价排序 0：倒序 1：顺序|query|false|integer(int32)||
|maxPrice|最高价|query|false|integer(int64)||
|maxSaleNum|最高销量|query|false|integer(int64)||
|minPrice|最低价|query|false|integer(int64)||
|minSaleNum|最低销量|query|false|integer(int64)||
|name|spu名称|query|false|string||
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|
|partyCode|商品编码|query|false|string||
|priceFeeSort|当前价排序 0：倒序 1：顺序|query|false|integer(int32)||
|saleNumSort|销量排序 0：倒序 1：顺序|query|false|integer(int32)||
|seqSort|序号排序 0：倒序 1：顺序|query|false|integer(int32)||
|spuId|spuId|query|false|integer(int64)||
|spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)|query|false|array|integer|
|spuStatus|商品状态： 0.全部  1.销售中  2.已售罄  3.已下架 |query|false|integer(int32)||
|status|状态 1:enable, 0:disable, -1:deleted|query|false|integer(int32)||
|stockSort|库存排序 0：倒序 1：顺序|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«SpuVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«SpuVO»|PageVO«SpuVO»|
|&emsp;&emsp;list|结果集|array|SpuVO|
|&emsp;&emsp;&emsp;&emsp;brand|品牌信息|BrandVO|BrandVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;brandId|brand_id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;brandId|品牌ID|integer||
|&emsp;&emsp;&emsp;&emsp;category|分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;categoryId|分类ID|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;detail|商品详情|string||
|&emsp;&emsp;&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔|string||
|&emsp;&emsp;&emsp;&emsp;mainImgUrl|商品介绍主图|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;name|spu名称|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;referenceId|分组商品关联id|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|商品销量|integer||
|&emsp;&emsp;&emsp;&emsp;sellingPoint|卖点|string||
|&emsp;&emsp;&emsp;&emsp;seq|序号|integer||
|&emsp;&emsp;&emsp;&emsp;shopCategory|店铺分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;shopCategoryId|店铺分类ID|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;shopName|店铺名称|string||
|&emsp;&emsp;&emsp;&emsp;skus|sku列表|array|SkuVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;modelId|商品条形码|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;partyCode|商品编码|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuName|sku名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|当前sku规格列表|array|SpuSkuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;stock|库存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;volume|商品体积|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;weight|商品重量|number||
|&emsp;&emsp;&emsp;&emsp;spuAttrValues|规格属性|array|SpuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|规格属性id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;searchType|搜索类型 0:不需要，1:需要|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|商品id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;spuId|spu id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;totalStock|总库存|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"brand": {
					"brandId": 0,
					"categories": [
						{
							"categories": [
								{
									"categories": [
										{}
									],
									"categoryId": 0,
									"desc": "",
									"icon": "",
									"imgUrl": "",
									"level": 0,
									"name": "",
									"parentId": 0,
									"path": "",
									"pathNames": [],
									"seq": 0,
									"shopId": 0,
									"status": 0
								}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"createTime": "",
					"desc": "",
					"firstLetter": "",
					"imgUrl": "",
					"name": "",
					"seq": 0,
					"status": 0,
					"updateTime": ""
				},
				"brandId": 0,
				"category": {},
				"categoryId": 0,
				"createTime": "",
				"detail": "",
				"hasSkuImg": 0,
				"imgUrls": "",
				"mainImgUrl": "",
				"marketPriceFee": 0,
				"name": "",
				"priceFee": 0,
				"referenceId": 0,
				"saleNum": 0,
				"sellingPoint": "",
				"seq": 0,
				"shopCategory": {},
				"shopCategoryId": 0,
				"shopId": 0,
				"shopName": "",
				"skus": [
					{
						"attrs": "",
						"createTime": "",
						"imgUrl": "",
						"marketPriceFee": 0,
						"modelId": "",
						"partyCode": "",
						"priceFee": 0,
						"skuId": 0,
						"skuName": "",
						"spuId": 0,
						"spuSkuAttrValues": [
							{
								"attrId": 0,
								"attrName": "",
								"attrValueId": 0,
								"attrValueName": "",
								"createTime": "",
								"skuId": 0,
								"spuId": 0,
								"spuSkuAttrId": 0,
								"status": 0,
								"updateTime": ""
							}
						],
						"status": 0,
						"stock": 0,
						"updateTime": "",
						"volume": 0,
						"weight": 0
					}
				],
				"spuAttrValues": [
					{
						"attrId": 0,
						"attrName": "",
						"attrValueId": 0,
						"attrValueName": "",
						"createTime": "",
						"searchType": 0,
						"spuAttrValueId": 0,
						"spuId": 0,
						"updateTime": ""
					}
				],
				"spuId": 0,
				"status": 0,
				"totalStock": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


## 获取平台spu信息列表


**接口地址**:`/mall4cloud_product/admin/spu/platform_page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取平台spu信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|brandId|品牌ID|query|false|integer(int64)||
|categoryId|分类ID|query|false|integer(int64)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|createTimeSort|创建时间排序 0：倒序 1：顺序|query|false|integer(int32)||
|marketPriceFeeSort|市场价排序 0：倒序 1：顺序|query|false|integer(int32)||
|maxPrice|最高价|query|false|integer(int64)||
|maxSaleNum|最高销量|query|false|integer(int64)||
|minPrice|最低价|query|false|integer(int64)||
|minSaleNum|最低销量|query|false|integer(int64)||
|name|spu名称|query|false|string||
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|
|partyCode|商品编码|query|false|string||
|priceFeeSort|当前价排序 0：倒序 1：顺序|query|false|integer(int32)||
|saleNumSort|销量排序 0：倒序 1：顺序|query|false|integer(int32)||
|seqSort|序号排序 0：倒序 1：顺序|query|false|integer(int32)||
|spuId|spuId|query|false|integer(int64)||
|spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)|query|false|array|integer|
|spuStatus|商品状态： 0.全部  1.销售中  2.已售罄  3.已下架 |query|false|integer(int32)||
|status|状态 1:enable, 0:disable, -1:deleted|query|false|integer(int32)||
|stockSort|库存排序 0：倒序 1：顺序|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«SpuVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«SpuVO»|PageVO«SpuVO»|
|&emsp;&emsp;list|结果集|array|SpuVO|
|&emsp;&emsp;&emsp;&emsp;brand|品牌信息|BrandVO|BrandVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;brandId|brand_id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;brandId|品牌ID|integer||
|&emsp;&emsp;&emsp;&emsp;category|分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;categoryId|分类ID|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;detail|商品详情|string||
|&emsp;&emsp;&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔|string||
|&emsp;&emsp;&emsp;&emsp;mainImgUrl|商品介绍主图|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;name|spu名称|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;referenceId|分组商品关联id|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|商品销量|integer||
|&emsp;&emsp;&emsp;&emsp;sellingPoint|卖点|string||
|&emsp;&emsp;&emsp;&emsp;seq|序号|integer||
|&emsp;&emsp;&emsp;&emsp;shopCategory|店铺分类信息|CategoryVO|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;shopCategoryId|店铺分类ID|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;shopName|店铺名称|string||
|&emsp;&emsp;&emsp;&emsp;skus|sku列表|array|SkuVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;modelId|商品条形码|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;partyCode|商品编码|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuName|sku名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|当前sku规格列表|array|SpuSkuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;stock|库存|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;volume|商品体积|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;weight|商品重量|number||
|&emsp;&emsp;&emsp;&emsp;spuAttrValues|规格属性|array|SpuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|规格属性id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;searchType|搜索类型 0:不需要，1:需要|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|商品id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;spuId|spu id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;totalStock|总库存|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"brand": {
					"brandId": 0,
					"categories": [
						{
							"categories": [
								{
									"categories": [
										{}
									],
									"categoryId": 0,
									"desc": "",
									"icon": "",
									"imgUrl": "",
									"level": 0,
									"name": "",
									"parentId": 0,
									"path": "",
									"pathNames": [],
									"seq": 0,
									"shopId": 0,
									"status": 0
								}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"createTime": "",
					"desc": "",
					"firstLetter": "",
					"imgUrl": "",
					"name": "",
					"seq": 0,
					"status": 0,
					"updateTime": ""
				},
				"brandId": 0,
				"category": {},
				"categoryId": 0,
				"createTime": "",
				"detail": "",
				"hasSkuImg": 0,
				"imgUrls": "",
				"mainImgUrl": "",
				"marketPriceFee": 0,
				"name": "",
				"priceFee": 0,
				"referenceId": 0,
				"saleNum": 0,
				"sellingPoint": "",
				"seq": 0,
				"shopCategory": {},
				"shopCategoryId": 0,
				"shopId": 0,
				"shopName": "",
				"skus": [
					{
						"attrs": "",
						"createTime": "",
						"imgUrl": "",
						"marketPriceFee": 0,
						"modelId": "",
						"partyCode": "",
						"priceFee": 0,
						"skuId": 0,
						"skuName": "",
						"spuId": 0,
						"spuSkuAttrValues": [
							{
								"attrId": 0,
								"attrName": "",
								"attrValueId": 0,
								"attrValueName": "",
								"createTime": "",
								"skuId": 0,
								"spuId": 0,
								"spuSkuAttrId": 0,
								"status": 0,
								"updateTime": ""
							}
						],
						"status": 0,
						"stock": 0,
						"updateTime": "",
						"volume": 0,
						"weight": 0
					}
				],
				"spuAttrValues": [
					{
						"attrId": 0,
						"attrName": "",
						"attrValueId": 0,
						"attrValueName": "",
						"createTime": "",
						"searchType": 0,
						"spuAttrValueId": 0,
						"spuId": 0,
						"updateTime": ""
					}
				],
				"spuId": 0,
				"status": 0,
				"totalStock": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


## 商品上下架


**接口地址**:`/mall4cloud_product/admin/spu/prod_status`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>商品上下架</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryId": 0,
  "changeStock": 0,
  "detail": "",
  "hasSkuImg": 0,
  "imgUrls": "",
  "mainImgUrl": "",
  "marketPriceFee": 0,
  "name": "",
  "priceFee": 0,
  "sellingPoint": "",
  "seq": 0,
  "shopCategoryId": 0,
  "shopId": 0,
  "skuList": [
    {
      "attrs": "",
      "changeStock": 0,
      "imgUrl": "",
      "marketPriceFee": 0,
      "modelId": "",
      "partyCode": "",
      "priceFee": 0,
      "skuId": 0,
      "skuName": "",
      "spuId": 0,
      "spuSkuAttrValues": [
        {
          "attrId": 0,
          "attrName": "",
          "attrValueId": 0,
          "attrValueName": "",
          "skuId": 0,
          "spuId": 0,
          "spuSkuAttrId": 0,
          "status": 0
        }
      ],
      "status": 0,
      "stock": 0,
      "volume": 0,
      "weight": 0
    }
  ],
  "spuAttrValues": [
    {
      "attrId": 0,
      "attrName": "",
      "attrValueId": 0,
      "attrValueName": "",
      "spuAttrValueId": 0,
      "spuId": 0
    }
  ],
  "spuId": 0,
  "spuIds": [],
  "status": 0,
  "tagId": 0,
  "totalStock": 0,
  "video": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuDTO|spuDTO|body|true|SpuDTO|SpuDTO|
|&emsp;&emsp;brandId|品牌ID||false|integer(int64)||
|&emsp;&emsp;categoryId|分类ID||false|integer(int64)||
|&emsp;&emsp;changeStock|更新时，变化的库存||false|integer(int32)||
|&emsp;&emsp;detail|商品详情||false|string||
|&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有||false|integer(int32)||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔||false|string||
|&emsp;&emsp;mainImgUrl|商品主图||false|string||
|&emsp;&emsp;marketPriceFee|市场价||false|integer(int64)||
|&emsp;&emsp;name|spu名称||false|string||
|&emsp;&emsp;priceFee|售价||false|integer(int64)||
|&emsp;&emsp;sellingPoint|卖点||false|string||
|&emsp;&emsp;seq|序号||false|integer(int32)||
|&emsp;&emsp;shopCategoryId|店铺分类ID||false|integer(int64)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;skuList|商品规格列表||false|array|SkuDTO|
|&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔||false|string||
|&emsp;&emsp;&emsp;&emsp;changeStock|更新时，变化的库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片||false|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;modelId|商品条形码||false|string||
|&emsp;&emsp;&emsp;&emsp;partyCode|商品编码||false|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|规格列表||false|array|SpuSkuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable||false|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;volume|商品体积||false|number||
|&emsp;&emsp;&emsp;&emsp;weight|商品重量||false|number||
|&emsp;&emsp;spuAttrValues|商品属性值列表||false|array|SpuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id||false|integer||
|&emsp;&emsp;spuId|spuId||false|integer(int64)||
|&emsp;&emsp;spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)||false|array|integer|
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||
|&emsp;&emsp;tagId|分组id||false|integer(int64)||
|&emsp;&emsp;totalStock|总库存||false|integer(int32)||
|&emsp;&emsp;video|商品视频||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 修改spu（名称、价格、库存、序号）信息


**接口地址**:`/mall4cloud_product/admin/spu/update_spu_data`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新spu信息</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryId": 0,
  "changeStock": 0,
  "detail": "",
  "hasSkuImg": 0,
  "imgUrls": "",
  "mainImgUrl": "",
  "marketPriceFee": 0,
  "name": "",
  "priceFee": 0,
  "sellingPoint": "",
  "seq": 0,
  "shopCategoryId": 0,
  "shopId": 0,
  "skuList": [
    {
      "attrs": "",
      "changeStock": 0,
      "imgUrl": "",
      "marketPriceFee": 0,
      "modelId": "",
      "partyCode": "",
      "priceFee": 0,
      "skuId": 0,
      "skuName": "",
      "spuId": 0,
      "spuSkuAttrValues": [
        {
          "attrId": 0,
          "attrName": "",
          "attrValueId": 0,
          "attrValueName": "",
          "skuId": 0,
          "spuId": 0,
          "spuSkuAttrId": 0,
          "status": 0
        }
      ],
      "status": 0,
      "stock": 0,
      "volume": 0,
      "weight": 0
    }
  ],
  "spuAttrValues": [
    {
      "attrId": 0,
      "attrName": "",
      "attrValueId": 0,
      "attrValueName": "",
      "spuAttrValueId": 0,
      "spuId": 0
    }
  ],
  "spuId": 0,
  "spuIds": [],
  "status": 0,
  "tagId": 0,
  "totalStock": 0,
  "video": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuDTO|spuDTO|body|true|SpuDTO|SpuDTO|
|&emsp;&emsp;brandId|品牌ID||false|integer(int64)||
|&emsp;&emsp;categoryId|分类ID||false|integer(int64)||
|&emsp;&emsp;changeStock|更新时，变化的库存||false|integer(int32)||
|&emsp;&emsp;detail|商品详情||false|string||
|&emsp;&emsp;hasSkuImg|sku是否含有图片 0无 1有||false|integer(int32)||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔||false|string||
|&emsp;&emsp;mainImgUrl|商品主图||false|string||
|&emsp;&emsp;marketPriceFee|市场价||false|integer(int64)||
|&emsp;&emsp;name|spu名称||false|string||
|&emsp;&emsp;priceFee|售价||false|integer(int64)||
|&emsp;&emsp;sellingPoint|卖点||false|string||
|&emsp;&emsp;seq|序号||false|integer(int32)||
|&emsp;&emsp;shopCategoryId|店铺分类ID||false|integer(int64)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;skuList|商品规格列表||false|array|SkuDTO|
|&emsp;&emsp;&emsp;&emsp;attrs|多个销售属性值id逗号分隔||false|string||
|&emsp;&emsp;&emsp;&emsp;changeStock|更新时，变化的库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片||false|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;modelId|商品条形码||false|string||
|&emsp;&emsp;&emsp;&emsp;partyCode|商品编码||false|string||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuSkuAttrValues|规格列表||false|array|SpuSkuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|销售属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrName|销售属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|销售属性值ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueName|销售属性值||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SKU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|SPU ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuSkuAttrId|商品sku销售属性关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable||false|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存||false|integer||
|&emsp;&emsp;&emsp;&emsp;volume|商品体积||false|number||
|&emsp;&emsp;&emsp;&emsp;weight|商品重量||false|number||
|&emsp;&emsp;spuAttrValues|商品属性值列表||false|array|SpuAttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称||false|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称||false|string||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id||false|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id||false|integer||
|&emsp;&emsp;spuId|spuId||false|integer(int64)||
|&emsp;&emsp;spuIds|spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)||false|array|integer|
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||
|&emsp;&emsp;tagId|分组id||false|integer(int64)||
|&emsp;&emsp;totalStock|总库存||false|integer(int32)||
|&emsp;&emsp;video|商品视频||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


# admin-分类信息


## 获取分类信息


**接口地址**:`/mall4cloud_product/admin/category`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据categoryId获取分类信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId|categoryId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«CategoryVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||CategoryVO|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"categories": [
			{
				"categories": [
					{}
				],
				"categoryId": 0,
				"desc": "",
				"icon": "",
				"imgUrl": "",
				"level": 0,
				"name": "",
				"parentId": 0,
				"path": "",
				"pathNames": [],
				"seq": 0,
				"shopId": 0,
				"status": 0
			}
		],
		"categoryId": 0,
		"desc": "",
		"icon": "",
		"imgUrl": "",
		"level": 0,
		"name": "",
		"parentId": 0,
		"path": "",
		"pathNames": [],
		"seq": 0,
		"shopId": 0,
		"status": 0
	},
	"msg": "",
	"success": true
}
```


## 保存分类信息


**接口地址**:`/mall4cloud_product/admin/category`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存分类信息</p>



**请求示例**:


```javascript
{
  "categoryId": 0,
  "desc": "",
  "icon": "",
  "imgUrl": "",
  "level": 0,
  "name": "",
  "parentId": 0,
  "path": "",
  "seq": 0,
  "shopId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryDTO|categoryDTO|body|true|CategoryDTO|CategoryDTO|
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;desc|分类描述||false|string||
|&emsp;&emsp;icon|分类图标||false|string||
|&emsp;&emsp;imgUrl|分类的显示图片||false|string||
|&emsp;&emsp;level|分类层级 从0开始||false|integer(int32)||
|&emsp;&emsp;name|分类名称||false|string||
|&emsp;&emsp;parentId|父ID||false|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新分类信息


**接口地址**:`/mall4cloud_product/admin/category`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新分类信息</p>



**请求示例**:


```javascript
{
  "categoryId": 0,
  "desc": "",
  "icon": "",
  "imgUrl": "",
  "level": 0,
  "name": "",
  "parentId": 0,
  "path": "",
  "seq": 0,
  "shopId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryDTO|categoryDTO|body|true|CategoryDTO|CategoryDTO|
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;desc|分类描述||false|string||
|&emsp;&emsp;icon|分类图标||false|string||
|&emsp;&emsp;imgUrl|分类的显示图片||false|string||
|&emsp;&emsp;level|分类层级 从0开始||false|integer(int32)||
|&emsp;&emsp;name|分类名称||false|string||
|&emsp;&emsp;parentId|父ID||false|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除分类信息


**接口地址**:`/mall4cloud_product/admin/category`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据分类信息id删除分类信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId|categoryId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 分类的启用或禁用


**接口地址**:`/mall4cloud_product/admin/category/category_enable_or_disable`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>分类的启用或禁用</p>



**请求示例**:


```javascript
{
  "categoryId": 0,
  "desc": "",
  "icon": "",
  "imgUrl": "",
  "level": 0,
  "name": "",
  "parentId": 0,
  "path": "",
  "seq": 0,
  "shopId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryDTO|categoryDTO|body|true|CategoryDTO|CategoryDTO|
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;desc|分类描述||false|string||
|&emsp;&emsp;icon|分类图标||false|string||
|&emsp;&emsp;imgUrl|分类的显示图片||false|string||
|&emsp;&emsp;level|分类层级 从0开始||false|integer(int32)||
|&emsp;&emsp;name|分类名称||false|string||
|&emsp;&emsp;parentId|父ID||false|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«boolean»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||boolean||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": true,
	"msg": "",
	"success": true
}
```


## 根据上级id，获取分类列表信息


**接口地址**:`/mall4cloud_product/admin/category/get_list_by_parent_id`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据上级id，获取分类列表信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|parentId|父类id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«CategoryVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"categories": [
				{
					"categories": [
						{}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"categoryId": 0,
			"desc": "",
			"icon": "",
			"imgUrl": "",
			"level": 0,
			"name": "",
			"parentId": 0,
			"path": "",
			"pathNames": [],
			"seq": 0,
			"shopId": 0,
			"status": 0
		}
	],
	"msg": "",
	"success": true
}
```


## 获取平台所有的分类信息


**接口地址**:`/mall4cloud_product/admin/category/platform_categories`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取所有的分类列表信息</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«CategoryVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"categories": [
				{
					"categories": [
						{}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"categoryId": 0,
			"desc": "",
			"icon": "",
			"imgUrl": "",
			"level": 0,
			"name": "",
			"parentId": 0,
			"path": "",
			"pathNames": [],
			"seq": 0,
			"shopId": 0,
			"status": 0
		}
	],
	"msg": "",
	"success": true
}
```


## 获取店铺所有的分类信息


**接口地址**:`/mall4cloud_product/admin/category/shop_categories`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取店铺所有的分类信息</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«CategoryVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"categories": [
				{
					"categories": [
						{}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"categoryId": 0,
			"desc": "",
			"icon": "",
			"imgUrl": "",
			"level": 0,
			"name": "",
			"parentId": 0,
			"path": "",
			"pathNames": [],
			"seq": 0,
			"shopId": 0,
			"status": 0
		}
	],
	"msg": "",
	"success": true
}
```


# admin-品牌信息


## 根据分类，获取品牌列表


**接口地址**:`/mall4cloud_product/admin/brand/get_brand_by_category_id`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据分类，获取品牌列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId|分类id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«BrandVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|BrandVO|
|&emsp;&emsp;brandId|brand_id|integer(int64)||
|&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"brandId": 0,
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"firstLetter": "",
			"imgUrl": "",
			"name": "",
			"seq": 0,
			"status": 0,
			"updateTime": ""
		}
	],
	"msg": "",
	"success": true
}
```


# admin-属性信息


## 获取属性信息


**接口地址**:`/mall4cloud_product/admin/attr`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据attrId获取属性信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|attrId|attrId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«AttrVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||AttrVO|AttrVO|
|&emsp;&emsp;attrId|attr id|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表|array|AttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;value|属性值|string||
|&emsp;&emsp;categories|分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|属性描述|string||
|&emsp;&emsp;name|属性名称|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"attrId": 0,
		"attrType": 0,
		"attrValues": [
			{
				"attrId": 0,
				"attrValueId": 0,
				"createTime": "",
				"updateTime": "",
				"value": ""
			}
		],
		"categories": [
			{
				"categories": [
					{
						"categories": [
							{}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"categoryId": 0,
				"desc": "",
				"icon": "",
				"imgUrl": "",
				"level": 0,
				"name": "",
				"parentId": 0,
				"path": "",
				"pathNames": [],
				"seq": 0,
				"shopId": 0,
				"status": 0
			}
		],
		"createTime": "",
		"desc": "",
		"name": "",
		"searchType": 0,
		"shopId": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


## 保存属性信息


**接口地址**:`/mall4cloud_product/admin/attr`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存属性信息</p>



**请求示例**:


```javascript
{
  "attrId": 0,
  "attrType": 0,
  "attrValues": [
    {
      "attrId": 0,
      "attrValueId": 0,
      "value": ""
    }
  ],
  "categoryIds": [],
  "desc": "",
  "name": "",
  "searchType": 0,
  "shopId": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|attrDTO|attrDTO|body|true|AttrDTO|AttrDTO|
|&emsp;&emsp;attrId|attr id||false|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性||false|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表||false|array|AttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;value|属性值||false|string||
|&emsp;&emsp;categoryIds|分类id列表||false|array|integer|
|&emsp;&emsp;desc|属性描述||false|string||
|&emsp;&emsp;name|属性名称||false|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要||false|integer(int32)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新属性信息


**接口地址**:`/mall4cloud_product/admin/attr`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新属性信息</p>



**请求示例**:


```javascript
{
  "attrId": 0,
  "attrType": 0,
  "attrValues": [
    {
      "attrId": 0,
      "attrValueId": 0,
      "value": ""
    }
  ],
  "categoryIds": [],
  "desc": "",
  "name": "",
  "searchType": 0,
  "shopId": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|attrDTO|attrDTO|body|true|AttrDTO|AttrDTO|
|&emsp;&emsp;attrId|attr id||false|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性||false|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表||false|array|AttrValueDTO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id||false|integer||
|&emsp;&emsp;&emsp;&emsp;value|属性值||false|string||
|&emsp;&emsp;categoryIds|分类id列表||false|array|integer|
|&emsp;&emsp;desc|属性描述||false|string||
|&emsp;&emsp;name|属性名称||false|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要||false|integer(int32)||
|&emsp;&emsp;shopId|店铺id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除属性信息


**接口地址**:`/mall4cloud_product/admin/attr`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据属性信息id删除属性信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|attrId|attrId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 根据分类及属性类别获取属性列表


**接口地址**:`/mall4cloud_product/admin/attr/get_attrs_by_category_id`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据分类及属性类别获取属性列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId|分类id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«AttrVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|AttrVO|
|&emsp;&emsp;attrId|attr id|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表|array|AttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;value|属性值|string||
|&emsp;&emsp;categories|分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|属性描述|string||
|&emsp;&emsp;name|属性名称|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"attrId": 0,
			"attrType": 0,
			"attrValues": [
				{
					"attrId": 0,
					"attrValueId": 0,
					"createTime": "",
					"updateTime": "",
					"value": ""
				}
			],
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"name": "",
			"searchType": 0,
			"shopId": 0,
			"updateTime": ""
		}
	],
	"msg": "",
	"success": true
}
```


## 获取店铺中的销售属性


**接口地址**:`/mall4cloud_product/admin/attr/get_shop_attrs`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取店铺中的销售属性</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«AttrVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|AttrVO|
|&emsp;&emsp;attrId|attr id|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表|array|AttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;value|属性值|string||
|&emsp;&emsp;categories|分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|属性描述|string||
|&emsp;&emsp;name|属性名称|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"attrId": 0,
			"attrType": 0,
			"attrValues": [
				{
					"attrId": 0,
					"attrValueId": 0,
					"createTime": "",
					"updateTime": "",
					"value": ""
				}
			],
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"name": "",
			"searchType": 0,
			"shopId": 0,
			"updateTime": ""
		}
	],
	"msg": "",
	"success": true
}
```


## 获取属性信息列表


**接口地址**:`/mall4cloud_product/admin/attr/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取属性信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name|属性名称|query|true|string||
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|attrId|attr id|query|false|integer(int64)||
|attrType|属性类型 0:销售属性，1:基本属性|query|false|integer(int32)||
|attrValues[0].attrId|属性ID|query|false|integer(int64)||
|attrValues[0].attrValueId|属性id|query|false|integer(int64)||
|attrValues[0].value|属性值|query|false|string||
|categoryIds|分类id列表|query|false|array|integer|
|columns|排序字段数组，用逗号分割|query|false|array|string|
|desc|属性描述|query|false|string||
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|
|searchType|作为搜索参数 0:不需要，1:需要|query|false|integer(int32)||
|shopId|店铺id|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«AttrVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«AttrVO»|PageVO«AttrVO»|
|&emsp;&emsp;list|结果集|array|AttrVO|
|&emsp;&emsp;&emsp;&emsp;attrId|attr id|integer||
|&emsp;&emsp;&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性|integer||
|&emsp;&emsp;&emsp;&emsp;attrValues|属性值列表|array|AttrValueVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrId|属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;attrValueId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;value|属性值|string||
|&emsp;&emsp;&emsp;&emsp;categories|分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;desc|属性描述|string||
|&emsp;&emsp;&emsp;&emsp;name|属性名称|string||
|&emsp;&emsp;&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"attrId": 0,
				"attrType": 0,
				"attrValues": [
					{
						"attrId": 0,
						"attrValueId": 0,
						"createTime": "",
						"updateTime": "",
						"value": ""
					}
				],
				"categories": [
					{
						"categories": [
							{
								"categories": [
									{}
								],
								"categoryId": 0,
								"desc": "",
								"icon": "",
								"imgUrl": "",
								"level": 0,
								"name": "",
								"parentId": 0,
								"path": "",
								"pathNames": [],
								"seq": 0,
								"shopId": 0,
								"status": 0
							}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"createTime": "",
				"desc": "",
				"name": "",
				"searchType": 0,
				"shopId": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


# app-spu信息


## 商品详情信息


**接口地址**:`/mall4cloud_product/ua/spu/prod_info`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据商品ID（prodId）获取商品信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|spuId|商品ID|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«SpuAppVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||SpuAppVO|SpuAppVO|
|&emsp;&emsp;detail|商品详情|string||
|&emsp;&emsp;imgUrls|商品介绍主图 多个图片逗号分隔|string||
|&emsp;&emsp;mainImgUrl|商品介绍主图|string||
|&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer(int64)||
|&emsp;&emsp;name|spu名称|string||
|&emsp;&emsp;priceFee|售价，整数方式保存|integer(int64)||
|&emsp;&emsp;saleNum|商品销量|integer(int32)||
|&emsp;&emsp;sellingPoint|卖点|string||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;skus|sku列表|array|SkuAppVO|
|&emsp;&emsp;&emsp;&emsp;imgUrl|banner图片|string||
|&emsp;&emsp;&emsp;&emsp;marketPriceFee|市场价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;priceFee|售价，整数方式保存|integer||
|&emsp;&emsp;&emsp;&emsp;properties|属性|string||
|&emsp;&emsp;&emsp;&emsp;skuId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;skuName|sku名称|string||
|&emsp;&emsp;&emsp;&emsp;spuId|SPU id|integer||
|&emsp;&emsp;&emsp;&emsp;stock|库存|integer||
|&emsp;&emsp;spuAttrValues|规格属性|array|SpuAttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|规格属性id|integer||
|&emsp;&emsp;&emsp;&emsp;attrName|规格属性名称|string||
|&emsp;&emsp;&emsp;&emsp;attrValueId|规格属性值id|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueName|规格属性值名称|string||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;searchType|搜索类型 0:不需要，1:需要|integer||
|&emsp;&emsp;&emsp;&emsp;spuAttrValueId|商品属性值关联信息id|integer||
|&emsp;&emsp;&emsp;&emsp;spuId|商品id|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;spuId|spu id|integer(int64)||
|&emsp;&emsp;totalStock|总库存|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"detail": "",
		"imgUrls": "",
		"mainImgUrl": "",
		"marketPriceFee": 0,
		"name": "",
		"priceFee": 0,
		"saleNum": 0,
		"sellingPoint": "",
		"shopId": 0,
		"skus": [
			{
				"imgUrl": "",
				"marketPriceFee": 0,
				"priceFee": 0,
				"properties": "",
				"skuId": 0,
				"skuName": "",
				"spuId": 0,
				"stock": 0
			}
		],
		"spuAttrValues": [
			{
				"attrId": 0,
				"attrName": "",
				"attrValueId": 0,
				"attrValueName": "",
				"createTime": "",
				"searchType": 0,
				"spuAttrValueId": 0,
				"spuId": 0,
				"updateTime": ""
			}
		],
		"spuId": 0,
		"totalStock": 0
	},
	"msg": "",
	"success": true
}
```


# app-分类信息


## 获取指定分类下的分类列表（顶级分类的parentId为0,默认为一级分类）


**接口地址**:`/mall4cloud_product/ua/category/category_list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取指定分类下的分类列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|parentId|分类ID|query|false|integer(int64)||
|shopId|店铺id|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«CategoryVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"categories": [
				{
					"categories": [
						{}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"categoryId": 0,
			"desc": "",
			"icon": "",
			"imgUrl": "",
			"level": 0,
			"name": "",
			"parentId": 0,
			"path": "",
			"pathNames": [],
			"seq": 0,
			"shopId": 0,
			"status": 0
		}
	],
	"msg": "",
	"success": true
}
```


## 店铺-平台的全部分类列表接口


**接口地址**:`/mall4cloud_product/ua/category/shop_category_list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>店铺/平台分类列表接口</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|shopId|店铺id|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«CategoryVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|CategoryVO|
|&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;categoryId|分类id|integer(int64)||
|&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;level|分类层级 从0开始|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;parentId|父ID|integer(int64)||
|&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"categories": [
				{
					"categories": [
						{}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"categoryId": 0,
			"desc": "",
			"icon": "",
			"imgUrl": "",
			"level": 0,
			"name": "",
			"parentId": 0,
			"path": "",
			"pathNames": [],
			"seq": 0,
			"shopId": 0,
			"status": 0
		}
	],
	"msg": "",
	"success": true
}
```


# app-品牌信息


## 分类-推荐品牌信息列表


**接口地址**:`/mall4cloud_product/ua/brand/list_by_category`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分类-推荐品牌信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId|categoryId|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«BrandVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|BrandVO|
|&emsp;&emsp;brandId|brand_id|integer(int64)||
|&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"brandId": 0,
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"firstLetter": "",
			"imgUrl": "",
			"name": "",
			"seq": 0,
			"status": 0,
			"updateTime": ""
		}
	],
	"msg": "",
	"success": true
}
```


## 获取品牌信息列表


**接口地址**:`/mall4cloud_product/ua/brand/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取品牌信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryIds|分类|query|true|array|integer|
|firstLetter|检索首字母|query|true|string||
|imgUrl|品牌logo图片|query|true|string||
|name|品牌名称|query|true|string||
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|seq|排序|query|true|integer(int32)||
|brandId|brand_id|query|false|integer(int64)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|desc|品牌描述|query|false|string||
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|
|status|状态 1:enable, 0:disable, -1:deleted|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«BrandVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«BrandVO»|PageVO«BrandVO»|
|&emsp;&emsp;list|结果集|array|BrandVO|
|&emsp;&emsp;&emsp;&emsp;brandId|brand_id|integer||
|&emsp;&emsp;&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"brandId": 0,
				"categories": [
					{
						"categories": [
							{
								"categories": [
									{}
								],
								"categoryId": 0,
								"desc": "",
								"icon": "",
								"imgUrl": "",
								"level": 0,
								"name": "",
								"parentId": 0,
								"path": "",
								"pathNames": [],
								"seq": 0,
								"shopId": 0,
								"status": 0
							}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"createTime": "",
				"desc": "",
				"firstLetter": "",
				"imgUrl": "",
				"name": "",
				"seq": 0,
				"status": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


## 置顶品牌列表


**接口地址**:`/mall4cloud_product/ua/brand/top_brand_list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>置顶品牌列表</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«BrandVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|BrandVO|
|&emsp;&emsp;brandId|brand_id|integer(int64)||
|&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"brandId": 0,
			"categories": [
				{
					"categories": [
						{
							"categories": [
								{}
							],
							"categoryId": 0,
							"desc": "",
							"icon": "",
							"imgUrl": "",
							"level": 0,
							"name": "",
							"parentId": 0,
							"path": "",
							"pathNames": [],
							"seq": 0,
							"shopId": 0,
							"status": 0
						}
					],
					"categoryId": 0,
					"desc": "",
					"icon": "",
					"imgUrl": "",
					"level": 0,
					"name": "",
					"parentId": 0,
					"path": "",
					"pathNames": [],
					"seq": 0,
					"shopId": 0,
					"status": 0
				}
			],
			"createTime": "",
			"desc": "",
			"firstLetter": "",
			"imgUrl": "",
			"name": "",
			"seq": 0,
			"status": 0,
			"updateTime": ""
		}
	],
	"msg": "",
	"success": true
}
```


# app-属性信息


## 获取属性信息


**接口地址**:`/mall4cloud_product/ua/attr`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据attrId获取属性信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|attrId|attrId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«AttrVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||AttrVO|AttrVO|
|&emsp;&emsp;attrId|attr id|integer(int64)||
|&emsp;&emsp;attrType|属性类型 0:销售属性，1:基本属性|integer(int32)||
|&emsp;&emsp;attrValues|属性值列表|array|AttrValueVO|
|&emsp;&emsp;&emsp;&emsp;attrId|属性ID|integer||
|&emsp;&emsp;&emsp;&emsp;attrValueId|属性id|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;&emsp;&emsp;value|属性值|string||
|&emsp;&emsp;categories|分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|属性描述|string||
|&emsp;&emsp;name|属性名称|string||
|&emsp;&emsp;searchType|作为搜索参数 0:不需要，1:需要|integer(int32)||
|&emsp;&emsp;shopId|店铺id|integer(int64)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"attrId": 0,
		"attrType": 0,
		"attrValues": [
			{
				"attrId": 0,
				"attrValueId": 0,
				"createTime": "",
				"updateTime": "",
				"value": ""
			}
		],
		"categories": [
			{
				"categories": [
					{
						"categories": [
							{}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"categoryId": 0,
				"desc": "",
				"icon": "",
				"imgUrl": "",
				"level": 0,
				"name": "",
				"parentId": 0,
				"path": "",
				"pathNames": [],
				"seq": 0,
				"shopId": 0,
				"status": 0
			}
		],
		"createTime": "",
		"desc": "",
		"name": "",
		"searchType": 0,
		"shopId": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


# app-购物车


## 获取用户购物车金额信息


**接口地址**:`/mall4cloud_product/a/shop_cart/amount_info`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取用户购物车金额信息</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«购物车合计»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||购物车合计|购物车合计|
|&emsp;&emsp;count|商品数量|integer(int32)||
|&emsp;&emsp;finalMoney|总计|integer(int64)||
|&emsp;&emsp;subtractMoney|减额|integer(int64)||
|&emsp;&emsp;totalMoney|总额|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"count": 0,
		"finalMoney": 0,
		"subtractMoney": 0,
		"totalMoney": 0
	},
	"msg": "",
	"success": true
}
```


## 添加、修改用户购物车物品


**接口地址**:`/mall4cloud_product/a/shop_cart/change_item`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>通过商品id(prodId)、skuId、店铺Id(shopId),添加/修改用户购物车商品，并传入改变的商品个数(count)，当count为正值时，增加商品数量，当count为负值时，将减去商品的数量，当最终count值小于0时，会将商品从购物车里面删除</p>



**请求示例**:


```javascript
{
  "check": true,
  "count": 0,
  "oldSkuId": 0,
  "shopCartItemId": 0,
  "shopId": 0,
  "skuId": 0,
  "spuId": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|param|param|body|true|ChangeShopCartItemDTO|ChangeShopCartItemDTO|
|&emsp;&emsp;check|||false|boolean||
|&emsp;&emsp;count|商品个数||true|integer(int32)||
|&emsp;&emsp;oldSkuId|旧的skuId 如果传过来说明在变更sku||true|integer(int64)||
|&emsp;&emsp;shopCartItemId|购物车ID||true|integer(int64)||
|&emsp;&emsp;shopId|店铺ID，前端不用传该字段||false|integer(int64)||
|&emsp;&emsp;skuId|skuId||true|integer(int64)||
|&emsp;&emsp;spuId|商品ID||true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 勾选购物车


**接口地址**:`/mall4cloud_product/a/shop_cart/check_items`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
[
  {
    "isChecked": 0,
    "shopCartItemId": 0
  }
]
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|params|params|body|true|array|CheckShopCartItemDTO|
|&emsp;&emsp;isChecked|商品是否勾选 1:勾选 0:未勾选||false|integer(int32)||
|&emsp;&emsp;shopCartItemId|购物车ID||true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 清空用户购物车所有物品


**接口地址**:`/mall4cloud_product/a/shop_cart/delete_all`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>清空用户购物车所有物品</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«string»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": "",
	"msg": "",
	"success": true
}
```


## 删除用户购物车物品


**接口地址**:`/mall4cloud_product/a/shop_cart/delete_item`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>通过购物车id删除用户购物车物品</p>



**请求示例**:


```javascript
[]
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|shopCartItemIds|shopCartItemIds|body|true|array|integer|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 获取购物车失效商品信息


**接口地址**:`/mall4cloud_product/a/shop_cart/expiry_prod_list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取购物车失效商品列表</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«List«ShopCartItemVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||array|ShopCartItemVO|
|&emsp;&emsp;cartItemId|购物车ID|integer(int64)||
|&emsp;&emsp;count|购物车产品个数|integer(int32)||
|&emsp;&emsp;createTime|加入购物车时间|string(date-time)||
|&emsp;&emsp;imgUrl|商品图片|string||
|&emsp;&emsp;isChecked|是否已经勾选|integer(int32)||
|&emsp;&emsp;priceFee|售价，加入购物车时的商品价格|integer(int64)||
|&emsp;&emsp;shopId|店铺ID|integer(int64)||
|&emsp;&emsp;skuId|SkuID|integer(int64)||
|&emsp;&emsp;skuName|sku规格信息|string||
|&emsp;&emsp;skuPriceFee|当前商品价格|integer(int64)||
|&emsp;&emsp;spuId|产品ID|integer(int64)||
|&emsp;&emsp;spuName|spu名称|string||
|&emsp;&emsp;totalAmount|总金额|integer(int64)||
|&emsp;&emsp;totalPrice|当前总价格(商品价格 * 数量)(带小数)|integer(int64)||
|&emsp;&emsp;totalPriceFee|当前总价格(商品价格 * 数量)|integer(int64)||
|&emsp;&emsp;userId|用户ID|integer(int64)||
|&emsp;&emsp;volume|商品体积|number||
|&emsp;&emsp;weight|商品重量|number||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": [
		{
			"cartItemId": 0,
			"count": 0,
			"createTime": "",
			"imgUrl": "",
			"isChecked": 0,
			"priceFee": 0,
			"shopId": 0,
			"skuId": 0,
			"skuName": "",
			"skuPriceFee": 0,
			"spuId": 0,
			"spuName": "",
			"totalAmount": 0,
			"totalPrice": 0,
			"totalPriceFee": 0,
			"userId": 0,
			"volume": 0,
			"weight": 0
		}
	],
	"msg": "",
	"success": true
}
```


## 获取用户购物车信息


**接口地址**:`/mall4cloud_product/a/shop_cart/info`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取用户购物车信息</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«ShopCartWithAmountVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||ShopCartWithAmountVO|ShopCartWithAmountVO|
|&emsp;&emsp;count|商品数量|integer(int32)||
|&emsp;&emsp;finalMoney|总计|integer(int64)||
|&emsp;&emsp;shopCarts|多个店铺的购物车信息|array|ShopCartVO|
|&emsp;&emsp;&emsp;&emsp;shopCartItem|购物车商品信息|array|ShopCartItemVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;cartItemId|购物车ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;count|购物车产品个数|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|加入购物车时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|商品图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;isChecked|是否已经勾选|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;priceFee|售价，加入购物车时的商品价格|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuId|SkuID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuName|sku规格信息|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuPriceFee|当前商品价格|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuId|产品ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;spuName|spu名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;totalAmount|总金额|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;totalPrice|当前总价格(商品价格 * 数量)(带小数)|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;totalPriceFee|当前总价格(商品价格 * 数量)|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;userId|用户ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;volume|商品体积|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;weight|商品重量|number||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺ID|integer||
|&emsp;&emsp;&emsp;&emsp;shopName|店铺名称|string||
|&emsp;&emsp;&emsp;&emsp;shopType|店铺类型1自营店 2普通店|integer||
|&emsp;&emsp;&emsp;&emsp;total|商品总值|integer||
|&emsp;&emsp;&emsp;&emsp;totalCount|数量|integer||
|&emsp;&emsp;totalMoney|总额|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"count": 0,
		"finalMoney": 0,
		"shopCarts": [
			{
				"shopCartItem": [
					{
						"cartItemId": 0,
						"count": 0,
						"createTime": "",
						"imgUrl": "",
						"isChecked": 0,
						"priceFee": 0,
						"shopId": 0,
						"skuId": 0,
						"skuName": "",
						"skuPriceFee": 0,
						"spuId": 0,
						"spuName": "",
						"totalAmount": 0,
						"totalPrice": 0,
						"totalPriceFee": 0,
						"userId": 0,
						"volume": 0,
						"weight": 0
					}
				],
				"shopId": 0,
				"shopName": "",
				"shopType": 0,
				"total": 0,
				"totalCount": 0
			}
		],
		"totalMoney": 0
	},
	"msg": "",
	"success": true
}
```


## 获取购物车商品数量


**接口地址**:`/mall4cloud_product/a/shop_cart/prod_count`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>获取购物车商品数量</p>



**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«int»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||integer(int32)|integer(int32)|
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": 0,
	"msg": "",
	"success": true
}
```


# platform-品牌信息


## 获取品牌信息


**接口地址**:`/mall4cloud_product/platform/brand`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据brandId获取品牌信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brandId|brandId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«BrandVO»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||BrandVO|BrandVO|
|&emsp;&emsp;brandId|brand_id|integer(int64)||
|&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;seq|排序|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer(int32)||
|&emsp;&emsp;updateTime|更新时间|string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"brandId": 0,
		"categories": [
			{
				"categories": [
					{
						"categories": [
							{}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"categoryId": 0,
				"desc": "",
				"icon": "",
				"imgUrl": "",
				"level": 0,
				"name": "",
				"parentId": 0,
				"path": "",
				"pathNames": [],
				"seq": 0,
				"shopId": 0,
				"status": 0
			}
		],
		"createTime": "",
		"desc": "",
		"firstLetter": "",
		"imgUrl": "",
		"name": "",
		"seq": 0,
		"status": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


## 保存品牌信息


**接口地址**:`/mall4cloud_product/platform/brand`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存品牌信息</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryIds": [],
  "desc": "",
  "firstLetter": "",
  "imgUrl": "",
  "name": "",
  "seq": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brandDTO|brandDTO|body|true|BrandDTO|BrandDTO|
|&emsp;&emsp;brandId|brand_id||false|integer(int64)||
|&emsp;&emsp;categoryIds|分类||false|array|integer|
|&emsp;&emsp;desc|品牌描述||false|string||
|&emsp;&emsp;firstLetter|检索首字母||false|string||
|&emsp;&emsp;imgUrl|品牌logo图片||false|string||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新品牌信息


**接口地址**:`/mall4cloud_product/platform/brand`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新品牌信息</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryIds": [],
  "desc": "",
  "firstLetter": "",
  "imgUrl": "",
  "name": "",
  "seq": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brandDTO|brandDTO|body|true|BrandDTO|BrandDTO|
|&emsp;&emsp;brandId|brand_id||false|integer(int64)||
|&emsp;&emsp;categoryIds|分类||false|array|integer|
|&emsp;&emsp;desc|品牌描述||false|string||
|&emsp;&emsp;firstLetter|检索首字母||false|string||
|&emsp;&emsp;imgUrl|品牌logo图片||false|string||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除品牌信息


**接口地址**:`/mall4cloud_product/platform/brand`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据品牌信息id删除品牌信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brandId|brandId|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 获取品牌信息列表


**接口地址**:`/mall4cloud_product/platform/brand/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取品牌信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryIds|分类|query|true|array|integer|
|firstLetter|检索首字母|query|true|string||
|imgUrl|品牌logo图片|query|true|string||
|name|品牌名称|query|true|string||
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|seq|排序|query|true|integer(int32)||
|brandId|brand_id|query|false|integer(int64)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|desc|品牌描述|query|false|string||
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|
|status|状态 1:enable, 0:disable, -1:deleted|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«BrandVO»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«BrandVO»|PageVO«BrandVO»|
|&emsp;&emsp;list|结果集|array|BrandVO|
|&emsp;&emsp;&emsp;&emsp;brandId|brand_id|integer||
|&emsp;&emsp;&emsp;&emsp;categories|分类|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categories|子分类列表|array|CategoryVO|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;desc|分类描述|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;icon|分类图标|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;imgUrl|分类的显示图片|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;level|分类层级 从0开始|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;parentId|父ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;path|分类地址{parent_id}-{child_id},...|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;pathNames|上级分类名称|array|string|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;shopId|店铺id|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;desc|品牌描述|string||
|&emsp;&emsp;&emsp;&emsp;firstLetter|检索首字母|string||
|&emsp;&emsp;&emsp;&emsp;imgUrl|品牌logo图片|string||
|&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;seq|排序|integer||
|&emsp;&emsp;&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|更新时间|string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"brandId": 0,
				"categories": [
					{
						"categories": [
							{
								"categories": [
									{}
								],
								"categoryId": 0,
								"desc": "",
								"icon": "",
								"imgUrl": "",
								"level": 0,
								"name": "",
								"parentId": 0,
								"path": "",
								"pathNames": [],
								"seq": 0,
								"shopId": 0,
								"status": 0
							}
						],
						"categoryId": 0,
						"desc": "",
						"icon": "",
						"imgUrl": "",
						"level": 0,
						"name": "",
						"parentId": 0,
						"path": "",
						"pathNames": [],
						"seq": 0,
						"shopId": 0,
						"status": 0
					}
				],
				"createTime": "",
				"desc": "",
				"firstLetter": "",
				"imgUrl": "",
				"name": "",
				"seq": 0,
				"status": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


## 更新品牌状态（启用或禁用）


**接口地址**:`/mall4cloud_product/platform/brand/update_brand_status`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新品牌状态（启用或禁用）</p>



**请求示例**:


```javascript
{
  "brandId": 0,
  "categoryIds": [],
  "desc": "",
  "firstLetter": "",
  "imgUrl": "",
  "name": "",
  "seq": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brandDTO|brandDTO|body|true|BrandDTO|BrandDTO|
|&emsp;&emsp;brandId|brand_id||false|integer(int64)||
|&emsp;&emsp;categoryIds|分类||false|array|integer|
|&emsp;&emsp;desc|品牌描述||false|string||
|&emsp;&emsp;firstLetter|检索首字母||false|string||
|&emsp;&emsp;imgUrl|品牌logo图片||false|string||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;seq|排序||false|integer(int32)||
|&emsp;&emsp;status|状态 1:enable, 0:disable, -1:deleted||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


# 库存锁定信息


## 获取库存锁定信息


**接口地址**:`/mall4cloud_product/a/sku_stock_lock`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据id获取库存锁定信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«SkuStockLock»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||SkuStockLock|SkuStockLock|
|&emsp;&emsp;count||integer(int32)||
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;orderId||integer(int64)||
|&emsp;&emsp;skuId||integer(int64)||
|&emsp;&emsp;spuId||integer(int64)||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"count": 0,
		"createTime": "",
		"id": 0,
		"orderId": 0,
		"skuId": 0,
		"spuId": 0,
		"status": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


## 保存库存锁定信息


**接口地址**:`/mall4cloud_product/a/sku_stock_lock`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存库存锁定信息</p>



**请求示例**:


```javascript
{
  "count": 0,
  "id": 0,
  "orderId": 0,
  "skuId": 0,
  "spuId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|skuStockLockDTO|skuStockLockDTO|body|true|SkuStockLockDTO|SkuStockLockDTO|
|&emsp;&emsp;count|锁定库存数量||false|integer(int32)||
|&emsp;&emsp;id|id||false|integer(int64)||
|&emsp;&emsp;orderId|订单id||false|integer(int64)||
|&emsp;&emsp;skuId|sku id||false|integer(int64)||
|&emsp;&emsp;spuId|商品id||false|integer(int64)||
|&emsp;&emsp;status|状态-1已解锁 0待确定 1已锁定||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新库存锁定信息


**接口地址**:`/mall4cloud_product/a/sku_stock_lock`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新库存锁定信息</p>



**请求示例**:


```javascript
{
  "count": 0,
  "id": 0,
  "orderId": 0,
  "skuId": 0,
  "spuId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|skuStockLockDTO|skuStockLockDTO|body|true|SkuStockLockDTO|SkuStockLockDTO|
|&emsp;&emsp;count|锁定库存数量||false|integer(int32)||
|&emsp;&emsp;id|id||false|integer(int64)||
|&emsp;&emsp;orderId|订单id||false|integer(int64)||
|&emsp;&emsp;skuId|sku id||false|integer(int64)||
|&emsp;&emsp;spuId|商品id||false|integer(int64)||
|&emsp;&emsp;status|状态-1已解锁 0待确定 1已锁定||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除库存锁定信息


**接口地址**:`/mall4cloud_product/a/sku_stock_lock`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据库存锁定信息id删除库存锁定信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 获取库存锁定信息列表


**接口地址**:`/mall4cloud_product/a/sku_stock_lock/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取库存锁定信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«SkuStockLock»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«SkuStockLock»|PageVO«SkuStockLock»|
|&emsp;&emsp;list|结果集|array|SkuStockLock|
|&emsp;&emsp;&emsp;&emsp;count||integer||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;orderId||integer||
|&emsp;&emsp;&emsp;&emsp;skuId||integer||
|&emsp;&emsp;&emsp;&emsp;spuId||integer||
|&emsp;&emsp;&emsp;&emsp;status||integer||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"count": 0,
				"createTime": "",
				"id": 0,
				"orderId": 0,
				"skuId": 0,
				"spuId": 0,
				"status": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```


## 获取库存锁定信息


**接口地址**:`/mall4cloud_product/admin/sku_stock_lock`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据id获取库存锁定信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«SkuStockLock»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||SkuStockLock|SkuStockLock|
|&emsp;&emsp;count||integer(int32)||
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;orderId||integer(int64)||
|&emsp;&emsp;skuId||integer(int64)||
|&emsp;&emsp;spuId||integer(int64)||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"count": 0,
		"createTime": "",
		"id": 0,
		"orderId": 0,
		"skuId": 0,
		"spuId": 0,
		"status": 0,
		"updateTime": ""
	},
	"msg": "",
	"success": true
}
```


## 保存库存锁定信息


**接口地址**:`/mall4cloud_product/admin/sku_stock_lock`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>保存库存锁定信息</p>



**请求示例**:


```javascript
{
  "count": 0,
  "id": 0,
  "orderId": 0,
  "skuId": 0,
  "spuId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|skuStockLockDTO|skuStockLockDTO|body|true|SkuStockLockDTO|SkuStockLockDTO|
|&emsp;&emsp;count|锁定库存数量||false|integer(int32)||
|&emsp;&emsp;id|id||false|integer(int64)||
|&emsp;&emsp;orderId|订单id||false|integer(int64)||
|&emsp;&emsp;skuId|sku id||false|integer(int64)||
|&emsp;&emsp;spuId|商品id||false|integer(int64)||
|&emsp;&emsp;status|状态-1已解锁 0待确定 1已锁定||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 更新库存锁定信息


**接口地址**:`/mall4cloud_product/admin/sku_stock_lock`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:<p>更新库存锁定信息</p>



**请求示例**:


```javascript
{
  "count": 0,
  "id": 0,
  "orderId": 0,
  "skuId": 0,
  "spuId": 0,
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|skuStockLockDTO|skuStockLockDTO|body|true|SkuStockLockDTO|SkuStockLockDTO|
|&emsp;&emsp;count|锁定库存数量||false|integer(int32)||
|&emsp;&emsp;id|id||false|integer(int64)||
|&emsp;&emsp;orderId|订单id||false|integer(int64)||
|&emsp;&emsp;skuId|sku id||false|integer(int64)||
|&emsp;&emsp;spuId|商品id||false|integer(int64)||
|&emsp;&emsp;status|状态-1已解锁 0待确定 1已锁定||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 删除库存锁定信息


**接口地址**:`/mall4cloud_product/admin/sku_stock_lock`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>根据库存锁定信息id删除库存锁定信息</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|query|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«Void»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"msg": "",
	"success": true
}
```


## 获取库存锁定信息列表


**接口地址**:`/mall4cloud_product/admin/sku_stock_lock/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>分页获取库存锁定信息列表</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|当前页|query|true|integer(int32)||
|pageSize|每页大小|query|true|integer(int32)||
|columns|排序字段数组，用逗号分割|query|false|array|string|
|orderBy||query|false|string||
|orders|排序字段方式，用逗号分割，ASC正序，DESC倒序|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ServerResponseEntity«PageVO«SkuStockLock»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||string||
|data||PageVO«SkuStockLock»|PageVO«SkuStockLock»|
|&emsp;&emsp;list|结果集|array|SkuStockLock|
|&emsp;&emsp;&emsp;&emsp;count||integer||
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;orderId||integer||
|&emsp;&emsp;&emsp;&emsp;skuId||integer||
|&emsp;&emsp;&emsp;&emsp;spuId||integer||
|&emsp;&emsp;&emsp;&emsp;status||integer||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;pages|总页数|integer(int32)||
|&emsp;&emsp;total|总条目数|integer(int64)||
|msg||string||
|success||boolean||


**响应示例**:
```javascript
{
	"code": "",
	"data": {
		"list": [
			{
				"count": 0,
				"createTime": "",
				"id": 0,
				"orderId": 0,
				"skuId": 0,
				"spuId": 0,
				"status": 0,
				"updateTime": ""
			}
		],
		"pages": 0,
		"total": 0
	},
	"msg": "",
	"success": true
}
```