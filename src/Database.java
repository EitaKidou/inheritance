import java.util.Arrays;

public class Database {
    private Courses [] courses;
    private Student [] students;
    private Teacher [] teachers;

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    public String addNewTeacher(Teacher teacher){
        return "Teacher added successfully";
    }

    public String addNewStudent(Student student){
        return "Student added successfully";
    }

    public String addNewCourse(Courses course){
        return "Course added successfully";
    }

    public String removeTeacher(Teacher teacher){
        return "Teacher removed successfully";
    }

    public String removeStudent(Student student){
        return "Student removed successfully";
    }

    public String removeCourse(Courses course){
        return "Course removed successfully";
    }

    public String updateTeacher(Teacher teacher){
        return "Teacher updated successfully";
    }

    public String updateStudent(Student student){
        return "Student updated successfully";
    }

    public String updateCourse(Courses course){
        return "Course updated successfully";
    }

    public String searchTeacher(Teacher teacher){
        return "Teacher found";
    }

    public Student searchStudentByName(String name){
        return null;
    }

    public Courses searchCourseByIndex(int index){
        return null;
    }

    public String listTeachers(){
        return "Teachers listed successfully";
    }

    public String listStudents(){
        return "Students listed successfully";
    }

    public String listCourses(){
        return "Courses listed successfully";
    }

    public String listStudentsByCourse(Courses course){
        return "Students listed successfully";
    }

    public String listCoursesByTeacher(Teacher teacher){
        return "Courses listed successfully";
    }

    public String listCoursesByStudent(Student student){
        return "Courses listed successfully";
    }

    public String listTeachersByCourse(Courses course){
        return "Teachers listed successfully";
    }

    public String listStudentsByTeacher(Teacher teacher){
        return "Students listed successfully";
    }

    public String listTeachersByStudent(Student student){
        return "Teachers listed successfully";
    }

    public Courses [] listCoursesByStudentName(String studentName){
        return null;
    }

    public Teacher [] listTeachersByStudentName(String studentName){
        return null;
    }

    public Student [] listStudentsByTeacherName(String teacherName){
        return null;
    }

    public Courses [] listCoursesByTeacherName(String teacherName){
        return null;
    }

    public Student [] listStudentsByCourseName(String courseName){
        return null;
    }





    @Override
    public String toString(){
        return "Database{" +
                "courses=" + Arrays.toString(courses) +
                ", students=" + Arrays.toString(students) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
