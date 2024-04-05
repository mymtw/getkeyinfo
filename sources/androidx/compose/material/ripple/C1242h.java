package androidx.compose.material.ripple;

import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.google.android.exoplayer2.source.hls.C14325m;
import com.paypal.pyplcheckout.sca.ScaUiListenerKt;
import java.util.Set;
import p753kq.C19846a;

/* renamed from: androidx.compose.material.ripple.h */
public final /* synthetic */ class C1242h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f2598b;

    /* renamed from: c */
    public final /* synthetic */ Object f2599c;

    public /* synthetic */ C1242h(Object obj, int i) {
        this.f2598b = i;
        this.f2599c = obj;
    }

    public final void run() {
        switch (this.f2598b) {
            case 0:
                RippleHostView.m34768setRippleState$lambda2((RippleHostView) this.f2599c);
                return;
            case 1:
                ThirdPartySignInFragment.m35022requestFocusRunnable$lambda0((ThirdPartySignInFragment) this.f2599c);
                return;
            case 2:
                Set<Integer> set = C14325m.f31950Z;
                ((C14325m) this.f2599c).mo47739D();
                return;
            default:
                ScaUiListenerKt.m35422runOnUiThread$lambda0((C19846a) this.f2599c);
                return;
        }
    }
}
