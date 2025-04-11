import java.util.Scanner;
class MergeSort{

  static  void mergesort(int []arr,int left,int right){

        if(left<right){
           int  mid=(left+right)/2;

            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

  static  void merge(int []arr,int left,int mid,int right){

        int n1=mid-left+1;
        int n2=right-mid;

        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int x=0;x<n1;x++){
            larr[x]=arr[left+x];
        }
        for(int x=0;x<n2;x++){
            rarr[x]=arr[mid+1+x];
        }
         
         int i=0;
         int j=0;
         int k=left;
        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;

            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
         
         int left=0;
         int right=n-1;
        mergesort(arr,left,right);

        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}