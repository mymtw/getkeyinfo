package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.j */
public final class C1337j {

    /* renamed from: a */
    public static final Object f2931a = new Object();

    /* renamed from: a */
    public static final C1330i m2819a(C1293a aVar, C1324g gVar) {
        C19383o.m32797g(gVar, ResponseConstants.PARENT);
        return new C1330i(gVar, aVar);
    }

    /* renamed from: b */
    public static final CoroutineContext m2820b(C1349n nVar) {
        C19383o.m32797g(nVar, "<this>");
        C1330i iVar = nVar instanceof C1330i ? (C1330i) nVar : null;
        if (iVar != null) {
            CoroutineContext coroutineContext = iVar.f2908s;
            if (coroutineContext == null) {
                coroutineContext = iVar.f2891b.mo5484h();
            }
            if (coroutineContext != null) {
                return coroutineContext;
            }
        }
        return EmptyCoroutineContext.INSTANCE;
    }
}
