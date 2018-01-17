
public class Test {
	public static void main(String[] args) {
		Element book = new Sectiune("My book");
		DocumentStatisticsVisitor v = new DocumentStatisticsVisitor();
		book.accept(v);
		v.printStatistics();
		
		SaveVisitor s = new SaveVisitor();
		
		Element imagine = new Image("imagine1");
		imagine.save(s);
		
		
	}
}
