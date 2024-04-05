package com.etsy.android.extensions;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.C19394m;
import p753kq.C19857l;

public final class ViewExtensions$trackingClick$2 extends TrackingOnClickListener {
    public final /* synthetic */ C19857l<View, C19394m> $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensions$trackingClick$2(C19857l<? super View, C19394m> lVar, C8698l[] lVarArr) {
        super(lVarArr);
        this.$listener = lVar;
    }

    public void onViewClick(View view) {
        this.$listener.invoke(view);
    }
}
