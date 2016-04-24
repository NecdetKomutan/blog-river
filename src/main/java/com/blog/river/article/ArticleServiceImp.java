package com.blog.river.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArticleServiceImp implements ArticleService{

	@Autowired
	ArticleDAO articleDAO;
	
	
	
	@Override
	public Article save(Article article) {
		
		return articleDAO.save(article);
	}

	@Override
	public List<Article> findAll() {

		return (List<Article>) articleDAO.findAll();
	}

	@Override
	public Article findByTitle(String title) {
		return articleDAO.findByTitle(title);
	}
	
}
