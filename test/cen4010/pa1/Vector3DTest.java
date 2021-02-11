package cen4010.pa1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector3DTest {
	
	private Vector3D vect = new Vector3D(3, 4, 5);
	
//	@BeforeEach
//	public void setUp() throws Exception {
//		vector3D = new Vector3D(int a, int b, int c);
//	}
	
	
	
	@Test
	public void testScale() {
		double f = 2;
		Vector3D vect1 = new Vector3D(2, 3, 4);
		Vector3D vect2 = new Vector3D(2*f, 3*f, 4*f);
		assertEquals(vect2, vect1.scale(f));
	}
	
	@Test
	public void testAdd() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		Vector3D vect2 = new Vector3D(8, 7, 6);
		Vector3D vect3 = new Vector3D(10, 10, 10);
		assertEquals(vect3, vect1.add(vect2));
	}
	
	@Test
	public void testSub() {
		Vector3D vect1 = new Vector3D(8, 7, 6);
		Vector3D vect2 = new Vector3D(2, 3, 4);
		Vector3D vect3 = new Vector3D(6, 4, 2);
		assertEquals(vect3, vect1.subtract(vect2));
	}
	
	@Test
	public void testNegate() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		Vector3D vect2 = new Vector3D(-1*2, -1*3, -1*4);
		assertEquals(vect2, vect1.negate());
	}
	
	@Test
	public void testDot() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		Vector3D vect2 = new Vector3D(1, 2, 3);
		double d = 20.0;
		assertEquals(d, vect1.dot(vect2));
	}
	
	@Test
	public void testMagnitude() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		double mag = Math.sqrt(2*2 + 3*3 + 4*4);
		assertEquals(mag, vect1.magnitude());
	}
	
	@Test
	public void testEquals() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		Vector3D vect2 = new Vector3D(2, 3, 4);
		assertEquals(vect1, vect2);
	}
	
	@Test
	public void testToString() {
		Vector3D vect1 = new Vector3D(2, 3, 4);
		String expected = "Coordinates:\n"
				+ "X: 2.0\n"
				+ "Y: 3.0\n"
				+ "Z: 4.0\n"
				+ "Magnitude =  " + vect1.magnitude();
		System.out.println(vect1.toString());
		System.out.println(expected);
		assertEquals(expected, vect1.toString());
	}
	

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
