package com.braze.p044ui.inappmessage.views;

/* renamed from: com.braze.ui.inappmessage.views.f */
public final /* synthetic */ class C5700f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InAppMessageModalView f12092b;

    /* renamed from: c */
    public final /* synthetic */ int f12093c;

    /* renamed from: d */
    public final /* synthetic */ int f12094d;

    /* renamed from: e */
    public final /* synthetic */ int f12095e;

    /* renamed from: f */
    public final /* synthetic */ double f12096f;

    public /* synthetic */ C5700f(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        this.f12092b = inAppMessageModalView;
        this.f12093c = i;
        this.f12094d = i2;
        this.f12095e = i3;
        this.f12096f = d;
    }

    public final void run() {
        this.f12092b.lambda$resizeGraphicFrameIfAppropriate$1(this.f12093c, this.f12094d, this.f12095e, this.f12096f);
    }
}
