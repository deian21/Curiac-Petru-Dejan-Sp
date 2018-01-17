import java.util.Vector;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
class Sectiune implements Element {
	String titlu;
	Vector<Element> continut = new Vector<Element>();
	AlignStrategy align;
	
	Sectiune() { }
	Sectiune(String titlu) {
		this.titlu = titlu;
	}

	public String getTitlu() {
		return titlu;
	}

//	@XmlElement
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

//	@XmlElement
	public Vector<Element> getContinut() {
		return continut;
	}

	public void setContinut(Vector<Element> continut) {
		this.continut = continut;
	}
	public void add(Element e) {
		continut.add(e);
	}
	public Element getElement(int i) {
		return continut.get(i);
	}
	public void remove(Element e) {
		continut.remove(e);
		
	}
	public Vector<Element> getElement() {
		return continut;
	}
	public void print() {
		System.out.println(titlu);
		for(Element e: continut) {
			e.print();
		}
	}
	public void setAlign(AlignStrategy align) {
		this.align = align;
	}

	public void accept(Visitor v) {
		v.visitSectiune(this);
		for(Element e: continut) {
			e.accept(v);
		}
		
	}

	public void save(Visitor v) {
		v.visitSectiune(this);
		
	}
}
