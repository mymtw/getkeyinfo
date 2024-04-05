package com.etsy.android.p327ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p251u1.C8115a;

@Deprecated
/* renamed from: com.etsy.android.ui.EtsyCommonListFragment */
public abstract class EtsyCommonListFragment extends EtsyListFragment {
    private Button mBtnRetry;
    private BroadcastReceiver mCurrencyUpdateListener;
    private Button mEmptyButton;
    private ImageView mEmptyImage;
    private TextView mEmptySubtext;
    public TextView mEmptyText;
    public View mEmptyView;
    public View mErrorView;
    private Animation mFadeAnimation;
    private boolean mIsEmptyViewShowing;
    private boolean mIsErrorViewShowing;
    private boolean mIsListViewShowing;
    private boolean mIsLoadingViewShowing;
    private final int mLayoutResourceId;
    public ListView mListView;
    public View mLoadingView;
    private View.OnClickListener mOnRetryClickListener;
    public boolean mWillCurrencyRefresh;

    /* renamed from: com.etsy.android.ui.EtsyCommonListFragment$a */
    public class C9081a extends BroadcastReceiver {
        public C9081a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.etsy.android.CURRENCY_UPDATED")) {
                EtsyCommonListFragment.this.onRetryClicked();
                C8901g0.m17337c(context, R.string.currency_updating_preference);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.EtsyCommonListFragment$b */
    public class C9082b extends TrackingOnClickListener {
        public C9082b() {
        }

        public final void onViewClick(View view) {
            EtsyCommonListFragment.this.onRetryClicked();
        }
    }

    public EtsyCommonListFragment(int i) {
        this.mWillCurrencyRefresh = false;
        this.mCurrencyUpdateListener = new C9081a();
        this.mOnRetryClickListener = new C9082b();
        this.mLayoutResourceId = i;
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    public Animation getFadeAnimation() {
        return this.mFadeAnimation;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void hideAllViews() {
        this.mListView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
        this.mErrorView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
    }

    public void hideRetryButton() {
        this.mBtnRetry.setVisibility(8);
    }

    public void onCreateCommonViews(View view) {
        this.mEmptyView = view.findViewById(R.id.empty_view);
        this.mEmptyText = (TextView) view.findViewById(R.id.empty_view_text);
        this.mEmptySubtext = (TextView) view.findViewById(R.id.empty_view_subtext);
        this.mEmptyButton = (Button) view.findViewById(R.id.empty_button);
        this.mEmptyImage = (ImageView) view.findViewById(R.id.empty_image);
        this.mErrorView = view.findViewById(R.id.no_internet);
        Button button = (Button) view.findViewById(R.id.btn_retry_internet);
        this.mBtnRetry = button;
        button.setOnClickListener(this.mOnRetryClickListener);
        this.mLoadingView = view.findViewById(R.id.loading_view);
        this.mFadeAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
    }

    public void onCreateListView(View view) {
        this.mListView = (ListView) view.findViewById(16908298);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.mLayoutResourceId, (ViewGroup) null);
        onCreateListView(inflate);
        onCreateCommonViews(inflate);
        return inflate;
    }

    public void onRetryClicked() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mIsListViewShowing = false;
        this.mIsEmptyViewShowing = false;
        this.mIsLoadingViewShowing = false;
        this.mIsErrorViewShowing = false;
        ListView listView = this.mListView;
        if (listView == null || listView.getVisibility() != 0) {
            View view = this.mEmptyView;
            if (view == null || view.getVisibility() != 0) {
                View view2 = this.mLoadingView;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.mErrorView;
                    if (view3 != null && view3.getVisibility() == 0) {
                        this.mIsListViewShowing = false;
                        this.mIsEmptyViewShowing = false;
                        this.mIsLoadingViewShowing = false;
                        this.mIsErrorViewShowing = true;
                        return;
                    }
                    return;
                }
                this.mIsListViewShowing = false;
                this.mIsEmptyViewShowing = false;
                this.mIsLoadingViewShowing = true;
                this.mIsErrorViewShowing = false;
                return;
            }
            this.mIsListViewShowing = false;
            this.mIsEmptyViewShowing = true;
            this.mIsLoadingViewShowing = false;
            this.mIsErrorViewShowing = false;
            return;
        }
        this.mIsListViewShowing = true;
        this.mIsEmptyViewShowing = false;
        this.mIsLoadingViewShowing = false;
        this.mIsErrorViewShowing = false;
    }

    public void onStart() {
        super.onStart();
        if (this.mWillCurrencyRefresh) {
            C8115a.m16322a(this.mActivity).mo20708b(this.mCurrencyUpdateListener, new IntentFilter("com.etsy.android.CURRENCY_UPDATED"));
        }
    }

    public void onStop() {
        super.onStop();
        if (this.mWillCurrencyRefresh) {
            C8115a.m16322a(this.mActivity).mo20710d(this.mCurrencyUpdateListener);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.mIsListViewShowing) {
            showListView();
        } else if (this.mIsEmptyViewShowing) {
            showEmptyView();
        } else if (this.mIsLoadingViewShowing) {
            showLoadingView();
        } else if (this.mIsErrorViewShowing) {
            showErrorView();
        }
    }

    public void setEmptyButtonTextAndClick(int i, View.OnClickListener onClickListener) {
        this.mEmptyButton.setVisibility(0);
        this.mEmptyButton.setText(i);
        this.mEmptyButton.setOnClickListener(onClickListener);
    }

    public void setEmptyButtonVisibility(boolean z) {
        this.mEmptyButton.setVisibility(z ? 0 : 8);
    }

    public void setEmptyImage(int i) {
        this.mEmptyImage.setImageResource(i);
    }

    public void setEmptyImageVisibility(boolean z) {
        this.mEmptyImage.setVisibility(z ? 0 : 8);
    }

    public void setEmptySubtext(int i) {
        this.mEmptySubtext.setVisibility(0);
        this.mEmptySubtext.setText(i);
    }

    public void setEmptySubtextVisibility(boolean z) {
        this.mEmptySubtext.setVisibility(z ? 0 : 8);
    }

    public void setEmptyText(int i) {
        this.mEmptyText.setText(i);
    }

    public void showEmptyView() {
        this.mListView.setVisibility(8);
        this.mErrorView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
        this.mEmptyView.setVisibility(0);
    }

    public void showErrorView() {
        this.mListView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
        this.mErrorView.setVisibility(0);
        this.mLoadingView.setVisibility(8);
    }

    public void showListView() {
        if (this.mListView.getVisibility() != 0) {
            this.mListView.startAnimation(this.mFadeAnimation);
        }
        this.mListView.setVisibility(0);
        this.mErrorView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
    }

    public void showLoadingView() {
        this.mListView.setVisibility(8);
        this.mErrorView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
        this.mLoadingView.setVisibility(0);
    }

    public void setEmptyText(CharSequence charSequence) {
        this.mEmptyText.setText(charSequence);
    }

    public EtsyCommonListFragment() {
        this.mWillCurrencyRefresh = false;
        this.mCurrencyUpdateListener = new C9081a();
        this.mOnRetryClickListener = new C9082b();
        this.mLayoutResourceId = R.layout.fragment_list;
    }
}
