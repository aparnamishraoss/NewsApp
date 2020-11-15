package Sda8.NewsApp.NewsArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsArticleService {
    @Autowired
    private NewsArticleRepo repo;
    public NewsArticleService(){

    }
    public List<NewsArticle> getAll(){
        return repo.findAll();
    }
    public Optional< NewsArticle> getById(Long id){
        return repo.findById(id);
    }
    public NewsArticle create (NewsArticle newsarticle){
        return repo.save(newsarticle);
    }

    public NewsArticle update (NewsArticle updatedNewsArticle){
        return repo.save(updatedNewsArticle);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
