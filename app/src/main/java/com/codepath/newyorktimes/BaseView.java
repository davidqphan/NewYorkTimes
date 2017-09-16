package com.codepath.newyorktimes;

/**
 * Created by dphan on 9/15/17.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
