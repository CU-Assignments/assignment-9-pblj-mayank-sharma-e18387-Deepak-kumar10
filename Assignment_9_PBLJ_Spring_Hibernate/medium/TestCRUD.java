public class TestCRUD {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(22);

        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student);
        System.out.println("Student saved with ID: " + student.getId());
    }
}