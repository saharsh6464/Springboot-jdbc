# 🛢️ SpringBoot JDBC Integration

A simple Spring Boot application demonstrating database connectivity with **PostgreSQL** using raw **JDBC (Java Database Connectivity)**.

---

## 🚀 Features

- ✅ **Direct DB Connection**: Connects to a PostgreSQL database using `DriverManager`.
- 🔄 **Full CRUD Operations**: Demonstrates Create, Read, Update, and Delete operations.
- 🔐 **Secure & Efficient Queries**: Uses both `Statement` and `PreparedStatement` for executing SQL.
- 💡 **Clean Resource Management**: Shows graceful connection handling and exception management.

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- JDBC (`java.sql.*`)
- PostgreSQL
- Maven

---

## 🔧 Setup & Run

### ✅ Prerequisites

- Java 17 or higher
- Maven
- A running PostgreSQL instance with a database created

---

### 1️⃣ Clone the Repository

> Replace with your actual repository URL if you have one

```bash
git clone https://github.com/saharsh6464/Springboot-jdbc.git
cd Springboot-jdbc
```

---

### 2️⃣ Database Setup

Before running the application, make sure to create the `student` table in your PostgreSQL database.

```sql
-- Create the student table
CREATE TABLE student (
    sid INT PRIMARY KEY,
    sname VARCHAR(50),
    age INT
);

-- Insert some sample data to get started
INSERT INTO student (sid, sname, age) VALUES
(1, 'Saharsh', 22),
(2, 'Nidhi', 21),
(3, 'Sanket', 23);
```

---

### 3️⃣ Configure Database Connection

Update the `src/main/resources/application.properties` file with your PostgreSQL credentials. Create the file if it doesn't exist.

```properties
# PostgreSQL Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
```

---

### 4️⃣ Run the Application

Use the Spring Boot Maven plugin to start the application.

```bash
mvn spring-boot:run
```

---

## 👨‍💻 Code Examples

The core JDBC logic is handled directly using `java.sql.*`. Below are a few key examples.

---

### 📖 Read (Select All)

```java
String sql = "SELECT * FROM student";
try (Connection con = dataSource.getConnection();
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(sql)) {

    while (rs.next()) {
        System.out.printf("ID: %d, Name: %s, Age: %d\n",
            rs.getInt("sid"),
            rs.getString("sname"),
            rs.getInt("age"));
    }
}
```

---

### ✍️ Insert with PreparedStatement

Using `PreparedStatement` is the recommended way to execute queries with parameters and avoid SQL injection.

```java
String sql = "INSERT INTO student (sid, sname, age) VALUES (?, ?, ?)";
try (Connection con = dataSource.getConnection();
     PreparedStatement pst = con.prepareStatement(sql)) {

    pst.setInt(1, 5);
      pst.setString(2, "Saharsh");
    pst.setInt(3, 21);
    int rowsAffected = pst.executeUpdate();
    System.out.println(rowsAffected + " row(s) inserted.");
}
```

---

## 🔗 Author

**Saharsh Patil**  
[LinkedIn Profile](https://www.linkedin.com/in/saharsh-patil-254981293)

---

## 📄 License

This project is licensed under the **MIT License**.
