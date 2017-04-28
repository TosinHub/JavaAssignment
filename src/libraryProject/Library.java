package libraryProject;

public class Library {
	
		String LibraryAddress;
		static String OperatingHours = "9am to 5pm daily";
		Book[] books;		
		boolean borrowed;
		int booksNumber;
		
		
		public Library(String address){
			LibraryAddress = address;
			books = new Book[50];
			booksNumber = 0;
		}
		
		
		private  void addBook(Book newlyAdded) {
			books[booksNumber] = newlyAdded;
			booksNumber++;
			
			// TODO Auto-generated method stub
			
		}
		
		public void borrowBook(String title){
			
			for( int j = 0; j < booksNumber; j++)
				if(books[j].getTitle().equals(title))
					if(books[j].isBorrowed()){
					System.out.println("Book is already borrowed");
					return;
					}else{
						System.out.println("You successfully borrowed " + title);
						books[j].borrowed();
						return;						
						
					}
			System.out.println("Book is not on our catalogue");
			
		}
		
	public void returnBook(String title){
		
		for(int j = 0; j<booksNumber; j++)
			if(books[j].getTitle().equals(title))
				if(books[j].isBorrowed()){
					System.out.println("Book successfully returned");
					books[j].returned();
					}else{
						System.out.println("Book not borrowed");
						
					}
				
			
		System.out.println("Book is not on our catalogue");
	}	
		
		
		 
		public static void printOpeningHours(){
			System.out.println(OperatingHours);
			
		}
		
		public void printAddress(){
			System.out.println(LibraryAddress);
			//return LibraryAddress;
		}
		
		private void printAvailableBooks() {
			if(booksNumber == 0)
				System.out.println("We don't have any book in the library");
			for(int j = 0; j< booksNumber; j++)
				if(!books[j].isBorrowed())
					System.out.println(books[j].getTitle());
					
			
			
		}
		
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Library firstLibrary = new Library("10 Main St.");
			Library secondLibrary = new Library("228 Liberty St");
			firstLibrary.addBook(new Book("The Da Vinci Code"));
			firstLibrary.addBook(new Book("Le Petit Prince"));
			firstLibrary.addBook(new Book("The Tale of Two cities"));
			firstLibrary.addBook(new Book("The Lord of the Rings"));
			firstLibrary.addBook(new Book("The Hidden Secret"));
			//System.out.println(firstLibrary.books[1].getTitle());
			
			
			System.out.println("Library Hours");
			Library.printOpeningHours();
			
			System.out.println("Library Address");
			firstLibrary.printAddress();
			secondLibrary.printAddress();
			System.out.println();
			
			firstLibrary.borrowBook("The Lord of the Rings");
			firstLibrary.borrowBook("The Lord of the Rings");
			
			
			secondLibrary.borrowBook("The Lord of the Rings");
			
			System.out.println();
			// Print the titles of all available books from both libraries
			System.out.println("Books available in the first library:");
			firstLibrary.printAvailableBooks();
			System.out.println();
			System.out.println("Books available in the second library:");
			secondLibrary.printAvailableBooks();
			System.out.println();
			
			

		}


		


		

}
