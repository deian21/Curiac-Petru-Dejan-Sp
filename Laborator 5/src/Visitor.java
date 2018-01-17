
public interface Visitor {
	void visitSectiune(Sectiune s);
	void visitImageProxy(ImageProxy i);
	void visitImagine(Image i);
	void visitParagraf(Paragraf i);
	void visitTabel(Tabel t);
}
