package com.etsy.android.push;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.etsy.android.push.c */
public final class C8940c {

    /* renamed from: a */
    public final C8941d f19728a;

    /* renamed from: b */
    public final List<PredefinedAnalyticsProperty> f19729b = C17782b.m29865e0(PredefinedAnalyticsProperty.CHANNEL_ID_CONVOS, PredefinedAnalyticsProperty.CHANNEL_ID_ETSY_NEWS, PredefinedAnalyticsProperty.CHANNEL_ID_MY_ACTIVITY, PredefinedAnalyticsProperty.CHANNEL_ID_ORDERS, PredefinedAnalyticsProperty.CHANNEL_ID_PROMOTIONS, PredefinedAnalyticsProperty.CHANNEL_ID_RECOMMENDATIONS);

    public C8940c(C8941d dVar) {
        C19383o.m32797g(dVar, "notificationStateReader");
        this.f19728a = dVar;
    }
}
