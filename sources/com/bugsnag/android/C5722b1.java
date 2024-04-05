package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.b1 */
public final class C5722b1 implements C5748g1.C5749a {

    /* renamed from: b */
    public final String f12157b;

    /* renamed from: c */
    public final Map<String, String> f12158c;

    public C5722b1(Map<String, String> map) {
        C19383o.m32798h(map, "store");
        this.f12158c = map;
        this.f12157b = "__EMPTY_VARIANT_SENTINEL__";
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "stream");
        g1Var.mo16520b();
        for (Map.Entry next : this.f12158c.entrySet()) {
            String str = (String) next.getValue();
            g1Var.mo16522d();
            g1Var.mo16514B("featureFlag");
            g1Var.mo16530k((String) next.getKey());
            if (!C19383o.m32792b(str, this.f12157b)) {
                g1Var.mo16514B("variant");
                g1Var.mo16530k(str);
            }
            g1Var.mo16526g();
        }
        g1Var.mo16524f();
    }

    public /* synthetic */ C5722b1() {
        this(new ConcurrentHashMap());
    }
}
