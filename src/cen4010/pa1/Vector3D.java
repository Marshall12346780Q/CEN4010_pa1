package cen4010.pa1;

public class Vector3D {
	
	private double x;
	private double y;
	private double z;
	
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public Vector3D scale(double f) {
		double x1 = x * f;
		double y1 = y * f;
		double z1 = z * f;
		Vector3D vec = new Vector3D(x1, y1, z1);
		return vec;
	}
	
	public Vector3D add(Vector3D vec) {
		Vector3D temp = new Vector3D(vec.x + this.x, vec.y + this.y, vec.z + this.z);
		return temp;	
	}
	
	public Vector3D subtract(Vector3D vec) {
		Vector3D temp = new Vector3D(this.x - vec.x, this.y - vec.y, this.z - vec.z);
		return temp;
	}
	
	public Vector3D negate() {
		double x1 = x * -1;
		double y1 = y * -1;
		double z1 = z * -1;
		Vector3D vec = new Vector3D(x1, y1, z1);
		return vec;
	}
	
	public double dot(Vector3D v) {
		double temp = this.x * v.x + this.y * v.y + this.z * v.z;
		return temp;
	}
	
	public double magnitude() {
		return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
	}
	
	public boolean equals(Object vec) {
		Vector3D vect = (Vector3D) vec;
		boolean flag = false;
		if ((Math.abs(this.x - vect.x) < .25 &&
				Math.abs(this.y - vect.y) < .25 && 
				Math.abs(this.z - vect.z) < .25)) {
			flag = true;
		}
		return flag;
	}
	
	public String toString() {
		return "Coordinates:\n"
				+ "X: " + this.x +"\n"
				+ "Y: " + this.y+"\n"
				+ "Z: " + this.z+"\n"
				+ "Magnitude =  " + this.magnitude();
	}

}
