package com.etsy.android.p327ui.core.listinggallery;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.ImageViewHolder$bind$1$1 */
public final class ImageViewHolder$bind$1$1 extends TrackingOnClickListener {
    public final /* synthetic */ C9643b.C9644a $it;
    public final /* synthetic */ String $url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageViewHolder$bind$1$1(PredefinedAnalyticsProperty predefinedAnalyticsProperty, String str, C9643b.C9644a aVar) {
        super((AnalyticsProperty) predefinedAnalyticsProperty, (Object) str);
        this.$url = str;
        this.$it = aVar;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "view");
        this.$it.onViewUnsupportedImage(this.$url);
    }
}
