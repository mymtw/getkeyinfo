package p701wh;

import p644ph.C18368v;

/* renamed from: wh.m */
public final class C18693m {

    /* renamed from: a */
    public final boolean f41412a;

    /* renamed from: b */
    public final String f41413b;

    /* renamed from: c */
    public final C18368v.C18369a f41414c;

    /* renamed from: d */
    public final int f41415d;

    /* renamed from: e */
    public final byte[] f41416e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r6.equals("cbc1") == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18693m(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0009
            r2 = r0
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            if (r11 != 0) goto L_0x000e
            r3 = r0
            goto L_0x000f
        L_0x000e:
            r3 = r1
        L_0x000f:
            r2 = r2 ^ r3
            p513bj.C14075p.m21691c(r2)
            r4.f41412a = r5
            r4.f41413b = r6
            r4.f41415d = r7
            r4.f41416e = r11
            ph.v$a r5 = new ph.v$a
            r7 = 2
            if (r6 != 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            r11 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case 3046605: goto L_0x004c;
                case 3046671: goto L_0x0041;
                case 3049879: goto L_0x0036;
                case 3049895: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = r11
            goto L_0x0055
        L_0x002b:
            java.lang.String r1 = "cens"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 3
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "cenc"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = r7
            goto L_0x0055
        L_0x0041:
            java.lang.String r1 = "cbcs"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r1 = r0
            goto L_0x0055
        L_0x004c:
            java.lang.String r2 = "cbc1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0055
            goto L_0x0029
        L_0x0055:
            switch(r1) {
                case 0: goto L_0x007a;
                case 1: goto L_0x007a;
                case 2: goto L_0x007b;
                case 3: goto L_0x007b;
                default: goto L_0x0058;
            }
        L_0x0058:
            int r7 = r6.length()
            int r7 = r7 + 68
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L_0x007b
        L_0x007a:
            r0 = r7
        L_0x007b:
            r5.<init>(r0, r9, r10, r8)
            r4.f41414c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18693m.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
