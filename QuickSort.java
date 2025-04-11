import java.util.Scanner;
class QuickSort{

  static   void quicksort(int[]arr,int left,int right){
        if(left<right){

        int pi=partition(arr,left,right);

        quicksort(arr,left,pi-1);
        quicksort(arr,pi+1,right);
        }

    }
   static   int partition(int []arr,int left,int right){

          
          int pivot=arr[right];
          int i=left-1;

          for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                i++;
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
          
          }
          int temp=arr[i+1];
          arr[i+1]=arr[right];
          arr[right]=temp;

          return i+1;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
       
         
         
        quicksort(arr,0,n-1);

        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}