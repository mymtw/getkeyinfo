package com.etsy.android.p327ui.shop;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.shop.BaseShopHomePageRepository", mo70541f = "BaseShopHomePageRepository.kt", mo70542l = {35}, mo70543m = "fetchHomePageDataCoroutine")
/* renamed from: com.etsy.android.ui.shop.BaseShopHomePageRepository$fetchHomePageDataCoroutine$1 */
public final class BaseShopHomePageRepository$fetchHomePageDataCoroutine$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseShopHomePageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseShopHomePageRepository$fetchHomePageDataCoroutine$1(BaseShopHomePageRepository baseShopHomePageRepository, C19340c<? super BaseShopHomePageRepository$fetchHomePageDataCoroutine$1> cVar) {
        super(cVar);
        this.this$0 = baseShopHomePageRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo36761a((C11167i) null, this);
    }
}
