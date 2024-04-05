package com.braze.support;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.p752io.C19357a;
import kotlin.p752io.FileWalkDirection;
import kotlin.text.C19457k;
import p003a2.C0023f;
import p568fn.C17782b;
import p753kq.C19846a;

public final class BrazeFileUtils {

    /* renamed from: a */
    public static final String f11885a = C19383o.m32802l("BrazeFileUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: b */
    public static final List<String> f11886b = C17782b.m29865e0("http", "https", "ftp", "ftps", "about", "javascript");

    /* renamed from: com.braze.support.BrazeFileUtils$a */
    public static final class C5538a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ File f11887b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5538a(File file) {
            super(0);
            this.f11887b = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11887b.getName(), "Could not recursively delete ");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$b */
    final class C5539b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ File f11888b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5539b(File file) {
            super(0);
            this.f11888b = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11888b.getAbsolutePath(), "Cannot delete SharedPreferences that does not exist. Path: ");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$c */
    final class C5540c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ File f11889b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5540c(File file) {
            super(0);
            this.f11889b = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11889b.getAbsolutePath(), "SharedPreferences file is expected to end in .xml. Path: ");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$d */
    public static final class C5541d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11890b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5541d(String str) {
            super(0);
            this.f11890b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11890b, "SDK is offline. File not downloaded for url: ");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$e */
    public static final class C5542e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5542e f11891b = new C5542e();

        public C5542e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$f */
    public static final class C5543f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5543f f11892b = new C5543f();

        public C5543f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$g */
    public static final class C5544g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5544g f11893b = new C5544g();

        public C5544g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$h */
    public static final class C5545h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11894b;

        /* renamed from: c */
        public final /* synthetic */ String f11895c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5545h(int i, String str) {
            super(0);
            this.f11894b = i;
            this.f11895c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("HTTP response code was ");
            h.append(this.f11894b);
            h.append(". File with url ");
            return C0023f.m110k(h, this.f11895c, " could not be downloaded.");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$i */
    public static final class C5546i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11896b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5546i(String str) {
            super(0);
            this.f11896b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11896b, "Exception during download of file from url : ");
        }
    }

    /* renamed from: com.braze.support.BrazeFileUtils$j */
    final class C5547j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5547j f11897b = new C5547j();

