public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date DOB;

    public Director(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    @Override
    public String toString(){
        return "Director{" + "name=" + name + ", surname=" + surname + ", DOB=" + DOB + ", movies directed=" + numDirectedMovie + "}";
    }
}
