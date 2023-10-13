/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.PersonItem;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        String title = "Person Management ";
        String[] s = new String[]{"Find person info. ", "Copy Text to new file.","Exit"};
        Menu<String> menu = new PersonItem(title, s);
        menu.run();
    }
}
