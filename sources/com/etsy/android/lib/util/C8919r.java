package com.etsy.android.lib.util;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@Deprecated
/* renamed from: com.etsy.android.lib.util.r */
public final class C8919r {

    /* renamed from: a */
    public static final Random f19677a = new Random();

    /* renamed from: a */
    public static boolean m17356a(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                C8694h.f19097a.mo21309d("File not created", e);
            }
        }
        return file.exists();
    }

    /* renamed from: b */
    public static File m17357b(Context context, String str) {
        File file = new File(context.getFilesDir() + "/shared/", str);
        m17356a(file);
        return file;
    }

    /* renamed from: c */
    public static File m17358c(Context context) {
        return Environment.getExternalStorageState().equals("mounted") || !Environment.isExternalStorageRemovable() ? new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Etsy") : new File(context.getFilesDir(), "Etsy");
    }

    /* renamed from: d */
    public static String m17359d(String str, String str2) {
        return str + String.valueOf(System.currentTimeMillis()) + (f19677a.nextInt() % 1000) + str2;
    }

    /* renamed from: e */
    public static Uri m17360e(Context context, File file) {
        try {
            return FileProvider.getUriForFile(context, EtsyApplication.get().getFileProviderAuthority(), file);
        } catch (IllegalArgumentException unused) {
            if (!BuildTarget.getAudience().isInternal()) {
                return null;
            }
            throw new RuntimeException("Your file can't be shared because its not in a shareable directory. Use getFileForSharing() to get a suitable file");
        }
    }

    /* renamed from: f */
    public static void m17361f(File file, InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                C8694h.f19097a.mo21309d("exception getting bytes for stream", e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            fileOutputStream.write(byteArray);
            fileOutputStream.close();
        } catch (IOException e2) {
            C8694h.f19097a.mo21309d("exception writing stream to file", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[SYNTHETIC, Splitter:B:19:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC, Splitter:B:25:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17362g(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "Error closing file: "
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003b }
            r2.<init>(r5)     // Catch:{ IOException -> 0x003b }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x003b }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ IOException -> 0x003b }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x003b }
            r3.write(r6)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r3.close()     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r6 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x0033
        L_0x001e:
            r1 = move-exception
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r2.mo21309d(r5, r1)
        L_0x0033:
            return r6
        L_0x0034:
            r6 = move-exception
            goto L_0x0074
        L_0x0036:
            r6 = move-exception
            r1 = r3
            goto L_0x003c
        L_0x0039:
            r6 = move-exception
            goto L_0x0073
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r3.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = "Error writing file: "
            r3.append(r4)     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = r5.getName()     // Catch:{ all -> 0x0039 }
            r3.append(r4)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0039 }
            r2.mo21309d(r3, r6)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0071
        L_0x005c:
            r6 = move-exception
            com.etsy.android.lib.logger.h r1 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r1.mo21309d(r5, r6)
        L_0x0071:
            r5 = 0
            return r5
        L_0x0073:
            r3 = r1
        L_0x0074:
            if (r3 == 0) goto L_0x008f
            r3.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x008f
        L_0x007a:
            r1 = move-exception
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r2.mo21309d(r5, r1)
        L_0x008f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.util.C8919r.m17362g(java.io.File, java.lang.String):boolean");
    }
}
