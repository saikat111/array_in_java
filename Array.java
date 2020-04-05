import  java.util.Scanner;
public class Array {
    public static void main(String args[]){
        int arraySize, arrayIndexNumberForInsertingTheElement, insertedElement;
        int positionForInsertingTheElement;
        Scanner objectOfScannnerClass = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        arraySize = objectOfScannnerClass.nextInt();
        int array[] = new int[arraySize+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < arraySize; i++)
        {
            array[i] = objectOfScannnerClass.nextInt();
        }
        System.out.println("Enter the positon where you want to insert element:");
        System.out.println("For Front type 1, for middle type 2,for end type 3:");
        positionForInsertingTheElement = objectOfScannnerClass.nextInt();

       if(positionForInsertingTheElement == 3){
           System.out.print("Enter the element you want to insert:");
           insertedElement = objectOfScannnerClass.nextInt();
           arrayIndexNumberForInsertingTheElement = array.length;
           for(int i = (arraySize-1); i >= (arrayIndexNumberForInsertingTheElement-1); i--)
           {
               array[i+1] = array[i];
           }
           array[arrayIndexNumberForInsertingTheElement-1] = insertedElement;
           System.out.println("After inserting:");
           System.out.println("Elements are:");
           for(int i = 0; i < arraySize; i++)
           {

               System.out.print(array[i]+",");
           }
           System.out.print(array[arraySize]);
       }
       else if(positionForInsertingTheElement == 2){
            System.out.print("Enter the element you want to insert:");
            insertedElement = objectOfScannnerClass.nextInt();
            arrayIndexNumberForInsertingTheElement = array.length / 2;
            for(int i = (arraySize-1); i >= (arrayIndexNumberForInsertingTheElement-1); i--)
            {
                array[i+1] = array[i];
            }
            array[arrayIndexNumberForInsertingTheElement-1] = insertedElement;
           System.out.println("After inserting:");
           System.out.println("Elements are:");
            for(int i = 0; i < arraySize; i++)
            {
                System.out.print(array[i]+",");
       }
            System.out.print(array[arraySize]);
        }
       if(positionForInsertingTheElement == 1){
            System.out.print("Enter the element you want to insert:");
            insertedElement = objectOfScannnerClass.nextInt();
            arrayIndexNumberForInsertingTheElement = 1;
            for(int i = (arraySize-1); i >= (arrayIndexNumberForInsertingTheElement-1); i--)
            {
                array[i+1] = array[i];
            }
            array[arrayIndexNumberForInsertingTheElement-1] = insertedElement;
           System.out.println("After inserting:");
           System.out.println("Elements are:");
            for(int i = 0; i < arraySize; i++)
            {
                System.out.print(array[i]+",");
            }
            System.out.print(array[arraySize]);
       }
    }
}

