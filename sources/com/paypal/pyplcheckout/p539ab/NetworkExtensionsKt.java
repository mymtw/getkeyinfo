package com.paypal.pyplcheckout.p539ab;

import java.io.IOException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import okhttp3.C19944e;

/* renamed from: com.paypal.pyplcheckout.ab.NetworkExtensionsKt */
public final class NetworkExtensionsKt {
    public static final <T> Object await(C19944e eVar, Class<T> cls, C19340c<? super T> cVar) {
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        eVar.mo72857S(new NetworkExtensionsKt$await$2$1(cls, lVar));
        lVar.mo72497O(new NetworkExtensionsKt$await$2$2(eVar));
        Object l = lVar.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    private static final <T> Object await$$forInline(C19944e eVar, Class<T> cls, C19340c<? super T> cVar) {
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        eVar.mo72857S(new NetworkExtensionsKt$await$2$1(cls, lVar));
        lVar.mo72497O(new NetworkExtensionsKt$await$2$2(eVar));
        Object l = lVar.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    public static final <T> Object executeSuspending(C19944e eVar, C19340c<? super T> cVar) throws IOException {
        C19383o.m32804n();
        throw null;
    }

    public static final <T> Object await(C19944e eVar, C19340c<? super T> cVar) {
        C19383o.m32804n();
        throw null;
    }
}
