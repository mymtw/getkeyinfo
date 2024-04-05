package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p415of.C13171a;

/* renamed from: com.etsy.android.vespa.viewholders.y */
public final class C12113y extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MessageCard f27013b;

    /* renamed from: c */
    public final /* synthetic */ C12114z f27014c;

    public C12113y(C12114z zVar, MessageCard messageCard) {
        this.f27014c = zVar;
        this.f27013b = messageCard;
    }

    public final void onViewClick(View view) {
        C13171a aVar = this.f27014c.f27015c;
        if (aVar != null) {
            aVar.mo31328c(this.f27013b);
        }
    }
}
