
    public class CalcPara {
        static int x;
        static int y ;
        static int z;


        public static void addition (int x, int y) {
            z= x+y;
            System.out.println("Addition :" + z);

        }

        public static void substract ( int x, int y) {
            z= x-y;
            System.out.println("substract:" + z);

        }

        public void mulitiplication (int x, int y) {
            z= x*y;
            System.out.println("Multiplication :" + z);

        }

        public void division (int x, int y) {
            z= x/y;
            System.out.println( "Division:"+ z);

        }


        public static void main(String args[]) {  // String is inbuilt class so s is capital

            addition(x,y);
            substract(x,y);

            CalcPara calcpara = new CalcPara();
            calcpara.division(x,y);
            calcpara.mulitiplication(x,y);
           

        }

}
