public class Matrit {

    int[][] mass;
    int stroka;
    int stolb;

    public Matrit(int stolb_, int stroka_){

        stroka = stroka_;
        stolb = stolb_;
        mass = new int [stolb_][stroka_];
    }
    public static Matrit Plus (Matrit a, Matrit b){
        Matrit result = new Matrit(a.stolb, a.stroka);
        for (int i = 0; i< a.stolb; i++){
            for (int j = 0; j< a.stroka; j++){
                result.mass[i][j] = a.mass[i][j] + b.mass[i][j];
            }
        }
        return result;
    }
    public static Matrit Umnoj(Matrit a, int b) {
        Matrit result = new Matrit(a.stolb, a.stroka);
        for(int i = 0; i< a.stolb; i++){
            for(int j = 0; j< a.stroka;j++){
                result.mass[i][j] = a.mass[i][j] * b;
            }
        }
        return result;
    }
}
