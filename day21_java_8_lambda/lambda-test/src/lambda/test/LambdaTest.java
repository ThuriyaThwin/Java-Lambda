/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.test;

/**
 *
 * @author acer
 */
public class LambdaTest {

 
    public static void main(String[] args) {
        
        
        MyLambda obj=new MyLambda() {

            @Override
            public boolean test(int n) {
                return true;
            }
        };
        MyLambda obj1=(n) -> n%2==0;
        if(obj1.test(8)){
            System.out.println("8 is event");
        }
        if(!obj1.test(5)){
            System.out.println("5 is not event");
        }
        MyLambda obj2=(n) -> n>=0;
        if(obj2.test(6)){
            System.out.println("6 is positive...");
        }
        if(!obj2.test(-6)){
            System.out.println("-6 is not positive");
        }
        AnotherLambda isFactor= (a,b) -> (a%b)==0;
        if(isFactor.test(10, 2)){
            System.out.println("2 is the factor of 10");
        }
        if(!isFactor.test(10, 3)){
            System.out.println("3 is not the factor of 10");
        }
//        FactorialLambda factorial=(n) -> {
//            int result=1;
//            for(int i=1;i<=n;i++){
//                result = i* result;
//            }
//            
//            return result;
//        };
        
      //  System.out.println("factorial of 5:"+ factorial.test(7) );
        FactorialLambda mytest= (n) -> n;
        System.out.println(mytest.test(4));
        
        StringFunc reverse= (s) ->{
          String result="";
          int i;
          for(i=s.length()-1;i>=0;i--){
              result+=s.charAt(i);
          }
          return result;
        };
        StringFunc reverseAndToUpperCase= (s) ->{
          String result="";
          int i;
          for(i=s.length()-1;i>=0;i--){
              result+=s.charAt(i);
          }
          return result.toUpperCase();
        };
        System.out.println("Lambda reversed is:"
        + reverse.myfunc("Lambda"));
        System.out.println("Lambda reverse and upper is:"
        + reverseAndToUpperCase.myfunc("Lambda"));
    }
    
//    private class MyTestLambda implements MyLambda{
//
//        @Override
//        public boolean test(int n) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        
//    }
    
}
