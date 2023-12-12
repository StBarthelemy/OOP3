import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudyGroupIterator implements Iterator<Student>{
    private List<Student> studentList;
    private int counter;

    public StudyGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext()){
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            studentList.remove(counter);
        }
    }


//    @Override
//    public Iterator<Integer> iterator() {
//        return null;
//    }
//
//    @Override
//    public void forEach(Consumer<? super Integer> action) {
//        Iterable.super.forEach(action);
//    }
//
//    @Override
//    public Spliterator<Integer> spliterator() {
//        return Iterable.super.spliterator();
//    }
}