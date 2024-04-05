package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14572a3;
import com.google.android.gms.internal.measurement.C14779q2;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
public final class C14964e7 {

    /* renamed from: a */
    public C14572a3 f33457a;

    /* renamed from: b */
    public ArrayList f33458b;

    /* renamed from: c */
    public ArrayList f33459c;

    /* renamed from: d */
    public long f33460d;

    /* renamed from: e */
    public final /* synthetic */ C14973f7 f33461e;

    public /* synthetic */ C14964e7(C14973f7 f7Var) {
        this.f33461e = f7Var;
    }

    /* renamed from: a */
    public final boolean mo51994a(long j, C14779q2 q2Var) {
        Preconditions.checkNotNull(q2Var);
        if (this.f33459c == null) {
            this.f33459c = new ArrayList();
        }
        if (this.f33458b == null) {
            this.f33458b = new ArrayList();
        }
        if (this.f33459c.size() > 0 && ((((C14779q2) this.f33459c.get(0)).mo50798u() / 1000) / 60) / 60 != ((q2Var.mo50798u() / 1000) / 60) / 60) {
            return false;
        }
        long c = this.f33460d + ((long) q2Var.mo50826c());
        this.f33461e.mo52008K();
        if (c >= ((long) Math.max(0, C14959e2.f33411j.mo51978a(null).intValue()))) {
            return false;
        }
        this.f33460d = c;
        this.f33459c.add(q2Var);
        this.f33458b.add(Long.valueOf(j));
        int size = this.f33459c.size();
        this.f33461e.mo52008K();
        return size < Math.max(1, C14959e2.f33413k.mo51978a(null).intValue());
    }
}
