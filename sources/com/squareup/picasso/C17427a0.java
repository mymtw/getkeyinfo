package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* renamed from: com.squareup.picasso.a0 */
public final class C17427a0 {

    /* renamed from: a */
    public static final StringBuilder f38069a = new StringBuilder();

    /* renamed from: b */
    public static final ByteString f38070b = ByteString.encodeUtf8("RIFF");

    /* renamed from: c */
    public static final ByteString f38071c = ByteString.encodeUtf8("WEBP");

    /* renamed from: com.squareup.picasso.a0$a */
    public static class C17428a extends Thread {
        public C17428a(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.a0$b */
    public static class C17429b implements ThreadFactory {
        public final Thread newThread(Runnable runnable) {
            return new C17428a(runnable);
        }
    }

    /* renamed from: a */
    public static int m29278a(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: b */
    public static String m29279b(C17431c cVar) {
        return m29280c(cVar, "");
    }

    /* renamed from: c */
    public static String m29280c(C17431c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C17425a aVar = cVar.f38089l;
        if (aVar != null) {
            sb.append(aVar.f38057b.mo68630b());
        }
        ArrayList arrayList = cVar.f38090m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(((C17425a) arrayList.get(i)).f38057b.mo68630b());
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m29281d(String str, String str2, String str3) {
        m29282e(str, str2, str3, "");
    }

    /* renamed from: e */
    public static void m29282e(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
