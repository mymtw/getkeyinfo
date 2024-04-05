package com.etsy.android.p327ui.listing.p329ui.panels;

import android.view.View;
import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.PanelHelperKt$configure$2 */
public final class PanelHelperKt$configure$2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C19857l<Boolean, C19394m> $onPanelExpandedChanged;
    public final /* synthetic */ CollageContentToggle $this_configure;

    public PanelHelperKt$configure$2(C19857l<? super Boolean, C19394m> lVar, CollageContentToggle collageContentToggle) {
        this.$onPanelExpandedChanged = lVar;
        this.$this_configure = collageContentToggle;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        this.$onPanelExpandedChanged.invoke(Boolean.valueOf(this.$this_configure.isExpanded()));
    }
}
