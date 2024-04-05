package com.airbnb.paris;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p242t3.C7956f;
import p753kq.C19857l;

final class StyleApplierUtils$Companion$getMissingStyleAttributesError$2 extends Lambda implements C19857l<C7956f, String> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleApplierUtils$Companion$getMissingStyleAttributesError$2(Context context) {
        super(1);
        this.$context = context;
    }

    public final String invoke(C7956f fVar) {
        C19383o.m32798h(fVar, "it");
        Context context = this.$context;
        C19383o.m32793c(context, ResponseConstants.CONTEXT);
        return fVar.mo20485c(context);
    }
}
