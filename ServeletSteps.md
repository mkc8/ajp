# Servlet Experiment (Calculator Application)

## 🔹 Requirements

* Java (JDK 8+)
* Eclipse IDE (Enterprise Edition)
* Apache Tomcat Server

## 🔹 Setup Steps

### 1. Install Tomcat

Download and extract Apache Tomcat

### 2. Configure in Eclipse

* Window → Preferences → Server → Runtime Environments
* Add Apache Tomcat → Select folder

### 3. Create Dynamic Web Project

* File → New → Dynamic Web Project
* Select Tomcat runtime

### 4. Add Files

* index.html → inside WebContent
* CalculatorServlet.java → inside src

### 5. Run Project

* Right click → Run As → Run on Server

Open in browser:

```
http://localhost:8080/ProjectName/index.html
```

## 🔹 Output

* Performs addition, subtraction, multiplication, division

## ⚠️ Common Errors

* 404 Error → Wrong URL
* Servlet not found → Wrong mapping
* Server not started → Start Tomcat
