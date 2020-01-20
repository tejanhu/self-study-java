public class Film{
    String title;
    String id;
    String rating;
    String year;



    public void setId(String id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getId(){
        return id;
    }


    public String getTitle(){
        return title;
    }

    public String getRating(){
        return rating;
    }

    public String getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Film [id: " + id + ", title:" + title + ", year:"+ year + " ,rating:" + rating +"]";
    }
 

}