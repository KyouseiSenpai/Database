// Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();

        System.out.println("=== STUDENT DATABASE ===\n");

        // Add 10 students
        Student[] students = {
                new Student.Builder().setFirstName("Juan").setMiddleName("Dela").setLastName("Cruz").setAge(20).setGender("Male").setCourse("BSIT").setYearLevel(2).setSection("A").setEmail("juan@gmail.com").build(),
                new Student.Builder().setFirstName("Maria").setMiddleName("Santos").setLastName("Reyes").setAge(19).setGender("Female").setCourse("BSCS").setYearLevel(1).setSection("B").setEmail("maria@gmail.com").build(),
                new Student.Builder().setFirstName("Pedro").setMiddleName("Reyes").setLastName("Garcia").setAge(21).setGender("Male").setCourse("BSIT").setYearLevel(3).setSection("C").setEmail("pedro@gmail.com").build(),
                new Student.Builder().setFirstName("Ana").setMiddleName("Torres").setLastName("Ramos").setAge(22).setGender("Female").setCourse("BSBA").setYearLevel(4).setSection("D").setEmail("ana@gmail.com").build(),
                new Student.Builder().setFirstName("Jose").setMiddleName("Martinez").setLastName("Fernandez").setAge(20).setGender("Male").setCourse("BSCS").setYearLevel(2).setSection("A").setEmail("jose@gmail.com").build(),
                new Student.Builder().setFirstName("Luisa").setMiddleName("Gomez").setLastName("Diaz").setAge(18).setGender("Female").setCourse("BSIT").setYearLevel(1).setSection("B").setEmail("luisa@gmail.com").build(),
                new Student.Builder().setFirstName("Carlos").setMiddleName("Santos").setLastName("Mendoza").setAge(23).setGender("Male").setCourse("BSCE").setYearLevel(4).setSection("C").setEmail("carlos@gmail.com").build(),
                new Student.Builder().setFirstName("Sofia").setMiddleName("Reyes").setLastName("Navarro").setAge(19).setGender("Female").setCourse("BSIT").setYearLevel(2).setSection("D").setEmail("sofia@gmail.com").build(),
                new Student.Builder().setFirstName("Miguel").setMiddleName("Cruz").setLastName("Ortiz").setAge(21).setGender("Male").setCourse("BSCS").setYearLevel(3).setSection("A").setEmail("miguel@gmail.com").build(),
                new Student.Builder().setFirstName("Isabella").setMiddleName("Lopez").setLastName("Morales").setAge(20).setGender("Female").setCourse("BSIT").setYearLevel(2).setSection("B").setEmail("isabella@gmail.com").build()
        };
