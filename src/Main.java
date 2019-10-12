
public class Main {

	public static void main(String[] args) {
		
		Book discatitanic = new Book("Disca Titani");
		Author a1 = new Author("Muresan");
		discatitanic.addAuthor(a1);
		int indexOfChapter = discatitanic.createChapter("Chapter one");
		Chapter chpOne = discatitanic.getChapter(indexOfChapter);
		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
		SubChapter chpOneOne = chpOne.getSubChapter(indexOfSubChapter);
		int indexOfParagraph = chpOneOne.createParagraph("Paragraph");
		int indexOfImage = chpOneOne.createImage("Image");
		int indexOfTable = chpOneOne.createTable("Table1");
		
		System.out.println(discatitanic);
		
		
	}

}
