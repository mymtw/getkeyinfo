package p325cg;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

/* renamed from: cg.b */
public final class C8587b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f18688b;

    /* renamed from: c */
    public final /* synthetic */ String f18689c = "com.facebook.sdk.attributionTracking";

    /* renamed from: d */
    public final /* synthetic */ String f18690d;

    public C8587b(Context context, String str) {
        this.f18688b = context;
        this.f18690d = str;
    }

    public final void run() {
        Class<RemoteServiceWrapper> cls;
        if (!C13080a.m20762b(this)) {
            try {
                SharedPreferences sharedPreferences = this.f18688b.getSharedPreferences(this.f18689c, 0);
                String str = this.f18690d + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0) == 0) {
                    String str2 = this.f18690d;
                    String str3 = RemoteServiceWrapper.f27325a;
                    cls = RemoteServiceWrapper.class;
                    if (!C13080a.m20762b(cls)) {
                        C19383o.m32797g(str2, "applicationId");
                        RemoteServiceWrapper.f27327c.mo39357b(RemoteServiceWrapper.EventType.MOBILE_APP_INSTALL, str2, EmptyList.INSTANCE);
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
