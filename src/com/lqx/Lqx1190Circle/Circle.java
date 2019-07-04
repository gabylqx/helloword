package com.lqx.Lqx1190Circle;

public class Circle {
	//radius:double 
	private double radius;
	//°ë¾¶toString():·µ»Ø radius

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
}
