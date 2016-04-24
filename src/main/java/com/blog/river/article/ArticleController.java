package com.blog.river.article;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.river.admin.Admin;
import com.blog.river.admin.AdminService;
@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	@RequestMapping("/save")
	  public @ResponseBody String save() {
		Article article = new Article("Bu bir makaledir.","Ýlk baþlýk", new Date());
		try {
			articleService.save(article);
		} catch (Exception e) {
			return e.getMessage();
		}finally {
			return "Kaydedildi!";
		}
	  }
	
	@RequestMapping("/listAllArticles")
	  public @ResponseBody List<Article> listAll() {
		return articleService.findAll();
	  }
	
	@RequestMapping("/delete/{id}")
	  public @ResponseBody String save(@PathVariable("id") Long id) {
		try {
			articleService.deleteArticle(id);
		} catch (Exception e) {
			return e.getMessage();
		}finally {
			return id+" deðerli article silindi!";
		}
	  }
	
}
