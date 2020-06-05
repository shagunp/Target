1. The application exposes following REST API to retrieve the product details specific to a product id along with pricing information-
	http://localhost:8080/MyProject/products/13860428
2. Response of the API hit in step1:
    {"productId":"13860428","productName":"The Big Lebowski (Blu-ray)","current_price":{"value":"13.76","currency_code":"INR"}}	
3. Price details are fetched from MongoDB and added to the response above(current_price)

4. Application exposes REST API to update the pricing details in MongoDB.
   Sample request body: {"current_price":{"value":"13.76","currency_code":"INR"}}
