package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.Button;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.vespa.viewholders.f */
public final /* synthetic */ class C12088f implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Button f26964b;

    /* renamed from: c */
    public final /* synthetic */ C12090g f26965c;

    public /* synthetic */ C12088f(Button button, C12090g gVar) {
        this.f26964b = button;
        this.f26965c = gVar;
    }

    public final void onClick(View view) {
        Button button = this.f26964b;
        C12090g gVar = this.f26965c;
        C19383o.m32797g(button, "$data");
        C19383o.m32797g(gVar, "this$0");
        String analyticsName = button.getAnalyticsName();
        if (analyticsName != null) {
            gVar.f26962b.mo21333d(analyticsName, (Map<? extends AnalyticsProperty, Object>) null);
        }
        gVar.f26966c.mo31328c(button);
    }
}
