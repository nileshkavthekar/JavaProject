package com.canvas.demo;

public class DrawComponents {
	
	private String canvasDetails[][]=null;
	
	public  void drawCanvas(Canvas canvas)
	{
		canvasDetails=new String[canvas.getHeight()][canvas.getWidth()];	

		for(int row=0;row<canvas.getHeight();row++){
			
			for(int col=0;col<canvas.getWidth();col++){
				canvasDetails[row][col]="0";
			}
		}
		
	}

	//L 1 2 6 2
	//L 6 3 6 4
	public void drawLine(Line line)
	{
		for(int row=line.getPointX1()-1;row<line.getPointX2();row++){
			
			for(int col=line.getPointY1()-1;col<line.getPointY2();col++){
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
	

	public void drawRectangle(Line line)
	{
		for(int row=line.getPointX1()-1;row<line.getPointX2();row++){
			
			for(int col=line.getPointY1()-1;col<line.getPointY2();col++){
				canvasDetails[col][row]="x";
			}
		}
	}
}
