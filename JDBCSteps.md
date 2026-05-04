# JDBC Experiment (Insert & Retrieve Data)

## 🔹 Requirements

* Java (JDK 8+)
* Eclipse IDE
* MySQL Server
* MySQL Connector/J (JDBC Driver)

## 🔹 Setup Steps

### 1. Create Database

Run in MySQL:

```sql
CREATE DATABASE TUTORIALSPOINT;
```

### 2. Download JDBC Driver

* Download MySQL Connector/J (.jar file)

### 3. Add Driver to Eclipse

* Right click project → Build Path → Configure Build Path
* Libraries → Add External JARs → Select `.jar`

### 4. Update Credentials in Code

```java
static final String USER = "root";
static final String PASS = "your_password";
```

### 5. Run Program

* Right click → Run As → Java Application

## 🔹 Output

* Records inserted into database
* Data retrieved using SELECT query

## ⚠️ Common Errors

* No suitable driver → JAR not added
* Access denied → Wrong DB credentials
