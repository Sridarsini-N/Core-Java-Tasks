import java.util.Scanner;
public class addition_using_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
       System.out.print("Enter the Array size:");
        int Arraysize=sc.nextInt();
        System.out.println("Enter the no of datas");
         int n=sc.nextInt();
        int a[]=new int[Arraysize];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        System.out.println("The enter values are:");
        for(int i=0;i<n;i++){
           sum=sum+a[i];  
        
        }
        System.out.println(sum);
    }
    }

