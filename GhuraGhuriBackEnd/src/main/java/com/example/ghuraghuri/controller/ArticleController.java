package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Article;
import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.repository.ArticleRepository;
import com.example.ghuraghuri.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("/add")
    public String addArticle(@RequestBody Article article){
        articleService.newArticle(article);
        return "New article added";
    }

    @PostMapping("/delete")
    public String deleteArticle(@RequestBody Article article){
        articleService.deleteArticle(article);
        return "Article deleted";
    }

    @GetMapping("/getAllArticles")
    public List<Article> getAllLocations(){
        return articleService.getAllArticle();
    }

    @GetMapping("/getTopArticles")
    public List<Article> getTopLocations(){
        return articleService.getTopArticle();
    }

    @GetMapping("/getById/id")
    public ResponseEntity<List<Article>> getById(@RequestParam int id){
        return new ResponseEntity<List<Article>>(articleService.findArticleById(id), HttpStatus.OK);
    }

    @GetMapping("/getByUserId/userid")
    public ResponseEntity<List<Article>> getByUserId(@RequestParam int userid){
        return new ResponseEntity<List<Article>>(articleService.findArticleByUserId(userid), HttpStatus.OK);
    }

    @PostMapping("/updateLike")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        List<Article> articles = articleService.findArticleById(article.getId());
        articles.get(0).setLike(article.getLike());
        final Article updatedArticle = articleService.updateArticle(articles.get(0));
        return ResponseEntity.ok(updatedArticle);
    }

    @PostMapping("/updateDislike")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Article> updateArticleDislike(@RequestBody Article article){
        List<Article> articles = articleService.findArticleById(article.getId());
        articles.get(0).setDislike(article.getDislike());
        final Article updatedArticle = articleService.updateArticle(articles.get(0));
        return ResponseEntity.ok(updatedArticle);
    }


}
