package com.etsy.android.p327ui.conversation.details;

import android.view.ViewGroup;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p354gc.C12767e;

/* renamed from: com.etsy.android.ui.conversation.details.m */
public final class C9556m extends MessageViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9556m(ViewGroup viewGroup, C9558n nVar, C9564q qVar) {
        super(viewGroup, R.layout.list_item_current_user_message, nVar, qVar);
        C19383o.m32797g(viewGroup, "parentView");
        C19383o.m32797g(nVar, "imageClickListener");
        C19383o.m32797g(qVar, "linkCardClickListener");
    }

    /* renamed from: f */
    public final int mo31959f() {
        return R.drawable.ripple_message_link_card_background_current_user;
    }

    /* renamed from: g */
    public final void mo31960g(C12767e eVar) {
        C19383o.m32797g(eVar, "groupedMessageItem");
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = this.itemView.getResources().getDimensionPixelSize(R.dimen.conversation_card_gutter_width);
        int dimensionPixelSize3 = this.itemView.getResources().getDimensionPixelSize(R.dimen.conversation_grouped_message_padding);
        if (eVar instanceof C12767e.C12771d) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize3);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_current_user_top);
        } else if (eVar instanceof C12767e.C12770c) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_current_user_middle);
        } else if (eVar instanceof C12767e.C12768a) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_current_user_bottom);
        } else if (eVar instanceof C12767e.C12769b) {
            this.itemView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            this.f20978d.setBackgroundResource(R.drawable.bg_chat_message_current_user);
        }
    }
}
