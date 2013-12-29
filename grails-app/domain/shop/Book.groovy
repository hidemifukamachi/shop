package shop

class Book {

	String title
	String author
	int pice
	Date releaseDate
	String isbn13
	String imageUrl

    static constraints = {
    	title (blank:false)
    	author (blank:false)
    	price (miniSize:0)
    	releaseDate ()
    	isbn13()
    	imageUrl(Url:true)
    }
}
