package p726zi;

import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import com.paypal.pyplcheckout.pojo.CryptoQuoteResponse;
import com.paypal.pyplcheckout.services.callbacks.CryptoCurrencyQuoteCallback;

/* renamed from: zi.f */
public final /* synthetic */ class C18911f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f42130b;

    /* renamed from: c */
    public final /* synthetic */ Object f42131c;

    public /* synthetic */ C18911f(Object obj, int i) {
        this.f42130b = i;
        this.f42131c = obj;
    }

    public final void run() {
        switch (this.f42130b) {
            case 0:
                ((C18917l) this.f42131c).mo70353k();
                return;
            case 1:
                CheckoutAnimationSequence.m35206fadeInView$lambda3((CheckoutAnimationSequence) this.f42131c);
                return;
            default:
                CryptoCurrencyQuoteCallback.m35427onApiSuccess$lambda1((CryptoQuoteResponse) this.f42131c);
                return;
        }
    }
}
