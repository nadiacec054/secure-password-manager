# Secure Password Manager (Java)

Secure Password Manager is a Java-based console application that allows users to securely store, manage, and retrieve passwords for multiple accounts. 

The application includes password strength analysis, password generation, master authentication, and OTP-based multi-factor verification before revealing stored credentials

## Features

### Authentication Layer
- Master password protection
- Access denied on incorrect master password
- OTP-based Multi-Factor Authentication (MFA) before displaying stored passwords

### Password Strength Checker
- Validates minimum length
- Detects uppercase letters
- Detects lowercase letters
- Detects numbers
- Detects special characters
- Classifies password as Weak / Medium / Strong

### Strong Password Generator
- Generates secure random passwords
- Includes uppercase, lowercase, numbers, and symbols

### Password Storage System
- Stores credentials for multiple platforms (e.g., Gmail, Instagram, LinkedIn)
- File-based storage using Java File Handling
- Allows adding new account credentials
- Allows viewing stored passwords (after authentication)

## Tech Stack
- Java
- File Handling (FileWriter, BufferedReader)
- OOP Concepts
- Random class for OTP generation
- Console-based UI

---

## Security Model (Educational Implementation)

This project demonstrates layered security concepts:

1. Master password authentication
2. OTP verification (Multi-Factor Authentication simulation)
3. Controlled access to stored credentials

Note: This is an academic implementation and does not include production-level encryption like AES.

## learning Outcomes

- Applied authentication logic
- Implemented file-based credential storage
- Simulated multi-factor authentication
- Built a security-focused Java application
- Strengthened understanding of conditional logic and access control

---

## Author
Nadia Cecil
