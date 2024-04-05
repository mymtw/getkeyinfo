package com.etsy.android.lib.requests.apiv3;

import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20016y;

public final class GzippedRequestBodyKt {
    public static final C20016y toGzippedRequestBody(byte[] bArr, C20002r rVar) {
        C19383o.m32797g(bArr, "<this>");
        return GzippedRequestBody.Companion.create(rVar, bArr);
    }

    public static /* synthetic */ C20016y toGzippedRequestBody$default(byte[] bArr, C20002r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = null;
        }
        return toGzippedRequestBody(bArr, rVar);
    }

    public static final C20016y toGzippedRequestBody(String str, C20002r rVar) {
        C19383o.m32797g(str, "<this>");
        return GzippedRequestBody.Companion.create(rVar, str);
    }

    public static /* synthetic */ C20016y toGzippedRequestBody$default(String str, C20002r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = null;
        }
        return toGzippedRequestBody(str, rVar);
    }
}
