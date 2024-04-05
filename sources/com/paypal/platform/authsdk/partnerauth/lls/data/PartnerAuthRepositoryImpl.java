package com.paypal.platform.authsdk.partnerauth.lls.data;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse;
import java.util.HashMap;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import p768rq.C20152a;

public final class PartnerAuthRepositoryImpl {

    /* renamed from: a */
    public final C17161a f37632a;

    /* renamed from: b */
    public final Context f37633b;

    /* renamed from: c */
    public final CoroutineDispatcher f37634c;

    public PartnerAuthRepositoryImpl(C17161a aVar, Context context) {
        C20152a aVar2 = C19760n0.f43720b;
        C19383o.m32797g(aVar, "partnerAuthAPIService");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(aVar2, "dispatcher");
        this.f37632a = aVar;
        this.f37633b = context;
        this.f37634c = aVar2;
    }

    /* renamed from: a */
    public final Object mo62571a(HashMap<String, String> hashMap, C19340c<? super ResultStatus<TokenResponse>> cVar) {
        return C19697g.m33471i(cVar, this.f37634c, new PartnerAuthRepositoryImpl$fetch$2(hashMap, this, (C19340c<? super PartnerAuthRepositoryImpl$fetch$2>) null));
    }
}
