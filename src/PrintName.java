public class PrintName {

// name static
    public static void studentName(String  name) { // static method - method name starts with small letter

        System.out.println( name);
    }

    //address static
        public static void address (String address) {  //instatnce method

            System.out.println( address);

    }

    //dob instatnce
    public void dateOfBirth (String dob) {
        System.out.println( dob);

    }


    public static void main(String args[]) {  // String is inbuilt class so s is capital
        PrintName printname = new PrintName();
        studentName("Ami");
        address("305, Kingsbury road, NW9 9PE");
        printname.dateOfBirth("20/06/79 ");
    }
}

