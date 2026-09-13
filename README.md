# Digital Certificate Verification System

A Java-based Digital Certificate Verification System designed to store, manage, and verify digital certificates using Object-Oriented Programming, JDBC, and MySQL.

## Tech Stack

- Language: Java
- Programming Concept: Object-Oriented Programming (OOP)
- GUI: Java Swing
- Database: MySQL
- Database Connectivity: JDBC
- Version Control: Git / GitHub

## Project Architecture

```text
             Frontend / GUI
                    │
                    ▼
             Java Backend
                    │
             Business Logic
                    │
                    ▼
                  JDBC
                    │
                    ▼
                 MySQL


Digital-Certificate-Verification-System/
│
├── src/
│   ├── Document.java
│   ├── DocumentManager.java
│   ├── Main.java
│   │
│   ├── model/
│   ├── dao/
│   ├── service/
│   └── database/
│
├── database/
│   └── schema.sql
│
├── basic-testing.jpg
│
├── .gitignore
└── README.md
