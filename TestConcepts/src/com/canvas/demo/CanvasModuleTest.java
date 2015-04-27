package com.canvas.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanvasModuleTest {
	public static void main(String args[])
	{
		String canvasDetails[][];
		DrawComponents components=new DrawComponents();
	  try
	   {
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter Canvas Details");
		    String inputLine = bufferRead.readLine();
		    System.out.println(inputLine);
		    String inputDetails[]= inputLine.trim().split(" ");
		  
		
		   if(inputDetails[0].equals("C"))
		   {
			   components.drawCanvas(new Canvas(Integer.parseInt(inputDetails[1]), Integer.parseInt(inputDetails[2])));
		   }
		   components.showCanvas();
		    System.out.println("Enter Line Details");
		    inputLine = bufferRead.readLine();			 
		    System.out.println(inputLine);
		    inputDetails= inputLine.trim().split(" ");
		   
		    if(inputDetails[0].equals("L"))
			 {
			  components.drawLine(new Line(Integer.parseInt(inputDetails[1].trim()), Integer.parseInt(inputDetails[2].trim()),
					  Integer.parseInt(inputDetails[3].trim()), Integer.parseInt(inputDetails[4].trim())));
			 }
		    
		    components.showCanvas();
		    
		    
		    System.out.println("Enter Line Details");
		    inputLine = bufferRead.readLine();			 
		    System.out.println(inputLine);
		    inputDetails= inputLine.trim().split(" ");
		   
		    if(inputDetails[0].equals("L"))
			 {
			  components.drawLine(new Line(Integer.parseInt(inputDetails[1].trim()), Integer.parseInt(inputDetails[2].trim()),
					  Integer.parseInt(inputDetails[3].trim()), Integer.parseInt(inputDetails[4].trim())));
			 }
		    
		    components.showCanvas();
		 
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
