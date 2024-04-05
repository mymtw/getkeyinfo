package p312ag;

import com.facebook.appevents.internal.ActivityLifecycleTracker;
import p312ag.C8532h;
import p401mg.C13080a;

/* renamed from: ag.a */
public final class C8523a implements Runnable {

    /* renamed from: b */
    public static final C8523a f18562b = new C8523a();

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                String str = ActivityLifecycleTracker.f27293a;
                if (ActivityLifecycleTracker.f27298f == null) {
                    ActivityLifecycleTracker.f27298f = C8532h.C8533a.m16939a();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
