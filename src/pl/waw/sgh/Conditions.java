package pl.waw.sgh;

public class Conditions {


    public static void main(String[] args) {

        int b = 6;
        {
            int a = 5;
            System.out.println("Run from a sub block");
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            {
                int c = 8;
                System.out.println("a=" + a);
                System.out.println("b=" + b);

            }

        }
// a not visible in this block
        // System.out.println("a=" + a);
        System.out.println("b=" + b);

        boolean myCond = false;

        if (myCond) ;

        {
            System.out.println("myCond is true");
            System.out.println("I'm in the fisrt block");
        }
       /* else
            System.out.println("myCond is false);

    }*/
       // compare with a value - primitive data type
       if (b==6) {
           System.out.println("b equal 6");
       }
               String s1 = "abc";
               String s2 = "abc";

               String s3 = new String("abc");
               if (s1==s2) {
                   System.out.println("String s1 and s2 are equal");
               }
               if (s1==s3) {
                   System.out.println("String s1 and s3 are equal");
               }
               if (s1.equals(s3)) {
                   System.out.println("String s1 and s2 are equal");

                   //compare if pointers point to the same object
                   // dont use it to compare values


               }
    }
}

