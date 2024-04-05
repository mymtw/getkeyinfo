package p594jh;

import p513bj.C14060k;
import p594jh.C17884a1;

/* renamed from: jh.z */
public final /* synthetic */ class C17987z implements C14060k.C14061a {

    /* renamed from: a */
    public final /* synthetic */ int f39329a;

    /* renamed from: b */
    public final /* synthetic */ Object f39330b;

    public /* synthetic */ C17987z(Object obj, int i) {
        this.f39329a = i;
        this.f39330b = obj;
    }

    public final void invoke(Object obj) {
        switch (this.f39329a) {
            case 0:
                ((C17884a1.C17886b) obj).onPlaybackSuppressionReasonChanged(((C17984x0) this.f39330b).f39316m);
                return;
            default:
                ((C17884a1.C17886b) obj).onAvailableCommandsChanged(((C17916h0) this.f39330b).f38905A);
                return;
        }
    }
}
