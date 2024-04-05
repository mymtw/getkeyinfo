package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import androidx.concurrent.futures.C2104a;
import androidx.core.content.FileProvider;
import com.google.common.util.concurrent.C16388l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p010a9.C0048b;

@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {
    private static final String AUTHORITY_SUFFIX = ".image_provider";
    private static final String CLIP_DATA_LABEL = "image_provider_uris";
    private static final String CONTENT_SCHEME = "content";
    private static final String FILE_EXTENSION = ".png";
    private static final String FILE_SUB_DIR = "image_provider";
    private static final String FILE_SUB_DIR_NAME = "image_provider_images/";
    private static final String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    private static final String TAG = "BrowserServiceFP";
    public static Object sFileCleanupLock = new Object();

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$a */
    public class C0363a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ContentResolver f944b;

        /* renamed from: c */
        public final /* synthetic */ Uri f945c;

        /* renamed from: d */
        public final /* synthetic */ C2104a f946d;

        public C0363a(ContentResolver contentResolver, Uri uri, C2104a aVar) {
            this.f944b = contentResolver;
            this.f945c = uri;
            this.f946d = aVar;
        }

        public final void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f944b.openFileDescriptor(this.f945c, "r");
                if (openFileDescriptor == null) {
                    this.f946d.mo8000i(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.f946d.mo8000i(new IOException("File could not be decoded."));
                } else {
                    this.f946d.mo7999h(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.f946d.mo8000i(e);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$b */
    public static class C0364b extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        public static final long f947b;

        /* renamed from: c */
        public static final long f948c;

        /* renamed from: d */
        public static final long f949d;

        /* renamed from: a */
        public final Context f950a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f947b = timeUnit.toMillis(7);
            f948c = timeUnit.toMillis(7);
            f949d = timeUnit.toMillis(1);
        }

        public C0364b(Context context) {
            this.f950a = context.getApplicationContext();
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            SharedPreferences sharedPreferences = this.f950a.getSharedPreferences(this.f950a.getPackageName() + BrowserServiceFileProvider.AUTHORITY_SUFFIX, 0);
            boolean z = true;
            if (!(System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, System.currentTimeMillis()) + f948c)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                File file = new File(this.f950a.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
                if (!file.exists()) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                long currentTimeMillis = System.currentTimeMillis() - f947b;
                for (File file2 : listFiles) {
                    if (file2.getName().endsWith("..png")) {
                        if (file2.lastModified() < currentTimeMillis && !file2.delete()) {
                            Log.e(BrowserServiceFileProvider.TAG, "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                }
                long currentTimeMillis2 = z ? System.currentTimeMillis() : (System.currentTimeMillis() - f948c) + f949d;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, currentTimeMillis2);
                edit.apply();
                return null;
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$c */
    public static class C0365c extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final Context f951a;

        /* renamed from: b */
        public final String f952b;

        /* renamed from: c */
        public final Bitmap f953c;

        /* renamed from: d */
        public final Uri f954d;

        /* renamed from: e */
        public final C2104a<Uri> f955e;

        public C0365c(Context context, String str, Bitmap bitmap, Uri uri, C2104a<Uri> aVar) {
            this.f951a = context.getApplicationContext();
            this.f952b = str;
            this.f953c = bitmap;
            this.f954d = uri;
            this.f955e = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC, Splitter:B:23:0x004a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3176a(java.io.File r10) {
            /*
                r9 = this;
                java.lang.String r0 = "Failed to close file output stream"
                java.lang.String r1 = "Failed to sync file output stream"
                java.lang.String r2 = "AtomicFile"
                d1.a r3 = new d1.a
                r3.<init>(r10)
                r10 = 1
                r4 = 0
                java.io.FileOutputStream r5 = r3.mo18802b()     // Catch:{ IOException -> 0x0045 }
                android.graphics.Bitmap r6 = r9.f953c     // Catch:{ IOException -> 0x0043 }
                android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0043 }
                r8 = 100
                r6.compress(r7, r8, r5)     // Catch:{ IOException -> 0x0043 }
                r5.close()     // Catch:{ IOException -> 0x0043 }
                java.io.FileDescriptor r6 = r5.getFD()     // Catch:{ IOException -> 0x0026 }
                r6.sync()     // Catch:{ IOException -> 0x0026 }
                r6 = r10
                goto L_0x0027
            L_0x0026:
                r6 = r4
            L_0x0027:
                if (r6 != 0) goto L_0x002c
                android.util.Log.e(r2, r1)     // Catch:{ IOException -> 0x0043 }
            L_0x002c:
                r5.close()     // Catch:{ IOException -> 0x0030 }
                goto L_0x0034
            L_0x0030:
                r6 = move-exception
                android.util.Log.e(r2, r0, r6)     // Catch:{ IOException -> 0x0043 }
            L_0x0034:
                java.io.File r6 = r3.f14604b     // Catch:{ IOException -> 0x0043 }
                java.io.File r7 = r3.f14603a     // Catch:{ IOException -> 0x0043 }
                p077d1.C6617a.m12985a(r6, r7)     // Catch:{ IOException -> 0x0043 }
                androidx.concurrent.futures.a<android.net.Uri> r6 = r9.f955e     // Catch:{ IOException -> 0x0043 }
                android.net.Uri r7 = r9.f954d     // Catch:{ IOException -> 0x0043 }
                r6.mo7999h(r7)     // Catch:{ IOException -> 0x0043 }
                goto L_0x007f
            L_0x0043:
                r6 = move-exception
                goto L_0x0047
            L_0x0045:
                r6 = move-exception
                r5 = 0
            L_0x0047:
                if (r5 != 0) goto L_0x004a
                goto L_0x007a
            L_0x004a:
                java.io.FileDescriptor r7 = r5.getFD()     // Catch:{ IOException -> 0x0052 }
                r7.sync()     // Catch:{ IOException -> 0x0052 }
                goto L_0x0053
            L_0x0052:
                r10 = r4
            L_0x0053:
                if (r10 != 0) goto L_0x0058
                android.util.Log.e(r2, r1)
            L_0x0058:
                r5.close()     // Catch:{ IOException -> 0x005c }
                goto L_0x0060
            L_0x005c:
                r10 = move-exception
                android.util.Log.e(r2, r0, r10)
            L_0x0060:
                java.io.File r10 = r3.f14604b
                boolean r10 = r10.delete()
                if (r10 != 0) goto L_0x007a
                java.lang.String r10 = "Failed to delete new file "
                java.lang.StringBuilder r10 = android.support.p013v4.media.C0072d.m201h(r10)
                java.io.File r0 = r3.f14604b
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                android.util.Log.e(r2, r10)
            L_0x007a:
                androidx.concurrent.futures.a<android.net.Uri> r10 = r9.f955e
                r10.mo8000i(r6)
            L_0x007f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.browseractions.BrowserServiceFileProvider.C0365c.mo3176a(java.io.File):void");
        }

        public final Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            File file = new File(this.f951a.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                if (file.exists() || file.mkdir()) {
                    File file2 = new File(file, this.f952b + BrowserServiceFileProvider.FILE_EXTENSION);
                    if (file2.exists()) {
                        this.f955e.mo7999h(this.f954d);
                    } else {
                        mo3176a(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                    return null;
                }
                this.f955e.mo8000i(new IOException("Could not create file directory."));
                return null;
            }
        }

        public final void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            new C0364b(this.f951a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private static Uri generateUri(Context context, String str) {
        String a = C0048b.m163a(FILE_SUB_DIR_NAME, str, FILE_EXTENSION);
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        return scheme.authority(context.getPackageName() + AUTHORITY_SUFFIX).path(a).build();
    }

    public static void grantReadPermission(Intent intent, List<Uri> list, Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, CLIP_DATA_LABEL, list.get(0));
            for (int i = 1; i < list.size(); i++) {
                newUri.addItem(new ClipData.Item(list.get(i)));
            }
            intent.setClipData(newUri);
        }
    }

    public static C16388l<Bitmap> loadBitmap(ContentResolver contentResolver, Uri uri) {
        C2104a aVar = new C2104a();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new C0363a(contentResolver, uri, aVar));
        return aVar;
    }

    public static C2104a<Uri> saveBitmap(Context context, Bitmap bitmap, String str, int i) {
        StringBuilder k = C0073e.m211k(str, "_");
        k.append(Integer.toString(i));
        String sb = k.toString();
        Uri generateUri = generateUri(context, sb);
        C2104a<Uri> aVar = new C2104a<>();
        new C0365c(context, sb, bitmap, generateUri, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return aVar;
    }
}
