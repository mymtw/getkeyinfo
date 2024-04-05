package com.paypal.pyplcheckout.navigation.interfaces;

import android.view.ViewGroup;
import java.util.List;

public interface IContentPage extends Identifiable {
    void addViewsToContainer(ContentView contentView, ViewGroup viewGroup);

    void addViewsToContainer(ContentView contentView, ViewGroup viewGroup, int i);

    void addViewsToContainer(List<ContentView> list, ViewGroup viewGroup);

    ContentView getBodyContentViewById(String str);

    List<ContentView> getBodyContentViewsList();

    ContentView getFooterContentViewById(String str);

    List<ContentView> getFooterContentViewsList();

    ContentView getHeaderContentViewById(String str);

    List<ContentView> getHeaderContentViewsList();

    List<ContentView> getTopBannerContentViewsList();

    void removeViewsFromContainer(ContentView contentView, ViewGroup viewGroup);

    void removeViewsFromContainer(List<ContentView> list, ViewGroup viewGroup);

    void setBodyContentViewsList(List<ContentView> list);

    void setFooterContentViewsList(List<ContentView> list);

    void setHeaderContentViewsList(List<ContentView> list);
}
