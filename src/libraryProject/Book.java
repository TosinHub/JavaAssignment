package libraryProject;

public class Book {
	String title;
	boolean borrowed;
	
	public Book(String bookTitle){
		this.title = bookTitle;

}
	public void borrowed(){
		borrowed = true;
	}
	
	public void returned(){
		
		borrowed = false;
	}
	
	public boolean isBorrowed(){
		return borrowed;
		
		
	}
	
	public String getTitle(){
		return title;
		
	}
	
	public static void main(String[] args){
		Book example = new Book("The Da Vinci Code");
		System.out.println("The title of the book is " + example.getTitle());
		System.out.println("Borrowed status: " + example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed status: " + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed status: " + example.isBorrowed());
		example.addbook(new Book("The Lord is good"));
		System.out.println("The title of the book is " + example.getTitle());
		
		
		
	}
	private void addbook(Book book) {
		// TODO Auto-generated method stub
		
		
	}
	
}
