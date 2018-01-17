
public class DocumentStatisticsVisitor implements Visitor {
	Integer sectiuneCounter = 0;
	Integer imagineCounter = 0;
	Integer paragrafCounter = 0;
	Integer tabelCounter = 0;
	void printStatistics() {
		System.out.println("Sectiuni: " + sectiuneCounter + " Imagini: " + imagineCounter + " Paragrafe: " + paragrafCounter + " Tabel: " + tabelCounter);
	}

	public void visitSectiune(Sectiune s) {
		sectiuneCounter++;
	}

	public void visitImageProxy(ImageProxy i) {
		imagineCounter++;
	}

	public void visitImagine(Image i) {
	
	}

	public void visitParagraf(Paragraf p) {
		paragrafCounter++;
	}

	public void visitTabel(Tabel t) {
		tabelCounter++;
	}
}
