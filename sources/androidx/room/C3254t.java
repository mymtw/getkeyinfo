package androidx.room;

import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.Collections;
import p587ii.C17840a;
import p726zi.C18917l;

/* renamed from: androidx.room.t */
public final /* synthetic */ class C3254t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7576b;

    /* renamed from: c */
    public final /* synthetic */ Object f7577c;

    public /* synthetic */ C3254t(Object obj, int i) {
        this.f7576b = i;
        this.f7577c = obj;
    }

    public final void run() {
        switch (this.f7576b) {
            case 0:
                ((C3255u) this.f7577c).getClass();
                Collections.emptyList();
                throw null;
            case 1:
                CreateReviewActivity.m35088showSuccessConfirmation$lambda21((CreateReviewActivity) this.f7577c);
                return;
            case 2:
                ((C17840a) this.f7577c).getClass();
                throw null;
            case 3:
                C18917l lVar = (C18917l) this.f7577c;
                lVar.f42151l.start();
                lVar.f42140a.postDelayed(lVar.f42160u, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
                return;
            default:
                CheckoutAnimationSequence.m35205cycleIV$lambda5((CheckoutAnimationSequence) this.f7577c);
                return;
        }
    }
}
