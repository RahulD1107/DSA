import java.util.Scanner;
class Selection{
public static void main(String[]args){
    Scanner scan=new Scanner(System.in);

    int n=scan.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
     
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
        if(arr[min]>arr[j])
          min=j;
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
    for(int num:arr){
        System.out.print(num +" ");
    }
}
}