package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.material.g1 */
public final class C1187g1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final View f2466b;

    /* renamed from: c */
    public final C19846a<C19394m> f2467c;

    /* renamed from: d */
    public boolean f2468d;

    public C1187g1(View view, C19846a<C19394m> aVar) {
        C19383o.m32797g(view, "view");
        this.f2466b = view;
        this.f2467c = aVar;
        view.addOnAttachStateChangeListener(this);
        if (!this.f2468d && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2468d = true;
        }
    }

    public final void onGlobalLayout() {
        this.f2467c.invoke();
    }

    public final void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "p0");
        if (!this.f2468d && this.f2466b.isAttachedToWindow()) {
            this.f2466b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2468d = true;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "p0");
        if (this.f2468d) {
            this.f2466b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2468d = false;
        }
    }
}
