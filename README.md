# To start the project-
Right click on project -> Run as -> Run on server


# getProductList API
Request type: GET
URL : http://localhost:8080/jersey-jdbc/webapi/product/list


# getProductById API
Request type: GET
URL : http://localhost:8080/jersey-jdbc/webapi/product/1


# createProduct API
Request type: POST
URL : http://localhost:8080/jersey-jdbc/webapi/product
Body : 
{
    "name": "Kiwi",
    "imageUrl": "/s3/kiwi.png",
    "price": 1.99,
    "quantity": 25
}


# updateProduct API
Request type: PUT
URL : http://localhost:8080/jersey-jdbc/webapi/product
Body : 
{
    "id": 5,
    "name": "Kiwi",
    "imageUrl": "/s3/kiwi.png",
    "price": 1.99,
    "quantity": 25
}


# deleteProduct API
Request type: DELETE
URL : http://localhost:8080/jersey-jdbc/webapi/product/1