        public C5547j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    /* renamed from: a */
    public static final void m11237a(File file) {
        boolean z;
        FileWalkDirection fileWalkDirection = FileWalkDirection.BOTTOM_UP;
        C19383o.m32797g(fileWalkDirection, "direction");
        C19357a.C19359b bVar = new C19357a.C19359b();
        loop0:
        while (true) {
            z = true;
            while (true) {
                if (!bVar.hasNext()) {
                    break loop0;
                }
                File file2 = (File) bVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
        if (!z) {
            BrazeLogger.m11283e(f11885a, BrazeLogger.Priority.W, (Throwable) null, new C5538a(file), 12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        kotlin.reflect.C19421p.m32917E(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        kotlin.reflect.C19421p.m32917E(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m11238b(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "downloadDirectoryAbsolutePath"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "remoteFileUrl"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "outputFilename"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            r0 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r0)
            boolean r0 = com.braze.Braze.f11178u
            r1 = 12
            r2 = 0
            if (r0 != 0) goto L_0x0117
            boolean r0 = kotlin.text.C19457k.m33020X0(r3)
            if (r0 != 0) goto L_0x0106
            boolean r0 = kotlin.text.C19457k.m33020X0(r4)
            if (r0 != 0) goto L_0x00f5
            boolean r0 = kotlin.text.C19457k.m33020X0(r5)
            if (r0 != 0) goto L_0x00e4
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00bf }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00bf }
            r0.mkdirs()     // Catch:{ Exception -> 0x00bf }
            r0 = 0
            if (r6 == 0) goto L_0x003e
            boolean r1 = kotlin.text.C19457k.m33020X0(r6)     // Catch:{ Exception -> 0x00bf }
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            if (r0 != 0) goto L_0x0045
            java.lang.String r5 = kotlin.jvm.internal.C19383o.m32802l(r6, r5)     // Catch:{ Exception -> 0x00bf }
        L_0x0045:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00bf }
            r6.<init>(r3, r5)     // Catch:{ Exception -> 0x00bf }
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00bf }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00bf }
            bo.app.p6 r5 = p030bo.app.C4079p6.f9086a     // Catch:{ Exception -> 0x00bf }
            java.net.HttpURLConnection r3 = r5.mo13882a(r3)     // Catch:{ Exception -> 0x00bf }
            int r5 = r3.getResponseCode()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L_0x0088
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0081 }
            r0.<init>(r6)     // Catch:{ all -> 0x0081 }
            r1 = 8192(0x2000, float:1.14794E-41)
            p568fn.C17782b.m29848N(r5, r0, r1)     // Catch:{ all -> 0x007a }
            kotlin.reflect.C19421p.m32917E(r0, r2)     // Catch:{ all -> 0x0081 }
            kotlin.reflect.C19421p.m32917E(r5, r2)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r3.disconnect()
            return r6
        L_0x007a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r0, r6)     // Catch:{ all -> 0x0081 }
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            kotlin.reflect.C19421p.m32917E(r5, r6)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            throw r0     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
        L_0x0088:
            java.lang.String r6 = f11885a     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            com.braze.support.BrazeFileUtils$h r0 = new com.braze.support.BrazeFileUtils$h     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r0.<init>(r5, r4)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r1 = 14
            com.braze.support.BrazeLogger.m11283e(r6, r2, r2, r0, r1)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.Exception r6 = new java.lang.Exception     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r0.<init>()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r1 = "HTTP response code was "
            r0.append(r1)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r0.append(r5)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r5 = ". File with url "
            r0.append(r5)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r0.append(r4)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r5 = " could not be downloaded."
            r0.append(r5)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
            throw r6     // Catch:{ Exception -> 0x00ba, all -> 0x00b8 }
        L_0x00b8:
            r4 = move-exception
            goto L_0x00dd
        L_0x00ba:
            r5 = move-exception
            r2 = r3
            goto L_0x00c1
        L_0x00bd:
            r3 = move-exception
            goto L_0x00db
        L_0x00bf:
            r3 = move-exception
            r5 = r3
        L_0x00c1:
            java.lang.String r3 = f11885a     // Catch:{ all -> 0x00bd }
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.E     // Catch:{ all -> 0x00bd }
            com.braze.support.BrazeFileUtils$i r0 = new com.braze.support.BrazeFileUtils$i     // Catch:{ all -> 0x00bd }
            r0.<init>(r4)     // Catch:{ all -> 0x00bd }
            r1 = 8
            com.braze.support.BrazeLogger.m11283e(r3, r6, r5, r0, r1)     // Catch:{ all -> 0x00bd }
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = "Exception during download of file from url : "
            java.lang.String r4 = kotlin.jvm.internal.C19383o.m32802l(r4, r5)     // Catch:{ all -> 0x00bd }
            r3.<init>(r4)     // Catch:{ all -> 0x00bd }
            throw r3     // Catch:{ all -> 0x00bd }
        L_0x00db:
            r4 = r3
            r3 = r2
        L_0x00dd:
            if (r3 != 0) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r3.disconnect()
        L_0x00e3:
            throw r4
        L_0x00e4:
            java.lang.String r3 = f11885a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeFileUtils$g r5 = com.braze.support.BrazeFileUtils.C5544g.f11893b
            com.braze.support.BrazeLogger.m11283e(r3, r4, r2, r5, r1)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "Output filename is blank. File not downloaded."
            r3.<init>(r4)
            throw r3
        L_0x00f5:
            java.lang.String r3 = f11885a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeFileUtils$f r5 = com.braze.support.BrazeFileUtils.C5543f.f11892b
            com.braze.support.BrazeLogger.m11283e(r3, r4, r2, r5, r1)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "Zip file url is blank. File not downloaded."
            r3.<init>(r4)
            throw r3
        L_0x0106:
            java.lang.String r3 = f11885a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeFileUtils$e r5 = com.braze.support.BrazeFileUtils.C5542e.f11891b
            com.braze.support.BrazeLogger.m11283e(r3, r4, r2, r5, r1)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "Download directory is blank. File not downloaded."
            r3.<init>(r4)
            throw r3
        L_0x0117:
            java.lang.String r3 = f11885a
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.I
            com.braze.support.BrazeFileUtils$d r6 = new com.braze.support.BrazeFileUtils$d
            r6.<init>(r4)
            com.braze.support.BrazeLogger.m11283e(r3, r5, r2, r6, r1)
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r5 = "SDK is offline. File not downloaded for url: "
            java.lang.String r4 = kotlin.jvm.internal.C19383o.m32802l(r4, r5)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeFileUtils.m11238b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m11239c(android.content.res.AssetManager r2) {
        /*
            java.lang.String r0 = "appboy-html-in-app-message-javascript-component.js"
            java.io.InputStream r2 = r2.open(r0)
            java.lang.String r0 = "this.open(assetPath)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            java.nio.charset.Charset r0 = kotlin.text.C19446a.f43373b
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r2, r0)
            boolean r2 = r1 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0019
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L_0x0021
        L_0x0019:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r0)
            r1 = r2
        L_0x0021:
            r2 = 0
            java.lang.String r0 = kotlinx.coroutines.C19543e0.m33313f0(r1)     // Catch:{ all -> 0x002a }
            kotlin.reflect.C19421p.m32917E(r1, r2)
            return r0
        L_0x002a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeFileUtils.m11239c(android.content.res.AssetManager):java.lang.String");
    }

    /* renamed from: d */
    public static final boolean m11240d(Uri uri) {
        C19383o.m32797g(uri, "<this>");
        String scheme = uri.getScheme();
        return (scheme == null || C19457k.m33020X0(scheme)) || C19383o.m32792b(scheme, ResponseConstants.FILE);
    }
}
