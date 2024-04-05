package com.etsy.android.p327ui.shop.viewholder;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p460ue.C13493c;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.viewholder.d0 */
public final class C11269d0 extends C12086e<C13493c> {

    /* renamed from: c */
    public final TextView f24879c;

    /* renamed from: d */
    public final TextView f24880d = ((TextView) this.itemView.findViewById(R.id.view_more_text_view));

    /* renamed from: e */
    public final boolean f24881e;

    public C11269d0(ViewGroup viewGroup, int i, int i2, boolean z) {
        super(C0326j.m859c(viewGroup, i, viewGroup, false));
        this.f24879c = (TextView) this.itemView.findViewById(i2);
        this.f24881e = z;
        ViewsExtensionsKt.m17424c(this.itemView, true);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f24879c.setText(((C13493c) obj).mo36825b(this.itemView.getContext()));
        this.f24879c.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f24881e) {
            Context context = this.itemView.getContext();
            TextView textView = this.f24879c;
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(textView, "textview");
            EtsyLinkify.m19612f(context, textView, false, (C19846a) null, 24);
        }
        if (this.f24880d != null) {
            this.itemView.getContext();
            this.f24880d.setVisibility(8);
        }
    }
}
