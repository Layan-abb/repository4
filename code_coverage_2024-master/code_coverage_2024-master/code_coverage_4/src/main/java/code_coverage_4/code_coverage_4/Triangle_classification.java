package code_coverage_4.code_coverage_4;

public class Triangle_classification {
	enum Triangle_Types{
		equilateral,
		isosceles,
		scalene,
		nottriangle,
	Error
	}
	
	public static String classifyTriangle(int a, int b, int c) {
		Triangle_Types triangle = Triangle_Types.nottriangle;
		if(c<a+b){
			if (b<a+c) {
				if (a<b+c) {
					if(a==b) {
						if(b==c){
							triangle=Triangle_Types.equilateral;
							return triangle.toString();}}
					if(a==b) {
						triangle=Triangle_Types.isosceles;
					}
					else if(b==c) {
						triangle=Triangle_Types.isosceles;
					}
					else if(a==c) {
						triangle=Triangle_Types.isosceles;}
					else {
						triangle=Triangle_Types.scalene;
						return triangle.toString();
					}}}}
		return triangle.toString();
	}
	
}