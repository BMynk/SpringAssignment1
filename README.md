# 🚀 CSC313 - Spring Boot Assignment 1
**Group 12 - Case Sensitive Warriors** 🛡️

<div align="center">

![Java](https://img.shields.io/badge/Java-20-%23ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.4-%236DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

![Dark Mode Ready](https://img.shields.io/badge/Dark_Mode-Ready-000000?style=for-the-badge&logo=git&logoColor=white)

</div>

---

### ✨ Project Overview
A **fully functional REST API** for the University of Fort Hare Computer Science Department.  
Built exactly to the assignment specification (Part A + Part B).

**Part A** → Returns 2 Foundation + 5 Undergraduate + 4 Honours courses  
**Part B** → Full CRUD + Bean Validation

---


**Members:** Mgoqi Aphelele (Leader), Ngcebo Mxolisi Bhengu, Mbanga Onwaba, Mtimba Misokuhle, Yeboah Mishael Kwaku, Zimase Afika

### 📊 Project Structure (Auto Dark Mode)

```mermaid
graph TD
    A[springassignment1] --> B[pom.xml]
    A --> C[src/main/java]
    C --> D[SpringAssignment1Application.java]
    C --> E[SpringAssignment1]
    E --> F[model]
    E --> G[service]
    E --> H[controller]
    F --> I[Course.java]
    F --> J[Level.java]
    G --> K[CourseService.java]
    H --> L[CourseController.java]
    A --> M[README.md]
    A --> N[postman-collection.json]


