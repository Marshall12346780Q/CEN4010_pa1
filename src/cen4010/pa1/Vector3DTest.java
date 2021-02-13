package cen4010.pa1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector3DTest {

	@Test
	void testScale() {
		double factor = 5;
		Vector3D test = new Vector3D(1,2,3);
		Vector3D test2 = new Vector3D(1*factor, 2*factor, 3*factor);
		assertEquals(test2, test.scale(factor));
	}

	@Test
	void testAdd() {
		Vector3D test = new Vector3D(1,2,3);
		Vector3D test2 = new Vector3D(7, 8, 9);
		Vector3D testSum = new Vector3D(8,10,12);
		assertEquals(testSum, test.add(test2));
	}

	@Test
	void testSubtract() {
		Vector3D test = new Vector3D(7,8,9);
		Vector3D test2 = new Vector3D(3,2,1);
		Vector3D testSum = new Vector3D(4,6,8);
		assertEquals(testSum, test.subtract(test2));
	}

	@Test
	void testNegate() {
		Vector3D test = new Vector3D(13, 14, 15);
		Vector3D test2 = new Vector3D(-13,-14,-15);
		assertEquals(test2, test.negate());
	}

	@Test
	void testDot() {
		Vector3D test = new Vector3D(7,8,9);
		Vector3D test2 = new Vector3D(3,2,1);
		assertEquals(46, test.dot(test2));
	}

	@Test
	void testMagnitude() {
		double check = Math.sqrt(3*3 + 4*4 + 6*6);
		Vector3D test = new Vector3D(3,4,6);
		assertEquals(test.magnitude(), check);
	}

	@Test
	void testToString() {
		String e = "Vector Coordinates: (1,2,3)";
		assertEquals(e, e.toString());
	}

	@Test
	void testEqualsObject() {
		Vector3D test = new Vector3D(1,2,3);
		assertEquals(true, test.equals(test));
		Vector3D test1 = new Vector3D(1,2,3);
		assertEquals(true, test.equals(test1));
	}

}
