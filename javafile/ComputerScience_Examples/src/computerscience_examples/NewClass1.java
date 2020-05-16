/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscience_examples;

import java.io.File;

/**
 *
 * @author Deshan
 */
public class NewClass1 {
    public static void main(String[] args) {
             
     File[] files = new File("C:\\Users\\Deshan\\Desktop\\eranga nawarathna").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null. 

for (File file : files) {
    if (file.isFile()) {
        System.out.println(file.getName());
    }
}

    }
    
}
