package com.etsy.android.p327ui;

import android.content.Intent;
import android.net.Uri;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.shop.homesection.C11160j;
import java.util.Map;
import p491ye.C13916b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.d */
public final /* synthetic */ class C9717d implements C19857l {

    /* renamed from: b */
    public final /* synthetic */ int f21510b;

    /* renamed from: c */
    public final /* synthetic */ Object f21511c;

    public /* synthetic */ C9717d(Object obj, int i) {
        this.f21510b = i;
        this.f21511c = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f21510b) {
            case 0:
                return ((BOEActivity) this.f21511c).handleTooltipEvents((C13916b) obj);
            default:
                C11160j jVar = (C11160j) this.f21511c;
                int i = C11160j.f24671f;
                jVar.f26962b.mo21333d("trader_distinction_link_clicked", (Map<? extends AnalyticsProperty, Object>) null);
                jVar.itemView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj)));
                return null;
        }
    }
}
