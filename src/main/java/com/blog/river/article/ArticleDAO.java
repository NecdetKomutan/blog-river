package com.blog.river.article;

import org.springframework.data.repository.CrudRepository;

public interface ArticleDAO extends CrudRepository<Article, Long>{
	public Article findByTitle(String title);
}
