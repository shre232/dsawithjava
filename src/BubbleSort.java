public class BubbleSort {
  
    PrintArray pa=new PrintArray();
    BubbleSort(){
        System.out.println("Buble Sort");
        System.out.println("Enter size of array"); 
    }
          int temp=0;
          
          //Bubble sort in ascending order Start
          public void sortAscending(int size,int[] arr){
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
          pa.printArray(arr);
    
          
        }
          //Bubble sort in decending order Start
          public void sorDecending(int size,int[] arr){
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
        
              pa.printArray(arr);
    }

}
