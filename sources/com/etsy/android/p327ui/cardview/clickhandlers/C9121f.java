package com.etsy.android.p327ui.cardview.clickhandlers;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p423pf.C13236g;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.f */
public class C9121f extends C13171a<Object> {

    /* renamed from: d */
    public final C9116a f20045d;

    /* renamed from: e */
    public final C13236g f20046e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9121f(Fragment fragment, C8703p pVar, C9116a aVar, C13236g gVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewAnalyticsTracker");
        this.f20045d = aVar;
        this.f20046e = gVar;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        C19383o.m32797g(obj, "data");
    }

    /* renamed from: d */
    public final void mo31344d(View view, IServerDrivenAction iServerDrivenAction) {
        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
        C13236g gVar = this.f20046e;
        if (gVar != null) {
            gVar.mo45936d(view, iServerDrivenAction);
        }
    }
}
