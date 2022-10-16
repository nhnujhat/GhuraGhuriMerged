package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Article;
import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.repository.ArticleRepository;
import com.example.ghuraghuri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImplementation implements ArticleService{
    @Autowired
    ArticleRepository repo;

    @Override
    public Article newArticle(Article article) {
        return repo.save(article);
    }

    @Override
    public void deleteArticle(Article article) {
        repo.delete(article);
        return;
    }

    @Override
    public List<Article> getAllArticle() {
        return repo.findAllByOrderByLikeDesc();
    }

    @Override
    public List<Article> getTopArticle() {
        return repo.findTop3ByOrderByLikeDesc();
    }

    @Override
    public List<Article> findArticleById(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Article> findArticleByUserId(int userid) {
        return repo.findByUserid(userid);
    }

    @Override
    public Article updateArticle(Article article) {
            return repo.save(article);
    }
}
