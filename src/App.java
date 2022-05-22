import java.util.Scanner;

public class App {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
           }
          }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Dsa With Java");
        System.out.println("Buble Sort");
       
       
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
       
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter Elemnts of array:");
       //taking arry input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // printing Unsorted array
        printArray(arr);
        System.out.println();
        int temp=0;
    

        
        //Bubble sort in ascending order Start
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
             
                if(arr[j]>arr[j+1]){
                    
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }
        System.out.println("\nBubble sort in Ascending Order: ");
       printArray(arr);


       
        //Bubble sort in decending order Start
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
             
                if(arr[j+1]>arr[j]){
                  
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }  
            }
        }
        System.out.println("\nBubble sort in decending Decending");
        
        printArray(arr);
    }
}
