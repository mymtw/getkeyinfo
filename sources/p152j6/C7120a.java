package p152j6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;

/* renamed from: j6.a */
public final class C7120a extends C8005o1 {

    /* renamed from: b */
    public final C7999m1 f15833b;

    /* renamed from: c */
    public final C7999m1 f15834c;

    /* renamed from: d */
    public final C7999m1 f15835d;

    /* renamed from: e */
    public final C7999m1 f15836e;

    /* renamed from: f */
    public final C7121b f15837f;

    public C7120a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C7121b bVar) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (bigInteger3 != null) {
            this.f15833b = new C7999m1(bigInteger);
            this.f15834c = new C7999m1(bigInteger2);
            this.f15835d = new C7999m1(bigInteger3);
            this.f15836e = bigInteger4 != null ? new C7999m1(bigInteger4) : null;
            this.f15837f = bVar;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: t5.h1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7120a(p244t5.C8021t1 r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.mo20525y()
            r1 = 3
            if (r0 < r1) goto L_0x007c
            int r0 = r4.mo20525y()
            r1 = 5
            if (r0 > r1) goto L_0x007c
            java.util.Enumeration r4 = r4.mo20524w()
            java.lang.Object r0 = r4.nextElement()
            t5.m1 r0 = p244t5.C7999m1.m16076q(r0)
            r3.f15833b = r0
            java.lang.Object r0 = r4.nextElement()
            t5.m1 r0 = p244t5.C7999m1.m16076q(r0)
            r3.f15834c = r0
            java.lang.Object r0 = r4.nextElement()
            t5.m1 r0 = p244t5.C7999m1.m16076q(r0)
            r3.f15835d = r0
            boolean r0 = r4.hasMoreElements()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r4.nextElement()
            t5.h1 r0 = (p244t5.C7984h1) r0
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x005e
            boolean r2 = r0 instanceof p244t5.C7999m1
            if (r2 == 0) goto L_0x005e
            t5.m1 r0 = p244t5.C7999m1.m16076q(r0)
            r3.f15836e = r0
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r4 = r4.nextElement()
            r0 = r4
            t5.h1 r0 = (p244t5.C7984h1) r0
            goto L_0x0060
        L_0x005c:
            r0 = r1
            goto L_0x0060
        L_0x005e:
            r3.f15836e = r1
        L_0x0060:
            if (r0 == 0) goto L_0x0079
            t5.s1 r4 = r0.mo12996i()
            boolean r0 = r4 instanceof p152j6.C7121b
            if (r0 == 0) goto L_0x006e
            r1 = r4
            j6.b r1 = (p152j6.C7121b) r1
            goto L_0x0079
        L_0x006e:
            if (r4 == 0) goto L_0x0079
            j6.b r1 = new j6.b
            t5.t1 r4 = p244t5.C8021t1.m16151s(r4)
            r1.<init>(r4)
        L_0x0079:
            r3.f15837f = r1
            return
        L_0x007c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            int r4 = r4.mo20525y()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152j6.C7120a.<init>(t5.t1):void");
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15833b);
        iVar.mo55343b(this.f15834c);
        iVar.mo55343b(this.f15835d);
        C7999m1 m1Var = this.f15836e;
        if (m1Var != null) {
            iVar.mo55343b(m1Var);
        }
        C7121b bVar = this.f15837f;
        if (bVar != null) {
            iVar.mo55343b(bVar);
        }
        return new C7976f0(iVar);
    }
}
