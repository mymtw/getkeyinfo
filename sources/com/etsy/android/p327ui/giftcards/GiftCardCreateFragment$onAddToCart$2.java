package com.etsy.android.p327ui.giftcards;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardCreateFragment$onAddToCart$2 */
public /* synthetic */ class GiftCardCreateFragment$onAddToCart$2 extends FunctionReferenceImpl implements C19857l<Throwable, C19394m> {
    public GiftCardCreateFragment$onAddToCart$2(Object obj) {
        super(1, obj, GiftCardCreateFragment.class, "onGiftCardCreateError", "onGiftCardCreateError(Ljava/lang/Throwable;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "p0");
        ((GiftCardCreateFragment) this.receiver).onGiftCardCreateError(th);
    }
}
