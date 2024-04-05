package p756lr;

import kotlin.jvm.internal.C19383o;

/* renamed from: lr.v */
public final class C19911v implements C19888c0 {

    /* renamed from: b */
    public final C19893f f43907b;

    /* renamed from: c */
    public C19915y f43908c;

    /* renamed from: d */
    public int f43909d;

    /* renamed from: e */
    public boolean f43910e;

    /* renamed from: f */
    public long f43911f;

    /* renamed from: g */
    public final C19897i f43912g;

    public C19911v(C19897i iVar) {
        C19383o.m32797g(iVar, "upstream");
        this.f43912g = iVar;
        C19893f l = iVar.mo72745l();
        this.f43907b = l;
        C19915y yVar = l.f43875b;
        this.f43908c = yVar;
        this.f43909d = yVar != null ? yVar.f43921b : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f43921b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo68544J(p756lr.C19893f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0082
            boolean r5 = r8.f43910e
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0076
            lr.y r5 = r8.f43908c
            if (r5 == 0) goto L_0x002a
            lr.f r6 = r8.f43907b
            lr.y r6 = r6.f43875b
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f43909d
            kotlin.jvm.internal.C19383o.m32794d(r6)
            int r6 = r6.f43921b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006a
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            lr.i r0 = r8.f43912g
            long r1 = r8.f43911f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            lr.y r0 = r8.f43908c
            if (r0 != 0) goto L_0x0050
            lr.f r0 = r8.f43907b
            lr.y r0 = r0.f43875b
            if (r0 == 0) goto L_0x0050
            r8.f43908c = r0
            int r0 = r0.f43921b
            r8.f43909d = r0
        L_0x0050:
            lr.f r0 = r8.f43907b
            long r0 = r0.f43876c
            long r2 = r8.f43911f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            lr.f r2 = r8.f43907b
            long r4 = r8.f43911f
            r3 = r9
            r6 = r10
            r2.mo72735f(r3, r4, r6)
            long r0 = r8.f43911f
            long r0 = r0 + r10
            r8.f43911f = r0
            return r10
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0076:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0082:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = android.support.p013v4.media.C0073e.m205e(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19911v.mo68544J(lr.f, long):long");
    }

    public final void close() {
        this.f43910e = true;
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43912g.mo68547m();
    }
}
