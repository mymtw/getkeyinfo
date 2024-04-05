package p728zk;

/* renamed from: zk.q */
public final class C18962q extends C18940b {

    /* renamed from: g */
    public int f42283g;

    /* renamed from: h */
    public int f42284h;

    /* renamed from: i */
    public boolean f42285i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18962q(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r4 = com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES
            r0 = 2130969544(0x7f0403c8, float:1.7547773E38)
            r7.<init>(r8, r9, r0, r4)
            int[] r2 = p610kp.C18161c.f39721y
            r6 = 0
            int[] r5 = new int[r6]
            r3 = 2130969544(0x7f0403c8, float:1.7547773E38)
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r9 = 1
            int r0 = r8.getInt(r6, r9)
            r7.f42283g = r0
            int r0 = r8.getInt(r9, r6)
            r7.f42284h = r0
            r8.recycle()
            r7.mo70376a()
            int r8 = r7.f42284h
            if (r8 != r9) goto L_0x002e
            r6 = r9
        L_0x002e:
            r7.f42285i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p728zk.C18962q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final void mo70376a() {
        if (this.f42283g != 0) {
            return;
        }
        if (this.f42225b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f42226c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
