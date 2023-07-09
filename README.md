# Ecommerce API

## Table of Contents
- [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [Controller](#controller)
  - [Services](#services)
  - [Repository](#repository)
  - [Database Design](#database-design)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)
- [Getting Started](#getting-started)
- [Testing Endpoints](#testing-endpoints)
- [License](#license)

## Frameworks and Language Used
- Java
- Spring Boot
- Maven
- Dependencies:
   - Spring Web
   - Lombok
   - WebMVC Ui for Swagger Ui
   - Spring Data JPA
   - MySQL Driver

## Data Flow

### Controller
The controller package contains classes responsible for handling HTTP requests and managing the flow of data between the client and the server. The following controllers are available:
- AddressController: Manages address-related endpoints.
- OrderController: Manages order-related endpoints.
- ProductController: Manages product-related endpoints.
- UserController: Manages user-related endpoints.

### Services
The service package contains classes that implement the business logic of the application. The following services are available:
- AddressService: Provides address-related functionality.
- OrderService: Provides order-related functionality.
- ProductService: Provides product-related functionality.
- UserService: Provides user-related functionality.

### Repository
The repository package contains interfaces that define CRUD operations and custom queries. The following repositories are available:
- AddressRepo: Provides CRUD operations for the Address entity.
- OrderRepo: Provides CRUD operations for the Order entity.
- ProductRepo: Provides CRUD operations for the Product entity.
- UserRepo: Provides CRUD operations for the User entity.

### Database Design
The project follows a relational database design. The main entities and their relationships are as follows:
- Address: Represents an address with a one-to-one relationship with the User entity.
- Order: Represents an order with relationships to User, Product, and Address entities.
- Product: Represents a product with relationships to Order entities.
- User: Represents a user with a one-to-one relationship with the Address entity.

## Data Structure
The project utilizes various data structures, including classes and enums, to represent different entities and their attributes. Some important data structures used in the project are:
- Address: Represents an address entity.
- Order: Represents an order entity.
- Product: Represents a product entity.
- User: Represents a user entity.
- Category: Enum representing different product categories.
- Brand: Enum representing different product brands.

## Project Summary
The Ecommerce API project is a simple eCommerce system built using Spring Boot and Java. It provides endpoints to manage users, addresses, orders, and products. The project follows the MVC architecture, where models represent entities, repositories handle data access, services contain business logic, and controllers define REST endpoints.

## Getting Started
To run the project locally, follow these steps:
1. Clone the repository from [Ecommerce API](https://github.com/ayaan097/Ecommerce-API.git).
2. Configure the MySQL database in the application.properties file.
3. Build and run the application using Maven or your preferred IDE.
4. Access the API endpoints using a tool like Swagger UI or Postman.

## Testing Endpoints
To test the API endpoints, you can use tools like Postman. Here are some sample endpoints you can test:
- Create a new user: `[POST] /users`
- Get user by ID: `[GET] /users/userId/{userId}`
- Create a new address: `[POST] /addresses`
- Create a new order: `[POST] /orders`
- Get order by ID: `[GET] /orders/orderId/{orderId}`
- Create a new product: `[POST] /products`
- Get all products by category: `[GET] /products/productCategory`
- Delete a product by ID: `[DELETE] /products/productId/{productId}`

## License
This project is Not `licensed`.
