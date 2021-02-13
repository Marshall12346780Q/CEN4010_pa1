package cen4010.pa1;
public class Vector3D {
	final private double x, y, z;
	protected Vector3D(double xVal, double yVal, double zVal)
	{
		x = xVal;
		y = yVal;
		z = zVal;
	}
	protected Vector3D scale(double f)
	{	
		return new Vector3D(f * x, f * y, f * z); 
	}
	protected Vector3D add(Vector3D v)
	{
		return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	protected Vector3D subtract(Vector3D v)
	{
		return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	protected Vector3D negate()
	{
		return new Vector3D(this.x *-1, this.y *-1, this.z *-1);
	}
	protected double dot(Vector3D v)
	{
		return (this.x * v.x) + (this.y * v.y) + (this.z * v.z);
	}
	protected double magnitude()
	{
		return java.lang.Math.sqrt(dot(this));
	}
	@Override
	public String toString()
	{
		return ("Vector Coordinates: (" + this.x + "," + this.y + "," + this.z + ")");
	}
	@Override
	public boolean equals(Object v)
	{
		double tolerance = .005;
		boolean state = false;
		Vector3D e = (Vector3D) v;
		if(Math.abs(x-e.x) < tolerance && Math.abs(y-e.y) < tolerance && Math.abs(z-e.z) < tolerance)
		{
			state = true;
		}
		return state;
	}
}
