import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int studentGroupID;

    private List<Student> studentList;

    public StudentGroup(List<Student> studentList, int studentGroupID) {
        this.studentList = studentList;
        this.studentGroupID = studentGroupID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.size() > o.size()) {
            return 1;
        }
        if (this.size() < o.size()) {
            return -1;
        }
        return 0;
    }

    public int size() {
        return studentList.size();
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentGroupID=" + studentGroupID +
                ", size=" + this.size() +
                '}';
    }
}
