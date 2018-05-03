
package com.john;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//importing these to start GUI

//Build Frame
//Build panel  - hold buttons, text boxes and labels


public class round1 {

//Declaring instance variables - done inside class

    // need to import the items below to be able to create the variables
    //import javax.swing.*;
    //import java.awt.*;


    private JFrame f; //frame variable called f as f is for Frame
    //frame is our window
    private JPanel p; //panel variable called p as p is for panel
    //panel displays all components on our frame
    private JButton b1;
    //component
    private JLabel label1;

    //TODO create more components i.e. labels and buttons


    //Declare constructor of the class
    public round1(){

//in constructor create a method
        gui();
    }



        //out of the constructor declare method
        public void gui(){
        //void is the return type and it returns nothing thus that is the type

//create frame, panel, button and label objects in this method

            //create an object frame
            f = new JFrame("Task List"); //this is the title of the window
            f.setVisible(true);//want frame to be visible thus setVisitible and its tue
            f.setSize(400, 300);//this is the window (frame) size
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press close button on frame it will close the frame

            //now create a panel
            //panel variable is p
            p = new JPanel();
            p.setBackground(Color.LIGHT_GRAY);
            //p.setBorder((Border) Color.BLUE);//setting the border color

            //declare components button and label
            b1 = new JButton("Push me");
            label1 = new JLabel("To test this button.");

            //Add label to panel
            //panel is p
            p.add(b1);
            p.add(label1);

            //add panel in to frame

           // f.add(p.BorderLayout.North);
//



        }


    public static void main(String[] args) {
	// need to create an object of the class round1

        new round1();
    }
}
