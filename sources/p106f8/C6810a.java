package p106f8;

import com.google.android.gms.internal.measurement.C14595c0;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14763p;
import java.io.Serializable;
import java.util.Map;

/* renamed from: f8.a */
public final class C6810a implements C14595c0 {

    /* renamed from: b */
    public final Object f14989b;

    /* renamed from: c */
    public final Serializable f14990c;

    public /* synthetic */ C6810a(C14598c3 c3Var, String str) {
        this.f14989b = c3Var;
        this.f14990c = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C6810a(byte[] r1, byte[] r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f14989b = r1
            if (r2 == 0) goto L_0x000a
            r0.f14990c = r2
            return
        L_0x000a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The authentication tag must not be null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p106f8.C6810a.<init>(byte[], byte[]):void");
    }

    /* renamed from: a */
    public final C14598c3 mo5884a(C14763p pVar) {
        C14598c3 b = ((C14598c3) this.f14989b).mo50399b();
        String str = (String) this.f14990c;
        b.mo50403f(str, pVar);
        ((Map) b.f32781d).put(str, Boolean.TRUE);
        return b;
    }
}
