package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p415of.C13171a;

/* renamed from: com.etsy.android.vespa.viewholders.v */
public final class C12110v extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ IPageLink f27009b;

    /* renamed from: c */
    public final /* synthetic */ C12111w f27010c;

    public C12110v(C12111w wVar, IPageLink iPageLink) {
        this.f27010c = wVar;
        this.f27009b = iPageLink;
    }

    public final void onViewClick(View view) {
        C13171a aVar = this.f27010c.f27012d;
        if (aVar != null) {
            aVar.mo31328c(this.f27009b);
        }
    }
}
