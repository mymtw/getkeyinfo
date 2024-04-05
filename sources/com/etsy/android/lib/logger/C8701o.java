package com.etsy.android.lib.logger;

import android.os.Bundle;

/* renamed from: com.etsy.android.lib.logger.o */
public final class C8701o {

    /* renamed from: a */
    public String f19104a;

    /* renamed from: b */
    public AnalyticsProperty f19105b;

    /* renamed from: c */
    public C8702a f19106c;

    /* renamed from: com.etsy.android.lib.logger.o$a */
    public interface C8702a {
        /* renamed from: a */
        Object mo11995a(Bundle bundle, String str);
    }

    public C8701o(String str, PredefinedAnalyticsProperty predefinedAnalyticsProperty, C8702a aVar) {
        this.f19104a = str;
        this.f19105b = predefinedAnalyticsProperty;
        this.f19106c = aVar;
    }
}
