package com.laioffer.tinnews.repository;

import android.content.Context;

import com.laioffer.tinnews.network.NewsApi;
import com.laioffer.tinnews.network.RetrofitClient;

public class NewsRepository {

    private final NewsApi newsApi;

    public NewsRepository(Context context) {
        newsApi = RetrofitClient.newInstance(context).create(NewsApi.class);
    }
}

