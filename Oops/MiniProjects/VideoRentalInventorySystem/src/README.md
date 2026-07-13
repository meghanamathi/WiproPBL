# Video Rental Inventory System

## Project Overview

The **Video Rental Inventory System** is a simple Java console-based application developed using **Object-Oriented Programming (OOP)** concepts. The application helps a video rental store manage its inventory by allowing users to add videos, check out videos, return videos, assign ratings, and display the complete inventory.

---

## Objective

The objective of this project is to implement an inventory control system for a small video rental store using Java.

---

## Features

- Add a new video to the inventory.
- Check out a video.
- Return a checked-out video.
- Give ratings to videos.
- Display the complete inventory.
- Menu-driven console application.

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- VS Code
- JDK 17 or above

---

## Project Structure

```
VideoRentalInventorySystem
│
├── Video.java
├── VideoStore.java
├── VideoLauncher.java
└── README.md
```

---

## Classes Used

### 1. Video.java

Represents a single video in the store.

#### Data Members

- videoName
- checkout
- rating

#### Methods

- getName()
- doCheckout()
- doReturn()
- receiveRating()
- getRating()
- getCheckout()

---

### 2. VideoStore.java

Manages the collection of videos.

#### Methods

- addVideo()
- doCheckout()
- doReturn()
- receiveRating()
- listInventory()

---

### 3. VideoLauncher.java

Contains the `main()` method and displays the menu-driven interface for interacting with the application.

---

## OOP Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Arrays of Objects
- Method Calling
- Loops
- Conditional Statements
- Scanner Class

---

## Menu Options

```
1. Add Video
2. Check Out Video
3. Return Video
4. Receive Rating
5. List Inventory
6. Exit
```

---

## Sample Output

```
==============================
      VIDEO RENTAL STORE
==============================

1. Add Video
2. Check Out Video
3. Return Video
4. Receive Rating
5. List Inventory
6. Exit

Enter your choice: 1

Enter the name of the video:
Matrix

Video "Matrix" added successfully.
```

---

## How to Run

### Compile the project

```bash
javac *.java
```

### Run the application

```bash
java VideoLauncher
```

---

## Expected Output

The application allows the user to:

- Add multiple videos.
- Rent videos.
- Return videos.
- Rate videos.
- View the complete inventory.

---

## Future Enhancements

- Prevent duplicate videos.
- Validate ratings between 1 and 10.
- Save inventory to a file.
- Search videos by name.
- Delete videos.
- GUI using Java Swing or JavaFX.
- Database integration using MySQL.

---

## Author

**Mathi Meghana**

B.Tech - Computer Science and Engineering

Java Mini Project

Wipro PBL