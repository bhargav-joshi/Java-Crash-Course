import java.io.*;
interface Shape
{
float fPi=3.14f;
public void fnRead();
public void fnArea();
public void fnShow();
}
 class Rectangle implements Shape 
{
int iLength,iBreadth;
float fArea;

public void fnRead()
{
    DataInputStream d=new DataInputStream(System.in);
    try
    {
        System.out.print("Enter the length : ");
        iLength=Integer.parseInt(d.readLine());
                System.out.print("Enter the breadth : ");
                    iBreadth=Integer.parseInt(d.readLine());
            }
    catch(Exception e)
    {
    }
}
public void fnArea()
{
    fArea=iLength*iBreadth;
}
public void fnShow()
{
    System.out.println("Area of the rectangle : " + fArea);
}
}

class Square implements Shape 
{
int iSide;
float fArea;
public void fnRead()
{
    try
    {
        DataInputStream d2=new DataInputStream(System.in);
        System.out.print("Enter the length of the side: ");
        iSide=Integer.parseInt(d2.readLine());
    }
    catch(Exception e)

    {
    }
}
public void fnArea()
{
    fArea=iSide*iSide;
}
public void fnShow()
{
    System.out.println("Area of the square: " + fArea);
}
}

class ShapeInterface 
{
public static void main(String[] a)throws IOException
{
    int iChoice;
    Shape sObject;
    String s;
    DataInputStream in=new DataInputStream(System.in);
    do
    {
        System.out.println("Area Calculation \n");
        System.out.println("1 --> Rectangle\n2 --> Square\n3 --> EXIT\n");
        System.out.print("Enter ur choice : ");
        iChoice=Integer.parseInt(in.readLine());
        switch(iChoice)
        {
            case 1:
            {
                Rectangle rObject=new Rectangle();
                sObject=rObject;
                sObject.fnRead();
                sObject.fnArea();
                sObject.fnShow();
            break;
            }
            case 2:
            {
                Square sqObject=new Square();
                sObject=sqObject;
                sObject.fnRead();
                sObject.fnArea();
                sObject.fnShow();
            break;
            }
                case 3: System.exit(0);
            break;
        } //end of switch
        System.out.println("Do you want to continue? Press y for Yes or Press N for No");
        s=in.readLine();
    }while(s.equals("y"));
}
}
