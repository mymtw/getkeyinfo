package com.etsy.android.p327ui.shop.homesection;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.listingresults.C10905e;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p460ue.C13498h;

/* renamed from: com.etsy.android.ui.shop.homesection.p */
public final class C11166p extends C12086e<C13498h> {

    /* renamed from: f */
    public static final /* synthetic */ int f24690f = 0;

    /* renamed from: c */
    public final C11192q0.C11193a f24691c;

    /* renamed from: d */
    public final TextView f24692d;

    /* renamed from: e */
    public final Button f24693e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11166p(ViewGroup viewGroup, C11192q0.C11193a aVar) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_translations_section_body, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "clickHandler");
        this.f24691c = aVar;
        View findViewById = this.itemView.findViewById(R.id.description_text_view);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.description_text_view)");
        this.f24692d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.translate_button);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.translate_button)");
        this.f24693e = (Button) findViewById2;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        String str;
        C13498h hVar = (C13498h) obj;
        C19383o.m32797g(hVar, "uiModel");
        TextView textView = this.f24692d;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        int i = C13498h.f29533c;
        String string = context.getString(R.string.shop_section_translations_description);
        C19383o.m32796f(string, "context.getString(R.stri…translations_description)");
        textView.setText(string);
        Button button = this.f24693e;
        Context context2 = this.itemView.getContext();
        C19383o.m32796f(context2, "itemView.context");
        if (hVar.f29534b) {
            str = context2.getString(R.string.see_original);
            C19383o.m32796f(str, "{\n            context.ge…g.see_original)\n        }");
        } else {
            str = context2.getString(R.string.translate);
            C19383o.m32796f(str, "{\n            context.ge…ring.translate)\n        }");
        }
        button.setText(str);
        this.f24693e.setOnClickListener(new C10905e(1, hVar, this));
    }
}
