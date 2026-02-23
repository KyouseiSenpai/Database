public class Student {
    private int studentID;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String gender;
    private String course;
    private int yearLevel;
    private String section;
    private String email;

    public Student() {}

    public int getStudentID() { return studentID; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCourse() { return course; }
    public int getYearLevel() { return yearLevel; }
    public String getSection() { return section; }
    public String getEmail() { return email; }

    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setCourse(String course) { this.course = course; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }
    public void setSection(String section) { this.section = section; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
    return studentID + " | " + firstName + " " + middleName + " " + lastName + 
               " | " + age + " | " + gender + " | " + course + 
               " | " + yearLevel + " | " + section + " | " + email;
    }

        
    public static class Builder {
    private Student student = new Student();

    public Builder setStudentID(int id) { student.studentID = id; return this; }
    public Builder setFirstName(String fn) { student.firstName = fn; return this; }
    public Builder setMiddleName(String mn) { student.middleName = mn; return this; }
    public Builder setLastName(String ln) { student.lastName = ln; return this; }
    public Builder setAge(int age) { student.age = age; return this; }
    public Builder setGender(String g) { student.gender = g; return this; }
    public Builder setCourse(String c) { student.course = c; return this; }
    public Builder setYearLevel(int yl) { student.yearLevel = yl; return this; }
    public Builder setSection(String s) { student.section = s; return this; }
    public Builder setEmail(String e) { student.email = e; return this; }

    public Student build() { return student; }
    }
}





