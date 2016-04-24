package com.blog.river.article;

import java.util.List;

import com.blog.river.admin.Admin;

public interface ArticleService {
	public Article findByTitle(String title);
	public Article save(Article article);
	public List<Article> findAll();
	public void deleteArticle(Long id);
}