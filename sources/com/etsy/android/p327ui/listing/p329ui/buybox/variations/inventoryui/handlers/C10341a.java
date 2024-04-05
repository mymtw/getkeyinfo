package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import android.widget.Toast;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;
import p490yd.C13914b;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.a */
public final class C10341a {

    /* renamed from: a */
    public final C13914b f22694a;

    public C10341a(C13914b bVar) {
        C19383o.m32797g(bVar, "toaster");
        this.f22694a = bVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33722a(C13597g.C13599a0 a0Var) {
        C19383o.m32797g(a0Var, "event");
        String str = a0Var.f30069a;
        if (str == null) {
            C13914b.m21425a(this.f22694a, R.string.variation_update_error);
        } else {
            C13914b bVar = this.f22694a;
            bVar.getClass();
            Toast.makeText(bVar.f30574a, str, 0).show();
        }
        return C13574d.C13575a.f29662a;
    }
}
