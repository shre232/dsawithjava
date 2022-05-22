public class SelectionSort {

    SelectionSort(){
        System.out.println("\nSelection Sort");
    }
    PrintArray b1=new PrintArray();

    public void selectionSortAsc(int size,int [] arr){
        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
               
                if(arr[smallest]>arr[j]){
                    smallest=j;
            
                }

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        System.out.println("\nSelection sort in asc order");
        b1.printArray(arr);

    }

    public void selectionSortDesc(int size,int [] arr){
        for(int i=0;i<size-1;i++){
            int largest=i;
            for(int j=i+1;j<size;j++){
               
                if(arr[largest]<arr[j]){
                    largest=j;
            
                }

            }
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;

        }
        System.out.println("\nSelection sort in dec order");
        b1.printArray(arr);

    }
    
}
