class Book {
	
	// Attributes
	private String title;
	private int numberOfPage;
	private String authorName;

	// Constructor
	public Book() {

	}

	// Constructor
	public Book(String title) {
		this.title = title;
	}

	// Constructor
	public Book(String title, int numberOfPage) {
		this.title = title;
		this.numberOfPage = numberOfPage;
	}

	// Constructor
	public Book(String title, int numberOfPage, String authorName) {
		this.title = title;
		this.numberOfPage = numberOfPage;
		this.authorName = authorName;
	}

	// Method
	public void setTitle(String title) {
		this.title = title;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return this.title;
	}

	public int getNumberOfPage() {
		return this.numberOfPage;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public boolean compareBook(Book that) {
		return this.numberOfPage == that.numberOfPage && this.authorName == that.authorName;
	}

}

