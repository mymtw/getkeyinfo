package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19457k;
import p764pq.C20057i;

/* renamed from: com.bugsnag.android.j2 */
public final class C5776j2 implements C5748g1.C5749a {

    /* renamed from: b */
    public final List<C5759i2> f12370b;

    public C5776j2(List<C5759i2> list) {
        C19383o.m32798h(list, "frames");
        this.f12370b = list.size() >= 200 ? list.subList(0, 200) : list;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16520b();
        for (C5759i2 M : this.f12370b) {
            g1Var.mo16516M(M, false);
        }
        g1Var.mo16524f();
    }

    public C5776j2(StackTraceElement[] stackTraceElementArr, Collection<String> collection, C5816o1 o1Var) {
        String str;
        boolean z;
        Object[] objArr;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        C5816o1 o1Var2 = o1Var;
        C19383o.m32798h(collection, "projectPackages");
        C19383o.m32798h(o1Var2, "logger");
        if (stackTraceElementArr2.length >= 200) {
            C20057i D0 = C19388s.m32816D0(0, 200);
            C19383o.m32797g(D0, "indices");
            if (D0.isEmpty()) {
                objArr = C19318k.m32608Z0(0, 0, stackTraceElementArr2);
            } else {
                objArr = C19318k.m32608Z0(D0.mo74309c().intValue(), D0.mo74311g().intValue() + 1, stackTraceElementArr2);
            }
            stackTraceElementArr2 = (StackTraceElement[]) objArr;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr2) {
            C5759i2 i2Var = null;
            try {
                String className = stackTraceElement.getClassName();
                C19383o.m32793c(className, "className");
                if (className.length() > 0) {
                    str = className + "." + stackTraceElement.getMethodName();
                } else {
                    str = stackTraceElement.getMethodName();
                }
                String str2 = str;
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "Unknown";
                }
                String str3 = fileName;
                Integer valueOf = Integer.valueOf(stackTraceElement.getLineNumber());
                if (!collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C19457k.m33025c1(className, (String) it.next(), false)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                i2Var = new C5759i2(str2, str3, valueOf, z ? Boolean.TRUE : null, 48);
            } catch (Exception e) {
                o1Var2.mo16602b("Failed to serialize stacktrace", e);
            }
            if (i2Var != null) {
                arrayList.add(i2Var);
            }
        }
        this.f12370b = arrayList;
    }
}
