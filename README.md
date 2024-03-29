POS Application
This is a Point of Sale (POS) application built with Spring Boot for managing customers, products, and orders.

Table of Contents
Introduction
Features
Technologies Used
Getting Started
Prerequisites
Installation
Running the Application
API Endpoints
Testing
Contributing
License
Introduction
The POS application provides functionalities for managing customers, products, and orders. It allows users to create, retrieve, update, and delete customer and product records, as well as create orders and associate products with orders.

Features
Create, retrieve, update, and delete customers
Create, retrieve, update, and delete products
Create orders and associate products with orders
Retrieve order details including customer information and product details
Technologies Used
Spring Boot
Spring Data JPA
H2 Database (for development and testing)
Maven (for dependency management)
JUnit and Mockito (for testing)
RESTful API architecture
Getting Started
Prerequisites
Before running the application, make sure you have the following installed on your system:

Java JDK 8 or later
Maven
Installation
Clone the repository:

git clone https://github.com/your-username/pos-application.git
Navigate to the project directory:

cd pos-application
Build the project:

mvn clean install
Running the Application
Run the Spring Boot application:

mvn spring-boot:run
The application will start, and you can access the API endpoints using the base URL http://localhost:8080.

API Endpoints
The following API endpoints are available:

GET /api/customers: Get all customers
GET /api/customers/{id}: Get customer by ID
POST /api/customers: Create a new customer
PUT /api/customers/{id}: Update customer by ID
DELETE /api/customers/{id}: Delete customer by ID
GET /api/products: Get all products
GET /api/products/{id}: Get product by ID
POST /api/products: Create a new product
PUT /api/products/{id}: Update product by ID
DELETE /api/products/{id}: Delete product by ID
GET /api/orders: Get all orders
GET /api/orders/{id}: Get order by ID
POST /api/orders: Create a new order
PUT /api/orders/{id}: Update order by ID
DELETE /api/orders/{id}: Delete order by ID

Testing
To run the tests, use the following command:
mvn test
Contributing


///to add customer 
use this @post
http://localhost:8080/api/customers/batch
[
  {
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "123-456-7890",
    "address": "123 Main St"
  },
  {
    "name": "Alice Smith",
    "email": "alice.smith@example.com",
    "phone": "987-654-3210",
    "address": "456 Elm St"
  },
  {
    "name": "Bob Johnson",
    "email": "bob.johnson@example.com",
    "phone": "555-123-4567",
    "address": "789 Oak St"
  },
  {
    "name": "Emily Brown",
    "email": "emily.brown@example.com",
    "phone": "333-444-5555",
    "address": "101 Pine St"
  }
]


///to add Products
use this @post
http://localhost:8080/api/products/batch
[
  {
    "name": "Product 1",
    "price": 10.99
  },
  {
    "name": "Product 2",
    "price": 15.49
  },
  {
    "name": "Product 3",
    "price": 20.79
  },
  {
    "name": "Product 4",
    "price": 8.99
  },
  {
    "name": "Product 5",
    "price": 25.99
  },
  {
    "name": "Product 6",
    "price": 19.99
  },
  {
    "name": "Product 7",
    "price": 12.49
  }
]


to create order 
use this @post
http://localhost:8080/api/orders
{
  "customer": {
    "id": 3
  },
  "products": [
    {"id": 1},
    {"id": 2},
    {"id": 4}
  ]
}

