package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.r2 */
public final class C15076r2 implements Runnable {

    /* renamed from: b */
    public final C15067q2 f33795b;

    /* renamed from: c */
    public final int f33796c;

    /* renamed from: d */
    public final Throwable f33797d;

    /* renamed from: e */
    public final byte[] f33798e;

    /* renamed from: f */
    public final String f33799f;

    /* renamed from: g */
    public final Map<String, List<String>> f33800g;

    public /* synthetic */ C15076r2(String str, C15067q2 q2Var, int i, IOException iOException, byte[] bArr, Map map) {
        Preconditions.checkNotNull(q2Var);
        this.f33795b = q2Var;
        this.f33796c = i;
        this.f33797d = iOException;
        this.f33798e = bArr;
        this.f33799f = str;
        this.f33800g = map;
    }

    public final void run() {
        this.f33795b.mo18935b(this.f33799f, this.f33796c, this.f33797d, this.f33798e, this.f33800g);
    }
}
