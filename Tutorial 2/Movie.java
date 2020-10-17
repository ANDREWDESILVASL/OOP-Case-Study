public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAward;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public void setNumAward(int numAward) {
        this.numAward = numAward;
    }

    public int getNumAward() {
        return numAward;
    }
    @Override
    public String toString(){
        return "Movie{" + "title=" + title + ", category=" + category + ", director name=" + director.getName() + ", director surname=" + director.getSurname() + ", number of awards=" + numAward + "}";
    }
}
