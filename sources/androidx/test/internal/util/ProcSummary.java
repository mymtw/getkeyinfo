package androidx.test.internal.util;

import androidx.test.internal.platform.ThreadChecker;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;

public final class ProcSummary {

    /* renamed from: a */
    public final String f7690a;

    /* renamed from: b */
    public final String f7691b;

    /* renamed from: c */
    public final String f7692c;

    /* renamed from: d */
    public final String f7693d;

    /* renamed from: e */
    public final String f7694e;

    /* renamed from: f */
    public final long f7695f;

    public static class Builder {

        /* renamed from: a */
        public String f7696a;

        /* renamed from: b */
        public String f7697b;

        /* renamed from: c */
        public String f7698c;

        /* renamed from: d */
        public String f7699d;

        /* renamed from: e */
        public long f7700e;

        /* renamed from: f */
        public String f7701f;
    }

    public static class SummaryException extends RuntimeException {
        public SummaryException(String str, Throwable th) {
            super(str, th);
        }

        public SummaryException(String str) {
            super(str);
        }
    }

    public ProcSummary(Builder builder) {
        String str = builder.f7696a;
        ThreadChecker threadChecker = Checks.f7689a;
        str.getClass();
        this.f7690a = str;
        String str2 = builder.f7697b;
        str2.getClass();
        this.f7691b = str2;
        String str3 = builder.f7698c;
        str3.getClass();
        this.f7693d = str3;
        String str4 = builder.f7701f;
        str4.getClass();
        this.f7692c = str4;
        String str5 = builder.f7699d;
        str5.getClass();
        this.f7694e = str5;
        this.f7695f = builder.f7700e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079 A[SYNTHETIC, Splitter:B:28:0x0079] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m7978a(java.io.File r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r1]
            r3 = 0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ RuntimeException -> 0x0054, IOException -> 0x0032 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ RuntimeException -> 0x0054, IOException -> 0x0032 }
            r5.<init>(r7)     // Catch:{ RuntimeException -> 0x0054, IOException -> 0x0032 }
            r4.<init>(r5)     // Catch:{ RuntimeException -> 0x0054, IOException -> 0x0032 }
        L_0x0014:
            r3 = 0
            int r5 = r4.read(r2, r3, r1)     // Catch:{ RuntimeException -> 0x002d, IOException -> 0x002a, all -> 0x0028 }
            r6 = -1
            if (r5 == r6) goto L_0x0020
            r0.append(r2, r3, r5)     // Catch:{ RuntimeException -> 0x002d, IOException -> 0x002a, all -> 0x0028 }
            goto L_0x0014
        L_0x0020:
            java.lang.String r7 = r0.toString()     // Catch:{ RuntimeException -> 0x002d, IOException -> 0x002a, all -> 0x0028 }
            r4.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return r7
        L_0x0028:
            r7 = move-exception
            goto L_0x0077
        L_0x002a:
            r0 = move-exception
            r3 = r4
            goto L_0x0033
        L_0x002d:
            r0 = move-exception
            r3 = r4
            goto L_0x0055
        L_0x0030:
            r7 = move-exception
            goto L_0x0076
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            androidx.test.internal.util.ProcSummary$SummaryException r1 = new androidx.test.internal.util.ProcSummary$SummaryException     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0030 }
            int r2 = r7.length()     // Catch:{ all -> 0x0030 }
            int r2 = r2 + 16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r4.<init>(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Could not read: "
            r4.append(r2)     // Catch:{ all -> 0x0030 }
            r4.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0030 }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            androidx.test.internal.util.ProcSummary$SummaryException r1 = new androidx.test.internal.util.ProcSummary$SummaryException     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0030 }
            int r2 = r7.length()     // Catch:{ all -> 0x0030 }
            int r2 = r2 + 15
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r4.<init>(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Error reading: "
            r4.append(r2)     // Catch:{ all -> 0x0030 }
            r4.append(r7)     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0030 }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0076:
            r4 = r3
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r4.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.util.ProcSummary.m7978a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    public static ProcSummary m7979b() {
        String a = m7978a(new File(new File("/proc", "self"), "stat"));
        String a2 = m7978a(new File(new File("/proc", "self"), ResponseConstants.STATUS));
        String a3 = m7978a(new File(new File("/proc", "self"), "cmdline"));
        String[] split = a.substring(a.lastIndexOf(41) + 2).split(" ", -1);
        String substring = a2.substring(a2.indexOf("\nUid:") + 1);
        String[] split2 = substring.substring(0, substring.indexOf(10)).split("\\s", -1);
        Builder builder = new Builder();
        String substring2 = a.substring(0, a.indexOf(32));
        try {
            Integer.parseInt(substring2);
            builder.f7697b = substring2;
            builder.f7696a = a.substring(a.indexOf(40) + 1, a.lastIndexOf(41));
            String str = split[1];
            try {
                Integer.parseInt(str);
                builder.f7701f = str;
                String str2 = split2[1];
                try {
                    Integer.parseInt(str2);
                    builder.f7698c = str2;
                    builder.f7699d = a3.trim().replace(0, ' ');
                    builder.f7700e = Long.parseLong(split[19]);
                    return new ProcSummary(builder);
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "not a uid: ".concat(valueOf) : new String("not a uid: "));
                }
            } catch (NumberFormatException unused2) {
                String valueOf2 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "not a pid: ".concat(valueOf2) : new String("not a pid: "));
            }
        } catch (NumberFormatException unused3) {
            String valueOf3 = String.valueOf(substring2);
            throw new IllegalArgumentException(valueOf3.length() != 0 ? "not a pid: ".concat(valueOf3) : new String("not a pid: "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ProcSummary)) {
            return false;
        }
        ProcSummary procSummary = (ProcSummary) obj;
        return procSummary.f7690a.equals(this.f7690a) && procSummary.f7691b.equals(this.f7691b) && procSummary.f7692c.equals(this.f7692c) && procSummary.f7693d.equals(this.f7693d) && procSummary.f7694e.equals(this.f7694e) && procSummary.f7695f == this.f7695f;
    }

    public final int hashCode() {
        return this.f7691b.hashCode();
    }

    public final String toString() {
        return String.format("ProcSummary(name: '%s', cmdline: '%s', pid: '%s', parent: '%s', realUid: '%s', startTime: %d)", new Object[]{this.f7690a, this.f7694e, this.f7691b, this.f7692c, this.f7693d, Long.valueOf(this.f7695f)});
    }
}
