package p521ck;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.internal.zze;

/* renamed from: ck.b */
public final class C14168b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Context f31272a;

    /* renamed from: b */
    public static zze f31273b;

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.internal.zze m21957a(android.content.Context r3) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.maps.internal.zze r0 = f31273b
            if (r0 == 0) goto L_0x0008
            return r0
        L_0x0008:
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r0 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r3, r0)
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "b"
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m21959c(r3)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ ClassNotFoundException -> 0x0067 }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x0067 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0067 }
            java.lang.Object r0 = m21958b(r0)     // Catch:{ ClassNotFoundException -> 0x0067 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0036
            r0 = 0
            goto L_0x004a
        L_0x0036:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.zze
            if (r2 == 0) goto L_0x0044
            r0 = r1
            com.google.android.gms.maps.internal.zze r0 = (com.google.android.gms.maps.internal.zze) r0
            goto L_0x004a
        L_0x0044:
            com.google.android.gms.maps.internal.zzf r1 = new com.google.android.gms.maps.internal.zzf
            r1.<init>(r0)
            r0 = r1
        L_0x004a:
            f31273b = r0
            android.content.Context r3 = m21959c(r3)     // Catch:{ RemoteException -> 0x0060 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch:{ RemoteException -> 0x0060 }
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ RemoteException -> 0x0060 }
            r0.zza((com.google.android.gms.dynamic.IObjectWrapper) r3, (int) r1)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.maps.internal.zze r3 = f31273b
            return r3
        L_0x0060:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r0.<init>(r3)
            throw r0
        L_0x0067:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to find dynamic class "
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0076
            java.lang.String r0 = r0.concat(r1)
            goto L_0x007c
        L_0x0076:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x007c:
            r3.<init>(r0)
            throw r3
        L_0x0080:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p521ck.C14168b.m21957a(android.content.Context):com.google.android.gms.maps.internal.zze");
    }

    /* renamed from: b */
    public static <T> T m21958b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
        }
    }

    /* renamed from: c */
    public static Context m21959c(Context context) {
        Context context2;
        Context context3 = f31272a;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = DynamiteModule.m22901c(context, DynamiteModule.f32574b, "com.google.android.gms.maps_dynamite").f32586a;
        } catch (Exception e) {
            Log.e("b", "Failed to load maps module, use legacy", e);
            context2 = GooglePlayServicesUtil.getRemoteContext(context);
        }
        f31272a = context2;
        return context2;
    }
}
