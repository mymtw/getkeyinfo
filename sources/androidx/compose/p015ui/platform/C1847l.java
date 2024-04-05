package androidx.compose.p015ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.l */
public final /* synthetic */ class C1847l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f4103b;

    public /* synthetic */ C1847l(AndroidComposeView androidComposeView) {
        this.f4103b = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.m34785globalLayoutListener$lambda1(this.f4103b);
    }
}
