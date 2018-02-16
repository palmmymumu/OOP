class TestBook {
	
	public static void main(String[] args) {
		Book myBook1 = new Book();
		Book myBook2 = new Book("Java Programming");
		Book myBook3 = new Book("C Programming", 500);

		myBook1.setTitle("OOP");
		myBook1.setNumberOfPage(1000);

		myBook2.setTitle("Network");
		myBook2.setNumberOfPage(600);

		System.out.println("myBook1 (Title = " + myBook1.getTitle() + ", NumberOfPage = " + myBook1.getNumberOfPage() + ")");
		System.out.println("myBook2 (Title = " + myBook2.getTitle() + ", NumberOfPage = " + myBook2.getNumberOfPage() + ")");

		myBook3.setAuthorName("Author");
		Book myBook4 = new Book("C Programming", 500, "Author");

		System.out.println("Compare myBook3 and myBook4 = " + myBook3.compareBook(myBook4));
	}

}