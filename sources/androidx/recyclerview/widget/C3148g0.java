package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* renamed from: androidx.recyclerview.widget.g0 */
public abstract class C3148g0 extends RecyclerView.C3106q {

    /* renamed from: a */
    public RecyclerView f7234a;

    /* renamed from: b */
    public Scroller f7235b;

    /* renamed from: c */
    public final C3149a f7236c = new C3149a();

    /* renamed from: androidx.recyclerview.widget.g0$a */
    public class C3149a extends RecyclerView.C3108s {

        /* renamed from: b */
        public boolean f7237b = false;

        public C3149a() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f7237b) {
                this.f7237b = false;
                C3148g0.this.mo11869g();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f7237b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo11867a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f7234a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.f7236c);
                this.f7234a.setOnFlingListener((RecyclerView.C3106q) null);
            }
            this.f7234a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f7234a.addOnScrollListener(this.f7236c);
                this.f7234a.setOnFlingListener(this);
                this.f7235b = new Scroller(this.f7234a.getContext(), new DecelerateInterpolator());
                mo11869g();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: b */
    public abstract int[] mo11820b(RecyclerView.C3100o oVar, View view);

    /* renamed from: c */
    public int[] mo11868c(int i, int i2) {
        this.f7235b.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new int[]{this.f7235b.getFinalX(), this.f7235b.getFinalY()};
    }

    /* renamed from: d */
    public abstract RecyclerView.C3114x mo11821d(RecyclerView.C3100o oVar);

    /* renamed from: e */
    public abstract View mo11822e(RecyclerView.C3100o oVar);

    /* renamed from: f */
    public abstract int mo11823f(RecyclerView.C3100o oVar, int i, int i2);

    /* renamed from: g */
    public final void mo11869g() {
        RecyclerView.C3100o layoutManager;
        View e;
        RecyclerView recyclerView = this.f7234a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (e = mo11822e(layoutManager)) != null) {
            int[] b = mo11820b(layoutManager, e);
            int i = b[0];
            if (i != 0 || b[1] != 0) {
                this.f7234a.smoothScrollBy(i, b[1]);
            }
        }
    }
}
