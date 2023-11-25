public class RotateArray {
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        for(int i=0;i<2;i++){
            int temp=array[array.length-1];
            for(int j=array.length-1;j>0;j++)
            {
                array[j]=array[j-1];
            }
            array[0]=temp;
        }
        for(int i: array)
        {
            System.out.println(i);
        }
    }
    
}
