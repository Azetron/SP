import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	public String T;
	
	public SubChapter() {}
	public SubChapter(String t) {
		this.T=t;
	}
	public String getSubChapter() {
		return T;
	}
	public void setSubChapter(String t) {
		T = t;
	}
	List<Paragraph> p1 = new ArrayList<Paragraph>();
	List<Image> i1 = new ArrayList<Image>();
	List<Table> t1 = new ArrayList<Table>();
	
	public void addParagraph(Paragraph paragraph) {
		p1.add(paragraph);
		
	}
	public void addImage(Image image) {
		i1.add(image);
		
	}
	public void addTable(Table table) {
		t1.add(table);
	}
	public int createParagraph(String string) {
		Paragraph p = new Paragraph(string);
		p1.add(p);
		return p1.indexOf(p);
	}
	
	public int createImage(String string) {
		Image i = new Image(string);
		i1.add(i);
		return i1.indexOf(i);
	}
	
	public int createTable(String string) {
		Table t = new Table(string);
		t1.add(t);
		return t1.indexOf(t);
	}
	public Paragraph getParagraph(int index) {
		return p1.get(index);
	}
	public Image getImage(int index) {
		return i1.get(index);
	}
	public Table getTable(int index) {
		return t1.get(index);
	}
	public void print() {
		System.out.println("SubChapter : "+T);
		for(Paragraph p : p1) {
			System.out.println("Paragraph : "+p);
		}
		for(Image i : i1) {
			System.out.println("Image : "+i);
		}
		for(Table t : t1) {
			System.out.println("Table : "+t);
		}
	}
}
