import java.util.Scanner;
class BinarySearch{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();

        int left=0;
        int right=arr.length-1;
        boolean found=false;
        

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                System.out.print("Element found");
                found=true;
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid+1;
            }
        }
        if(!found)
        System.out.print("Element not found");
    }
}