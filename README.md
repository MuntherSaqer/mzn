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
