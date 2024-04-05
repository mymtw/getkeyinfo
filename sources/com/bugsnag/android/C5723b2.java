package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.b2 */
public final class C5723b2 {

    /* renamed from: a */
    public final Set<C5719a2> f12159a;

    /* renamed from: b */
    public final C5719a2 f12160b;

    /* renamed from: c */
    public final C5719a2 f12161c;

    /* renamed from: d */
    public final C5719a2 f12162d;

    /* renamed from: e */
    public final C5763c f12163e;

    /* renamed from: f */
    public final C5816o1 f12164f;

    public C5723b2(HashSet hashSet, C5763c cVar, C5816o1 o1Var) {
        C19383o.m32798h(hashSet, "userPlugins");
        C19383o.m32798h(cVar, "immutableConfig");
        C19383o.m32798h(o1Var, "logger");
        this.f12163e = cVar;
        this.f12164f = o1Var;
        C5719a2 a = mo16483a("com.bugsnag.android.NdkPlugin");
        this.f12160b = a;
        C5719a2 a2 = mo16483a("com.bugsnag.android.AnrPlugin");
        this.f12161c = a2;
        C5719a2 a3 = mo16483a("com.bugsnag.android.BugsnagReactNativePlugin");
        this.f12162d = a3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(hashSet);
        if (a != null) {
            linkedHashSet.add(a);
        }
        if (a2 != null) {
            linkedHashSet.add(a2);
        }
        if (a3 != null) {
            linkedHashSet.add(a3);
        }
        this.f12159a = C19327t.m32664t1(linkedHashSet);
    }

    /* renamed from: a */
    public final C5719a2 mo16483a(String str) {
        try {
            Object newInstance = Class.forName(str).newInstance();
            if (newInstance != null) {
                return (C5719a2) newInstance;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            C5816o1 o1Var = this.f12164f;
            o1Var.mo16604d("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
            return null;
        } catch (Throwable th) {
            C5816o1 o1Var2 = this.f12164f;
            o1Var2.mo16603c("Failed to load plugin '" + str + '\'', th);
            return null;
        }
    }
}
