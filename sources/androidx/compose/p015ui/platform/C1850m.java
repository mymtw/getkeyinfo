package androidx.compose.p015ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.m */
public final /* synthetic */ class C1850m implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f4106b;

    public /* synthetic */ C1850m(AndroidComposeView androidComposeView) {
        this.f4106b = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.m34787scrollChangedListener$lambda2(this.f4106b);
    }
}
