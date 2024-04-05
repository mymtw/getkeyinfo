package com.etsy.android.p327ui.cardview.viewholders;

/* renamed from: com.etsy.android.ui.cardview.viewholders.f0 */
public final class C9175f0 implements C9204o1 {

    /* renamed from: a */
    public final /* synthetic */ C9184i0 f20201a;

    public C9175f0(C9184i0 i0Var) {
        this.f20201a = i0Var;
    }

    /* renamed from: a */
    public final void mo31407a() {
    }

    public final void onDestroy() {
        this.f20201a.f26987c.getViewTreeObserver().removeOnScrollChangedListener(this.f20201a.f20221l);
    }
}
