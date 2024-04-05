package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import androidx.room.C3227e;
import com.braze.C5380a;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.C6546j;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6551m;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C6526b;
import com.google.android.datatransport.runtime.backends.C6527c;
import com.google.android.datatransport.runtime.backends.C6535i;
import com.google.android.datatransport.runtime.scheduling.persistence.C6579a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6590h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C19388s;
import p030bo.app.C3653e7;
import p085dh.C6673a;
import p120gh.C6898a;
import p132hh.C6963a;
import p425q9.C13264o;
import p698vm.C18663e;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.i */
public final class C6573i {

    /* renamed from: a */
    public final Context f14519a;

    /* renamed from: b */
    public final C6526b f14520b;

    /* renamed from: c */
    public final C6580b f14521c;

    /* renamed from: d */
    public final C6577m f14522d;

    /* renamed from: e */
    public final Executor f14523e;

    /* renamed from: f */
    public final C6898a f14524f;

    /* renamed from: g */
    public final C6963a f14525g;

    /* renamed from: h */
    public final C6963a f14526h;

    /* renamed from: i */
    public final C6579a f14527i;

    public C6573i(Context context, C6526b bVar, C6580b bVar2, C6577m mVar, Executor executor, C6898a aVar, C6963a aVar2, C6963a aVar3, C6579a aVar4) {
        this.f14519a = context;
        this.f14520b = bVar;
        this.f14521c = bVar2;
        this.f14522d = mVar;
        this.f14523e = executor;
        this.f14524f = aVar;
        this.f14525g = aVar2;
        this.f14526h = aVar3;
        this.f14527i = aVar4;
    }

    /* renamed from: a */
    public final void mo18755a(C6556p pVar, int i) {
        BackendResponse backendResponse;
        C6535i iVar = this.f14520b.get(pVar.getBackendName());
        long j = 0;
        while (((Boolean) this.f14524f.mo18790e(new C13264o(this, pVar))).booleanValue()) {
            Iterable<C6590h> iterable = (Iterable) this.f14524f.mo18790e(new C6569e(this, pVar));
            if (iterable.iterator().hasNext()) {
                if (iVar == null) {
                    C19388s.m32845S(pVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                    backendResponse = BackendResponse.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C6590h event : iterable) {
                        arrayList.add(event.getEvent());
                    }
                    if (pVar.shouldUploadClientHealthMetrics()) {
                        C6898a aVar = this.f14524f;
                        C6579a aVar2 = this.f14527i;
                        Objects.requireNonNull(aVar2);
                        C6673a aVar3 = (C6673a) aVar.mo18790e(new C3653e7(aVar2, 6));
                        C6547k.C6548a transportName = C6547k.builder().setEventMillis(this.f14525g.mo19124a()).setUptimeMillis(this.f14526h.mo19124a()).setTransportName("GDT_CLIENT_METRICS");
                        C6493a aVar4 = new C6493a("proto");
                        aVar3.getClass();
                        C18663e eVar = C6551m.f14485a;
                        eVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            eVar.mo70165a(byteArrayOutputStream, aVar3);
                        } catch (IOException unused) {
                        }
                        arrayList.add(iVar.mo13003a(transportName.setEncodedPayload(new C6546j(aVar4, byteArrayOutputStream.toByteArray())).build()));
                    }
                    backendResponse = iVar.mo13004b(C6527c.builder().setEvents(arrayList).setExtras(pVar.getExtras()).build());
                }
                if (backendResponse.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f14524f.mo18790e(new C6570f(this, iterable, pVar, j));
                    this.f14522d.mo18753b(pVar, i + 1, true);
                    return;
                }
                this.f14524f.mo18790e(new C3227e(this, iterable));
                if (backendResponse.getStatus() == BackendResponse.Status.OK) {
                    j = Math.max(j, backendResponse.getNextRequestWaitMillis());
                    if (pVar.shouldUploadClientHealthMetrics()) {
                        this.f14524f.mo18790e(new C5380a(this));
                    }
                } else if (backendResponse.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C6590h event2 : iterable) {
                        String transportName2 = event2.getEvent().getTransportName();
                        if (!hashMap.containsKey(transportName2)) {
                            hashMap.put(transportName2, 1);
                        } else {
                            hashMap.put(transportName2, Integer.valueOf(((Integer) hashMap.get(transportName2)).intValue() + 1));
                        }
                    }
                    this.f14524f.mo18790e(new C6571g(this, hashMap));
                }
            } else {
                return;
            }
        }
        this.f14524f.mo18790e(new C6572h(this, pVar, j));
    }
}
