package com.epam.news.bo;

import java.util.List;

import com.epam.news.model.News;

public interface INewsBo {
	List<News> findAll();
}
