public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName_, String lastName_,String group_, double averageMark_) {
        firstName = firstName_;
        lastName = lastName_;
        group = group_;
        averageMark = averageMark_;

    }

    public int getScholarship(){
        if (averageMark == 5){
            return 10000;
        }
        else
            return 8000;
    }
}
