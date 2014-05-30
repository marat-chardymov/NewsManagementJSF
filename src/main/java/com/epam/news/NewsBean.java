package com.epam.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	private Map<Integer, Boolean> selectedItems = new HashMap<Integer, Boolean>();

	public void setNewsBo(INewsBo newsBo) {
		this.newsBo = newsBo;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

	public List<News> getNewsList() {
		return newsBo.findAll();
	}

	public Map<Integer, Boolean> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(Map<Integer, Boolean> selectedItems) {
		this.selectedItems = selectedItems;
	}
	
	public void deleteSelected(){
		System.out.println("asdf");
		newsBo.deleteSelected(selectedItems);
	}

}
