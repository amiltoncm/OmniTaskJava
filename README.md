# OmniTaskJava

OmniTaskJava is a **REST API** developed in **Java**, designed with a focus on **clean architecture, security, and scalability**.  
The goal is to provide a solid foundation for task management and other domains, enabling any frontend (web, mobile, desktop) to consume its services.  

A **React frontend** will be developed later to demonstrate how to consume this API.

## 🏗️ Architecture
- **Well-defined layers**: clear separation between domain, application, and infrastructure
- **Security best practices**: authentication, authorization, and data protection
- **Scalability**: prepared to evolve and support multiple clients
- **Automated tests**: ensuring quality and reliability

## 🚀 Initial Features
- Task CRUD operations
- Organization by categories and priorities
- Standardized and documented REST API
- Data persistence in a relational database

## 📦 Technologies
- Java 17+
- Spring Boot
- Maven/Gradle
- Relational database (e.g., PostgreSQL)
- [Add here other libraries/frameworks you use]

## 🔧 How to Run
Clone the repository: git clone git@github.com:amiltoncm/OmniTaskJava.git

## Build and run:

cd OmniTaskJava
mvn clean install
java -jar target/omnitask.jar

## The API will be available at:

http://localhost:8080/api

📄 Documentation
The API follows REST standards and will be documented with Swagger/OpenAPI to facilitate integration with any frontend.

🤝 Contributing
Contributions are welcome!

Fork the project

Create a branch (git checkout -b feature/new-feature)

Commit your changes (git commit -m 'Add new feature')

Push to the branch (git push origin feature/new-feature)

Open a Pull Request

📄 License
This project is licensed under the MIT License – see the LICENSE file for details.


✨ This version positions your project as a **professional API** with strong architecture and security principles, while also making it clear that it’s frontend-agnostic and will later have a React client.  

Would you like me to also add a **Roadmap section** in English (e.g., “Next steps: JWT authentication, React frontend, cloud deployment”) so potential contributors see where the project is heading?
