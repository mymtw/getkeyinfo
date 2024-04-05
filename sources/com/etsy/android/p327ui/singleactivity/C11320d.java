package com.etsy.android.p327ui.singleactivity;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.util.C8890e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p496za.C13943a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.singleactivity.d */
public final class C11320d {

    /* renamed from: a */
    public final C13943a f24982a;

    /* renamed from: b */
    public final C8618c f24983b;

    /* renamed from: c */
    public final C8890e0 f24984c;

    public C11320d(C13943a aVar, C8618c cVar, C8890e0 e0Var) {
        C19383o.m32797g(aVar, "sharedPrefsProvider");
        C19383o.m32797g(e0Var, "systemTime");
        this.f24982a = aVar;
        this.f24983b = cVar;
        this.f24984c = e0Var;
    }

    /* renamed from: a */
    public final void mo37062a(String str) {
        ArrayList arrayList = null;
        if (this.f24983b.mo21132b(C8592b.f18798i0)) {
            Set<String> stringSet = this.f24982a.mo46761a().getStringSet("nav_info", (Set) null);
            if (C19543e0.m33306Y(stringSet)) {
                Object[] array = stringSet.toArray(new String[0]);
                C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                arrayList = C17782b.m29888u(Arrays.copyOf(strArr, strArr.length));
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() >= this.f24983b.mo21134d(C8592b.f18801j0)) {
            arrayList.remove(0);
        }
        arrayList.add(str);
        this.f24982a.mo46761a().edit().putStringSet("nav_info", C19327t.m32664t1(arrayList)).apply();
    }
}
