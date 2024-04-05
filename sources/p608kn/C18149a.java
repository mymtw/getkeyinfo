package p608kn;

import android.view.View;
import android.view.animation.Animation;
import com.google.firebase.perf.p530v1.C16660d;
import com.google.firebase.perf.util.Timer;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.pojo.AddShippingAddressResponse;
import com.paypal.pyplcheckout.services.callbacks.AddShippingAddressCallback;

/* renamed from: kn.a */
public final /* synthetic */ class C18149a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39629b;

    /* renamed from: c */
    public final /* synthetic */ Object f39630c;

    /* renamed from: d */
    public final /* synthetic */ Object f39631d;

    public /* synthetic */ C18149a(int i, Object obj, Object obj2) {
        this.f39629b = i;
        this.f39630c = obj;
        this.f39631d = obj2;
    }

    public final void run() {
        switch (this.f39629b) {
            case 0:
                C18150b bVar = (C18150b) this.f39630c;
                C16660d b = bVar.mo69699b((Timer) this.f39631d);
                if (b != null) {
                    bVar.f39634a.add(b);
                    return;
                }
                return;
            case 1:
                AnimationUtils.m35199expand$lambda1((View) this.f39630c, (Animation) this.f39631d);
                return;
            default:
                AddShippingAddressCallback.m35424onApiSuccess$lambda0((AddShippingAddressCallback) this.f39630c, (AddShippingAddressResponse) this.f39631d);
                return;
        }
    }
}
