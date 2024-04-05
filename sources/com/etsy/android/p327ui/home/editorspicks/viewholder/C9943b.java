package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.finds.FindsHeadingModule;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.b */
public final class C9943b extends C12086e<FindsHeadingModule> {

    /* renamed from: c */
    public final TextView f21915c;

    public C9943b(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.finds_heading_view, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.heading_text);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.heading_text)");
        this.f21915c = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsHeadingModule findsHeadingModule = (FindsHeadingModule) obj;
        C19383o.m32797g(findsHeadingModule, "data");
        this.f21915c.setText(findsHeadingModule.getText());
    }
}
