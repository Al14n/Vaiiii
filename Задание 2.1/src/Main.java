public class Main {
    public static void main (String[] args) {
       Aspirant[] students = new Aspirant[3];
        students[0] = new Aspirant("Ivan","Golovin","AI-555",5);
        students[1] = new Aspirant("Andrey","Ivanov","AI-513",4);
        students[2] = new Aspirant("Ivan","Smirnov","AI-525",5);

        for (int i = 0; i < students.length; i++){
            System.out.print(students[i].firstName + " " + students[i].lastName + " " + students[i].group + " " + students[i].averageMark + " " + students[i].getScholarship());
            System.out.println();
        }





    }
}
