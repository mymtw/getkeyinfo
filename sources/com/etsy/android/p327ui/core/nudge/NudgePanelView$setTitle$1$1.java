package com.etsy.android.p327ui.core.nudge;

import android.text.style.URLSpan;
import android.view.View;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: com.etsy.android.ui.core.nudge.NudgePanelView$setTitle$1$1 */
public final class NudgePanelView$setTitle$1$1 extends URLSpan {
    public final /* synthetic */ URLSpan $span;
    public final /* synthetic */ NudgePanelView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgePanelView$setTitle$1$1(NudgePanelView nudgePanelView, URLSpan uRLSpan, String str) {
        super(str);
        this.this$0 = nudgePanelView;
        this.$span = uRLSpan;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        C8672b analyticsTracker = this.this$0.getAnalyticsTracker();
        if (analyticsTracker != null) {
            analyticsTracker.mo21333d("nudge_link_clicked", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.URL, this.$span.getURL())));
        }
    }
}
