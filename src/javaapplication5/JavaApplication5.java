/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;


public class JavaApplication5 {
    int puppyAge;
    
    public JavaApplication5(String name){
        System.out.println("Passed name is :" + name);
        
    }
    public void setAge( int age){
        puppyAge = age;
    }
    
    public int getAge(){
        System.out.println("Puppy's age is : "  + puppyAge);
        return puppyAge;
    }
    
    
    
    public static void main(String[] args) {
        JavaApplication5 myPuppy = new JavaApplication5("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable value:"+myPuppy.puppyAge);
    }
} 
