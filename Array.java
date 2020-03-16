import  java.util.Scanner;
public class Array {
    public static  void main(String args[]){
        int n;
        int value;
        int d ;
        System.out.println("Enter the array size:");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] list = new int[n];
        int[] newArr = new int[list.length - 1];
        System.out.println("Enter the array element:");
        for(int i = 0; i<list.length;i++){
            list[i] = obj.nextInt();
        }
        System.out.println("Enter the value you want to search:");
        value = obj.nextInt();
        for(int i = 0; i<list.length;i++){
           if (list[i] == value){
               System.out.println("value found");

           }
        }
        System.out.println("Enter the element you want to delete:");
        d = obj.nextInt();
        // Copying the elements to the new array except the index from the original array.
        for(int j=0, k=0; j<list.length; j++) {
            if(j == d)
                continue;
            newArr[k++] = list[j];
        }
        for(int i = 0; i<list.length-1;i++){
            System.out.print(newArr[i]);

            }

    }
}
