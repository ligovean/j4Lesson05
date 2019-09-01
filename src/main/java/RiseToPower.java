public class RiseToPower {
    public static void main(String[] args) {
        double base = 2.0f;
        int i;

        for (i = -10; i <10 ; i+=1) {
            System.out.printf("%f^%d = %f\n",base,i,toPower(base,i));
       }

       base = 0;
        i=5;
        System.out.printf("%f^%d = %f\n",base,i,toPower(base,i));
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
