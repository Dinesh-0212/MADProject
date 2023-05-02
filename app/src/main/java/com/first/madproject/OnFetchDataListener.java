package com.first.madproject;

import com.first.madproject.Models.NewHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewHeadLines> list,String message);
    void onError(String message);
}
