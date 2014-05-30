package com.epam.news.bo;

import java.util.List;
import java.util.Map;

import com.epam.news.model.News;

public interface INewsBo {
	List<News> findAll();

	void deleteSelected(Map<Integer, Boolean> selectedItems);
	
}
