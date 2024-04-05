package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.stylekit.views.CollageListItem;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;
import p260v0.C8184a;
import p435rb.C13350a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.c */
public final class C9687c extends RecyclerView.Adapter<C9688a> {

    /* renamed from: b */
    public final List<VariationValue> f21451b;

    /* renamed from: c */
    public final C9696j f21452c;

    /* renamed from: d */
    public int f21453d = -1;

    /* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.c$a */
    public final class C9688a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f21454b;

        /* renamed from: c */
        public final ImageView f21455c;

        public C9688a(View view) {
            super(view);
            View findViewById = this.itemView.findViewById(R.id.variation_item_label);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.variation_item_label)");
            this.f21454b = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.check);
            C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.check)");
            this.f21455c = (ImageView) findViewById2;
        }
    }

    public C9687c(List<VariationValue> list, C9696j jVar) {
        this.f21451b = list;
        this.f21452c = jVar;
    }

    public final int getItemCount() {
        List<VariationValue> list = this.f21451b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9688a aVar = (C9688a) b0Var;
        C19383o.m32797g(aVar, "holder");
        List<VariationValue> list = this.f21451b;
        String str = null;
        VariationValue variationValue = list != null ? list.get(i) : null;
        TextView textView = aVar.f21454b;
        if (variationValue != null) {
            str = variationValue.getValue();
        }
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(String.valueOf(str));
        if (unescapeHtml4 == null) {
            unescapeHtml4 = "";
        }
        textView.setText(unescapeHtml4);
        if (C9687c.this.f21453d == aVar.getBindingAdapterPosition()) {
            ViewExtensions.m12869m(aVar.f21455c);
        } else {
            ViewExtensions.m12860d(aVar.f21455c);
        }
        if (variationValue != null ? C19383o.m32792b(variationValue.isAvailable(), Boolean.TRUE) : false) {
            View view = aVar.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
            CollageListItem collageListItem = (CollageListItem) view;
            aVar.itemView.setEnabled(true);
            Context context = aVar.itemView.getContext();
            C19383o.m32796f(context, "itemView.context");
            aVar.f21454b.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_primary));
        } else {
            View view2 = aVar.itemView;
            C19383o.m32795e(view2, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
            CollageListItem collageListItem2 = (CollageListItem) view2;
            aVar.itemView.setEnabled(false);
            Context context2 = aVar.itemView.getContext();
            Object obj = C8184a.f17966a;
            aVar.f21454b.setTextColor(C8184a.C8188d.m16468a(context2, R.color.text_gray_disabled));
        }
        View view3 = aVar.itemView;
        C19383o.m32796f(view3, "itemView");
        ViewExtensions.m12866j(view3, new C9683xbb56070e(variationValue, C9687c.this, aVar, this));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.layout_variation_sheet_item, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new C9688a(h);
    }
}
