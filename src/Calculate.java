public class Calculate {
        static int x = 6;
        static int y = 4;
        static int z;


        public static void addition () {
            z= x+y;
            System.out.println("Addition :" + z);

        }

        public static void substract () {
            z= x-y;
            System.out.println("substract:" + z);

        }

        public void mulitiplication () {
            z= x*y;
            System.out.println("Multiplication :" + z);

        }

        public void division () {
            z= x/y;
            System.out.println( "Division:"+ z);

        }


        public static void main(String args[]) {  // String is inbuilt class so s is capital

            addition();
            substract();

            Calculate calculate = new Calculate();

            calculate.division();
            calculate.mulitiplication();


        }
    }






