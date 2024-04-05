package p772tq;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import p770sq.C20171d;
import p773uq.C20205a;

/* renamed from: tq.b */
public final class C20204b {
    /* renamed from: a */
    public static String m34551a(File file) {
        Class<C20204b> cls = C20204b.class;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile2.length())];
                randomAccessFile2.readFully(bArr);
                String str = new String(bArr, "UTF-8");
                C20171d.m34478b(cls, randomAccessFile2);
                return str;
            } catch (Exception e) {
                e = e;
                randomAccessFile = randomAccessFile2;
                try {
                    C20205a.m34555b(e, cls);
                    C20171d.m34478b(cls, randomAccessFile);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    C20171d.m34478b(cls, randomAccessFile2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C20171d.m34478b(cls, randomAccessFile2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C20205a.m34555b(e, cls);
            C20171d.m34478b(cls, randomAccessFile);
            return "";
        }
    }

    /* renamed from: b */
    public static void m34552b(File file, String str) {
        Class<C20204b> cls = C20204b.class;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes("UTF-8"));
                C20171d.m34478b(cls, fileOutputStream2);
            } catch (Exception e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    C20205a.m34555b(e, cls);
                    C20171d.m34478b(cls, fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    C20171d.m34478b(cls, fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C20171d.m34478b(cls, fileOutputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C20205a.m34555b(e, cls);
            C20171d.m34478b(cls, fileOutputStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34553c(java.io.File r5) {
        /*
            java.lang.Class<tq.b> r0 = p772tq.C20204b.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0020, all -> 0x001e }
        L_0x0012:
            java.lang.String r5 = r3.readLine()     // Catch:{ IOException -> 0x001c }
            if (r5 == 0) goto L_0x002a
            r1.append(r5)     // Catch:{ IOException -> 0x001c }
            goto L_0x0012
        L_0x001c:
            r5 = move-exception
            goto L_0x0022
        L_0x001e:
            r5 = move-exception
            goto L_0x003f
        L_0x0020:
            r5 = move-exception
            r3 = r2
        L_0x0022:
            r4 = -403(0xfffffffffffffe6d, float:NaN)
            r1.append(r4)     // Catch:{ all -> 0x003d }
            p773uq.C20205a.m34555b(r5, r0)     // Catch:{ all -> 0x003d }
        L_0x002a:
            p770sq.C20171d.m34478b(r0, r3)
            java.lang.String r5 = r1.toString()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            java.lang.String r2 = r1.toString()
        L_0x003c:
            return r2
        L_0x003d:
            r5 = move-exception
            r2 = r3
        L_0x003f:
            p770sq.C20171d.m34478b(r0, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p772tq.C20204b.m34553c(java.io.File):java.lang.String");
    }
}
