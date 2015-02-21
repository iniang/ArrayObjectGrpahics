import java.awt.Color;
import java.awt.Graphics;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;

import com.sun.xml.internal.ws.api.server.Container;

public class ControllerClass extends JFrame  
{  
   
    int s=5;
    int x = 50;
    int y = 50;
    int height;
    int width;
    Scanner keyboard = new Scanner(System.in);
     
	Face figure = new Face(x, y, width, height);
	Face[] faceNumber =  new Face[s];

public ControllerClass()  
{  

 //Set JFrame title  
 super("Draw A Rectangle In JFrame"); 
 
  //java.awt.Container c = getContentPane();
  setBackground(Color.BLUE);
  
 //Set default close operation for JFrame  
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 
 //Set JFrame size  
 setSize(600,400);  
 
 //Make JFrame visible   
 setVisible(true);
 
 setLocation(500,200);
 // 
 setAlwaysOnTop(true);
 ask();
 
 display();
 repaint();
}  
  public int ask()
  {
	  boolean valid = false;
      int a = 0;
 	while(valid == false){	
 		
	try
	{	  
      System.out.println("How many figure do you want to draw?");
      s = keyboard.nextInt();
      for(int v = 1; v <= s; v++)
      {
          faceNumber[v] = new Face(figure.x, figure.y, figure.width, figure.height);
            
         
          System.out.println("Enter an Integer for x");
          faceNumber[v].x = keyboard.nextInt();
         figure.x = faceNumber[v].x;
          
          System.out.println("Enter an Integer for y");
          faceNumber[v].y = keyboard.nextInt();
          figure.y = faceNumber[v].y; 
           
          System.out.println("Enter an Integer for the width");
          faceNumber[v].width = keyboard.nextInt();
          figure.width = faceNumber[v].width;
           
          System.out.println("Enter an Integer for the height");
          faceNumber[v].height = keyboard.nextInt();
          figure.height = faceNumber[v].height;
          repaint();
          
          
          a = keyboard.nextInt();
          valid = true; 
      }
      }
          
      
      catch(InputMismatchException exception)
      {
     
    	  {	
        	  //Print "This is not an integer"
        	  //when user put other than integer
        	  System.out.println("This is not an integer! Please enter a valid enter!");
        	   keyboard.next();
        	}
        }
            	
        }
	return a;
 
  }
   
  public void display()
  {
      for(int a = 1; a <= s; a++)
      { 
      System.out.println("x = " + faceNumber[a].getX());
      System.out.println("y = " + faceNumber[a].getY());
      System.out.println("Width = " + faceNumber[a].getWidth());
      System.out.println("Height = " + faceNumber[a].getHeight());
       
      }
  }
public void paint(Graphics g)  
{  
   if (x<25){
 //draw rectangle outline  
 g.drawRect(figure.getX(),figure.getY(),figure.getWidth(),figure.getHeight());  
 //set color to RED  
 //So after this, if you draw anything, all of it's result will be RED  
 g.setColor(Color.red);  
 //fill rectangle with RED  
 g.fillRect(figure.x,figure.y,figure.width,figure.height); 
 
} else if (x>50){
	
	//draw rectangle outline  
	 g.drawRect(figure.getX(),figure.getY(),figure.getWidth(),figure.getHeight());  
	 //set color to RED  
	 //So after this, if you draw anything, all of it's result will be RED  
	 g.setColor(Color.yellow);  
	 //fill rectangle with RED  
	 g.fillRect(figure.x,figure.y,figure.width,figure.height);
	
} else if (x >= 25 && x <= 50){
	
	//draw rectangle outline  
	 g.drawRect(figure.getX(),figure.getY(),figure.getWidth(),figure.getHeight());  
	 //set color to RED  
	 //So after this, if you draw anything, all of it's result will be RED  
	 g.setColor(Color.green);  
	 //fill rectangle with RED  
	 g.fillRect(figure.x,figure.y,figure.width,figure.height);
	
}
 
}  
 
 
 
  
}

