package p159k4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k4.a */
public final class C7191a implements C5968d<InputStream> {

    /* renamed from: b */
    public final Uri f15970b;

    /* renamed from: c */
    public final C7195c f15971c;

    /* renamed from: d */
    public InputStream f15972d;

    /* renamed from: k4.a$a */
    public static class C7192a implements C7194b {

        /* renamed from: b */
        public static final String[] f15973b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f15974a;

        public C7192a(ContentResolver contentResolver) {
            this.f15974a = contentResolver;
        }

        /* renamed from: a */
        public final Cursor mo19490a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f15974a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f15973b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: k4.a$b */
    public static class C7193b implements C7194b {

        /* renamed from: b */
        public static final String[] f15975b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f15976a;

        public C7193b(ContentResolver contentResolver) {
            this.f15976a = contentResolver;
        }

        /* renamed from: a */
        public final Cursor mo19490a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f15976a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f15975b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public C7191a(Uri uri, C7195c cVar) {
        this.f15970b = uri;
        this.f15971c = cVar;
    }

    /* renamed from: c */
    public static C7191a m13853c(Context context, Uri uri, C7194b bVar) {
        return new C7191a(uri, new C7195c(Glide.get(context).getRegistry().mo16764d(), bVar, Glide.get(context).getArrayPool(), context.getContentResolver()));
    }

    /* renamed from: a */
    public final Class<InputStream> mo16848a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo16851b() {
        InputStream inputStream = this.f15972d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo16854d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo16855e(Priority priority, C5968d.C5969a<? super InputStream> aVar) {
        try {
            InputStream f = mo19489f();
            this.f15972d = f;
            aVar.mo16863f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo16862c(e);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream mo19489f() throws java.io.FileNotFoundException {
        /*
            r11 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            k4.c r1 = r11.f15971c
            android.net.Uri r2 = r11.f15970b
            r1.getClass()
            r3 = 0
            r4 = 3
            r5 = 0
            k4.b r6 = r1.f15977a     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            android.database.Cursor r6 = r6.mo19490a(r2)     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            if (r6 == 0) goto L_0x0028
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0026 }
            if (r7 == 0) goto L_0x0028
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x0026 }
            r6.close()
            goto L_0x0051
        L_0x0022:
            r0 = move-exception
            r5 = r6
            goto L_0x00f5
        L_0x0026:
            r7 = move-exception
            goto L_0x0031
        L_0x0028:
            if (r6 == 0) goto L_0x0050
            goto L_0x004d
        L_0x002b:
            r0 = move-exception
            goto L_0x00f5
        L_0x002e:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x0031:
            boolean r8 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0022 }
            if (r8 == 0) goto L_0x004b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r8.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r9 = "Failed to query for thumbnail for Uri: "
            r8.append(r9)     // Catch:{ all -> 0x0022 }
            r8.append(r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0022 }
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x0022 }
        L_0x004b:
            if (r6 == 0) goto L_0x0050
        L_0x004d:
            r6.close()
        L_0x0050:
            r7 = r5
        L_0x0051:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0059
        L_0x0057:
            r1 = r5
            goto L_0x007c
        L_0x0059:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x006f
            r7 = 0
            long r9 = r6.length()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x006f
            r3 = 1
        L_0x006f:
            if (r3 != 0) goto L_0x0072
            goto L_0x0057
        L_0x0072:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.f15979c     // Catch:{ NullPointerException -> 0x00cf }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00cf }
        L_0x007c:
            r2 = -1
            if (r1 == 0) goto L_0x00c5
            k4.c r3 = r11.f15971c
            android.net.Uri r6 = r11.f15970b
            r3.getClass()
            android.content.ContentResolver r7 = r3.f15979c     // Catch:{ IOException -> 0x009e, NullPointerException -> 0x009c }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException -> 0x009e, NullPointerException -> 0x009c }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f15980d     // Catch:{ IOException -> 0x009e, NullPointerException -> 0x009c }
            com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r3.f15978b     // Catch:{ IOException -> 0x009e, NullPointerException -> 0x009c }
            int r0 = com.bumptech.glide.load.C5963a.m11788a(r3, r5, r7)     // Catch:{ IOException -> 0x009e, NullPointerException -> 0x009c }
            if (r5 == 0) goto L_0x00c6
            r5.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00c6
        L_0x009a:
            r0 = move-exception
            goto L_0x00bf
        L_0x009c:
            r3 = move-exception
            goto L_0x009f
        L_0x009e:
            r3 = move-exception
        L_0x009f:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x00b9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r4.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "Failed to open uri: "
            r4.append(r7)     // Catch:{ all -> 0x009a }
            r4.append(r6)     // Catch:{ all -> 0x009a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009a }
            android.util.Log.d(r0, r4, r3)     // Catch:{ all -> 0x009a }
        L_0x00b9:
            if (r5 == 0) goto L_0x00c5
            r5.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c5
        L_0x00bf:
            if (r5 == 0) goto L_0x00c4
            r5.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r0 = r2
        L_0x00c6:
            if (r0 == r2) goto L_0x00ce
            com.bumptech.glide.load.data.g r2 = new com.bumptech.glide.load.data.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00ce:
            return r1
        L_0x00cf:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00f5:
            if (r5 == 0) goto L_0x00fa
            r5.close()
        L_0x00fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159k4.C7191a.mo19489f():java.io.InputStream");
    }
}
