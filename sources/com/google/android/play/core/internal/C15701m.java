package com.google.android.play.core.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p665rl.C18487e;

/* renamed from: com.google.android.play.core.internal.m */
public final class C15701m {

    /* renamed from: a */
    public final C18487e f35483a;

    /* renamed from: b */
    public final Context f35484b;

    /* renamed from: c */
    public final C15700l f35485c;

    /* renamed from: d */
    public PackageInfo f35486d;

    public C15701m(Context context, C18487e eVar) {
        C15700l lVar = new C15700l();
        this.f35483a = eVar;
        this.f35484b = context;
        this.f35485c = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r6.f35482a.getName().equals("manifest") == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r7 = r6.f35482a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r6 = r6.f35482a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r7 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r6 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r6 = (long) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r6 = (((long) r7) & com.etsy.android.lib.config.bucketing.UnsignedInteger.INT_MASK) | (((long) java.lang.Integer.parseInt(r6)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", new java.lang.Object[]{r13.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", new java.lang.Object[]{r13.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55528a(java.io.File[] r13) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r12 = this;
            android.content.pm.PackageInfo r0 = r12.mo55530c()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            long r0 = r0.getLongVersionCode()
            goto L_0x0012
        L_0x000f:
            int r0 = r0.versionCode
            long r0 = (long) r0
        L_0x0012:
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            r3 = 0
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00d9 }
            java.lang.reflect.Constructor r5 = r2.getDeclaredConstructor(r5)     // Catch:{ Exception -> 0x00d9 }
            boolean r6 = r5.isAccessible()     // Catch:{ Exception -> 0x00d9 }
            if (r6 != 0) goto L_0x0025
            r5.setAccessible(r4)     // Catch:{ Exception -> 0x00d9 }
        L_0x0025:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00d9 }
            java.lang.Object r2 = r5.newInstance(r6)     // Catch:{ Exception -> 0x00d9 }
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2
            int r5 = r13.length
        L_0x002e:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00d8
            com.google.android.play.core.internal.l r6 = r12.f35485c
            r7 = r13[r5]
            r6.getClass()
            int r7 = p665rl.C18484b.m31190a(r2, r7)
            java.lang.String r8 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r7 = r2.openXmlResourceParser(r7, r8)
            r6.f35482a = r7
            com.google.android.play.core.internal.l r6 = r12.f35485c
            android.content.res.XmlResourceParser r7 = r6.f35482a
            if (r7 == 0) goto L_0x00d0
        L_0x004b:
            android.content.res.XmlResourceParser r7 = r6.f35482a
            int r7 = r7.next()
            r8 = 2
            if (r7 == r8) goto L_0x0057
            if (r7 == r4) goto L_0x00c8
            goto L_0x004b
        L_0x0057:
            android.content.res.XmlResourceParser r7 = r6.f35482a
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "manifest"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00c8
            android.content.res.XmlResourceParser r7 = r6.f35482a
            java.lang.String r8 = "http://schemas.android.com/apk/res/android"
            java.lang.String r9 = "versionCode"
            java.lang.String r7 = r7.getAttributeValue(r8, r9)
            android.content.res.XmlResourceParser r6 = r6.f35482a
            java.lang.String r9 = "versionCodeMajor"
            java.lang.String r6 = r6.getAttributeValue(r8, r9)
            if (r7 == 0) goto L_0x00c0
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00ab }
            if (r6 != 0) goto L_0x0081
            long r6 = (long) r7
            goto L_0x0091
        L_0x0081:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0096 }
            long r8 = (long) r6
            r6 = 32
            long r8 = r8 << r6
            long r6 = (long) r7
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            long r6 = r6 | r8
        L_0x0091:
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            return r3
        L_0x0096:
            r13 = move-exception
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r13 = r13.getMessage()
            r1[r3] = r13
            java.lang.String r13 = "Couldn't parse versionCodeMajor to int: %s"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.<init>(r13)
            throw r0
        L_0x00ab:
            r13 = move-exception
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r13 = r13.getMessage()
            r1[r3] = r13
            java.lang.String r13 = "Couldn't parse versionCode to int: %s"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.<init>(r13)
            throw r0
        L_0x00c0:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Manifest entry doesn't contain 'versionCode' attribute."
            r13.<init>(r0)
            throw r13
        L_0x00c8:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Couldn't find manifest entry at top-level."
            r13.<init>(r0)
            throw r13
        L_0x00d0:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Manifest file needs to be loaded before parsing."
            r13.<init>(r0)
            throw r13
        L_0x00d8:
            return r4
        L_0x00d9:
            r13 = move-exception
            com.google.android.play.core.internal.zzbx r0 = new com.google.android.play.core.internal.zzbx
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r2.getName()
            r1[r3] = r2
            java.lang.String r2 = "Failed to invoke default constructor on class %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C15701m.mo55528a(java.io.File[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 32);
        r2.append("Downloaded split ");
        r2.append(r6);
        r2.append(" is not signed.");
        android.util.Log.e("SplitCompat", r2.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55529b(java.io.File[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = " is not signed."
            java.lang.String r1 = "Downloaded split "
            android.content.pm.PackageInfo r2 = r12.mo55530c()
            r3 = 0
            r4 = 0
            java.lang.String r5 = "SplitCompat"
            if (r2 == 0) goto L_0x0046
            android.content.pm.Signature[] r6 = r2.signatures
            if (r6 != 0) goto L_0x0013
            goto L_0x0046
        L_0x0013:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.pm.Signature[] r2 = r2.signatures
            int r7 = r2.length
            r8 = r4
        L_0x001c:
            if (r8 >= r7) goto L_0x0045
            r9 = r2[r8]
            java.lang.String r10 = "X509"
            java.security.cert.CertificateFactory r10 = java.security.cert.CertificateFactory.getInstance(r10)     // Catch:{ CertificateException -> 0x0036 }
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0036 }
            byte[] r9 = r9.toByteArray()     // Catch:{ CertificateException -> 0x0036 }
            r11.<init>(r9)     // Catch:{ CertificateException -> 0x0036 }
            java.security.cert.Certificate r9 = r10.generateCertificate(r11)     // Catch:{ CertificateException -> 0x0036 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ CertificateException -> 0x0036 }
            goto L_0x003d
        L_0x0036:
            r9 = move-exception
            java.lang.String r10 = "Cannot decode certificate."
            android.util.Log.e(r5, r10, r9)
            r9 = r3
        L_0x003d:
            if (r9 == 0) goto L_0x0042
            r6.add(r9)
        L_0x0042:
            int r8 = r8 + 1
            goto L_0x001c
        L_0x0045:
            r3 = r6
        L_0x0046:
            if (r3 == 0) goto L_0x00ec
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0050
            goto L_0x00ec
        L_0x0050:
            int r2 = r13.length
        L_0x0051:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00ea
            r6 = r13[r2]
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00e3 }
            java.security.cert.X509Certificate[][] r7 = com.google.android.play.core.internal.C15692f0.m25508a(r6)     // Catch:{ Exception -> 0x00bd }
            if (r7 == 0) goto L_0x009d
            int r8 = r7.length     // Catch:{ Exception -> 0x00e3 }
            if (r8 == 0) goto L_0x009d
            r8 = r7[r4]     // Catch:{ Exception -> 0x00e3 }
            int r8 = r8.length     // Catch:{ Exception -> 0x00e3 }
            if (r8 != 0) goto L_0x006a
            goto L_0x009d
        L_0x006a:
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x00e3 }
            if (r6 == 0) goto L_0x0076
            java.lang.String r13 = "No certificates found for app."
            android.util.Log.e(r5, r13)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00dd
        L_0x0076:
            java.util.Iterator r6 = r3.iterator()     // Catch:{ Exception -> 0x00e3 }
        L_0x007a:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x00e3 }
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x00e3 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ Exception -> 0x00e3 }
            int r9 = r7.length     // Catch:{ Exception -> 0x00e3 }
            r10 = r4
        L_0x0088:
            if (r10 >= r9) goto L_0x0097
            r11 = r7[r10]     // Catch:{ Exception -> 0x00e3 }
            r11 = r11[r4]     // Catch:{ Exception -> 0x00e3 }
            boolean r11 = r11.equals(r8)     // Catch:{ Exception -> 0x00e3 }
            if (r11 != 0) goto L_0x007a
            int r10 = r10 + 1
            goto L_0x0088
        L_0x0097:
            java.lang.String r13 = "There's an app certificate that doesn't sign the split."
            android.util.Log.i(r5, r13)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00dd
        L_0x009d:
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00e3 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x00e3 }
            int r13 = r13 + 32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e3 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x00e3 }
            r2.append(r1)     // Catch:{ Exception -> 0x00e3 }
            r2.append(r6)     // Catch:{ Exception -> 0x00e3 }
            r2.append(r0)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x00e3 }
            android.util.Log.e(r5, r13)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00dd
        L_0x00bd:
            r13 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00e3 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00e3 }
            int r2 = r2 + 32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e3 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00e3 }
            r3.append(r1)     // Catch:{ Exception -> 0x00e3 }
            r3.append(r6)     // Catch:{ Exception -> 0x00e3 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00e3 }
            android.util.Log.e(r5, r0, r13)     // Catch:{ Exception -> 0x00e3 }
        L_0x00dd:
            java.lang.String r13 = "Split verification failure."
            android.util.Log.e(r5, r13)     // Catch:{ Exception -> 0x00e3 }
            return r4
        L_0x00e3:
            r13 = move-exception
            java.lang.String r0 = "Split verification error."
            android.util.Log.e(r5, r0, r13)
            return r4
        L_0x00ea:
            r13 = 1
            return r13
        L_0x00ec:
            java.lang.String r13 = "No app certificates found."
            android.util.Log.e(r5, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C15701m.mo55529b(java.io.File[]):boolean");
    }

    /* renamed from: c */
    public final PackageInfo mo55530c() {
        if (this.f35486d == null) {
            try {
                this.f35486d = this.f35484b.getPackageManager().getPackageInfo(this.f35484b.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f35486d;
    }
}
