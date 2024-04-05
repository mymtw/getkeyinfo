package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.g1 */
public final class C9179g1 extends C12086e<ISearchSuggestion> {

    /* renamed from: c */
    public final C13171a<ISearchSuggestion> f20209c;

    /* renamed from: d */
    public final boolean f20210d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9179g1(ViewGroup viewGroup, C13171a<ISearchSuggestion> aVar, boolean z) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_pill, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "clickHandler");
        this.f20209c = aVar;
        this.f20210d = z;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ISearchSuggestion iSearchSuggestion = (ISearchSuggestion) obj;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        ((TextView) viewGroup.findViewById(R.id.recentSearch)).setText(iSearchSuggestion != null ? iSearchSuggestion.getQuery() : null);
        if (iSearchSuggestion != null) {
            ViewExtensions.m12866j(viewGroup, new SearchTermViewHolder$bind$1$1(this, iSearchSuggestion));
        } else {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
        if (!(iSearchSuggestion instanceof C8698l)) {
            iSearchSuggestion = null;
        }
        if (iSearchSuggestion != null && C19388s.m32880q0(iSearchSuggestion) == 0) {
            ((ImageView) viewGroup.findViewById(R.id.recentSearchIcon)).setVisibility(0);
        } else {
            ((ImageView) viewGroup.findViewById(R.id.recentSearchIcon)).setVisibility(8);
        }
        viewGroup.setLayoutParams(new FrameLayout.LayoutParams(this.f20210d ? -1 : -2, -2));
    }
}
