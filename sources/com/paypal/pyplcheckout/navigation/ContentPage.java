package com.paypal.pyplcheckout.navigation;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.IContentPage;
import java.util.List;

public class ContentPage implements IContentPage {
    public static final String TAG = "ContentPage";
    public List<ContentView> bodyContentViewsList;
    public List<ContentView> footerContentViewsList;
    public List<ContentView> headerContentViewsList;
    public List<ContentView> topBannerContentViewList;

    public ContentPage() {
    }

    private ContentView getContentViewById(String str, List<ContentView> list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (ContentView next : list) {
                if (next != null && TextUtils.equals(next.getViewId(), str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public void addViewsToContainer(List<ContentView> list, ViewGroup viewGroup) {
        if (viewGroup != null && list != null) {
            for (ContentView next : list) {
                if (next != null) {
                    addViewsToContainer(next, viewGroup);
                }
            }
        }
    }

    public ContentView getBodyContentViewById(String str) {
        return getContentViewById(str, this.bodyContentViewsList);
    }

    public List<ContentView> getBodyContentViewsList() {
        return this.bodyContentViewsList;
    }

    public ContentView getFooterContentViewById(String str) {
        return getContentViewById(str, this.footerContentViewsList);
    }

    public List<ContentView> getFooterContentViewsList() {
        return this.footerContentViewsList;
    }

    public ContentView getHeaderContentViewById(String str) {
        return getContentViewById(str, this.headerContentViewsList);
    }

    public List<ContentView> getHeaderContentViewsList() {
        return this.headerContentViewsList;
    }

    public List<ContentView> getTopBannerContentViewsList() {
        return this.topBannerContentViewList;
    }

    public String getViewId() {
        return TAG;
    }

    public void removeViewsFromContainer(List<ContentView> list, ViewGroup viewGroup) {
        if (viewGroup != null && list != null) {
            for (ContentView next : list) {
                if (next != null) {
                    removeViewsFromContainer(next, viewGroup);
                }
            }
        }
    }

    public void setBodyContentViewsList(List<ContentView> list) {
        this.bodyContentViewsList = list;
    }

    public void setFooterContentViewsList(List<ContentView> list) {
        this.footerContentViewsList = list;
    }

    public void setHeaderContentViewsList(List<ContentView> list) {
        this.headerContentViewsList = list;
    }

    public ContentPage(List<ContentView> list, List<ContentView> list2, List<ContentView> list3, List<ContentView> list4) {
        this.topBannerContentViewList = list;
        this.headerContentViewsList = list2;
        this.bodyContentViewsList = list3;
        this.footerContentViewsList = list4;
    }

    public void addViewsToContainer(ContentView contentView, ViewGroup viewGroup) {
        if (viewGroup != null && contentView != null) {
            viewGroup.addView(contentView.getView((GenericViewData) null));
        }
    }

    public void removeViewsFromContainer(ContentView contentView, ViewGroup viewGroup) {
        if (contentView != null && viewGroup != null) {
            viewGroup.removeView(contentView.getView((GenericViewData) null));
        }
    }

    public void addViewsToContainer(ContentView contentView, ViewGroup viewGroup, int i) {
        if (viewGroup != null && contentView != null && i >= 0) {
            viewGroup.addView(contentView.getView((GenericViewData) null), i);
        }
    }
}
