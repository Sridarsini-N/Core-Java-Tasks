import java.util.Scanner;
public class Tables_16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        char Ch;
        do{
        System.out.println("Enter the tables you want to print");
        int a=sc.nextInt();
        System.out.println("Enter how many times upto ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.err.println(a+"*"+i+"="+a*i);
           
        }
        System.out.println("Do you want to Continue 'Y' or 'N'");
        Ch=sc.next().charAt(i);
        }
        while(Ch=='y'||Ch=='Y');
        
    }
}
