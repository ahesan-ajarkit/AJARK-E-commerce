
# E-Commerce Application

## Project Overview

The E-Commerce application provides essential functionalities for managing products, user registration, login, and browsing product information. 

### Key Features:
- **Product Management:** Fetch and display a list of products.
- **User Management:** Register and authenticate users.

---

## System Requirements

### Backend:
- **Java:** 17
- **Framework:** Spring Boot 3.4.1

### Database:
- **MySQL**

### IDE:
- **Spring Tool Suite (STS)**

---

## Installation and Setup

### Backend (Spring Boot) Setup:

1. **Clone the Repository:**  
   ```bash
   git clone <repository-url>
   ```
   
2. **Configure MySQL Database:**  
   Update the `application.properties` file with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run the Application:**  
   Navigate to the project directory and run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## API Endpoints

| **Endpoint**         | **Description**                                   |
|-----------------------|---------------------------------------------------|
| `GET /api/products`   | Retrieves a list of all available products.       |
| `POST /api/user/register` | Allows new users to create an account.          |
| `POST /api/user/login`    | Allows existing users to log in.                 |

---

## Future Enhancements

1. **Product Management:**
   - Add APIs for creating, updating, and deleting products.

2. **Order Management:**
   - Enable users to place and track orders.

3. **Search and Filters:**
   - Allow users to search for products by name and apply category-based filters.

4. **Email Notifications:**
   - Send email confirmations for registration and orders.

---

