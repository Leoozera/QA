package triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	TriangleClassifier triangleClassifier = new TriangleClassifier();
	
	@Test
	public void testEquilatero() {
		Integer size1 = 10;
		Integer size2 = 10;
		Integer size3 = 10;
		
		TriangleEnum type = triangleClassifier.classifier(size1, size2, size3);
		assertEquals(TriangleEnum.EQUILATERO, type);
	}
	
	@Test
	public void testIsosceles() {
		Integer size1 = 11;
		Integer size2 = 11;
		Integer size3 = 10;
		
		TriangleEnum type = triangleClassifier.classifier(size1, size2, size3);
		assertEquals(TriangleEnum.ISOSCELES, type);
	}
	
	@Test
	public void testIsosceles2() {
		Integer size1 = 10;
		Integer size2 = 11;
		Integer size3 = 11;
		
		TriangleEnum type = triangleClassifier.classifier(size1, size2, size3);
		assertEquals(TriangleEnum.ISOSCELES, type);
	}
	
	@Test
	public void testIsosceles3() {
		Integer size1 = 11;
		Integer size2 = 10;
		Integer size3 = 11;
		
		TriangleEnum type = triangleClassifier.classifier(size1, size2, size3);
		assertEquals(TriangleEnum.ISOSCELES, type);
	}
	
	@Test
	public void testEscaleno() {
		Integer size1 = 10;
		Integer size2 = 11;
		Integer size3 = 12;
		
		TriangleEnum type = triangleClassifier.classifier(size1, size2, size3);
		assertEquals(TriangleEnum.ESCALENO, type);
	}
	
}
