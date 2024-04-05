package com.etsy.android.uikit;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import java.util.List;
import p415of.C13181j;
import p628nj.C18263b;

public abstract class EndlessRecyclerViewListFragment<T> extends BaseRecyclerViewListFragment<T> implements C13181j {
    private static final String KEY_CONTENT_EXHAUSTED = "key_content_exhausted";
    private static final String KEY_OFFSET = "key_offset";
    private boolean mIsContentExhausted;
    private int mOffset;
    private TransactionViewModel<Bundle> transactionViewModel;

    /* renamed from: com.etsy.android.uikit.EndlessRecyclerViewListFragment$a */
    public class C11823a implements Runnable {
        public C11823a() {
        }

        public final void run() {
            EndlessRecyclerViewListFragment.this.adapter.addFooter(503);
        }
    }

    /* renamed from: com.etsy.android.uikit.EndlessRecyclerViewListFragment$b */
    public class C11824b implements Runnable {
        public C11824b() {
        }

        public final void run() {
            EndlessRecyclerViewListFragment.this.adapter.removeFooter(503);
        }
    }

    /* renamed from: com.etsy.android.uikit.EndlessRecyclerViewListFragment$c */
    public class C11825c implements Runnable {
        public C11825c() {
        }

        public final void run() {
            EndlessRecyclerViewListFragment.this.adapter.addFooter(502);
        }
    }

    /* renamed from: com.etsy.android.uikit.EndlessRecyclerViewListFragment$d */
    public class C11826d implements Runnable {
        public C11826d() {
        }

        public final void run() {
            EndlessRecyclerViewListFragment.this.adapter.removeFooter(502);
        }
    }

    public boolean canLoadContent() {
        return !this.mIsContentExhausted && super.canLoadContent();
    }

    public int getApiOffset() {
        return this.mOffset;
    }

    public int getLoadTriggerPosition() {
        return 12;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TransactionViewModel<Bundle> Y = C18263b.m30830Y(this, "endless", new Bundle());
        this.transactionViewModel = Y;
        Bundle bundle2 = (Bundle) Y.f26405b;
        this.mIsContentExhausted = bundle2.getBoolean(KEY_CONTENT_EXHAUSTED, false);
        this.mOffset = bundle2.getInt(KEY_OFFSET, 0);
    }

    public abstract void onLoadContent();

    public void onLoadFailure() {
        if (this.adapter.getDataItemCount() <= 0) {
            super.onLoadFailure();
        } else if (isRefreshing()) {
            super.onLoadFailure();
        } else {
            setLoading(false);
            showEndlessError();
        }
    }

    public void onLoadSuccess(List<T> list, int i) {
        if (this.adapter.getDataItemCount() > 0 && !isRefreshing()) {
            stopEndless();
            removeEndlessError();
        }
        this.mOffset = list.size() + this.mOffset;
        super.onLoadSuccess(list, i);
        if (this.mOffset >= i) {
            this.mIsContentExhausted = true;
        }
    }

    public void onPreLoadContent() {
        if (this.adapter.getDataItemCount() <= 0 || isRefreshing()) {
            super.onPreLoadContent();
        } else {
            startEndless();
        }
    }

    public void onRefresh() {
        if (!isRefreshing()) {
            this.mOffset = 0;
            this.mIsContentExhausted = false;
            super.onRefresh();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = (Bundle) this.transactionViewModel.f26405b;
        bundle2.putBoolean(KEY_CONTENT_EXHAUSTED, this.mIsContentExhausted);
        bundle2.putInt(KEY_OFFSET, this.mOffset);
    }

    public void onScrolledToLoadTrigger() {
        loadContent();
    }

    public void removeEndlessError() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new C11826d());
        }
    }

    public void resetAndLoadContent() {
        setApiOffset(0);
        setLoading(false);
        this.mIsContentExhausted = false;
        loadContent();
    }

    public void setApiOffset(int i) {
        this.mOffset = i;
    }

    public void setContentExhausted(boolean z) {
        this.mIsContentExhausted = z;
    }

    public void showEndlessError() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new C11825c());
        }
    }

    public void startEndless() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new C11823a());
        }
    }

    public void stopEndless() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new C11824b());
        }
    }
}
