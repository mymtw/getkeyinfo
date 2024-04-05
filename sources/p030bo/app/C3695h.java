package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p030bo.app.C3971n0;
import p753kq.C19846a;

/* renamed from: bo.app.h */
public final class C3695h {

    /* renamed from: a */
    private final C3971n0 f8452a;

    /* renamed from: bo.app.h$a */
    public static final class C3696a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8453b;

        /* renamed from: c */
        public final /* synthetic */ String f8454c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3696a(String str, String str2) {
            super(0);
            this.f8453b = str;
            this.f8454c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Error while retrieving disk for key ");
            h.append(this.f8453b);
            h.append(" diskKey ");
            h.append(this.f8454c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h$b */
    public static final class C3697b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8455b;

        /* renamed from: c */
        public final /* synthetic */ String f8456c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3697b(String str, String str2) {
            super(0);
            this.f8455b = str;
            this.f8456c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to get bitmap from disk cache for key ");
            h.append(this.f8455b);
            h.append(" diskKey ");
            h.append(this.f8456c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h$c */
    public static final class C3698c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8457b;

        /* renamed from: c */
        public final /* synthetic */ String f8458c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3698c(String str, String str2) {
            super(0);
            this.f8457b = str;
            this.f8458c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to load image from disk cache: ");
            h.append(this.f8457b);
            h.append(JsonPointer.SEPARATOR);
            h.append(this.f8458c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h$d */
    public static final class C3699d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8459b;

        /* renamed from: c */
        public final /* synthetic */ String f8460c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3699d(String str, String str2) {
            super(0);
            this.f8459b = str;
            this.f8460c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Error while producing output stream or compressing bitmap for key ");
            h.append(this.f8459b);
            h.append(" diskKey ");
            h.append(this.f8460c);
            return h.toString();
        }
    }

    public C3695h(File file, int i, int i2, long j) {
        C3971n0 a = C3971n0.m9162a(file, i, i2, j);
        C19383o.m32796f(a, "open(directory, appVersion, valueCount, maxSize)");
        this.f8452a = a;
    }

    /* renamed from: c */
    private final String m8684c(String str) {
        return String.valueOf(str.hashCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13337a(java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = r7.m8684c(r8)
            bo.app.n0 r1 = r7.f8452a     // Catch:{ all -> 0x0034 }
            bo.app.n0$c r1 = r1.mo13730a((java.lang.String) r0)     // Catch:{ all -> 0x0034 }
            r2 = 0
            java.io.OutputStream r2 = r1.mo13738a((int) r2)     // Catch:{ all -> 0x0034 }
            r3 = 0
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x002d }
            r5 = 100
            r9.compress(r4, r5, r2)     // Catch:{ all -> 0x002d }
            r2.flush()     // Catch:{ all -> 0x002d }
            kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x002d }
            kotlin.reflect.C19421p.m32917E(r2, r3)     // Catch:{ all -> 0x0034 }
            r1.mo13740b()     // Catch:{ all -> 0x0034 }
            goto L_0x0044
        L_0x002d:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r9)     // Catch:{ all -> 0x0034 }
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r9 = move-exception
            r4 = r9
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            bo.app.h$d r5 = new bo.app.h$d
            r5.<init>(r8, r0)
            r6 = 4
            r2 = r7
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3695h.mo13337a(java.lang.String, android.graphics.Bitmap):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo13339b(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.String r0 = r13.m8684c(r14)
            r1 = 0
            bo.app.n0 r2 = r13.f8452a     // Catch:{ all -> 0x0024 }
            bo.app.n0$d r2 = r2.mo13731b((java.lang.String) r0)     // Catch:{ all -> 0x0024 }
            r3 = 0
            java.io.InputStream r3 = r2.mo13745a(r3)     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x001d }
            kotlin.reflect.C19421p.m32917E(r2, r1)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x001d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001f }
        L_0x001f:
            r4 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r3)     // Catch:{ all -> 0x0024 }
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            r6 = r2
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.E
            bo.app.h$b r7 = new bo.app.h$b
            r7.<init>(r14, r0)
            r8 = 4
            r3 = r2
            r4 = r13
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
            bo.app.h$c r11 = new bo.app.h$c
            r11.<init>(r14, r0)
            r9 = 0
            r10 = 0
            r12 = 7
            r7 = r2
            r8 = r13
            com.braze.support.BrazeLogger.m11282d(r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3695h.mo13339b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public final boolean mo13338a(String str) {
        C19383o.m32797g(str, "key");
        String c = m8684c(str);
        try {
            C3971n0.C3976d b = this.f8452a.mo13731b(c);
            boolean z = b != null;
            C19421p.m32917E(b, (Throwable) null);
            return z;
        } catch (Throwable th) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, th, new C3696a(str, c), 4);
            return false;
        }
    }
}
