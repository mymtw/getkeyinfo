package p325cg;

import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p568fn.C17782b;

/* renamed from: cg.a */
public final class C8586a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f18686b;

    /* renamed from: c */
    public final /* synthetic */ AppEvent f18687c;

    public C8586a(String str, AppEvent appEvent) {
        this.f18686b = str;
        this.f18687c = appEvent;
    }

    public final void run() {
        Class<RemoteServiceWrapper> cls;
        if (!C13080a.m20762b(this)) {
            try {
                String str = this.f18686b;
                List d0 = C17782b.m29864d0(this.f18687c);
                String str2 = RemoteServiceWrapper.f27325a;
                cls = RemoteServiceWrapper.class;
                if (!C13080a.m20762b(cls)) {
                    C19383o.m32797g(str, "applicationId");
                    RemoteServiceWrapper.f27327c.mo39357b(RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS, str, d0);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
