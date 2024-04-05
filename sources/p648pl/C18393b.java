package p648pl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.measurement.internal.C15032m3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: pl.b */
public final class C18393b {

    /* renamed from: c */
    public static final C15032m3 f40451c = new C15032m3("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f40452a;

    /* renamed from: b */
    public final PackageManager f40453b;

    public C18393b(Context context, PackageManager packageManager) {
        this.f40452a = context;
        this.f40453b = packageManager;
    }

    /* renamed from: a */
    public final List mo69929a() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f40453b.getPackageInfo(this.f40452a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f40451c.mo52246f("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public final void mo69930b(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            this.f40453b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }
}
