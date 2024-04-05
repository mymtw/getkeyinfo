package p517bn;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.app.C0164l;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.play.core.assetpacks.C15664v1;
import com.google.firebase.messaging.C16588c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18126j;

@KeepForSdk
/* renamed from: bn.i */
public final class C14118i {

    /* renamed from: b */
    public static final Object f31103b = new Object();

    /* renamed from: c */
    public static C16588c f31104c;

    /* renamed from: a */
    public final Context f31105a;

    public C14118i(Context context) {
        this.f31105a = context;
    }

    /* renamed from: a */
    public static C18123g<Integer> m21855a(Context context, Intent intent) {
        C16588c cVar;
        C18117a0<TResult> a0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f31103b) {
            if (f31104c == null) {
                f31104c = new C16588c(context);
            }
            cVar = f31104c;
        }
        synchronized (cVar) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            C16588c.C16589a aVar = new C16588c.C16589a(intent);
            ScheduledExecutorService scheduledExecutorService = cVar.f36803d;
            aVar.f36808b.f39566a.mo69655b(scheduledExecutorService, new C0164l((Object) scheduledExecutorService.schedule(new C15664v1(aVar, 2), 9000, TimeUnit.MILLISECONDS)));
            cVar.f36804e.add(aVar);
            cVar.mo59203a();
            a0Var = aVar.f36808b.f39566a;
        }
        return a0Var.mo69660g(C14117h.f31102b, C14113f.f31094b);
    }

    @KeepForSdk
    /* renamed from: b */
    public final C18123g<Integer> mo46995b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f31105a;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return m21855a(context, intent);
        }
        C14117h hVar = C14117h.f31102b;
        return C18126j.m30615c(hVar, new C14115g(context, intent)).mo69662i(hVar, new C14110e(context, intent));
    }
}
