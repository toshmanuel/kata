package com.exercise.chapterFive;

public class Debug {
    public static void main(String[] args) {
//        For (i = 100, i >= 1, i++)
//        System.out.println(i);
//        the above code is to be refined
        for (int i = 100; i >= 1; i-- ) {
            System.out.println(i);
            // the above code is the refined code
        }
        System.out.println();
        System.out.println();
//        switch (value % 2)
//        {
//            case 0:
//                System.out.println("Even integer");
//            case 1:
//                System.out.println("Odd integer");
//        }
//        the above code us to be refined also
        int value = 5;
        switch (value % 2 )
        {
            case 0:
                System.out.println("Even integer");
            case 1:
                System.out.println("Odd integer");

                // the above code is the refined code
        }
        System.out.println();
        System.out.println();
//        The following code should output the odd integers from 19 to 1:
//        for (i = 19; i >= 1; i += 2)
//            System.out.println(i);
//        the above code us to be refined also
        for (int i = 19; i >= 1; i-= 2){
            System.out.println(i);

            // the above code is the refined code
        }


//        The following code should output the even integers from 2 to 100:
//        counter = 2;
//        do
//        {
//            System.out.println(counter);
//            counter += 2;
//        } While (counter < 100);

//        the above code us to be refined also

        System.out.println();
        System.out.println();

        int counter = 2;
        do {
            System.out.println(counter);
            counter += 2;
        }while (counter <= 100);

    }
}
