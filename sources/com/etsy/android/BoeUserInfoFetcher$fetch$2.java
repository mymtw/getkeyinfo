package com.etsy.android;

import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p346fa.C12703a;
import p753kq.C19857l;
import retrofit2.HttpException;

public final class BoeUserInfoFetcher$fetch$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ BoeUserInfoFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoeUserInfoFetcher$fetch$2(BoeUserInfoFetcher boeUserInfoFetcher) {
        super(1);
        this.this$0 = boeUserInfoFetcher;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
        String message = th instanceof HttpException ? th.getMessage() : null;
        if (message == null) {
            message = "unknown";
        }
        C12703a aVar = this.this$0.f14092d;
        aVar.mo45474a("session.BoeUserInfoFetcher.failure." + message);
        this.this$0.f14089a.f29140f = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
