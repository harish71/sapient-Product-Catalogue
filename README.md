# sapient-Product-Catalogue

API Endpoints :- 

POST :- http://localhost:8080/product/save
GET :-  http://localhost:8080/product/getByBrand/{brand}
GET :-  http://localhost:8080/product/getByColor/{color}
GET :-  http://localhost:8080/product/getBySize/{size}
GET :-  http://localhost:8080/product/getByPrice/{price}
GET :-  http://localhost:8080/product/getBySku/{sku}
GET :-  http://localhost:8080/product/{sellerName}/{productId}
GET :-  http://localhost:8080/product/inventory/{productId}
DELETE :- http://localhost:8080/product/delete/{id}
POST :- http://localhost:8080/seller/save
DELETE :- http://localhost:8080/seller/delete/{id}
      
Ref - Product.json
{
      "productId": 1,
      "productName": "shirt",
      "price": 1200.0,
      "color": "white",
      "brand": "levis",
      "size": 38,
      "sku": "sku1"
 }

Ref - Seller.json
{
  "id":1,
  "product_id":2,
  "product_quantity":5,
  "seller_name":"abc"
}
