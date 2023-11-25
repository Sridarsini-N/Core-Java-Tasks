//public class Consonantvowels {
//    public static void main(String args[]){
//        
//        int vowels=0,constant=0;
//        String Sentences="Hi My Name is Sridarsini";
//       
//          for(int i=0;i<Sentences.length();i++){             
//             if(Sentences.charAt(i) =='a'||Sentences.charAt(i) =='e'|| Sentences.charAt(i) =='i' || Sentences.charAt(i) =='o' || Sentences.charAt(i) =='u' || Sentences.charAt(i) =='A'||Sentences.charAt(i) =='E'||Sentences.charAt(i) =='I'||Sentences.charAt(i) =='O'||Sentences.charAt(i) =='U');
//             {
//                 ++vowels;
//                 
//             }else{ (Sentences.charAt(i)>='a' && Sentences.charAt(i)<='Z')
//                     
//                     constant++;
//                     }
//              
//            
//        }
//    }
//}
   

import java.util.Scanner;
public class Consonantvowels {    
    public static void main(String[] args) {    
           
        int vowels = 0, constants = 0,digits = 0,spaces=0,special=0;    
                 
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
            
      
     
            
        for(int i = 0; i < str.length(); i++) {    
             
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {    
             
                vowels++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                constants++;    
            }    
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                digits++;
            }
            else if(str.charAt(i)==' ')
            {
                spaces++;
            }
            else{
                special++;
            }
                
        }    
        System.out.println("Number of vowels: " + vowels);    
        System.out.println("Number of consonants: " + constants);    
        System.out.println("Number of digits :"+ digits);
        System.out.println("Numebers of spaces :" +spaces);
        System.out.println("Number of special Charaters :"+special);
    }    
}   
