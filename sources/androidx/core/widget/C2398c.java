package androidx.core.widget;

import com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;

/* renamed from: androidx.core.widget.c */
public final /* synthetic */ class C2398c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5679b;

    /* renamed from: c */
    public final /* synthetic */ Object f5680c;

    public /* synthetic */ C2398c(Object obj, int i) {
        this.f5679b = i;
        this.f5680c = obj;
    }

    public final void run() {
        switch (this.f5679b) {
            case 0:
                ((ContentLoadingProgressBar) this.f5680c).hideOnUiThread();
                return;
            case 1:
                SearchFiltersV2Fragment.m35033hideKeyboard$lambda19((SearchFiltersV2Fragment) this.f5680c);
                return;
            default:
                ((AppStartTrace) this.f5680c).logAppStartTrace();
                return;
        }
    }
}
