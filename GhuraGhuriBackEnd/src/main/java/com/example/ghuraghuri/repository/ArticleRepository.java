package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    List<Article> findTop3ByOrderByLikeDesc();
    List<Article> findAllByOrderByLikeDesc();
    List<Article> findById(int id);
    List<Article> findByUserid(int userid);
}
