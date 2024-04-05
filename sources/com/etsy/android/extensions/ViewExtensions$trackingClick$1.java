package com.etsy.android.extensions;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.C19394m;
import p753kq.C19857l;

public final class ViewExtensions$trackingClick$1 extends TrackingOnClickListener {
    public final /* synthetic */ C19857l<View, C19394m> $listener;

    public ViewExtensions$trackingClick$1(C19857l<? super View, C19394m> lVar) {
        this.$listener = lVar;
    }

    public void onViewClick(View view) {
        this.$listener.invoke(view);
    }
}
