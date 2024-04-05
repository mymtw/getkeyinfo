package p371if;

import android.view.ViewTreeObserver;
import com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager;

/* renamed from: if.b */
public final class C12954b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver f28533b;

    /* renamed from: c */
    public final /* synthetic */ StickyHeadersGridLayoutManager f28534c;

    public C12954b(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, ViewTreeObserver viewTreeObserver) {
        this.f28534c = stickyHeadersGridLayoutManager;
        this.f28533b = viewTreeObserver;
    }

    public final void onGlobalLayout() {
        this.f28533b.removeOnGlobalLayoutListener(this);
        StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager = this.f28534c;
        int i = stickyHeadersGridLayoutManager.f26418R;
        if (i != -1) {
            stickyHeadersGridLayoutManager.mo11307k1(i, stickyHeadersGridLayoutManager.f26419S);
            StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager2 = this.f28534c;
            stickyHeadersGridLayoutManager2.f26418R = -1;
            stickyHeadersGridLayoutManager2.f26419S = Integer.MIN_VALUE;
        }
    }
}
