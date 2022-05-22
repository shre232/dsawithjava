import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
       
       
        System.out.println("Welcome to Dsa With Java");

        BinarySearch b=new BinarySearch();
       
        Scanner sc= new Scanner(System.in);
        
        int size=sc.nextInt();
        int[] arr=new int[size];

       // System.out.println("Enter Elemnts of array:");
       
        //taking arry input
       
       for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

      b.sortAscending(size, arr);
      b.sorDecending(size, arr); 
       
    }
}
