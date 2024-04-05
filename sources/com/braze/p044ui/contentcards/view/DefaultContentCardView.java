package com.braze.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import com.appboy.p043ui.C4940R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.view.DefaultContentCardView */
public class DefaultContentCardView extends BaseContentCardView<Card> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultContentCardView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    public void bindViewHolder(C6784b bVar, Card card) {
        C19383o.m32797g(bVar, "viewHolder");
        C19383o.m32797g(card, ResponseConstants.CARD);
    }

    public C6784b createViewHolder(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4940R.C4943layout.com_braze_default_content_card, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        return new C6784b(inflate, false);
    }
}
