import java.util.Vector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ImageProxy implements Element {
	private String fileName;
	private Image realImage = null;
	
	ImageProxy() { }
	ImageProxy(String fileName, Image realImage) {
		this.fileName = fileName;
		this.realImage = realImage;
	}
	
	public String getFileName() {
		return fileName;
	}

	@XmlElement
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Image getRealImage() {
		return realImage;
	}

	@XmlElement
	public void setRealImage(Image realImage) {
		this.realImage = realImage;
	}


	public void print() {
		if (realImage == null) {
			realImage = new Image(fileName);
		}
		realImage.print();
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Element> getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void accept(Visitor v) {
		v.visitImageProxy(this);
	}

	public void save(Visitor v) {
		v.visitImageProxy(this);
	}
	
}
