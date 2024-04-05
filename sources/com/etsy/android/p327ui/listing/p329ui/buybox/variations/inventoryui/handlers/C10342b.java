package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import android.widget.Toast;
import com.etsy.android.R;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;
import p490yd.C13914b;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.b */
public final class C10342b {

    /* renamed from: a */
    public final C13914b f22695a;

    /* renamed from: b */
    public final C11786n f22696b;

    public C10342b(C13914b bVar, C11786n nVar) {
        C19383o.m32797g(bVar, "toaster");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f22695a = bVar;
        this.f22696b = nVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33723a(C13597g.C13705p1 p1Var) {
        String str;
        C19383o.m32797g(p1Var, "event");
        String str2 = p1Var.f30218a;
        if (str2 == null) {
            str = this.f22696b.mo38059c(R.string.item_invalid_generic, new Object[0]);
        } else {
            str = this.f22696b.mo38059c(R.string.item_invalid_one_variation, str2);
        }
        C13914b bVar = this.f22695a;
        bVar.getClass();
        Toast.makeText(bVar.f30574a, str, 0).show();
        return C13574d.C13575a.f29662a;
    }
}
