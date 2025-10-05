

## 🚗 Car Data Management System (Java)

### 📘 **Project Overview**

This project implements a simple **Car Data Management System** in Java using **Object-Oriented Programming (OOP)** concepts.
It allows adding, removing, displaying, and sorting car data based on a custom **calculated performance formula**.
The system automatically **extends array capacity** when more cars are added, demonstrating dynamic array behavior.

---

### 🧩 **Key Features**

* **Car_Data Class**

  * Stores information about each car:

    * Name
    * Top Speed
    * Mileage
    * Price
    * Safety Rating
  * Calculates a weighted **performance formula**:

    ```
    formula = (TopSpeed * 0.3) + (Mileage * 0.2) + (SafetyRating * 0.3) - (Price * 0.2)
    ```
  * Implements the `Comparable` interface to allow sorting cars based on this formula.
  * Overrides:

    * `toString()` → neatly displays car information
    * `equals()` → compares cars by all attributes

* **Data_List Class**

  * Maintains an internal array of `Car_Data` objects.
  * Automatically increases capacity when full (using a custom `extendCapacity()` method).
  * Supports adding, removing, and sorting cars safely.

* **Main Class**

  * Creates multiple `Car_Data` objects.
  * Demonstrates:

    * Adding cars
    * Automatic array resizing
    * Removing a car
    * Sorting all cars based on their computed formula
    * Printing the final car list

---

### ⚙️ **Core Java Concepts Used**

* Classes & Objects
* Constructors
* Method Overloading & Overriding
* `Comparable` Interface
* `Arrays.sort()` and `Collections`
* Dynamic array resizing
* Encapsulation & Data Abstraction
* `StringBuilder` for formatted output

---

### 🧠 **Example Output**

```
CarName : Tesla
TopSpeed : 280
Milege : 2.3
Price : 20
Safety : 8.0
AuctionRating : 82.9
```

---

### 💡 **Learning Outcomes**

* Understanding how to **dynamically manage arrays** without using `ArrayList`.
* Applying **custom sorting logic** using the `Comparable` interface.
* Reinforcing **object comparison**, **toString formatting**, and **memory handling (stack vs heap)** concepts.
* Practicing clean and modular Java code structure.

