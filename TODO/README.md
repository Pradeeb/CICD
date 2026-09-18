# Tech Stock TODO Application

A Full Stack TODO Management Application built using Spring Boot, React, MySQL, Docker, and Jenkins to gain real-world CI/CD experience.

## 🚀 Project Overview

This project demonstrates a complete software development lifecycle from development to deployment.

Users can create, update, delete, and manage TODO tasks through a React frontend that communicates with a Spring Boot REST API. Data is stored in MySQL, containerized using Docker, and automatically deployed through a Jenkins CI/CD pipeline.

---

## 🛠 Tech Stack

### Frontend
- React.js
- Axios
- Bootstrap / Material UI

### Backend
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database
- MySQL

### DevOps & CI/CD
- Docker
- Docker Compose
- Jenkins
- Git
- GitHub

---

## 📌 Features

### TODO Management
- Create TODO
- View All TODOs
- Update TODO
- Delete TODO
- Mark TODO as Completed

### Future Enhancements
- User Authentication (JWT)
- Role-Based Access Control
- Stock Watchlist Module
- Kubernetes Deployment
- AWS Deployment

---

## 🏗 Project Architecture

```text
┌─────────────┐
│ React UI    │
└──────┬──────┘
       │ REST API
       ▼
┌─────────────┐
│ Spring Boot │
│ Backend API │
└──────┬──────┘
       │ JPA
       ▼
┌─────────────┐
│   MySQL DB  │
└─────────────┘

Dockerized Services

Frontend Container
Backend Container
MySQL Container

CI/CD Using Jenkins
```

---

## 📂 Project Structure

```text
tech-stock-todo/
│
├── frontend/
│   ├── src/
│   ├── public/
│   ├── Dockerfile
│   └── package.json
│
├── backend/
│   ├── src/
│   ├── Dockerfile
│   ├── pom.xml
│   └── application.properties
│
├── database/
│
├── docker-compose.yml
│
├── Jenkinsfile
│
└── README.md
```

---

## 🗃 Database Schema

### Todos Table

```sql
CREATE TABLE todos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## ⚙️ Local Setup

### Clone Repository

```bash
git clone https://github.com/your-username/tech-stock-todo.git

cd tech-stock-todo
```

### Backend Setup

```bash
cd backend

mvn clean install

mvn spring-boot:run
```

Backend URL

```text
http://localhost:8080
```

### Frontend Setup

```bash
cd frontend

npm install

npm start
```

Frontend URL

```text
http://localhost:3000
```

---

## 🐳 Docker Setup

### Build Images

```bash
docker build -t todo-backend ./backend

docker build -t todo-frontend ./frontend
```

### Run Using Docker Compose

```bash
docker-compose up -d
```

Verify Containers

```bash
docker ps
```

---

## 🔄 CI/CD Pipeline Flow

### Stage 1

Checkout Source Code

```bash
git checkout main
```

### Stage 2

Build Backend

```bash
mvn clean package
```

### Stage 3

Build Frontend

```bash
npm install

npm run build
```

### Stage 4

Run Automated Tests

```text
Unit Testing
Integration Testing
```

### Stage 5

Build Docker Images

```bash
docker build
```

### Stage 6

Deploy Containers

```bash
docker-compose up -d
```

### Stage 7

Health Check

```text
Application verification
```

---

## Jenkins Pipeline

```text
GitHub Push
      │
      ▼
 Jenkins Trigger
      │
      ▼
Checkout Code
      │
      ▼
Build Backend
      │
      ▼
Build Frontend
      │
      ▼
Run Tests
      │
      ▼
Build Docker Images
      │
      ▼
Deploy Containers
      │
      ▼
Application Running
```

---

## 📈 Learning Outcomes

Through this project, you will gain hands-on experience with:

- Git & GitHub
- Branching Strategy
- Spring Boot REST APIs
- React Development
- MySQL Database Design
- Maven Build Process
- Docker & Docker Compose
- Jenkins Pipelines
- CI/CD Concepts
- Linux Commands
- Automated Deployment
- DevOps Best Practices

---

## 🎯 Project Goal

Build a production-style Full Stack application and implement an end-to-end CI/CD pipeline that automatically builds, tests, dockerizes, and deploys the application whenever code is pushed to GitHub.

---

## 👨‍💻 Author

Your Name

Learning Journey:
Full Stack Development + DevOps + CI/CD