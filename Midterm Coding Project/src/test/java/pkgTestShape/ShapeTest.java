package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

import java.util.ArrayList;

import java.util.Collections;
public class ShapeTest {
	
	@Test
	public void RectangleGetterTest() {
		Rectangle rec = new Rectangle(3,6);
		assertTrue(rec.getWidth() == 3);
		assertTrue(rec.getLength() == 6);		
	}
	
	@Test
	public void RectangleSetterTest() {
		Rectangle rec = new Rectangle(3,6);
		rec.setLength(8);
		rec.setWidth(12);
		assertTrue(rec.getLength() == 8);
		assertTrue(rec.getWidth() == 12);
	}
	
	@Test
	public void AreaTest() {
		Rectangle rec = new Rectangle(3,6);
		assertTrue(rec.area() == 18);
	}
	
	@Test
	public void PerimeterTest() {
		Rectangle rec = new Rectangle(4,5);
		assertTrue(rec.perimeter() == 18); 
	}
	
	@Test
	public void RectangleCompareTest() {
		Rectangle rec1 = new Rectangle(3,6);
		Rectangle rec2 = new Rectangle(4,5);
		ArrayList<Rectangle> compareRectangle = new ArrayList<Rectangle>();
		compareRectangle.add(rec1);
		compareRectangle.add(rec2);
		Collections.sort(compareRectangle);
		assertTrue(compareRectangle.get(0).area() < compareRectangle.get(1).area()); 
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest2() {
		Rectangle rec = new Rectangle(-3, 5);
		assertTrue(rec.getWidth() < 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest3() {
		Rectangle rec = new Rectangle(1, -6);
		assertTrue(rec.getLength() < 0);
	}

	@Test
	public void CuboidSetterTest() {
		Cuboid cube = new Cuboid(1,2,3);
			cube.setWidth(7);
			cube.setLength(8);
			cube.setDepth(9);
			assertTrue(cube.getWidth() == 7);
			assertTrue(cube.getLength() == 8);
			assertTrue(cube.getDepth() == 9);	
	}
	
	@Test
	public void CuboidGetterTest() {
		Cuboid cube = new Cuboid(1,2,3);
		assertTrue(cube.getWidth() == 1);
		assertTrue(cube.getLength() == 2);
		assertTrue(cube.getDepth() == 3);
		
	}
	
	@Test
	public void CuboidAreaTest() {
		Cuboid cube = new Cuboid(1,2,3);
		assertTrue(cube.area() == 12);
	}
	
	@Test
	public void CuboidVolumeTest() {
		Cuboid cube = new Cuboid(1,2,3);
		assertTrue(cube.volume() == 6);
		
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void CubicPerimeterTest() {
		Cuboid cube = new Cuboid(1,2,3);
		cube.perimeter();
	}
	
	@Test
	public void CuboidAreaSortTest() {
		Cuboid cube1 = new Cuboid(1,2,3);
		Cuboid cube2 = new Cuboid(4,5,6);
		ArrayList<Cuboid> compareCube = new ArrayList<Cuboid>();
		compareCube.add(cube1);
		compareCube.add(cube2);
		Collections.sort(compareCube);
		assertTrue(compareCube.get(0).area() < compareCube.get(1).area());
		
	}
	
	@Test
	public void CuboidVolumeSortTest() {
		Cuboid cube1 = new Cuboid(1,2,3);
		Cuboid cube2 = new Cuboid(4,5,6);
		ArrayList<Cuboid> compareCube = new ArrayList<Cuboid>();
		compareCube.add(cube1);
		compareCube.add(cube2);
		Collections.sort(compareCube);
		assertTrue(compareCube.get(0).volume() < compareCube.get(1).volume());
	}
	

}


