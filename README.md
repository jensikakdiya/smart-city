# 🌆 Smart City Management System

A console-based **Smart City Management System** built in **Java** that simulates three core city services — Transportation, Electricity Billing, and Hotel Booking — with fare/bill calculation and file-based record saving.

![Java](https://img.shields.io/badge/Java-Console%20App-orange?logo=java&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux-lightgrey)
![Type](https://img.shields.io/badge/Type-Console%20Application-informational)

---

## 📌 Project Overview

This project simulates a smart city service management platform where citizens can access three key services through a menu-driven interface. Each module collects user input, performs calculations, displays results, and automatically saves records to a `.txt` file for future reference.

---

## ✨ Features

### 🚌 1. City Transportation
- Choose transport mode: **Bus**, **Metro**, or **Taxi**
- Enter distance traveled (in km)
- Automatically calculates fare based on mode:
  - Bus: ₹0.5/km
  - Metro: ₹1.0/km
  - Taxi: ₹2.0/km
- Saves fare receipt to a `.txt` file

### ⚡ 2. Electricity Billing System
- Enter units consumed
- Calculates bill using a **slab-based pricing system**:
  - Up to 300 units: ₹8/unit + ₹100 fixed charge
  - 301–500 units: 20% surcharge on extra units
  - 500+ units: 50% surcharge on extra units + 15% overall surcharge
- Saves electricity bill to a `.txt` file

### 🏨 3. Hotel Booking System
- Enter customer name, check-in date, room type, guests, and duration
- Calculates booking amount:
  - Single room: ₹1,200/guest/night
  - Double room: ₹1,000/guest/night
- Saves booking confirmation to a `.txt` file

---

## 🗂️ Project Structure

```
smart-city/
├── SmartCity.java         # Main source file (all modules)
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8+
- Terminal / Command Prompt

### Compile & Run

```bash
javac SmartCity.java
java SmartCity
```

### Sample Menu

```
Select:
1. City Transportation
2. Electricity Billing
3. Hotel Booking
4. Exit
Enter your choice:
```

---

## 📄 Output Files

Each module automatically generates a `.txt` file with the transaction details:

| Module | File Generated |
|--------|---------------|
| Transportation | `1_bus.txt`, `2_metro.txt`, etc. |
| Electricity | `Electricity Bill<units>.txt` |
| Hotel Booking | `<name>_<date>_<roomtype>.txt` |

---

## 🧠 Concepts Used

- Java OOP (static inner classes)
- Menu-driven programming (`do-while` + `switch`)
- File I/O (`BufferedReader`, `PrintWriter`)
- Slab-based calculation logic
- Exception handling (`IOException`)

---

## 🚀 Future Enhancements

- [ ] Add a graphical user interface (JavaFX or web-based)
- [ ] Connect to a MySQL database instead of file storage
- [ ] Add user login and authentication
- [ ] Integrate real IoT sensor data for smart monitoring
- [ ] Add data analytics dashboard

---

## 👩‍💻 Author

**Jensi Kakdiya**
M.Sc. Data Science | Marwadi University, Rajkot

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?logo=linkedin)](https://linkedin.com/in/jensi-kakdiya-245585282)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?logo=github)](https://github.com/jensikakdiya)
