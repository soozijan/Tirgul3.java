public class Main {
    static Scanner scanner = new Scanner (System.in);

    public static <k> void main(String[] args) {
       // greet ();
       // int number = 5;
       // printNum (number);
      //  for (int index = 0; index <= 10; index++) {
       //     System.out.println (index);
       // }

     //  int k = 5;
      //  changeNumber (k);
      //  System.out.println (k);
        
 //10
        int[] aro = {5,7,9,1,3};
        checkArray(aro, 5);



     printHello();
        numberType(5);
        numberType((float) 3.2);
        numberType(2.11111);

        getScanner();
        //16:
        int[]arry = {3, 6, 8, 2};
                  // 0  1  2  3

        randomize(arry);
        //17:

        printString("Hello");

        //21:
        sumDigits (125);
        



        //20:
        int[] arraynumbers1 = {2,6,7,8,34,16 };
        multiPlayZugi (arraynumbers1);
        addOne (arraynumbers1);
        setZero (arraynumbers1);

        for (int i=0; i<arraynumbers1.length; i++) {
            System.out.print (arraynumbers1[i] + " ");
        }

    }
     //21:
     private static int sumDigits (int number) {
         int sumnumber = 0;
         do {
             sumnumber = sumnumber + (number % 10);
             number /= 10;
         }
         while (number!= 0);
         return sumnumber;
     }







    //20:
     private static void multiPlayZugi(int[] arraynumbers1)   {
        for (int index = 0; index < arraynumbers1.length; index++)   {
            if(arraynumbers1[index]%2 == 0)  {
                arraynumbers1[index] *= 2;
            }
        }
     }
      private static void addOne (int [] arraynumbers1)   {
        arraynumbers1[5]+=1;
      }
      private static void setZero (int[] arraynumbers1)   {
        for (int index = 0; index < arraynumbers1.length; index++)   {
            if (arraynumbers1[index]%2 != 0)   {
                arraynumbers1[index]=0;
            }
        }
      }
    //10
    private static boolean checkArray(int[] aro, int num) {
        int index;
        for(index = 0; index < aro.length; index++) {
            if (aro[index] == num)
                return true;
        }
        return false;
    }

    //16
      private static int randomize(int[] array) {
        return array[random.nextInt(array.length)];
      }

     //Targil 17:
      private static void printString (String word)   {
          word += "@@@";
          printStars(word);
      }
      private static void printStars(String word)   {
          word+= "**";
        printSulamit();
      }

    private static void printSulamit() {
        System.out.println ("Hello Sanaz" + "@@@" + "**" + "#");
    }

    //Targil 16:


    //Targil 14:
    private static void numberType(int number) {
        System.out.println ("int");
    }
    private static void numberType(float number)   {
        System.out.println ("float");
    }
    private static void numberType(double number)   {
        System.out.println ("double");
    }

    //Targil 15:
    private static Scanner getScanner()   {
     Scanner scanner = new Scanner (System.in);
     return scanner;
    }



     //Targil 12
    private static void printHello() {
        System.out.println ("Hello ");
        printWord();
    }
    private static void printWord()   {
        System.out.println ("Word");
    }



    //Targil 11:
    private static void printAllIntegerParts(int num)   {
        for(int index = 1; index <= num; index++)   {
            if (num%index == 0)   {
                System.out.println (index);
            }
        }
    }

        }

       //Targil 7:
      //  int x = 3;
      //  int y = 7;
      //  moltiply (3,7);
      //  moltiply (5,4);
       // moltiply (3,6);
       // moltiply (7,5);


        //Targil 8:
      //  int a = 3;
      //  int b = 2;
      //  calc(3,2, '+');
      //  calc (3,2,'-');

        //Targil 9:
      //  int number_1 = 6;
      //  int number_2 = 4;
     //   int number_3 = 2;
      //  System.out.println (threeNumbers(6,4,2));
     //   threeNumbers(6,4,2);


        //Targil 10:
        int[]numbers = {12, 18, 20,25,10};
        int x1 = 9;
     
        arryNum (numbers, x1);

}
    //Targil 10:
    private static boolean isarryNum(int[] numbers, int x1) {
        for (int index = 0; index < numbers.length; index++) {
             if (numbers[index] == x1)
             {
          
                return (true);
            } 
        }
           
                return  (false);
            }

      


       



      //Targil 9:
   //private static float threeNumbers(int number_1, int number_2, int number_3) {
       // return (number_1+ number_2 +number_3 ) / 3;
    //}


    //Targil 4,5:
        // private static void printNum(int number)  {
         //   System.out.println (number);
        //  }


        //Targil 3:
        // private static void greet() {
         //   System.out.println ("good Morning");
        // }

         //Targil 6:
   // private static void changeNumber(int k) {
      //  k++;
     //   System.out.println (k);
    //}

      //Targil 7:
   // private static void moltiply(int x, int y)   {
       // System.out.println (x*y);
    //}

    //Targil 8:
    //private static void calc(int a, int b,char c)   {
        //   if(c == '+')   {
            //    System.out.println ( a +  b);
          //  }
          //  if (c == '-')   {
          //      System.out.println (a - b);
         //   }

