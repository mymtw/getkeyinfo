package com.bugsnag.android;

import android.annotation.SuppressLint;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.k */
public final class C5777k {

    /* renamed from: a */
    public static final Object f12371a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public static C5917u f12372b;

    /* renamed from: a */
    public static void m11575a(String str, Map<String, ?> map) {
        C5909s1 s1Var = m11576b().f12623b;
        s1Var.getClass();
        s1Var.f12604b.mo16616b(str, map);
        for (Map.Entry entry : map.entrySet()) {
            if (!s1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                String str2 = (String) entry.getKey();
                C5829r1 r1Var = s1Var.f12604b;
                String str3 = (String) entry.getKey();
                r1Var.getClass();
                C19383o.m32798h(str3, "key");
                Map map2 = r1Var.f12468c.get(str);
                C5780k2.C5783c cVar = new C5780k2.C5783c(str, str2, map2 != null ? map2.get(str3) : null);
                for (C5771f onStateChange : s1Var.getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(cVar);
                }
            }
        }
    }

    /* renamed from: b */
    public static C5917u m11576b() {
        C5917u uVar = f12372b;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
    }
}
