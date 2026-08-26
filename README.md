# Restaurant Order Management System

A simple **Java-based Restaurant Order Management System** developed using Java Collections Framework. The system demonstrates how **Queue** and **Stack** data structures can be used to manage restaurant orders efficiently.

## 📌 Project Overview

The Restaurant Order Management System allows users to add, view, process, cancel, and display restaurant orders through a simple console-based menu.

The system uses:

* **Queue** – To manage pending orders using the FIFO (First In, First Out) principle.
* **Stack** – To manage processed orders using the LIFO (Last In, First Out) principle.

This project was developed as a practical implementation of data structures and basic Java programming concepts.

## ✨ Features

The system provides the following options:

1. **Add Order**

   * Allows the user to add a new restaurant order.
   * Orders are stored in the pending order queue.

2. **View Next Order**

   * Displays the next order that needs to be processed.
   * Uses the `Queue.peek()` operation.

3. **Process Order**

   * Removes the next pending order from the queue.
   * Adds the processed order to the processed orders stack.

4. **Cancel Last Processed Order**

   * Removes the most recently processed order.
   * Returns the cancelled order to the pending order queue.

5. **Show Pending Orders**

   * Displays all currently pending orders.

6. **Show Processed Orders**

   * Displays all processed orders.

7. **Exit**

   * Closes the application.

## 🛠️ Technologies Used

* **Java**
* **Java Collections Framework**
* `Queue`
* `LinkedList`
* `Stack`
* `Scanner`
* IntelliJ IDEA

## 📂 Project Structure

```text
Restaurant Order Management System/
│
├── src/
│   └── Main.java
│
├── .gitignore
├── Restaurant Order Managment System.iml
└── README.md
```

## 🔄 Data Structures Used

### Queue

The system uses a `Queue<String>` with `LinkedList` to store pending orders.

```java
Queue<String> pendingOrders = new LinkedList<>();
```

The queue follows the **FIFO (First In, First Out)** principle. Therefore, the first order added to the pending queue will be the first order processed.

### Stack

The system uses a `Stack<String>` to store processed orders.

```java
Stack<String> processedOrders = new Stack<>();
```

The stack follows the **LIFO (Last In, First Out)** principle. Therefore, the most recently processed order can be cancelled first.

## ▶️ How to Run

### Prerequisites

Make sure you have:

* Java Development Kit (JDK)
* IntelliJ IDEA or another Java IDE

### Steps

1. Clone the repository:

```bash
git clone https://github.com/YOUR-USERNAME/restaurant-order-management-system.git
```

2. Open the project in IntelliJ IDEA.

3. Open:

```text
src/Main.java
```

4. Run the `Main` class.

5. Use the console menu to manage restaurant orders.

## 💻 Example Menu

```text
========== RESTAURANT ORDER SYSTEM ==========
1. Add Order
2. View Next Order
3. Process Order
4. Cancel Last Processed Order
5. Show Pending Orders
6. Show Processed Orders
7. Exit
```

## 📋 Example Workflow

```text
Add Order
   ↓
Pending Order Queue
   ↓
View Next Order
   ↓
Process Order
   ↓
Processed Order Stack
   ↓
Cancel Last Processed Order
   ↓
Return to Pending Queue
```

## 🎯 Learning Objectives

This project demonstrates:

* Java programming fundamentals
* Object-oriented programming basics
* Java Collections Framework
* Queue implementation
* Stack implementation
* FIFO and LIFO concepts
* User input handling
* Menu-driven console applications
* Basic order management logic

## 🚀 Future Improvements

The system can be further enhanced by adding:

* Customer details
* Food item and quantity management
* Order IDs
* Order prices and total calculations
* Customer management
* File/database storage
* Graphical User Interface (GUI)
* Login and authentication
* Search and update functions
* Order status tracking
* MySQL database integration

## 👨‍💻 Author

Developed as a Java-based Restaurant Order Management System project.

---

⭐ If you find this project useful, feel free to star the repository.
