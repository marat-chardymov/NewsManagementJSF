package com.epam.news.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.epam.news.dao.INewsDAO;
import com.epam.news.model.News;

@Repository
@Transactional
public class JPANewsDAO implements INewsDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<News> findAll() {
        Query query = em.createNamedQuery("FIND_ALL");
        return query.getResultList();
    }
}