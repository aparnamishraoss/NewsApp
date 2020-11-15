package Sda8.NewsApp.NewsArticle;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;


public class NewsArticle {
@Id
@GeneratedValue
    private Long id ;
    private  String title;
    private String body;
    private String authorName;

    public NewsArticle(long id,String title,String body,String authorName){

        this.id=id;
        this.title= title;
        this.body= body;
        this.authorName= authorName;
    }

    public long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title= title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body){
        this.body= body;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

}
