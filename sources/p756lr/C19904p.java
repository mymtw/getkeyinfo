package p756lr;

import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: lr.p */
public final class C19904p implements C19888c0 {

    /* renamed from: b */
    public int f43895b;

    /* renamed from: c */
    public boolean f43896c;

    /* renamed from: d */
    public final C19897i f43897d;

    /* renamed from: e */
    public final Inflater f43898e;

    public C19904p(C19913x xVar, Inflater inflater) {
        this.f43897d = xVar;
        this.f43898e = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo68544J(p756lr.C19893f r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
        L_0x0005:
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x000e
            r4 = r3
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r8.f43896c
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00c4
            if (r2 != 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            lr.y r2 = r9.mo72729c0(r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r2.f43922c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r3 = java.lang.Math.min(r10, r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = (int) r3     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r4 = r8.f43898e     // Catch:{ DataFormatException -> 0x00bd }
            boolean r4 = r4.needsInput()     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 != 0) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            lr.i r4 = r8.f43897d     // Catch:{ DataFormatException -> 0x00bd }
            boolean r4 = r4.mo72733e0()     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            lr.i r4 = r8.f43897d     // Catch:{ DataFormatException -> 0x00bd }
            lr.f r4 = r4.mo72745l()     // Catch:{ DataFormatException -> 0x00bd }
            lr.y r4 = r4.f43875b     // Catch:{ DataFormatException -> 0x00bd }
            kotlin.jvm.internal.C19383o.m32794d(r4)     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r4.f43922c     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r4.f43921b     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r6
            r8.f43895b = r5     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r7 = r8.f43898e     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r4 = r4.f43920a     // Catch:{ DataFormatException -> 0x00bd }
            r7.setInput(r4, r6, r5)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0053:
            java.util.zip.Inflater r4 = r8.f43898e     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r5 = r2.f43920a     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r2.f43922c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r4.inflate(r5, r6, r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r8.f43895b     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 != 0) goto L_0x0062
            goto L_0x0074
        L_0x0062:
            java.util.zip.Inflater r5 = r8.f43898e     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 - r5
            int r5 = r8.f43895b     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r4
            r8.f43895b = r5     // Catch:{ DataFormatException -> 0x00bd }
            lr.i r5 = r8.f43897d     // Catch:{ DataFormatException -> 0x00bd }
            long r6 = (long) r4     // Catch:{ DataFormatException -> 0x00bd }
            r5.skip(r6)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0074:
            if (r3 <= 0) goto L_0x0082
            int r4 = r2.f43922c     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 + r3
            r2.f43922c = r4     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r9.f43876c     // Catch:{ DataFormatException -> 0x00bd }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r4 + r2
            r9.f43876c = r4     // Catch:{ DataFormatException -> 0x00bd }
            goto L_0x0092
        L_0x0082:
            int r3 = r2.f43921b     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r2.f43922c     // Catch:{ DataFormatException -> 0x00bd }
            if (r3 != r4) goto L_0x0091
            lr.y r3 = r2.mo72806a()     // Catch:{ DataFormatException -> 0x00bd }
            r9.f43875b = r3     // Catch:{ DataFormatException -> 0x00bd }
            p756lr.C19916z.m34045a(r2)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0091:
            r2 = r0
        L_0x0092:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            return r2
        L_0x0097:
            java.util.zip.Inflater r0 = r8.f43898e
            boolean r0 = r0.finished()
            if (r0 != 0) goto L_0x00ba
            java.util.zip.Inflater r0 = r8.f43898e
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L_0x00a8
            goto L_0x00ba
        L_0x00a8:
            lr.i r0 = r8.f43897d
            boolean r0 = r0.mo72733e0()
            if (r0 != 0) goto L_0x00b2
            goto L_0x0005
        L_0x00b2:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r10 = "source exhausted prematurely"
            r9.<init>(r10)
            throw r9
        L_0x00ba:
            r9 = -1
            return r9
        L_0x00bd:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        L_0x00c4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00d0:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = android.support.p013v4.media.C0073e.m205e(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p756lr.C19904p.mo68544J(lr.f, long):long");
    }

    public final void close() throws IOException {
        if (!this.f43896c) {
            this.f43898e.end();
            this.f43896c = true;
            this.f43897d.close();
        }
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f43897d.mo68547m();
    }
}
