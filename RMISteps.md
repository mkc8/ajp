# RMI Experiment (Palindrome Checker)

## 🔹 Requirements

* Java (JDK 8+)
* Eclipse IDE

## 🔹 Files

* one.java (Interface)
* two.java (Implementation)
* rmiserver.java
* rmiclient.java

## 🔹 Steps to Run

### 1. Compile Project

Eclipse compiles automatically

### 2. Start RMI Registry

Open terminal in project folder:

```bash
rmiregistry
```

### 3. Run Server

Run:

```
rmiserver.java
```

Output:

```
Object registered
```

### 4. Run Client

Run:

```
rmiclient.java
```

## 🔹 Output

* Checks whether string is palindrome or not

## ⚠️ Common Errors

* Connection refused → registry not running
* NotBoundException → wrong binding name
