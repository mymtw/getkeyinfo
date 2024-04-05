package com.paypal.pyplcheckout.p539ab;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import java.io.IOException;
import java.io.StringReader;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import okhttp3.C19928a0;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C20018z;

/* renamed from: com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$1 */
public final class NetworkExtensionsKt$await$2$1 implements C19946f {
    public final /* synthetic */ C19747k<T> $continuation;
    public final /* synthetic */ Class<T> $responseClass;

    public NetworkExtensionsKt$await$2$1(Class<T> cls, C19747k<? super T> kVar) {
        this.$responseClass = cls;
        this.$continuation = kVar;
    }

    public void onFailure(C19944e eVar, IOException iOException) {
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(iOException, "e");
        if (!eVar.mo72861n()) {
            this.$continuation.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(iOException)));
        }
    }

    public void onResponse(C19944e eVar, C20018z zVar) {
        String str;
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
        C19928a0 a0Var = zVar.f44368i;
        if (a0Var == null || (str = a0Var.mo72844g()) == null) {
            str = "";
        }
        try {
            this.$continuation.mo72503v(NetworkExtensionsKt$await$2$1$onResponse$1.INSTANCE, new C16708i().mo59457d(new StringReader(str), this.$responseClass));
        } catch (Exception e) {
            this.$continuation.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(e)));
        }
    }
}
