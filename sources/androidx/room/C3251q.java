package androidx.room;

import android.media.MediaCodec;
import com.google.android.exoplayer2.source.C14355m;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.services.callbacks.CryptoCurrencyQuoteCallback;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.room.q */
public final /* synthetic */ class C3251q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7569b;

    /* renamed from: c */
    public final /* synthetic */ Object f7570c;

    public /* synthetic */ C3251q(Object obj, int i) {
        this.f7569b = i;
        this.f7570c = obj;
    }

    public final void run() {
        switch (this.f7569b) {
            case 0:
                ((C3255u) this.f7570c).getClass();
                Collections.emptyList();
                throw null;
            case 1:
                ((MediaCodec) this.f7570c).start();
                return;
            case 2:
                Map<String, String> map = C14355m.f32180N;
                ((C14355m) this.f7570c).mo47809z();
                return;
            case 3:
                CheckoutAnimationSequence.m35209showView$lambda1((CheckoutAnimationSequence) this.f7570c);
                return;
            case 4:
                PayPalSnappingRecyclerView.m35366setUpCarousel$lambda29((PayPalSnappingRecyclerView) this.f7570c);
                return;
            default:
                CryptoCurrencyQuoteCallback.m35428onApiSuccess$lambda2((Exception) this.f7570c);
                return;
        }
    }
}
