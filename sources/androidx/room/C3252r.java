package androidx.room;

import com.appboy.p043ui.AppboyXamarinFormsFeedFragment;
import com.paypal.checkout.paymentbutton.PaymentButton;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import java.util.Collections;
import p594jh.C17927j1;
import p726zi.C18917l;

/* renamed from: androidx.room.r */
public final /* synthetic */ class C3252r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7571b;

    /* renamed from: c */
    public final /* synthetic */ Object f7572c;

    public /* synthetic */ C3252r(Object obj, int i) {
        this.f7571b = i;
        this.f7572c = obj;
    }

    public final void run() {
        switch (this.f7571b) {
            case 0:
                ((C3255u) this.f7572c).getClass();
                Collections.emptyList();
                throw null;
            case 1:
                ((AppboyXamarinFormsFeedFragment) this.f7572c).lambda$onRefresh$4();
                return;
            case 2:
                int i = C17927j1.C17929b.f39026b;
                ((C17927j1) this.f7572c).mo69417c();
                return;
            case 3:
                ((C18917l) this.f7572c).f42153n.start();
                return;
            case 4:
                PaymentButton.m35150noEligibilityRunnable$lambda2((PaymentButton) this.f7572c);
                return;
            default:
                CheckoutAnimationSequence.m35207fadeOutView$lambda2((CheckoutAnimationSequence) this.f7572c);
                return;
        }
    }
}
