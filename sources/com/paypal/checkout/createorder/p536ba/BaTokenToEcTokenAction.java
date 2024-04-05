package com.paypal.checkout.createorder.p536ba;

import com.google.gson.C16708i;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;

/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenAction */
public final class BaTokenToEcTokenAction {
    /* access modifiers changed from: private */
    public final BaTokenToEcTokenRequestFactory baTokenToEcTokenRequestFactory;
    /* access modifiers changed from: private */
    public final C16708i gson;
    private final CoroutineDispatcher ioDispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;

    public BaTokenToEcTokenAction(BaTokenToEcTokenRequestFactory baTokenToEcTokenRequestFactory2, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(baTokenToEcTokenRequestFactory2, "baTokenToEcTokenRequestFactory");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.baTokenToEcTokenRequestFactory = baTokenToEcTokenRequestFactory2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object execute(String str, C19340c<? super String> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new BaTokenToEcTokenAction$execute$2(this, str, (C19340c<? super BaTokenToEcTokenAction$execute$2>) null));
    }
}
