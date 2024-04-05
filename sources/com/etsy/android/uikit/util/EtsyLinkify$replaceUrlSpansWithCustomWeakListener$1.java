package com.etsy.android.uikit.util;

import android.content.Context;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.lang.ref.WeakReference;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class EtsyLinkify$replaceUrlSpansWithCustomWeakListener$1 extends EtsyLinkify.UnderlineURLSpan {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ WeakReference<C19857l<String, C19394m>> $onClickListener;
    public final /* synthetic */ String $urlString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLinkify$replaceUrlSpansWithCustomWeakListener$1(String str, boolean z, WeakReference<C19857l<String, C19394m>> weakReference, Context context) {
        super(str, z);
        this.$urlString = str;
        this.$onClickListener = weakReference;
        this.$context = context;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        WeakReference<C19857l<String, C19394m>> weakReference = this.$onClickListener;
        if (weakReference != null) {
            C19857l lVar = weakReference.get();
            if (lVar != null) {
                String str = this.$urlString;
                C19383o.m32796f(str, "urlString");
                lVar.invoke(str);
                return;
            }
            return;
        }
        Context context = this.$context;
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String str2 = this.$urlString;
        C19383o.m32796f(str2, "urlString");
        EtsyLinkify.m19618l(context, str2);
    }
}
