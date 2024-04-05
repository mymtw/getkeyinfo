package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p003a2.C0015b;
import p505aj.C14008o;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17912g;
import p594jh.C17954o0;

/* renamed from: com.google.android.exoplayer2.drm.a */
public final class C14215a {

    /* renamed from: a */
    public final Object f31561a = new Object();

    /* renamed from: b */
    public C17954o0.C17958d f31562b;

    /* renamed from: c */
    public DefaultDrmSessionManager f31563c;

    /* renamed from: a */
    public static DefaultDrmSessionManager m22150a(C17954o0.C17958d dVar) {
        C17954o0.C17958d dVar2 = dVar;
        C14008o.C14009a aVar = new C14008o.C14009a();
        aVar.f30842b = null;
        Uri uri = dVar2.f39177b;
        C14230h hVar = new C14230h(uri == null ? null : uri.toString(), dVar2.f39181f, aVar);
        for (Map.Entry next : dVar2.f39178c.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            str.getClass();
            str2.getClass();
            synchronized (hVar.f31583d) {
                hVar.f31583d.put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = C17912g.f38897a;
        C14430a aVar2 = new C14430a();
        UUID uuid2 = dVar2.f39176a;
        C0015b bVar = C14229g.f31576d;
        uuid2.getClass();
        boolean z = dVar2.f39179d;
        boolean z2 = dVar2.f39180e;
        int[] c = Ints.m26385c(dVar2.f39182g);
        for (int i : c) {
            boolean z3 = true;
            if (!(i == 2 || i == 1)) {
                z3 = false;
            }
            C14075p.m21691c(z3);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, bVar, hVar, hashMap, z, (int[]) c.clone(), z2, aVar2, 300000);
        byte[] bArr = dVar2.f39183h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        C14075p.m21694f(defaultDrmSessionManager.f31540m.isEmpty());
        defaultDrmSessionManager.f31550w = 0;
        defaultDrmSessionManager.f31551x = copyOf;
        return defaultDrmSessionManager;
    }

    /* renamed from: b */
    public final C14219c mo47322b(C17954o0 o0Var) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        o0Var.f39138b.getClass();
        C17954o0.C17958d dVar = o0Var.f39138b.f39191c;
        if (dVar == null || C14049b0.f30913a < 18) {
            return C14219c.f31569a;
        }
        synchronized (this.f31561a) {
            if (!C14049b0.m21628a(dVar, this.f31562b)) {
                this.f31562b = dVar;
                this.f31563c = m22150a(dVar);
            }
            defaultDrmSessionManager = this.f31563c;
            defaultDrmSessionManager.getClass();
        }
        return defaultDrmSessionManager;
    }
}
