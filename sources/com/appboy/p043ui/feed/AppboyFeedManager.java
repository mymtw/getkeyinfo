package com.appboy.p043ui.feed;

import com.appboy.p043ui.feed.listeners.AppboyDefaultFeedClickActionListener;
import com.appboy.p043ui.feed.listeners.IFeedClickActionListener;

/* renamed from: com.appboy.ui.feed.AppboyFeedManager */
public class AppboyFeedManager {
    private static volatile AppboyFeedManager sInstance;
    private IFeedClickActionListener mCustomFeedClickActionListener;
    private final IFeedClickActionListener mDefaultFeedClickActionListener = new AppboyDefaultFeedClickActionListener();

    public static AppboyFeedManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyFeedManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyFeedManager();
                }
            }
        }
        return sInstance;
    }

    public IFeedClickActionListener getFeedCardClickActionListener() {
        IFeedClickActionListener iFeedClickActionListener = this.mCustomFeedClickActionListener;
        return iFeedClickActionListener != null ? iFeedClickActionListener : this.mDefaultFeedClickActionListener;
    }

    public void setFeedCardClickActionListener(IFeedClickActionListener iFeedClickActionListener) {
        this.mCustomFeedClickActionListener = iFeedClickActionListener;
    }
}
