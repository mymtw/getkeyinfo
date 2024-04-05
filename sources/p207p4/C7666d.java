package p207p4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.jvm.internal.C19382n;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: p4.d */
public final class C7666d<DataT> implements C7588n<Uri, DataT> {

    /* renamed from: a */
    public final Context f16976a;

    /* renamed from: b */
    public final C7588n<File, DataT> f16977b;

    /* renamed from: c */
    public final C7588n<Uri, DataT> f16978c;

    /* renamed from: d */
    public final Class<DataT> f16979d;

    /* renamed from: p4.d$a */
    public static abstract class C7667a<DataT> implements C7590o<Uri, DataT> {

        /* renamed from: a */
        public final Context f16980a;

        /* renamed from: b */
        public final Class<DataT> f16981b;

        public C7667a(Context context, Class<DataT> cls) {
            this.f16980a = context;
            this.f16981b = cls;
        }

        /* renamed from: b */
        public final C7588n<Uri, DataT> mo20003b(C7596r rVar) {
            return new C7666d(this.f16980a, rVar.mo20029b(File.class, this.f16981b), rVar.mo20029b(Uri.class, this.f16981b), this.f16981b);
        }
    }

    /* renamed from: p4.d$b */
    public static final class C7668b extends C7667a<ParcelFileDescriptor> {
        public C7668b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: p4.d$c */
    public static final class C7669c extends C7667a<InputStream> {
        public C7669c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: p4.d$d */
    public static final class C7670d<DataT> implements C5968d<DataT> {

        /* renamed from: l */
        public static final String[] f16982l = {"_data"};

        /* renamed from: b */
        public final Context f16983b;

        /* renamed from: c */
        public final C7588n<File, DataT> f16984c;

        /* renamed from: d */
        public final C7588n<Uri, DataT> f16985d;

        /* renamed from: e */
        public final Uri f16986e;

        /* renamed from: f */
        public final int f16987f;

        /* renamed from: g */
        public final int f16988g;

        /* renamed from: h */
        public final C7114e f16989h;

        /* renamed from: i */
        public final Class<DataT> f16990i;

        /* renamed from: j */
        public volatile boolean f16991j;

        /* renamed from: k */
        public volatile C5968d<DataT> f16992k;

        public C7670d(Context context, C7588n<File, DataT> nVar, C7588n<Uri, DataT> nVar2, Uri uri, int i, int i2, C7114e eVar, Class<DataT> cls) {
            this.f16983b = context.getApplicationContext();
            this.f16984c = nVar;
            this.f16985d = nVar2;
            this.f16986e = uri;
            this.f16987f = i;
            this.f16988g = i2;
            this.f16989h = eVar;
            this.f16990i = cls;
        }

        /* renamed from: a */
        public final Class<DataT> mo16848a() {
            return this.f16990i;
        }

        /* renamed from: b */
        public final void mo16851b() {
            C5968d<DataT> dVar = this.f16992k;
            if (dVar != null) {
                dVar.mo16851b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.C5968d<DataT> mo20063c() throws java.io.FileNotFoundException {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                o4.n<java.io.File, DataT> r0 = r9.f16984c
                android.net.Uri r8 = r9.f16986e
                android.content.Context r2 = r9.f16983b     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f16982l     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f16987f
                int r3 = r9.f16988g
                j4.e r5 = r9.f16989h
                o4.n$a r0 = r0.mo20000a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f16983b
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f16986e
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f16986e
            L_0x0096:
                o4.n<android.net.Uri, DataT> r2 = r9.f16985d
                int r3 = r9.f16987f
                int r4 = r9.f16988g
                j4.e r5 = r9.f16989h
                o4.n$a r0 = r2.mo20000a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                com.bumptech.glide.load.data.d<Data> r1 = r0.f16855c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p207p4.C7666d.C7670d.mo20063c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f16991j = true;
            C5968d<DataT> dVar = this.f16992k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: d */
        public final DataSource mo16854d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo16855e(Priority priority, C5968d.C5969a<? super DataT> aVar) {
            try {
                C5968d<DataT> c = mo20063c();
                if (c == null) {
                    aVar.mo16862c(new IllegalArgumentException("Failed to build fetcher for: " + this.f16986e));
                    return;
                }
                this.f16992k = c;
                if (this.f16991j) {
                    cancel();
                } else {
                    c.mo16855e(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo16862c(e);
            }
        }
    }

    public C7666d(Context context, C7588n<File, DataT> nVar, C7588n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f16976a = context.getApplicationContext();
        this.f16977b = nVar;
        this.f16978c = nVar2;
        this.f16979d = cls;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        return new C7588n.C7589a(new C3479d(uri), new C7670d(this.f16976a, this.f16977b, this.f16978c, uri, i, i2, eVar, this.f16979d));
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && C19382n.m32766q0((Uri) obj);
    }
}
