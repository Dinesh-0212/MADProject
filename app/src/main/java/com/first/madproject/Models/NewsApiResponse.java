package com.first.madproject.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResults;
    List<NewHeadLines> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewHeadLines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewHeadLines> articles) {
        this.articles = articles;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
