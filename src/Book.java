import java.util.ArrayList;
import java.util.List;

public class Book {
	
	public String Titlu;
	
	public Book() {}
	public Book(String T) {
		this.Titlu= T;
	}
	public String getTitlu() {
		return Titlu;
	}
	public void setTitlu(String titlu) {
		Titlu = titlu;
	}
	List<Author> a1 = new ArrayList<Author>();
	List<Chapter> c1 = new ArrayList<Chapter>();
	
	
	
	public void addAuthor(Author author) {
		a1.add(author);
		
	}
	public Chapter getChapter(int indexOfChapter) {
		return c1.get(indexOfChapter);
	}
	public int createChapter(String string) {
		Chapter chp = new Chapter(string);
		c1.add(chp);
		return c1.indexOf(chp);
	}
	public String toString() {
		return this.Titlu;
	}
}
