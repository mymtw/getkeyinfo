package androidx.compose.p015ui.platform;

import androidx.compose.runtime.saveable.C1369e;
import androidx.compose.runtime.saveable.C1371f;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.i0 */
public final class C1839i0 implements C1369e {

    /* renamed from: a */
    public final C19846a<C19394m> f4097a;

    /* renamed from: b */
    public final /* synthetic */ C1369e f4098b;

    public C1839i0(C1371f fVar, C19846a aVar) {
        this.f4097a = aVar;
        this.f4098b = fVar;
    }

    /* renamed from: a */
    public final boolean mo5923a(Object obj) {
        C19383o.m32797g(obj, "value");
        return this.f4098b.mo5923a(obj);
    }

    /* renamed from: b */
    public final C1369e.C1370a mo5924b(String str, C19846a<? extends Object> aVar) {
        C19383o.m32797g(str, "key");
        return this.f4098b.mo5924b(str, aVar);
    }

    /* renamed from: c */
    public final Map<String, List<Object>> mo5925c() {
        return this.f4098b.mo5925c();
    }

    /* renamed from: d */
    public final Object mo5926d(String str) {
        C19383o.m32797g(str, "key");
        return this.f4098b.mo5926d(str);
    }
}
