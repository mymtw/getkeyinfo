package com.etsy.android.p327ui.favorites;

import android.view.ViewTreeObserver;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.p327ui.favorites.createalist.C9800b;
import com.etsy.android.uikit.util.C11914o;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$onViewCreated$1 */
public final class FavoritesTabFragment$onViewCreated$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FavoritesTabFragment this$0;

    public FavoritesTabFragment$onViewCreated$1(FavoritesTabFragment favoritesTabFragment) {
        this.this$0 = favoritesTabFragment;
    }

    public void onGlobalLayout() {
        if (this.this$0.recyclerView != null && this.this$0.recyclerView.getChildCount() > 0) {
            C11914o.m19630b(this.this$0.recyclerView.getViewTreeObserver(), this);
            C8707d timeToFirstContent = this.this$0.getTimeToFirstContent();
            if (timeToFirstContent != null) {
                timeToFirstContent.mo21377a();
            }
            C8707d timeToFirstContent2 = this.this$0.getTimeToFirstContent();
            long j = timeToFirstContent2 != null ? timeToFirstContent2.f19129c : -1;
            if (j >= 0) {
                this.this$0.getLogCat().mo21310e("Time to first content: " + j + "ms");
                C12703a grafana = this.this$0.getGrafana();
                boolean z = true;
                String e = C0388a.m1049e(new Object[]{this.this$0.getTrackingName()}, 1, "homescreen_tabs.%s.time_to_results_displayed", "format(format, *args)");
                double d = (double) j;
                if (grafana.f27995e.nextDouble() > 0.1d) {
                    z = false;
                }
                if (z) {
                    grafana.mo45477d(e, d);
                } else {
                    grafana.getClass();
                }
            }
            if (this.this$0.createACollectionState != null) {
                C9800b access$getCreateACollectionState$p = this.this$0.createACollectionState;
                C19383o.m32794d(access$getCreateACollectionState$p);
                if (access$getCreateACollectionState$p.f21687a) {
                    this.this$0.recyclerView.requestLayout();
                }
            }
        }
    }
}
