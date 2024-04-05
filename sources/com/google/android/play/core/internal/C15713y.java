package com.google.android.play.core.internal;

import com.google.android.play.core.assetpacks.C15595e0;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.y */
public final class C15713y extends C15712x {

    /* renamed from: b */
    public final C15712x f35489b;

    /* renamed from: c */
    public final long f35490c;

    /* renamed from: d */
    public final long f35491d;

    public C15713y(C15595e0 e0Var, long j, long j2) {
        this.f35489b = e0Var;
        long d = mo55534d(j);
        this.f35490c = d;
        this.f35491d = mo55534d(d + j2);
    }

    /* renamed from: a */
    public final long mo55394a() {
        return this.f35491d - this.f35490c;
    }

    /* renamed from: b */
    public final InputStream mo55395b(long j, long j2) throws IOException {
        long d = mo55534d(this.f35490c);
        return this.f35489b.mo55395b(d, mo55534d(j2 + d) - d);
    }

    public final void close() throws IOException {
    }

    /* renamed from: d */
    public final long mo55534d(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f35489b.mo55394a() ? this.f35489b.mo55394a() : j;
    }
}
