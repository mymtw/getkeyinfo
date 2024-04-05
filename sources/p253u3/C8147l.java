package p253u3;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;

/* renamed from: u3.l */
public final class C8147l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8139f f17869b;

    /* renamed from: c */
    public final /* synthetic */ String f17870c;

    /* renamed from: d */
    public final /* synthetic */ C8139f f17871d;

    public C8147l(C8139f fVar, C8139f fVar2, String str) {
        this.f17871d = fVar;
        this.f17869b = fVar2;
        this.f17870c = str;
    }

    public final void run() {
        if (!C8156t.m16412c(this.f17869b.f17822d)) {
            C8139f fVar = this.f17869b;
            String str = this.f17870c;
            fVar.f17825g = str;
            this.f17871d.f17821c.mo20785u(EventsNameKt.DEVICE_ID, str);
        }
    }
}
