package com.etsy.android.uikit.util;

import android.content.Context;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;

public final class EtsyLinkify$replaceUrlSpansWithCustom$1 extends EtsyLinkify.UnderlineURLSpan {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ String $urlString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLinkify$replaceUrlSpansWithCustom$1(String str, boolean z, View.OnClickListener onClickListener, Context context) {
        super(str, z);
        this.$urlString = str;
        this.$onClickListener = onClickListener;
        this.$context = context;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        View.OnClickListener onClickListener = this.$onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        Context context = this.$context;
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String str = this.$urlString;
        C19383o.m32796f(str, "urlString");
        EtsyLinkify.m19618l(context, str);
    }
}
