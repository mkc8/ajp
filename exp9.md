# JSP Project Setup

## Step-by-Step Guide

1. **Open Eclipse IDE**

2. **Create a Dynamic Web Project**

   * Go to: `File → New → Dynamic Web Project`
   * Enter **Project Name**
   * Click **Next**
   * Click **Next** again

3. **Important Step**

   * Check  **Generate web.xml deployment descriptor**
   * Click **Finish**

4. **Create JSP File**

   * Go to `WebContent` (or `webapp`) folder
   * Right-click → `New → JSP File`
   * Name it: `index.jsp`

5. **Write Code in index.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP Assignment</title>
</head>

<body>
    <h1>Hello JSP</h1>

    <% out.print("Result is " + 3 * 9 * 8 * 2); %>

</body>
</html>
```

6. **Run the Project**

   * Right-click on project → **Run As → Run on Server**
   * Select **Apache Tomcat v9.0**
   * Click **Finish**

7. **Run JSP File**

   * Right-click `index.jsp`
   * Click **Run As → Run on Server**

8. **Result**

   * Browser will open:

     ```
     http://localhost:8080/ProjectName/index.jsp
     ```
   * Output:

     ```
     Hello JSP
     Result is 432
     ```

---

## Notes

* No separate Java class is required for JSP
* JSP runs only on server (Tomcat)
* Make sure file is inside `WebContent` or `webapp` folder

---
