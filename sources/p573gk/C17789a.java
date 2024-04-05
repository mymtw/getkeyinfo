package p573gk;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: gk.a */
public final class C17789a {

    /* renamed from: a */
    public static final GoogleApiAvailabilityLight f38661a = GoogleApiAvailabilityLight.getInstance();

    /* renamed from: b */
    public static final Object f38662b = new Object();

    /* renamed from: c */
    public static Method f38663c = null;

    /* renamed from: d */
    public static Method f38664d = null;

    /* renamed from: a */
    public static void m29916a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        long elapsedRealtime;
        Context context2;
        Preconditions.checkNotNull(context, "Context must not be null");
        f38661a.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (f38662b) {
            try {
                elapsedRealtime = SystemClock.elapsedRealtime();
                context2 = DynamiteModule.m22901c(context, DynamiteModule.f32576d, "com.google.android.gms.providerinstaller.dynamite").f32586a;
            } catch (DynamiteModule.LoadingException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ProviderInstaller", valueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(valueOf) : new String("Failed to load providerinstaller module: "));
                context2 = null;
            } catch (Throwable th) {
                throw th;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext != null) {
                    try {
                        if (f38664d == null) {
                            Class cls = Long.TYPE;
                            f38664d = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f38664d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        Log.w("ProviderInstaller", valueOf2.length() != 0 ? "Failed to report request stats: ".concat(valueOf2) : new String("Failed to report request stats: "));
                    }
                }
                if (remoteContext != null) {
                    m29917b(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else {
                m29917b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    public static void m29917b(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f38663c == null) {
                f38663c = context.getClassLoader().loadClass(str).getMethod("insertProvider", new Class[]{Context.class});
            }
            f38663c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? e.getMessage() : cause.getMessage());
                Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new String("Failed to install provider: "));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
