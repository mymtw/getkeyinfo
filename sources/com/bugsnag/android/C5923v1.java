package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.bugsnag.android.internal.C5760a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;

/* renamed from: com.bugsnag.android.v1 */
public final class C5923v1 {

    /* renamed from: a */
    public Set<String> f12669a = C19382n.m32702C0("password");

    /* renamed from: a */
    public final void mo16692a(Object obj, C5748g1 g1Var, boolean z) throws IOException {
        boolean z2;
        C19383o.m32798h(g1Var, "writer");
        if (obj == null) {
            g1Var.mo16527h();
        } else if (obj instanceof String) {
            g1Var.mo16530k((String) obj);
        } else if (obj instanceof Number) {
            g1Var.mo16533t((Number) obj);
        } else if (obj instanceof Boolean) {
            g1Var.mo16534u(((Boolean) obj).booleanValue());
        } else if (obj instanceof C5748g1.C5749a) {
            ((C5748g1.C5749a) obj).toStream(g1Var);
        } else if (obj instanceof Date) {
            g1Var.mo16530k(C5760a.m11557b((Date) obj));
        } else if (obj instanceof Map) {
            g1Var.mo16522d();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    String str = (String) key;
                    g1Var.mo16514B(str);
                    if (z) {
                        Set<String> set = this.f12669a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator<T> it = set.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (C19459m.m33036e1(str, (String) it.next(), false)) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            g1Var.mo16530k("[REDACTED]");
                        }
                    }
                    mo16692a(entry.getValue(), g1Var, z);
                }
            }
            g1Var.mo16526g();
        } else if (obj instanceof Collection) {
            g1Var.mo16520b();
            for (Object a : (Collection) obj) {
                mo16692a(a, g1Var, false);
            }
            g1Var.mo16524f();
        } else if (obj.getClass().isArray()) {
            g1Var.mo16520b();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                mo16692a(Array.get(obj, i), g1Var, false);
            }
            g1Var.mo16524f();
        } else {
            g1Var.mo16530k("[OBJECT]");
        }
    }
}
