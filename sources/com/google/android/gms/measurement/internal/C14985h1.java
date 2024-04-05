package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: com.google.android.gms.measurement.internal.h1 */
public final class C14985h1 extends C14968f2 {

    /* renamed from: c */
    public final C7494b f33550c = new C7494b();

    /* renamed from: d */
    public final C7494b f33551d = new C7494b();

    /* renamed from: e */
    public long f33552e;

    public C14985h1(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: h */
    public final void mo52084h(long j, String str) {
        if (str == null || str.length() == 0) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Ad unit id must be a non-empty string");
        } else {
            ((C15103u3) this.f33681b).mo52015a().mo52308o(new C14920a(this, str, j));
        }
    }

    /* renamed from: i */
    public final void mo52085i(long j, String str) {
        if (str == null || str.length() == 0) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Ad unit id must be a non-empty string");
        } else {
            ((C15103u3) this.f33681b).mo52015a().mo52308o(new C15064q(this, str, j));
        }
    }

    /* renamed from: j */
    public final void mo52086j(long j) {
        C15061p5 n = ((C15103u3) this.f33681b).mo52332t().mo52348n(false);
        Iterator it = ((C7500h.C7503c) this.f33550c.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mo52088l(str, j - ((Long) this.f33550c.getOrDefault(str, null)).longValue(), n);
        }
        if (!this.f33550c.isEmpty()) {
            mo52087k(j - this.f33552e, n);
        }
        mo52089m(j);
    }

    /* renamed from: k */
    public final void mo52087k(long j, C15061p5 p5Var) {
        if (p5Var == null) {
            ((C15103u3) this.f33681b).mo52016b().f33732o.mo52237a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C15018k7.m24481s(p5Var, bundle, true);
            ((C15103u3) this.f33681b).mo52331s().mo52151m("am", bundle, "_xa");
        }
    }

    /* renamed from: l */
    public final void mo52088l(String str, long j, C15061p5 p5Var) {
        if (p5Var == null) {
            ((C15103u3) this.f33681b).mo52016b().f33732o.mo52237a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C15018k7.m24481s(p5Var, bundle, true);
            ((C15103u3) this.f33681b).mo52331s().mo52151m("am", bundle, "_xu");
        }
    }

    /* renamed from: m */
    public final void mo52089m(long j) {
        Iterator it = ((C7500h.C7503c) this.f33550c.keySet()).iterator();
        while (it.hasNext()) {
            this.f33550c.put((String) it.next(), Long.valueOf(j));
        }
        if (!this.f33550c.isEmpty()) {
            this.f33552e = j;
        }
    }
}
