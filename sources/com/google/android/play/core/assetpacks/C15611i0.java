package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
public final class C15611i0 extends C15613i2 {

    /* renamed from: a */
    public final int f35186a;

    /* renamed from: b */
    public final String f35187b;

    /* renamed from: c */
    public final long f35188c;

    /* renamed from: d */
    public final long f35189d;

    /* renamed from: e */
    public final int f35190e;

    public C15611i0(int i, int i2, long j, long j2, String str) {
        this.f35186a = i;
        this.f35187b = str;
        this.f35188c = j;
        this.f35189d = j2;
        this.f35190e = i2;
    }

    /* renamed from: a */
    public final int mo55413a() {
        return this.f35186a;
    }

    /* renamed from: b */
    public final int mo55414b() {
        return this.f35190e;
    }

    /* renamed from: c */
    public final long mo55415c() {
        return this.f35188c;
    }

    /* renamed from: d */
    public final long mo55416d() {
        return this.f35189d;
    }

    /* renamed from: e */
    public final String mo55417e() {
        return this.f35187b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f35187b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C15613i2
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.i2 r8 = (com.google.android.play.core.assetpacks.C15613i2) r8
            int r1 = r7.f35186a
            int r3 = r8.mo55413a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f35187b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo55417e()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo55417e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f35188c
            long r5 = r8.mo55415c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f35189d
            long r5 = r8.mo55416d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f35190e
            int r8 = r8.mo55414b()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15611i0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f35186a ^ 1000003) * 1000003;
        String str = this.f35187b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f35188c;
        long j2 = this.f35189d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f35190e;
    }

    public final String toString() {
        int i = this.f35186a;
        String str = this.f35187b;
        long j = this.f35188c;
        long j2 = this.f35189d;
        int i2 = this.f35190e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
