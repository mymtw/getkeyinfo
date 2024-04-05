package com.appboy.p043ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.C2300f;
import androidx.room.C3252r;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.p043ui.adapters.AppboyListAdapter;
import com.braze.Braze;
import com.braze.C5416d;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginStatusClient;
import java.util.ArrayList;
import java.util.EnumSet;
import p301z3.C8434d;

/* renamed from: com.appboy.ui.AppboyXamarinFormsFeedFragment */
public class AppboyXamarinFormsFeedFragment extends ListFragment implements SwipeRefreshLayout.C3293j {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    private static final int MAX_FEED_TTL_SECONDS = 60;
    private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String TAG = BrazeLogger.m11287i(AppboyXamarinFormsFeedFragment.class);
    /* access modifiers changed from: private */
    public int currentCardIndexAtBottomOfScreen;
    /* access modifiers changed from: private */
    public AppboyListAdapter mAdapter;
    private C5416d mBraze;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout mFeedSwipeLayout;
    private C8434d<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private C2300f mGestureDetector;
    /* access modifiers changed from: private */
    public ProgressBar mLoadingSpinner;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public LinearLayout mNetworkErrorLayout;
    private final Runnable mShowNetworkError = new Runnable() {
        public void run() {
            if (AppboyXamarinFormsFeedFragment.this.mLoadingSpinner != null) {
                AppboyXamarinFormsFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (AppboyXamarinFormsFeedFragment.this.mNetworkErrorLayout != null) {
                AppboyXamarinFormsFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    private boolean mSkipCardImpressionsReset;
    private View mTransparentFullBoundsContainerView;
    /* access modifiers changed from: private */
    public int previousVisibleHeadCardIndex;

    /* renamed from: com.appboy.ui.AppboyXamarinFormsFeedFragment$FeedGestureListener */
    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            long eventTime = (motionEvent2.getEventTime() - motionEvent.getEventTime()) * 2;
            AppboyXamarinFormsFeedFragment.this.getListView().smoothScrollBy(-((int) ((f2 * ((float) eventTime)) / 1000.0f)), (int) (eventTime * 2));
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AppboyXamarinFormsFeedFragment.this.getListView().smoothScrollBy((int) f2, 0);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onActivityCreated$0(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.mo8896a(motionEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onActivityCreated$1(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$2(FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        String str = TAG;
        BrazeLogger.m11285g(str, "Updating feed views in response to FeedUpdatedEvent: " + feedUpdatedEvent);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkError);
        this.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            listView.setVisibility(8);
            this.mAdapter.clear();
        } else {
            this.mEmptyFeedLayout.setVisibility(8);
            this.mLoadingSpinner.setVisibility(8);
            this.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < System.currentTimeMillis()) {
            BrazeLogger.m11288j(str, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
            this.mBraze.mo15493f();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                BrazeLogger.m11285g(str, "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                this.mMainThreadLooper.postDelayed(this.mShowNetworkError, LoginStatusClient.DEFAULT_TOAST_DURATION_MS);
                return;
            }
        }
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            this.mLoadingSpinner.setVisibility(8);
            this.mEmptyFeedLayout.setVisibility(0);
            this.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$3(ListView listView, FeedUpdatedEvent feedUpdatedEvent) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C4954i(this, 0, feedUpdatedEvent, listView));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$4() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.previousVisibleHeadCardIndex, this.currentCardIndexAtBottomOfScreen);
    }

    public EnumSet<CardCategory> getCategories() {
        return this.mCategories;
    }

    @SuppressLint({"InflateParams"})
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            BrazeLogger.m11285g(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        ListView listView = getListView();
        listView.addHeaderView(from.inflate(C4940R.C4943layout.com_appboy_feed_header, (ViewGroup) null));
        listView.addFooterView(from.inflate(C4940R.C4943layout.com_appboy_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new C4951f(this, 0));
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                AppboyXamarinFormsFeedFragment.this.mFeedSwipeLayout.setEnabled(i == 0);
                if (i2 != 0) {
                    int i4 = i - 1;
                    if (i4 > AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex) {
                        AppboyXamarinFormsFeedFragment.this.mAdapter.batchSetCardsToRead(AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex, i4);
                    }
                    int unused = AppboyXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex = i4;
                    int unused2 = AppboyXamarinFormsFeedFragment.this.currentCardIndexAtBottomOfScreen = i + i2;
                }
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new C4952g(0));
        this.mBraze.mo15491d(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        C4953h hVar = new C4953h(this, listView);
        this.mFeedUpdatedSubscriber = hVar;
        this.mBraze.mo15488a(hVar);
        listView.setAdapter(this.mAdapter);
        this.mBraze.mo15489b();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.mBraze = Braze.f11170m.mo15515f(context);
        if (this.mAdapter == null) {
            this.mAdapter = new AppboyListAdapter(context, C4940R.C4942id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        setRetainInstance(true);
        this.mGestureDetector = new C2300f(context, new FeedGestureListener());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4940R.C4943layout.com_appboy_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(C4940R.C4942id.com_appboy_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(C4940R.C4942id.com_appboy_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(C4940R.C4942id.com_appboy_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(C4940R.C4942id.com_appboy_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C4940R.C4942id.appboy_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(C4940R.color.com_appboy_newsfeed_swipe_refresh_color_1, C4940R.color.com_appboy_newsfeed_swipe_refresh_color_2, C4940R.color.com_appboy_newsfeed_swipe_refresh_color_3, C4940R.color.com_appboy_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(C4940R.C4942id.com_appboy_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mBraze.mo15491d(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    public void onDetach() {
        super.onDetach();
        setListAdapter((ListAdapter) null);
    }

    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    public void onRefresh() {
        this.mBraze.mo15493f();
        this.mMainThreadLooper.postDelayed(new C3252r(this, 1), AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS);
    }

    public void onResume() {
        super.onResume();
        Braze.m10643o(getActivity()).mo15502r();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    public void setCategories(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.m11288j(TAG, "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.");
            this.mCategories = CardCategory.getAllCategories();
        } else if (enumSet.isEmpty()) {
            BrazeLogger.m11292n(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
            return;
        } else if (!enumSet.equals(this.mCategories)) {
            this.mCategories = enumSet;
        } else {
            return;
        }
        C5416d dVar = this.mBraze;
        if (dVar != null) {
            dVar.mo15489b();
        }
    }

    public void setCategory(CardCategory cardCategory) {
        setCategories(EnumSet.of(cardCategory));
    }
}
