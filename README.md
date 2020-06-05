# Java Crash Course
`(This is for Intermediate Students who knows basics of java,)`

`(But Beginners can fork the programs to understand the concepts easily)`

![java](https://user-images.githubusercontent.com/47782249/83146045-54f4c780-a113-11ea-8dfc-b2ea7054ba8d.png)

### Hello Everyone so If you want to do a normal crash course which will help you to get a brushup your knowledge of java.

Based on Notes & Programs done in Engineering subject Java.

##  Requirements

 * A computer running Windows, Mac OS, or Linux so that the free tools for writing Java code can be installed
 * An open mind to learn something new and exciting which may make a huge difference in your future career.

### What is Java ?

• A programming language.
• A class library
• A platform

### JAVA is Use in -

• Mobile applications (specially Android apps)
• Desktop applications
• Web applications
• Web servers and application servers
• Games
• Database connection
• And much, much more!

### JAVA -- PACKAGES

Packages are used in Java in order to prevent naming conflicts, to control access, to make
searching/locating and usage of classes, interfaces, enumerations and annotations easier, etc.

A Package can be defined as a grouping of related types classes, interfaces, enumerationsandannotations
providing access protection and name space management.

### Built-in Packages

**Package Name** | **Description**
-- | --
java.lang | Contains language support classes ( for e.g classes which defines primitive data types, math operations, etc.) . This package is automatically imported.
java.io | Contains classes for supporting input / output operations.
java.util | Contains utility classes which implement data structures like Linked List, Hash Table, Dictionary, etc and support for Date / Time operations.
java.applet | Contains classes for creating Applets.
java.awt | Contains classes for implementing the components of graphical user interface ( like buttons, menus, etc. ).
java.net | Contains classes for supporting networking operations.

## Objects and Classes in Java

##### What is an object in Java ?

An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible). The example of an intangible object is the banking system.

## Class in Java

A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

A class in Java can contain:

* *Fields*
* *Methods*
* *Constructors*
* *Blocks*
* *Nested class and interface*

**Syntax -**

class <class_name>{  
    field;  
    method;  
}  

## Different ways to create an object in Java?

By new keyword
By newInstance() method
By clone() method
By deserialization
By factory method etc.

# Java - Applet

An applet is a Java program that runs in a Web browser. An applet can be a fully functional Java application because it has the entire Java API at its disposal.

## Life Cycle of an Applet

* init − This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.

* start − This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.

* stop − This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.

* destroy − This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.

* paint − Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.

#### Example - 

```
import java.applet.*;
import java.awt.*;

public class Example extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello Java Course !!", 25, 50);
   }
}
```
# Java ActionListener -Interface

The Java ActionListener is notified whenever you click on the button or menu item. It is notified against ActionEvent. The ActionListener interface is found in java.awt.event package. It has only one method: actionPerformed().

Interface declaration
Following is the declaration for java.awt.event.ActionListener interface:

```public interface ActionListener
   extends EventListener
 ```
#### Interface methods -
   **void actionPerformed(ActionEvent e)**
Invoked when an action occurs.

**Methods inherited
This interface inherits methods from the following interfaces:**

*java.awt.EventListener*

#### Eg.

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ActionListenerExample extends JFrame implements ActionListener
{
    JLabel lblData;
    JButton btnOk,btnCancel;
    ActionListenerExample()
    {
      setLayout(new FlowLayout());
      lblData = new JLabel("Click any button to display data");
      btnOk=new JButton("OK");
      btnCancel = new JButton("Cancel");
      btnOk.addActionListener(this);
      btnCancel.addActionListener(this);
      add(lblData);
      add(btnOk);
      add(btnCancel);
    }
 
   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource() == btnOk)
       lblData.setText("OK Button is Clicked ");
    else
       lblData.setText("Cancel Button is Clicked ");
   }
}
 class ActionListenerJavaExample
 {
    public static void main(String args[])
    {
         ActionListenerExample frame = new ActionListenerExample();
        frame.setTitle("ActionListener in Java Swing Examples");
        frame.setBounds(200,150,180,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }
 }
```

**This Example will generate a GUI interface and after running it you can see there are two buttons so if you can see that you have clicked or not ? It will tell you after clicking which button is clicked**


 
   
