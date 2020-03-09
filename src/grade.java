public class grade {
    public static void main(String[] args) {
        char grade = 'B';
        int point;

        switch (grade)
        {
            case 'A' : point = 4;
            case 'B' : point = 3;
            case 'C' : point = 2;
            case 'D' : point = 1;
            default :  point = 0;

            System.out.println(point);
        }
    }
}
