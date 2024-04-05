package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0073e;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.C6494b;
import com.google.android.datatransport.C6495c;
import com.google.android.datatransport.C6517d;

/* renamed from: com.google.android.datatransport.runtime.r */
public final class C6559r<T> implements C6517d<T> {

    /* renamed from: a */
    public final C6556p f14491a;

    /* renamed from: b */
    public final String f14492b;

    /* renamed from: c */
    public final C6493a f14493c;

    /* renamed from: d */
    public final C6495c<T, byte[]> f14494d;

    /* renamed from: e */
    public final C6560s f14495e;

    public C6559r(C6556p pVar, String str, C6493a aVar, C6495c<T, byte[]> cVar, C6560s sVar) {
        this.f14491a = pVar;
        this.f14492b = str;
        this.f14493c = aVar;
        this.f14494d = cVar;
        this.f14495e = sVar;
    }

    /* renamed from: a */
    public final void mo18729a(C6494b<T> bVar) {
        C0073e eVar = new C0073e();
        C6560s sVar = this.f14495e;
        C6554o build = C6554o.builder().setTransportContext(this.f14491a).setEvent(bVar).setTransportName(this.f14492b).setTransformer(this.f14494d).setEncoding(this.f14493c).build();
        C6611t tVar = (C6611t) sVar;
        tVar.f14592c.mo18938a(eVar, C6547k.builder().setEventMillis(tVar.f14590a.mo19124a()).setUptimeMillis(tVar.f14591b.mo19124a()).setTransportName(build.getTransportName()).setEncodedPayload(new C6546j(build.getEncoding(), build.getPayload())).setCode(build.getEvent().getCode()).build(), build.getTransportContext().withPriority(build.getEvent().getPriority()));
    }
}
