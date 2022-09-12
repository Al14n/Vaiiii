public class Aspirant extends Student {

    public Aspirant(String firstName_, String lastName_,String group_, double averageMark_){
        super(firstName_,lastName_,group_,averageMark_);
    }


    public int getScholarship(){
        if (averageMark == 5){
            return 20000;
        }
        else
            return 18000;
    }
}
