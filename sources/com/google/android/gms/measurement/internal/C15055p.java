package com.google.android.gms.measurement.internal;

import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.measurement.C14720l8;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p401mg.C13080a;
import p492yf.C13935g;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final /* synthetic */ class C15055p implements C14941c2, FeatureManager.C12256a {

    /* renamed from: b */
    public static final /* synthetic */ C15055p f33739b = new C15055p();

    /* renamed from: c */
    public static final C15055p f33740c = new C15055p();

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            AtomicBoolean atomicBoolean = C13935g.f30642a;
            Class<C13935g> cls = C13935g.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C13935g.f30642a.set(true);
                    C13935g.m21461a();
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50685a());
    }
}
