package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import android.widget.AdapterView;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.p327ui.user.addresses.PostalCodeSuggestion;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.e */
public final /* synthetic */ class C11458e implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ List f25286b;

    /* renamed from: c */
    public final /* synthetic */ C11459f f25287c;

    public /* synthetic */ C11458e(List list, C11459f fVar) {
        this.f25286b = list;
        this.f25287c = fVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        List list = this.f25286b;
        C11459f fVar = this.f25287c;
        C19383o.m32797g(list, "$suggestions");
        C19383o.m32797g(fVar, "this$0");
        fVar.f25289c.invoke(new C11430n.C11434d((PostalCodeSuggestion) list.get(i), fVar.f25288b));
    }
}
