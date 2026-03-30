📚 Book Store Application (Spring Boot - No Database)
🚀 Project Overview

The Book Store Application is a simple backend project built using Spring Boot. It demonstrates how to create REST APIs without using any database.

All book data is managed in-memory (using collections like List), making it perfect for beginners to understand the core concepts of Spring Boot and API development.

🛠️ Tech Stack
Java
Spring Boot
Spring Web
Maven
✨ Features
➕ Add new books
📖 View all books
🔍 Get book details by ID
✏️ Update book information
❌ Delete books
⚡ In-memory data storage (no database required)
🔗 RESTful API design
📁 Project Structure
BookStoreApplication
│── controller      # Handles HTTP requests (API layer)
│── service         # Business logic
│── repository      # In-memory data handling
│── model           # Book class
│── main class      # Spring Boot entry point
⚙️ How It Works
The application uses a List or collection to store book data.
No database connection is required. 
Method	Endpoint	Description
GET	/books	Get all books
GET	/books/{id}	Get book by ID
POST	/books	Add new book
PUT	/books/{id}	Update book
DELETE	/books/{id}	Delete book
📌 Limitations
❌ No database integration
❌ Data is not persistent
🔄 Data resets on restart
📌 Future Enhancements
Add database (MySQL / MongoDB)
Add frontend UI
Implement validation
Add exception handling
