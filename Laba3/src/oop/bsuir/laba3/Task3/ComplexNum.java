package oop.bsuir.laba3.Task3;

import java.util.Random;

public class ComplexNum implements Normalize {

	private double complexNum;

	public ComplexNum() {
		Random r = new Random();
		this.complexNum = r.nextInt(21)-10;
	}

	
	public double getComplexNum() {
		return complexNum;
	}


	public void setComplexNum(double complexNum) {
		this.complexNum = complexNum;
	}


	@Override
	public double norm() {
		double rezult = Math.pow(Math.abs(complexNum), 2);
		return rezult;
	}
}
