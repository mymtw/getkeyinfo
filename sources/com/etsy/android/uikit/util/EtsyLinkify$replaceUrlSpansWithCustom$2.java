package com.etsy.android.uikit.util;

import android.content.Context;
import android.view.View;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;

public final class EtsyLinkify$replaceUrlSpansWithCustom$2 extends EtsyLinkify.CustomColorUnderlineURLSpan {
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ String $urlContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLinkify$replaceUrlSpansWithCustom$2(int i, String str, boolean z, View.OnClickListener onClickListener) {
        super(i, str, z);
        this.$urlContent = str;
        this.$onClickListener = onClickListener;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        View.OnClickListener onClickListener = this.$onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        Context context = view.getContext();
        C19383o.m32796f(context, "view.context");
        String str = this.$urlContent;
        C19383o.m32796f(str, "urlContent");
        EtsyLinkify.m19618l(context, str);
    }
}
