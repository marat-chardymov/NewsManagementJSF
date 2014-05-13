package com.epam.news.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.news.bo.INewsBo;
import com.epam.news.dao.INewsDAO;
import com.epam.news.model.News;

@Component
public class NewsBoImpl implements INewsBo{
	
	@Autowired
	INewsDAO newsDAO;	

	public INewsDAO getNewsDAO() {
		return newsDAO;
	}
	public void setNewsDAO(INewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
	
	@Override
	public List<News> findAll() {
		return newsDAO.findAll();
	}
}