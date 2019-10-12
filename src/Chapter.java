import java.util.ArrayList;
import java.util.List;

public class Chapter {
	public String TC;
	
	public Chapter() {}
	public Chapter(String tc) {
		this.TC = tc;
	}
	public String getChapter() {
		return TC;
	}
	public void setChapter(String tC) {
		TC = tC;
	}
	List<SubChapter> sc1 = new ArrayList<SubChapter>();
	
	public int createSubChapter(String string) {
		SubChapter sc = new SubChapter(string);
		sc1.add(sc);
		return sc1.indexOf(sc);
	}
	
	public void addSubChapter(SubChapter chp) {
		sc1.add(chp);
		
	}
	public SubChapter getSubChapter(int indexOfSubChapter) {
		return sc1.get(indexOfSubChapter);
	}
	public String toString() {
		return this.TC;
	}
	
}
