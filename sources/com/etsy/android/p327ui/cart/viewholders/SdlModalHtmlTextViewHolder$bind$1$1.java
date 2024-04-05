package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.text.style.URLSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cart.viewholders.SdlModalHtmlTextViewHolder$bind$1$1 */
public final class SdlModalHtmlTextViewHolder$bind$1$1 extends TrackingOnClickListener {
    public final /* synthetic */ View $this_apply;
    public final /* synthetic */ URLSpan $url;
    public final /* synthetic */ C9387i0 this$0;

    public SdlModalHtmlTextViewHolder$bind$1$1(View view, URLSpan uRLSpan, C9387i0 i0Var) {
        this.$this_apply = view;
        this.$url = uRLSpan;
        this.this$0 = i0Var;
    }

    public void onViewClick(View view) {
        Context context;
        if (this.$this_apply.getContext() instanceof ContextThemeWrapper) {
            Context context2 = this.$this_apply.getContext();
            C19383o.m32795e(context2, "null cannot be cast to non-null type android.view.ContextThemeWrapper");
            context = ((ContextThemeWrapper) context2).getBaseContext();
        } else {
            context = this.$this_apply.getContext();
        }
        String c0 = C19421p.m32935c0(context);
        String url = this.$url.getURL();
        C19383o.m32796f(url, "url.url");
        C19421p.m32932V(context, new GenericHelpKey(c0, url));
        C19846a<C19394m> aVar = this.this$0.f20788c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
