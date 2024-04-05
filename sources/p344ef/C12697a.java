package p344ef;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: ef.a */
public final class C12697a {

    /* renamed from: a */
    public final View f27968a;

    /* renamed from: b */
    public final C8703p f27969b;

    /* renamed from: c */
    public final boolean f27970c = true;

    /* renamed from: d */
    public final int f27971d;

    /* renamed from: e */
    public int f27972e;

    /* renamed from: f */
    public boolean f27973f;

    public C12697a(View view, C8703p pVar) {
        this.f27968a = view;
        this.f27969b = pVar;
        this.f27971d = (view.getContext().getResources().getDisplayMetrics().densityDpi * 120) / 160;
        this.f27973f = true;
    }

    /* renamed from: a */
    public final void mo45458a(RecyclerView recyclerView, int i) {
        C19383o.m32797g(recyclerView, "recyclerView");
        int i2 = this.f27972e;
        int i3 = this.f27971d;
        if (i2 > i3 && this.f27973f) {
            if (this.f27970c) {
                this.f27968a.animate().translationY((float) (-this.f27968a.getHeight())).start();
            }
            this.f27973f = false;
            this.f27972e = 0;
        } else if (i2 < (-i3) && !this.f27973f) {
            mo45459b();
            this.f27973f = true;
            this.f27972e = 0;
        } else if (!this.f27973f && recyclerView.computeVerticalScrollOffset() == 0) {
            mo45459b();
            this.f27973f = true;
            this.f27972e = 0;
        }
        boolean z = this.f27973f;
        if ((z && i > 0) || (!z && i < 0)) {
            this.f27972e += i;
        }
    }

    /* renamed from: b */
    public final void mo45459b() {
        C8703p pVar = this.f27969b;
        if (pVar != null) {
            pVar.mo21333d("sticky_filter_bar_reappear", (Map<? extends AnalyticsProperty, Object>) null);
        }
        if (this.f27970c) {
            this.f27968a.animate().translationY(0.0f).start();
        }
    }
}
