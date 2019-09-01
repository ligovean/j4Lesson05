public class RiseToPower {
    public static void main(String[] args) {

        for (int i = -10; i <10 ; i+=1) {
            System.out.printf("2^%d = %f\n",i,toPower(2.0,i));
       }
    }

    public static double toPower(double base, int pow){
        if (pow == -1) return 1/base;
        if (pow == 0)  return 1.0f;
        if (pow == 1) return base;

        if (pow >0) return base * toPower(base, --pow);
        if (pow <0) return 1/base * (toPower(base, ++pow));

        return 0.0;
    }
}
