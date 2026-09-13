# Digital Document Verification System

A basic Java-based Digital Document Verification System designed to store, manage, and verify digital documents using Object-Oriented Programming concepts.

## Tech Stack

- Language: Java
- Programming Concept: Object-Oriented Programming
- Data Structure: ArrayList
- Version Control: Git / GitHub

## Project Structure

digital-document-verification-system/
│
├── src/                    # Java source files
│   ├── Document.java       # Document class
│   ├── DocumentManager.java# Document management
│   └── Main.java           # Main program and testing
│
├── basic-testing.jpg       # Basic console testing result
│
├── .gitignore
└── README.md

## Architecture

```text
Main
 │
 │ creates
 ▼
Document Objects
 │
 │ managed by
 ▼
DocumentManager
 │
 ├── Add Document
 │
 ├── Search Document
 │
 └── Display Documents
