class  Parent{
        public static void  parentClass(){
            System.out.println("parentclass");
        }
    }

class  child extends Parent{
        public static void  parentClass()
{
 System.out.println("Childclass");      
    }
}
 
 
 
class  Inheritance_32 {
public static void main(String args[]){
Inheritance_32 obj=new Inheritance_32();

Parent parentobj=new Parent();  //comment this block to over the parent class
parentobj.parentClass();

child childobj=new child();
childobj.parentClass();

}
Inheritance_32()
    {
   System.out.println("Default Constructor");
    }
 }






//class Inheritance_32 {
//    Inheritance_32() {
//        System.out.println("Default Constructor");
//    }
//
//    class Parent {
//        public static void parentClass() {
//            System.out.println("parentclass");
//        }
//    }
//
//    class Child extends Parent {
//    }
//
//    public static void main(String args[]) {
//        Inheritance_32 obj = new Inheritance_32();
//
//        Parent parentObj = new Parent();
//        parentObj.parentClass();
//
//        Child childObj = new Child();
//        childObj.parentClass();
//    }
//}