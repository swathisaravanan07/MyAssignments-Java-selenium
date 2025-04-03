package week1.day2;

public class Library {

	
	public static void main(String[] args) {
		
		Library lib=new Library();
		lib.addBook("The Great Gatsby");
		lib.issueBook();}
	
	//Method - add book
	public String addBook(String bookTitle) 
	{
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	
	//Method - issue book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

}

class LibraryManagement{
public static void main(String[] args) {
	Library lib=new Library();
	lib.addBook("Fairy tale");
	lib.issueBook();
}
	
}
