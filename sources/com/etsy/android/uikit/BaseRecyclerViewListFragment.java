package com.etsy.android.uikit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.C11897c;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.List;

public abstract class BaseRecyclerViewListFragment<T> extends TrackingBaseFragment implements SwipeRefreshLayout.C3293j {
    public C11829a<T> adapter;
    public Button emptyButton;
    public ImageView emptyImage;
    public TextView emptySubtext;
    public TextView emptyText;
    public View emptyView;
    public LinearLayout emptyViewContainer;
    public View errorView;
    private boolean isLoading;
    private boolean isRefreshing;
    public View loadingView;
    public RecyclerView recyclerView;
    public SwipeRefreshLayout swipeRefreshLayout;

    /* renamed from: com.etsy.android.uikit.BaseRecyclerViewListFragment$a */
    public class C11821a extends TrackingOnClickListener {
        public C11821a() {
        }

        public final void onViewClick(View view) {
            BaseRecyclerViewListFragment.this.onRetry();
        }
    }

    private void hideLoadingOnFailure() {
        setLoading(false);
        if (this.isRefreshing) {
            setRefreshing(false);
        }
    }

    private void showErrorViewWithoutRetry() {
        Button button;
        showErrorView();
        View view = this.errorView;
        if (view != null && (button = (Button) view.findViewById(R.id.btn_retry_internet)) != null) {
            button.setVisibility(8);
        }
    }

    public boolean canLoadContent() {
        return !this.isLoading;
    }

    public RecyclerView.C3100o createLayoutManager() {
        getActivity();
        return new LinearLayoutManager();
    }

    public int getLayoutId() {
        return R.layout.fragment_baserecyclerview;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void initEmptyStateViews(View view) {
        this.emptyView = view.findViewById(R.id.empty_view);
        this.emptyViewContainer = (LinearLayout) view.findViewById(R.id.empty_layout);
        this.emptyText = (TextView) view.findViewById(R.id.empty_view_text);
        this.emptySubtext = (TextView) view.findViewById(R.id.empty_view_subtext);
        this.emptyButton = (Button) view.findViewById(R.id.empty_button);
        this.emptyImage = (ImageView) view.findViewById(R.id.empty_image);
        this.errorView = view.findViewById(R.id.no_internet);
        this.loadingView = view.findViewById(R.id.loading_view);
        View findViewById = this.errorView.findViewById(R.id.btn_retry_internet);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C11821a());
        }
    }

    public boolean isEmpty() {
        return this.adapter.getDataItemCount() == 0;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final void loadContent() {
        if (canLoadContent()) {
            onPreLoadContent();
            setLoading(true);
            onLoadContent();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.swipeRefreshLayout = swipeRefreshLayout2;
        swipeRefreshLayout2.setOnRefreshListener(this);
        this.swipeRefreshLayout.setColorSchemeResources(R.color.clg_color_black);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.recyclerView = recyclerView2;
        recyclerView2.setLayoutManager(createLayoutManager());
        this.recyclerView.setAdapter(this.adapter);
        initEmptyStateViews(inflate);
        return inflate;
    }

    public void onDestroyView() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        }
        this.emptyView = null;
        this.emptyViewContainer = null;
        this.errorView = null;
        this.loadingView = null;
        this.recyclerView = null;
        this.swipeRefreshLayout = null;
        super.onDestroyView();
    }

    public abstract void onLoadContent();

    public void onLoadFailure() {
        hideLoadingOnFailure();
        showErrorView();
    }

    public void onLoadSuccess(List<T> list, int i) {
        setLoading(false);
        if (this.isRefreshing) {
            setRefreshing(false);
            this.adapter.clearData();
        }
        this.adapter.addItems(list);
        if (isEmpty()) {
            showEmptyView();
        } else {
            showListView();
        }
    }

    public void onPreLoadContent() {
        if (!this.isRefreshing) {
            showLoadingView();
        }
    }

    public void onRefresh() {
        if (!this.isRefreshing) {
            setRefreshing(true);
            refreshContent();
        }
    }

    public void onRetry() {
        loadContent();
    }

    public final void popOrGoBack() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (activity instanceof C11897c) {
            ((C11897c) activity).popBackstack();
        } else if (activity.getSupportFragmentManager().mo10355E() <= 0) {
            activity.finish();
            if (activity.getIntent() != null) {
                activity.overridePendingTransition(activity.getIntent().getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0), activity.getIntent().getIntExtra("NAV_ANIM_TOP_EXIT", 0));
            }
        } else {
            activity.getSupportFragmentManager().mo10363P();
        }
    }

    public void refreshContent() {
        loadContent();
    }

    public void setEmptyView(View view) {
        ViewGroup viewGroup = (ViewGroup) this.emptyView.getParent();
        int indexOfChild = viewGroup.indexOfChild(this.emptyView);
        viewGroup.removeView(this.emptyView);
        viewGroup.addView(view, indexOfChild);
        this.emptyView = view;
    }

    public void setLoading(boolean z) {
        this.isLoading = z;
    }

    public void setRefreshing(boolean z) {
        this.isRefreshing = z;
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(z);
        }
    }

    public void showEmptyView() {
        View view = this.emptyView;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.loadingView;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    public void showErrorView() {
        View view = this.emptyView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.loadingView;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    public void showListView() {
        View view = this.emptyView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.loadingView;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
    }

    public void showLoadingView() {
        View view = this.emptyView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.loadingView;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    public void onLoadFailure(int i) {
        if (i == 502 || i == 503) {
            hideLoadingOnFailure();
            showErrorViewWithoutRetry();
            return;
        }
        onLoadFailure();
    }
}
