Project Documentation: E-commerce Application

1. Project Overview

    Description: The E-Commerce application supports functionalities for managing products, user registration, login, and browsing product information. It includes the following key     
     components:
       Product Management : Fetch and display a list of products.
       User Management : Register and authenticate users.

3. System Requirements

    Backend:
      Java 17
      Spring Boot 3.4.1
    Database:
      MYSQL
    IDE:
      Spring Tool Suite (STS)

4. Installation and Setup

    Backend (Spring Boot) Setup:
      1. Clone the backend repository.
      2. Configure the application.properties file with your MYSQL database.
      3. Build and run the Spring Boot application:


5. API Endpoints

    GET  /api/products	Retrieves a list of all available products
    POST  /api/user/register	Allows new users to create an account
    POST  /api/user/login	Allows existing users to log in


5. Future Enhancements

    Product Management: Add APIs for creating, updating, and deleting products.
    Order Management: Enable users to place and track orders.
    Search and Filters: Allow users to search for products by name and apply category-based filters.
    Email Notifications: Send email confirmations for registration and orders.

