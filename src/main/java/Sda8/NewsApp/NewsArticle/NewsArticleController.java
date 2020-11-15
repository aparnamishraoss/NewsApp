package Sda8.NewsApp.NewsArticle;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;

@RestController
 public class NewsArticleController {
    //  private List<NewsArticle> newsarticle;

    @Autowired
    private NewsArticleService newsService;

    public NewsArticleController(){
    this.newsService =new NewsArticleService();

}

     //public NewsArticleController(){
       // this.newsarticle = new ArrayList<>();

       // newsarticle.add(new NewsArticle(1L,"Pride and Prejudice","he romantic novel based on manners","Jane Austin"));
       // newsarticle.add(new NewsArticle(2L,"Rich Dad Poor Dad","A good book to learn financial management","JRobert T. Kiyosaki"));
       // newsarticle.add(new NewsArticle(3L,"The Two states","The romantic story of a boy and girl from different culture","Chetan Bhagat"));
       // newsarticle.add(new NewsArticle(4L,"The fault in our stars","The romantic novel teaches that every life should be a full life","John Green"));


    @GetMapping("/newsarticle")

    public List<NewsArticle> getAll() {

        return newsService.getAll();

    }
    @GetMapping("/newsarticle/{id}")
    public NewsArticle getById(@PathVariable Long id){
         return newsService.getById(id)
                .orElseThrow (()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/newsArticle")
    public NewsArticle create (@RequestBody NewsArticle newsArticle){
        return newsService.create(newsArticle);
    }
    @PutMapping("/newsArticle/{id}")
    public NewsArticle update(@RequestBody NewsArticle newsArticle){
        return newsService.update(newsArticle);
    }
    @DeleteMapping("/newsArticle/{id}")
    public void delete(@PathVariable Long id){
        newsService.delete(id);
    }
}











