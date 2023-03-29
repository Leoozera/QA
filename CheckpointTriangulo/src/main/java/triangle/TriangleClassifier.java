package triangle;

public class TriangleClassifier {
		
	public TriangleEnum classifier(Integer size1, Integer size2, Integer size3) {
		
		if(size1 == size2 && size1 == size3) {
			return TriangleEnum.EQUILATERO;
		}
		
		if(size1 != size2 && size1 == size3 || size1 == size2 && size1 !=size3 || size2 == size3 && size2 != size1) {
			return TriangleEnum.ISOSCELES;
		}
		
		return TriangleEnum.ESCALENO;	
	}
	
	
}
