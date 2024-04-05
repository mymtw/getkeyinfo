package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.fragment.app.i */
public final class C2766i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C2769j0 f6304b;

    /* renamed from: c */
    public final /* synthetic */ View f6305c;

    /* renamed from: d */
    public final /* synthetic */ Rect f6306d;

    public C2766i(C2769j0 j0Var, View view, Rect rect) {
        this.f6304b = j0Var;
        this.f6305c = view;
        this.f6306d = rect;
    }

    public final void run() {
        C2769j0 j0Var = this.f6304b;
        View view = this.f6305c;
        Rect rect = this.f6306d;
        j0Var.getClass();
        C2769j0.m6636g(view, rect);
    }
}
