package aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private List<String> authors= new ArrayList<String>();
    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public Book(int id,String title,String category, float cost, ArrayList<String> authors){
        super.setId(id);
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
        this.authors=authors;
    }
    public void addAuthor(String authorName){
        if(authors.contains(authorName)){
           System.out.println("author already in Book author list"); 
        } else{authors.add(authorName);}
    }
    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
           authors.remove(authorName);
        } else{System.out.println("author has been remove from Book author list"); }
    }
}
