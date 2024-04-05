package com.etsy.android.p327ui.search.filters.refactor.category;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.category.b */
public final class C10796b extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f23916b;

    /* renamed from: c */
    public final TextView f23917c;

    /* renamed from: d */
    public final ImageView f23918d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10796b(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_subitem_category, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onItemChange");
        this.f23916b = lVar;
        View findViewById = this.itemView.findViewById(R.id.text_category);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_category)");
        this.f23917c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.img_selected_icon);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.img_selected_icon)");
        this.f23918d = (ImageView) findViewById2;
    }
}
