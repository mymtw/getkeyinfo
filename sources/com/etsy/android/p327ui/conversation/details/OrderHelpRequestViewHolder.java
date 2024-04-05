package com.etsy.android.p327ui.conversation.details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p354gc.C12767e;
import p354gc.C12778k;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.OrderHelpRequestViewHolder */
public final class OrderHelpRequestViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<String, C19394m> f20986b;

    /* renamed from: c */
    public final View f20987c;

    /* renamed from: d */
    public final TextView f20988d;

    /* renamed from: e */
    public final Button f20989e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderHelpRequestViewHolder(ViewGroup viewGroup, C19857l<? super String, C19394m> lVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_help_with_order_message, viewGroup, false));
        C19383o.m32797g(viewGroup, "parentView");
        C19383o.m32797g(lVar, "viewHelpRequestClickedListener");
        this.f20986b = lVar;
        View findViewById = this.itemView.findViewById(R.id.background);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.background)");
        this.f20987c = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.message_text);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.message_text)");
        this.f20988d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.view_request_button);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.view_request_button)");
        this.f20989e = (Button) findViewById3;
    }

    /* renamed from: e */
    public final void mo31962e(C12778k.C12780b bVar) {
        C19383o.m32797g(bVar, "item");
        this.f20988d.setText(bVar.f28237b.mo45523a().f28244a);
        String str = bVar.f28238c;
        if (str != null) {
            ViewExtensions.m12866j(this.f20989e, new OrderHelpRequestViewHolder$bind$1$1(this, str));
        }
        ViewExtensions.m12870n(this.f20989e, new OrderHelpRequestViewHolder$bind$2(bVar));
        C12767e eVar = bVar.f28237b;
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = this.itemView.getResources().getDimensionPixelSize(R.dimen.conversation_card_gutter_width);
        int dimensionPixelSize3 = this.itemView.getResources().getDimensionPixelSize(R.dimen.conversation_grouped_message_padding);
        if (eVar instanceof C12767e.C12771d) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize3);
            this.f20987c.setBackgroundResource(R.drawable.bg_chat_message_help_with_order_top);
        } else if (eVar instanceof C12767e.C12770c) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3);
            this.f20987c.setBackgroundResource(R.drawable.bg_chat_message_help_with_order_middle);
        } else if (eVar instanceof C12767e.C12768a) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize);
            this.f20987c.setBackgroundResource(R.drawable.bg_chat_message_help_with_order_bottom);
        } else if (eVar instanceof C12767e.C12769b) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            this.f20987c.setBackgroundResource(R.drawable.bg_chat_message_help_with_order);
        }
    }
}
