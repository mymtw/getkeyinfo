package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2332t0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19382n;

/* renamed from: androidx.appcompat.app.j */
public final class C0161j extends C19382n {

    /* renamed from: r */
    public final /* synthetic */ AppCompatDelegateImpl f393r;

    public C0161j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f393r = appCompatDelegateImpl;
    }

    /* renamed from: b */
    public final void mo1391b() {
        this.f393r.f333q.setVisibility(0);
        if (this.f393r.f333q.getParent() instanceof View) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c((View) this.f393r.f333q.getParent());
        }
    }

    public final void onAnimationEnd() {
        this.f393r.f333q.setAlpha(1.0f);
        this.f393r.f336t.mo8921d((C2332t0) null);
        this.f393r.f336t = null;
    }
}
