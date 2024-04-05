package com.cardinalcommerce.shared.p065cs.p071g;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCAImageView;
import java.lang.ref.WeakReference;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.g.a */
public class C6298a extends AsyncTask<String, Void, Bitmap> {

    /* renamed from: a */
    private final WeakReference<CCAImageView> f14000a;

    /* renamed from: b */
    private final String f14001b;

    /* renamed from: c */
    private final boolean f14002c;

    /* renamed from: d */
    private final C8172b f14003d = C8172b.m16432f();

    public C6298a(CCAImageView cCAImageView, String str) {
        this.f14000a = new WeakReference<>(cCAImageView);
        this.f14001b = str;
        this.f14002c = str.substring(0, 4).toLowerCase().equals("http");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065 A[SYNTHETIC, Splitter:B:38:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC, Splitter:B:44:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008c A[SYNTHETIC, Splitter:B:54:0x008c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m12691a() {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r7.f14002c     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r7.f14001b     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.lang.String r2 = ","
            int r2 = r1.indexOf(r2)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r3 = r1.length     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            return r0
        L_0x001e:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.lang.String r2 = r7.f14001b     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r2 = r1.getResponseCode()     // Catch:{ Exception -> 0x005c, all -> 0x0056 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0037
            r1.disconnect()
            return r0
        L_0x0037:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x005c, all -> 0x0056 }
            if (r2 == 0) goto L_0x004d
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ Exception -> 0x0063 }
            r1.disconnect()
            r2.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r1 = move-exception
            r1.printStackTrace()
        L_0x004c:
            return r0
        L_0x004d:
            r1.disconnect()
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x0056:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r1
            r1 = r6
            goto L_0x0085
        L_0x005c:
            r2 = r0
            goto L_0x0063
        L_0x005e:
            r1 = move-exception
            r2 = r0
            goto L_0x0085
        L_0x0061:
            r1 = r0
            r2 = r1
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.disconnect()     // Catch:{ all -> 0x0081 }
        L_0x0068:
            u8.b r3 = r7.f14003d     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "ImageDownloader"
            java.lang.String r5 = "Error downloading image"
            r3.mo19175a(r4, r5, r0)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0076
            r1.disconnect()
        L_0x0076:
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0080:
            return r0
        L_0x0081:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.disconnect()
        L_0x008a:
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0094:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.p071g.C6298a.m12691a():android.graphics.Bitmap");
    }

    /* renamed from: a */
    public Bitmap doInBackground(String... strArr) {
        return m12691a();
    }

    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        CCAImageView cCAImageView;
        if (isCancelled()) {
            bitmap = null;
        }
        WeakReference<CCAImageView> weakReference = this.f14000a;
        if (weakReference != null && (cCAImageView = weakReference.get()) != null && bitmap != null) {
            cCAImageView.setCCAImageBitmap(bitmap);
            cCAImageView.setAdjustViewBounds(true);
        }
    }
}
