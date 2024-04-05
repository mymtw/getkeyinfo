package com.etsy.android.p327ui.cart.googlepay;

import android.app.Activity;
import android.view.View;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.p327ui.cart.googlepay.C9308f;
import com.google.firebase.perf.p530v1.C16660d;
import com.google.firebase.perf.util.Timer;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback;
import kotlin.jvm.internal.C19383o;
import p311af.C8515a;
import p568fn.C17781a;
import p608kn.C18150b;

/* renamed from: com.etsy.android.ui.cart.googlepay.d */
public final /* synthetic */ class C9306d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f20535b;

    /* renamed from: c */
    public final /* synthetic */ Object f20536c;

    /* renamed from: d */
    public final /* synthetic */ Object f20537d;

    public /* synthetic */ C9306d(int i, Object obj, Object obj2) {
        this.f20535b = i;
        this.f20536c = obj;
        this.f20537d = obj2;
    }

    public final void run() {
        switch (this.f20535b) {
            case 0:
                C9308f fVar = (C9308f) this.f20536c;
                C9308f.C9309a aVar = (C9308f.C9309a) this.f20537d;
                C19383o.m32797g(fVar, "this$0");
                C19383o.m32797g(aVar, "this$1");
                if (fVar.f20547e.get() != null) {
                    View view = aVar.f20549b;
                    C19383o.m32794d(view);
                    view.setVisibility(0);
                    C9303a aVar2 = fVar.f20543a;
                    Activity activity = fVar.f20547e.get();
                    C19383o.m32794d(activity);
                    GooglePayDataContract googlePayDataContract = fVar.f20545c;
                    C19383o.m32794d(googlePayDataContract);
                    C9303a.m17696d(aVar2, activity, googlePayDataContract);
                    return;
                }
                return;
            case 1:
                C8515a aVar3 = (C8515a) this.f20536c;
                ShopCard shopCard = (ShopCard) this.f20537d;
                int i = C8515a.f18530j;
                C19383o.m32797g(aVar3, "this$0");
                C19383o.m32797g(shopCard, "$shopData");
                int width = aVar3.f18532c.getWidth();
                C0761x.m1710b0(aVar3.f18532c, shopCard.getIcon().pickBestImageSource(width, aVar3.f18532c.getHeight()), width);
                return;
            case 2:
                C18150b bVar = (C18150b) this.f20536c;
                C17781a aVar4 = C18150b.f39632g;
                C16660d b = bVar.mo69699b((Timer) this.f20537d);
                if (b != null) {
                    bVar.f39634a.add(b);
                    return;
                }
                return;
            default:
                ApprovePaymentCallback.m35425onApiSuccess$lambda0((ApprovePaymentCallback) this.f20536c, (ApprovePaymentResponse) this.f20537d);
                return;
        }
    }
}
