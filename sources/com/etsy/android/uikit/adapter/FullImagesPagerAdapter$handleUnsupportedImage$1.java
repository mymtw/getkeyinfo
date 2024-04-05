package com.etsy.android.uikit.adapter;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

public final class FullImagesPagerAdapter$handleUnsupportedImage$1 extends TrackingOnClickListener {
    public final /* synthetic */ String $url;
    public final /* synthetic */ C11834e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullImagesPagerAdapter$handleUnsupportedImage$1(PredefinedAnalyticsProperty predefinedAnalyticsProperty, String str, C11834e eVar) {
        super((AnalyticsProperty) predefinedAnalyticsProperty, (Object) str);
        this.$url = str;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "view");
        throw null;
    }
}
