public class App {
    public static void main(String[] args) {
        /*
        int foo = 3;
        for (int number = 0; foo > number; number +=2) {
            foo++;
            System.out.println(foo + " " + number + " ");
        
        
        for (int number = 1; number<=5; number++) {
            for (int counter = 1; counter <=4; counter++) {
               System.out.println(number);
               
            }
            System.out.println();
        */
        practice1();
        System.out.println();
        practice2();
        System.out.println();
        practice3();
        System.out.println();
        practiceChallenge();
        
    }
    
    public static void practice1() {
         for (int number = 1; number<=5; number++) {
            for (int counter = 0; counter <number;counter++) {
               System.out.print(number);
               
               
            }
            System.out.println();
         }

    }
    
    public static void practice2() {
         for (int number = 1; number<=5; number++) {
            for (int d = 5; d >number;d--) {
                   System.out.print(".");

            }

            for (int counter = 0; counter <number;counter++) {
                  System.out.print(number);
               
               
               
            }
            System.out.println();
         }

    }

    public static void practice3() {
        for (int number = 1; number<=5; number++) {
            for (int d = 1; d<=(-1*number+5);d++) {
                   System.out.print(".");

            }
            System.out.print(number);

            for (int d = 1; d<=(1*number-1);d++) {
                System.out.print(".");

            }  
            
            System.out.println();
         }
    }

    public static void practiceChallenge() {
        for (int number = 1; number<=8; number++) {

            for (int d = 1; d<=(-1*number+11);d++) {
                System.out.print(" ");

            }

            for (int d = 1; d<=(2*number);d++) {
                System.out.print(number);

            }

            
            
            
            System.out.println();
        }
        System.out.println("  999999999999999999");
        int l = 8;
        for(int p = 1; p <=8;p++) {
            for (int c = 1; c<=(1*p+2);c++) {
                System.out.print(" ");
    
            }
            
            for (int a = 1; a<=(-2*p+18);a++) {
                System.out.print(l);
                
            }
            
            System.out.println();
            l--;  
        }
        

    }
}
