package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import android.widget.AdapterView;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11408e0;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.stylekit.views.CollageSelectDropdown;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.c */
public final /* synthetic */ class C11456c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11396e f25282b;

    /* renamed from: c */
    public final /* synthetic */ C11457d f25283c;

    /* renamed from: d */
    public final /* synthetic */ CollageSelectDropdown f25284d;

    public /* synthetic */ C11456c(C11396e eVar, C11457d dVar, CollageSelectDropdown collageSelectDropdown) {
        this.f25282b = eVar;
        this.f25283c = dVar;
        this.f25284d = collageSelectDropdown;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C11396e eVar = this.f25282b;
        C11457d dVar = this.f25283c;
        CollageSelectDropdown collageSelectDropdown = this.f25284d;
        C19383o.m32797g(eVar, "$item");
        C19383o.m32797g(dVar, "this$0");
        C19383o.m32797g(collageSelectDropdown, "$dropdown");
        if (i >= 0) {
            C11396e.C11397a aVar = (C11396e.C11397a) eVar;
            Object[] array = aVar.f25124a.f25141g.keySet().toArray(new String[0]);
            C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String str = ((String[]) array)[i];
            if (eVar instanceof C11396e.C11397a) {
                C11408e0 e0Var = aVar.f25124a;
                e0Var.f25144j = null;
                e0Var.f25143i = str;
                collageSelectDropdown.setErrorText((String) null);
            } else {
                boolean z = true;
                if (!(eVar instanceof C11396e.C11398b ? true : eVar instanceof C11396e.C11402f ? true : eVar instanceof C11396e.C11401e ? true : eVar instanceof C11396e.C11407k ? true : eVar instanceof C11396e.C11403g ? true : eVar instanceof C11396e.C11405i ? true : eVar instanceof C11396e.C11404h ? true : eVar instanceof C11396e.C11399c)) {
                    z = C19383o.m32792b(eVar, C11396e.C11400d.f25127a);
                }
                if (!z) {
                    C19383o.m32792b(eVar, C11396e.C11406j.f25133a);
                }
            }
        }
        dVar.f25285b.invoke(new C11430n.C11436f(eVar, i));
    }
}
