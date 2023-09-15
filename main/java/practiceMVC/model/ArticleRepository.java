package practiceMVC.model;

import practiceMVC.util.Util;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ArticleRepository {
    int lastArticleId = 1;
    ArrayList<Article> articles = new ArrayList<>();


    public void insert(String title, String content) {
        Article article = new Article(lastArticleId, title, content, Util.getCurrentDate());
        articles.add(article);
        lastArticleId++;
    }

    public void delete(Article article) {
        //articles.remove(i); // 위치 기반으로 삭제
        articles.remove(article);// 값 기반 삭제
    }

    public ArrayList<Article> findAllArticles() {
        return articles;
    }

    public Article findById(int targetId) {
        Article target = null;
        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);

            if (targetId == article.getId()) {
                target = article;


            }

        }
        return target;
    }


}

