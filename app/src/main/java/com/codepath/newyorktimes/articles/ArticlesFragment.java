package com.codepath.newyorktimes.articles;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by dphan on 9/15/17.
 */

public class ArticlesFragment extends Fragment implements ArticlesContract.View {

    private ArticlesContract.Presenter articlesPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setPresenter(@NonNull ArticlesContract.Presenter presenter) {
        articlesPresenter = presenter;
    }
}
