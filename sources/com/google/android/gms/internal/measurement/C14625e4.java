package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.e4 */
public final class C14625e4 {

    /* renamed from: a */
    public static volatile zzhz<Boolean> f32823a = zzhz.zzc();

    /* renamed from: b */
    public static final Object f32824b = new Object();

    /* renamed from: a */
    public static boolean m23510a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f32823a.zzb()) {
            return f32823a.zza().booleanValue();
        } else {
            synchronized (f32824b) {
                if (f32823a.zzb()) {
                    boolean booleanValue = f32823a.zza().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f32823a = zzhz.zzd(Boolean.valueOf(z));
                    return f32823a.zza().booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f32823a = zzhz.zzd(Boolean.valueOf(z));
                return f32823a.zza().booleanValue();
            }
        }
    }
}
