class DescendingOrder{
public static void main(String [] args){
int arr[]={1,1,1,2,2,2,2,3,3,'y',5,'y',1,1};
int count=0,j;
           for(int i=0;i<arr.length;i++)
           {
            for(j=i+1;j<arr.length;j++)
            {
             if(arr[i]==arr[j]) 
             {
              count++;
              //System.out.print(count);
             }

}
         if(count==0)
         {
             
         System.out.println(arr[i]+",");
         }
       
        
          count=0;

}
           
}
}

