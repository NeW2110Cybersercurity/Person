/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.PersonManager;
import view.Menu;

/**
 *
 * @author Admin
 */
public class PersonItem extends Menu<String>{
 
    public PersonItem(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                PersonManager.findPersonInfo();
                break;
            case 2:
                PersonManager.coppyNewFile();
                break;
            case 3:
                System.exit(0);        
        }
    }
}
