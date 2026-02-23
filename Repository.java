// Repository.java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private String DB_URL = "jdbc:sqlite:students.db";

    public Repository() {
        try {
            Class.forName("org.sqlite.JDBC");
            createTable();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                "studentID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "firstName TEXT NOT NULL," +
                "middleName TEXT," +
                "lastName TEXT NOT NULL," +
                "age INTEGER CHECK(age >= 0)," +
                "gender TEXT," +
                "course TEXT," +
                "yearLevel INTEGER CHECK(yearLevel >= 1)," +
                "section TEXT," +
                "email TEXT UNIQUE)";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(Student s) {
        String sql = "INSERT INTO Student(firstName,middleName,lastName,age,gender,course,yearLevel,section,email) VALUES(?,?,?,?,?,?,?,?,?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getFirstName());
            ps.setString(2, s.getMiddleName());
            ps.setString(3, s.getLastName());
            ps.setInt(4, s.getAge());
            ps.setString(5, s.getGender());
            ps.setString(6, s.getCourse());
            ps.setInt(7, s.getYearLevel());
            ps.setString(8, s.getSection());
            ps.setString(9, s.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM Student";
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student.Builder()
                        .setStudentID(rs.getInt("studentID"))
                        .setFirstName(rs.getString("firstName"))
                        .setMiddleName(rs.getString("middleName"))
                        .setLastName(rs.getString("lastName"))
                        .setAge(rs.getInt("age"))
                        .setGender(rs.getString("gender"))
                        .setCourse(rs.getString("course"))
                        .setYearLevel(rs.getInt("yearLevel"))
                        .setSection(rs.getString("section"))
                        .setEmail(rs.getString("email"))
                        .build();
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
