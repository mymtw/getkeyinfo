package com.etsy.android.lib.network;

import android.net.TrafficStats;
import okhttp3.C20000q;
import okhttp3.C20018z;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.y */
public final class C8815y implements C20000q {

    /* renamed from: b */
    public final int f19370b;

    public C8815y(int i) {
        this.f19370b = i;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        TrafficStats.setThreadStatsTag(this.f19370b);
        C19006f fVar = (C19006f) aVar;
        return fVar.mo70453a(fVar.f42351f);
    }
}
