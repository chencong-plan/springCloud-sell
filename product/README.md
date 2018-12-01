## 商品服务

现将其修改为多模块

| 模块名称 |功能描述  | 备注 |
| --- | --- | --- |
| product-client | 提供服务，供外部服务调用 | |
| product-server | 具体业务实现 |  |
| product-common | 基础服务，供product-client和product-server调用 | 其中重新定义入参和出参 |
