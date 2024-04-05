package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.content.DialogInterface;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.j */
public final /* synthetic */ class C10210j implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ C10211k f22451b;

    /* renamed from: c */
    public final /* synthetic */ C19846a f22452c;

    public /* synthetic */ C10210j(C10211k kVar, C19846a aVar) {
        this.f22451b = kVar;
        this.f22452c = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C10211k kVar = this.f22451b;
        C19846a aVar = this.f22452c;
        C19383o.m32797g(kVar, "this$0");
        C19383o.m32797g(aVar, "$dismissEvent");
        EtsyLinkify.m19614h(kVar.f22457e);
        aVar.invoke();
    }
}
