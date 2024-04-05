package androidx.compose.p015ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.n */
public final /* synthetic */ class C1854n implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f4109b;

    public /* synthetic */ C1854n(AndroidComposeView androidComposeView) {
        this.f4109b = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.m34790touchModeChangeListener$lambda3(this.f4109b, z);
    }
}
