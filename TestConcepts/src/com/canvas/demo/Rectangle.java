/**
 * 
 */
package com.canvas.demo;

public class Rectangle {
	int pointX1;
	int pointY1;
	int pointX2;
	int pointY2;
	
	
	public Rectangle(int pointX1, int pointY1, int pointX2, int pointY2) {
		super();
		this.pointX1 = pointX1;
		this.pointY1 = pointY1;
		this.pointX2 = pointX2;
		this.pointY2 = pointY2;
	}
	
	public int getPointX1() {
		return pointX1;
	}
	public int getPointY1() {
		return pointY1;
	}
	public int getPointX2() {
		return pointX2;
	}
	public int getPointY2() {
		return pointY2;
	}
	public void setPointX1(int pointX1) {
		this.pointX1 = pointX1;
	}
	public void setPointY1(int pointY1) {
		this.pointY1 = pointY1;
	}
	public void setPointX2(int pointX2) {
		this.pointX2 = pointX2;
	}
	public void setPointY2(int pointY2) {
		this.pointY2 = pointY2;
	}

}
