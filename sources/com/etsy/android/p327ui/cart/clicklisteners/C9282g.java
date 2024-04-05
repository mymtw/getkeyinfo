package com.etsy.android.p327ui.cart.clicklisteners;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.cart.C9333r;
import kotlin.jvm.internal.C19383o;
import p423pf.C13236g;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.g */
public class C9282g extends C13236g {

    /* renamed from: e */
    public final C9333r f20499e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9282g(Fragment fragment, C8703p pVar, C9333r rVar) {
        super(fragment, pVar, rVar);
        C19383o.m32797g(rVar, "cartActionDelegate");
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32794d(fragment);
        this.f20499e = rVar;
    }
}
