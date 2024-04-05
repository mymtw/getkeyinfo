package p365hg;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import p453tf.C13418j;
import p453tf.C13442y;

/* renamed from: hg.b */
public final class C12831b {

    /* renamed from: f */
    public static final String f28319f = C12831b.class.getCanonicalName();

    /* renamed from: g */
    public static C12831b f28320g;

    /* renamed from: h */
    public static final C12832a f28321h = new C12832a();

    /* renamed from: a */
    public String f28322a;

    /* renamed from: b */
    public long f28323b;

    /* renamed from: c */
    public String f28324c;

    /* renamed from: d */
    public String f28325d;

    /* renamed from: e */
    public boolean f28326e;

    /* renamed from: hg.b$a */
    public static final class C12832a {
        /* JADX WARNING: Removed duplicated region for block: B:105:0x01f4  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[Catch:{ Exception -> 0x0098 }] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003f A[Catch:{ Exception -> 0x0098 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0158 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0161 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0164 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0168 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0174 A[Catch:{ Exception -> 0x01da, all -> 0x0171 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01d2 A[SYNTHETIC, Splitter:B:97:0x01d2] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p365hg.C12831b m20469a(android.content.Context r18) {
            /*
                r1 = r18
                java.lang.String r2 = "limit_tracking"
                java.lang.String r3 = "androidid"
                java.lang.String r4 = "aid"
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C19383o.m32797g(r1, r0)
                java.lang.String r5 = "android_id"
                r6 = 1
                r7 = 0
                r8 = 0
                java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0098 }
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r0[r7] = r9     // Catch:{ Exception -> 0x0098 }
                java.lang.String r9 = "com.google.android.gms.common.GooglePlayServicesUtil"
                java.lang.String r10 = "isGooglePlayServicesAvailable"
                java.lang.reflect.Method r0 = p365hg.C12869i0.m20580s(r9, r10, r0)     // Catch:{ Exception -> 0x0098 }
                if (r0 == 0) goto L_0x003b
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0098 }
                r9[r7] = r1     // Catch:{ Exception -> 0x0098 }
                java.lang.Object r0 = p365hg.C12869i0.m20584w(r8, r0, r9)     // Catch:{ Exception -> 0x0098 }
                boolean r9 = r0 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0098 }
                if (r9 == 0) goto L_0x003b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0098 }
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r9)     // Catch:{ Exception -> 0x0098 }
                r0 = r0 ^ r6
                if (r0 != 0) goto L_0x003b
                r0 = r6
                goto L_0x003c
            L_0x003b:
                r0 = r7
            L_0x003c:
                if (r0 != 0) goto L_0x003f
                goto L_0x009c
            L_0x003f:
                java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                java.lang.String r9 = "getAdvertisingIdInfo"
                java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0098 }
                java.lang.Class<android.content.Context> r11 = android.content.Context.class
                r10[r7] = r11     // Catch:{ Exception -> 0x0098 }
                java.lang.reflect.Method r0 = p365hg.C12869i0.m20580s(r0, r9, r10)     // Catch:{ Exception -> 0x0098 }
                if (r0 == 0) goto L_0x009c
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0098 }
                r9[r7] = r1     // Catch:{ Exception -> 0x0098 }
                java.lang.Object r0 = p365hg.C12869i0.m20584w(r8, r0, r9)     // Catch:{ Exception -> 0x0098 }
                if (r0 == 0) goto L_0x009c
                java.lang.Class r9 = r0.getClass()     // Catch:{ Exception -> 0x0098 }
                java.lang.String r10 = "getId"
                java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0098 }
                java.lang.reflect.Method r9 = p365hg.C12869i0.m20579r(r9, r10, r11)     // Catch:{ Exception -> 0x0098 }
                java.lang.Class r10 = r0.getClass()     // Catch:{ Exception -> 0x0098 }
                java.lang.String r11 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0098 }
                java.lang.reflect.Method r10 = p365hg.C12869i0.m20579r(r10, r11, r12)     // Catch:{ Exception -> 0x0098 }
                if (r9 == 0) goto L_0x009c
                if (r10 != 0) goto L_0x0076
                goto L_0x009c
            L_0x0076:
                hg.b r11 = new hg.b     // Catch:{ Exception -> 0x0098 }
                r11.<init>()     // Catch:{ Exception -> 0x0098 }
                java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0098 }
                java.lang.Object r9 = p365hg.C12869i0.m20584w(r0, r9, r12)     // Catch:{ Exception -> 0x0098 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0098 }
                r11.f28322a = r9     // Catch:{ Exception -> 0x0098 }
                java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0098 }
                java.lang.Object r0 = p365hg.C12869i0.m20584w(r0, r10, r9)     // Catch:{ Exception -> 0x0098 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0098 }
                if (r0 == 0) goto L_0x0094
                boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0098 }
                goto L_0x0095
            L_0x0094:
                r0 = r7
            L_0x0095:
                r11.f28326e = r0     // Catch:{ Exception -> 0x0098 }
                goto L_0x009d
            L_0x0098:
                r0 = move-exception
                p365hg.C12869i0.m20550F(r5, r0)
            L_0x009c:
                r11 = r8
            L_0x009d:
                if (r11 != 0) goto L_0x00eb
                hg.b$c r9 = new hg.b$c
                r9.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r10 = "com.google.android.gms.ads.identifier.service.START"
                r0.<init>(r10)
                java.lang.String r10 = "com.google.android.gms"
                r0.setPackage(r10)
                boolean r0 = r1.bindService(r0, r9, r6)     // Catch:{ SecurityException -> 0x00e3 }
                if (r0 == 0) goto L_0x00e3
                hg.b$b r0 = new hg.b$b     // Catch:{ Exception -> 0x00d7 }
                android.os.IBinder r6 = r9.mo45617a()     // Catch:{ Exception -> 0x00d7 }
                r0.<init>(r6)     // Catch:{ Exception -> 0x00d7 }
                hg.b r6 = new hg.b     // Catch:{ Exception -> 0x00d7 }
                r6.<init>()     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r10 = r0.mo45615b()     // Catch:{ Exception -> 0x00d7 }
                r6.f28322a = r10     // Catch:{ Exception -> 0x00d7 }
                boolean r0 = r0.mo45616c()     // Catch:{ Exception -> 0x00d7 }
                r6.f28326e = r0     // Catch:{ Exception -> 0x00d7 }
                r1.unbindService(r9)
                r11 = r6
                goto L_0x00e4
            L_0x00d5:
                r0 = move-exception
                goto L_0x00df
            L_0x00d7:
                r0 = move-exception
                p365hg.C12869i0.m20550F(r5, r0)     // Catch:{ all -> 0x00d5 }
                r1.unbindService(r9)
                goto L_0x00e3
            L_0x00df:
                r1.unbindService(r9)
                throw r0
            L_0x00e3:
                r11 = r8
            L_0x00e4:
                if (r11 != 0) goto L_0x00eb
                hg.b r11 = new hg.b
                r11.<init>()
            L_0x00eb:
                android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 != 0) goto L_0x01d2
                hg.b r0 = p365hg.C12831b.f28320g     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 == 0) goto L_0x010c
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                long r9 = r0.f28323b     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                long r5 = r5 - r9
                r9 = 3600000(0x36ee80, double:1.7786363E-317)
                int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r5 >= 0) goto L_0x010c
                return r0
            L_0x010c:
                java.lang.String[] r14 = new java.lang.String[]{r4, r3, r2}     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                android.content.pm.PackageManager r0 = r18.getPackageManager()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r5 = "com.facebook.katana.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r5, r7)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                android.content.pm.PackageManager r5 = r18.getPackageManager()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r6 = "com.facebook.wakizashi.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r7)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 == 0) goto L_0x013a
                java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r6 = "contentProviderInfo.packageName"
                kotlin.jvm.internal.C19383o.m32796f(r0, r6)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                boolean r0 = p365hg.C12866h.m20543a(r1, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 == 0) goto L_0x013a
                java.lang.String r0 = "content://com.facebook.katana.provider.AttributionIdProvider"
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                goto L_0x014f
            L_0x013a:
                if (r5 == 0) goto L_0x0151
                java.lang.String r0 = r5.packageName     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r5 = "wakizashiProviderInfo.packageName"
                kotlin.jvm.internal.C19383o.m32796f(r0, r5)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                boolean r0 = p365hg.C12866h.m20543a(r1, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 == 0) goto L_0x0151
                java.lang.String r0 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
            L_0x014f:
                r13 = r0
                goto L_0x0152
            L_0x0151:
                r13 = r8
            L_0x0152:
                android.content.pm.PackageManager r0 = r18.getPackageManager()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r0 == 0) goto L_0x0161
                java.lang.String r5 = r18.getPackageName()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r0 = r0.getInstallerPackageName(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                goto L_0x0162
            L_0x0161:
                r0 = r8
            L_0x0162:
                if (r0 == 0) goto L_0x0166
                r11.f28325d = r0     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
            L_0x0166:
                if (r13 != 0) goto L_0x0174
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                r11.f28323b = r0     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                p365hg.C12831b.f28320g = r11     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                return r11
            L_0x0171:
                r0 = move-exception
                goto L_0x01fa
            L_0x0174:
                android.content.ContentResolver r12 = r18.getContentResolver()     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                r15 = 0
                r16 = 0
                r17 = 0
                android.database.Cursor r1 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                if (r1 == 0) goto L_0x01c2
                boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x01d0 }
                if (r0 != 0) goto L_0x018a
                goto L_0x01c2
            L_0x018a:
                int r0 = r1.getColumnIndex(r4)     // Catch:{ Exception -> 0x01d0 }
                int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x01d0 }
                int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x01d0 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x01d0 }
                r11.f28324c = r0     // Catch:{ Exception -> 0x01d0 }
                if (r3 <= 0) goto L_0x01b6
                if (r2 <= 0) goto L_0x01b6
                java.lang.String r0 = r11.mo45613a()     // Catch:{ Exception -> 0x01d0 }
                if (r0 != 0) goto L_0x01b6
                java.lang.String r0 = r1.getString(r3)     // Catch:{ Exception -> 0x01d0 }
                r11.f28322a = r0     // Catch:{ Exception -> 0x01d0 }
                java.lang.String r0 = r1.getString(r2)     // Catch:{ Exception -> 0x01d0 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x01d0 }
                r11.f28326e = r0     // Catch:{ Exception -> 0x01d0 }
            L_0x01b6:
                r1.close()
                long r0 = java.lang.System.currentTimeMillis()
                r11.f28323b = r0
                p365hg.C12831b.f28320g = r11
                return r11
            L_0x01c2:
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01d0 }
                r11.f28323b = r2     // Catch:{ Exception -> 0x01d0 }
                p365hg.C12831b.f28320g = r11     // Catch:{ Exception -> 0x01d0 }
                if (r1 == 0) goto L_0x01cf
                r1.close()
            L_0x01cf:
                return r11
            L_0x01d0:
                r0 = move-exception
                goto L_0x01dc
            L_0x01d2:
                com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                java.lang.String r1 = "getAttributionIdentifiers cannot be called on the main thread."
                r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
                throw r0     // Catch:{ Exception -> 0x01da, all -> 0x0171 }
            L_0x01da:
                r0 = move-exception
                r1 = r8
            L_0x01dc:
                java.lang.String r2 = p365hg.C12831b.f28319f     // Catch:{ all -> 0x01f8 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f8 }
                r3.<init>()     // Catch:{ all -> 0x01f8 }
                java.lang.String r4 = "Caught unexpected exception in getAttributionId(): "
                r3.append(r4)     // Catch:{ all -> 0x01f8 }
                r3.append(r0)     // Catch:{ all -> 0x01f8 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01f8 }
                p365hg.C12869i0.m20551G(r2, r0)     // Catch:{ all -> 0x01f8 }
                if (r1 == 0) goto L_0x01f7
                r1.close()
            L_0x01f7:
                return r8
            L_0x01f8:
                r0 = move-exception
                r8 = r1
            L_0x01fa:
                if (r8 == 0) goto L_0x01ff
                r8.close()
            L_0x01ff:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p365hg.C12831b.C12832a.m20469a(android.content.Context):hg.b");
        }
    }

    /* renamed from: hg.b$b */
    public static final class C12833b implements IInterface {

        /* renamed from: a */
        public final IBinder f28327a;

        public C12833b(IBinder iBinder) {
            this.f28327a = iBinder;
        }

        public final IBinder asBinder() {
            return this.f28327a;
        }

        /* renamed from: b */
        public final String mo45615b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C19383o.m32796f(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            C19383o.m32796f(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f28327a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: c */
        public final boolean mo45616c() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C19383o.m32796f(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            C19383o.m32796f(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f28327a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: hg.b$c */
    public static final class C12834c implements ServiceConnection {

        /* renamed from: b */
        public final AtomicBoolean f28328b = new AtomicBoolean(false);

        /* renamed from: c */
        public final LinkedBlockingDeque f28329c = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder mo45617a() throws InterruptedException {
            if (!this.f28328b.compareAndSet(true, true)) {
                Object take = this.f28329c.take();
                C19383o.m32796f(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f28329c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public final String mo45613a() {
        if (!C13418j.m21113i() || !C13442y.m21139b()) {
            return null;
        }
        return this.f28322a;
    }
}
