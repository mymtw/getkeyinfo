package com.etsy.android.p327ui.user.review;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.z */
public final class C11759z extends RecyclerView.Adapter<ReviewIconViewHolder> {

    /* renamed from: b */
    public final List<ReviewFlowIcon> f26201b;

    /* renamed from: c */
    public final C19857l<String, Drawable> f26202c;

    public C11759z(C19857l lVar, List list) {
        C19383o.m32797g(list, "data");
        this.f26201b = list;
        this.f26202c = lVar;
    }

    public final int getItemCount() {
        return this.f26201b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        ReviewIconViewHolder reviewIconViewHolder = (ReviewIconViewHolder) b0Var;
        C19383o.m32797g(reviewIconViewHolder, "holder");
        ReviewFlowIcon reviewFlowIcon = this.f26201b.get(i);
        C19383o.m32797g(reviewFlowIcon, ResponseConstants.ICON);
        Object value = reviewIconViewHolder.f26033c.getValue();
        C19383o.m32796f(value, "<get-textView>(...)");
        ((TextView) value).setText(reviewFlowIcon.f25994b);
        Object value2 = reviewIconViewHolder.f26034d.getValue();
        C19383o.m32796f(value2, "<get-iconView>(...)");
        ((ImageView) value2).setImageDrawable(reviewIconViewHolder.f26032b.invoke(reviewFlowIcon.f25993a));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_create_review_icon, viewGroup, false);
        C19383o.m32796f(h, "itemView");
        return new ReviewIconViewHolder(h, this.f26202c);
    }
}
