package p504ai;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* renamed from: ai.g */
public final class C13981g extends DecoderInputBuffer {

    /* renamed from: j */
    public long f30742j;

    /* renamed from: k */
    public int f30743k;

    /* renamed from: l */
    public int f30744l = 32;

    public C13981g() {
        super(2);
    }

    /* renamed from: j */
    public final void mo46795j() {
        super.mo46795j();
        this.f30743k = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46796n(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.mo69761h(r0)
            r1 = 1
            r0 = r0 ^ r1
            p513bj.C14075p.m21691c(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r5.mo69761h(r0)
            r0 = r0 ^ r1
            p513bj.C14075p.m21691c(r0)
            r0 = 4
            boolean r0 = r5.mo69761h(r0)
            r0 = r0 ^ r1
            p513bj.C14075p.m21691c(r0)
            int r0 = r4.f30743k
            r2 = 0
            if (r0 <= 0) goto L_0x0025
            r3 = r1
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            if (r3 != 0) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            int r3 = r4.f30744l
            if (r0 < r3) goto L_0x002e
            goto L_0x004f
        L_0x002e:
            boolean r0 = r5.mo69762i()
            boolean r3 = r4.mo69762i()
            if (r0 == r3) goto L_0x0039
            goto L_0x004f
        L_0x0039:
            java.nio.ByteBuffer r0 = r5.f31493d
            if (r0 == 0) goto L_0x0051
            java.nio.ByteBuffer r3 = r4.f31493d
            if (r3 == 0) goto L_0x0051
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L_0x0051
        L_0x004f:
            r0 = r2
            goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            return r2
        L_0x0055:
            int r0 = r4.f30743k
            int r2 = r0 + 1
            r4.f30743k = r2
            if (r0 != 0) goto L_0x0069
            long r2 = r5.f31495f
            r4.f31495f = r2
            boolean r0 = r5.mo69761h(r1)
            if (r0 == 0) goto L_0x0069
            r4.f39937b = r1
        L_0x0069:
            boolean r0 = r5.mo69762i()
            if (r0 == 0) goto L_0x0073
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f39937b = r0
        L_0x0073:
            java.nio.ByteBuffer r0 = r5.f31493d
            if (r0 == 0) goto L_0x0083
            int r2 = r0.remaining()
            r4.mo47271l(r2)
            java.nio.ByteBuffer r2 = r4.f31493d
            r2.put(r0)
        L_0x0083:
            long r2 = r5.f31495f
            r4.f30742j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p504ai.C13981g.mo46796n(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }
}
