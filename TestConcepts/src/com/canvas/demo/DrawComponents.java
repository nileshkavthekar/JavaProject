package com.canvas.demo;

public class DrawComponents {
	
	private String canvasDetails[][]=null;
	
	public  void drawCanvas(Canvas canvas)
	{
		canvasDetails=new String[canvas.getWidth()][canvas.getHeight()];	

		for(int row=0;row<canvas.getWidth();row++){
			
			for(int col=0;col<canvas.getHeight();col++){
				canvasDetails[row][col]="0";
			}
		}
		
	}

	public void drawLine(Line line)
	{
		for(int col=line.getPointX1();col<=line.getPointX2();col++){
			
			for(int row=line.getPointY1();row<=line.getPointY2();row++){
				canvasDetails[col][row]="x";
			}
		}
	}

	public String[][] getCanvasDetails() {
		return canvasDetails;
	}

	public void setCanvasDetails(String[][] canvasDetails) {
		this.canvasDetails = canvasDetails;
	}
	
	public  void showCanvas()
	{
		for(int row=0;row<canvasDetails.length;row++){
			
			for(int col=0;col<canvasDetails[row].length;col++){
				System.out.print(canvasDetails[row][col]);
			}
			System.out.println();
		}		
		
	}
}
