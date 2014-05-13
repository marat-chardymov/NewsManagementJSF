package com.epam.news.dao;

import java.util.List;

import com.epam.news.model.News;

public interface INewsDAO {
//	public void save(News news);
//
//	public News read(int id);
//
//	public void update(News news);
//
//	public void delete(int id);
//
//	public void deleteList(int[] ids);

	public List<News> findAll();
}