package com.etsy.android.p327ui.favorites.add;

import com.google.firebase.perf.p530v1.C16653b;
import com.google.firebase.perf.util.Timer;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.services.callbacks.UserAndCheckoutCallback;
import kotlin.jvm.internal.Ref$ObjectRef;
import p568fn.C17781a;
import p608kn.C18156h;

/* renamed from: com.etsy.android.ui.favorites.add.v */
public final /* synthetic */ class C9787v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21638b;

    /* renamed from: c */
    public final /* synthetic */ Object f21639c;

    /* renamed from: d */
    public final /* synthetic */ Object f21640d;

    public /* synthetic */ C9787v(int i, Object obj, Object obj2) {
        this.f21638b = i;
        this.f21639c = obj;
        this.f21640d = obj2;
    }

    public final void run() {
        switch (this.f21638b) {
            case 0:
                NameAListFragment.m34974back$lambda7((NameAListFragment) this.f21639c, (Ref$ObjectRef) this.f21640d);
                return;
            case 1:
                C18156h hVar = (C18156h) this.f21639c;
                C17781a aVar = C18156h.f39648f;
                C16653b b = hVar.mo69702b((Timer) this.f21640d);
                if (b != null) {
                    hVar.f39650b.add(b);
                    return;
                }
                return;
            default:
                UserAndCheckoutCallback.m35432onApiSuccess$lambda1((UserAndCheckoutCallback) this.f21639c, (UserCheckoutResponse) this.f21640d);
                return;
        }
    }
}
