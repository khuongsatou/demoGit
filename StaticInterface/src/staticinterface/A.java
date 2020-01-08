/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticinterface;
/**
 *
 * @author Yui
 */
public interface A {
    static void hello(){
        System.out.println("Hello, New Static Method Here");
    }
    
    void overritdeMethod(String str);
}
