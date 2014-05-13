package com.epam.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.epam.news.bo.INewsBo;
import com.epam.news.model.News;

@Controller
@ManagedBean(name = "newsBean")
@SessionScoped
public class NewsBean implements Serializable {

	@Autowired
	INewsBo newsBo;

	List<News> newsList = new ArrayList<News>();

	public void setNewsBo(INewsBo newsBo) {
		this.newsBo = newsBo;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

	public List<News> getNewsList() {
		return newsBo.findAll();
	}

}
