package com.appboy.p043ui.widget;

import com.appboy.models.cards.Card;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.appboy.ui.widget.BaseCardView$handleCardClick$5 */
public final class BaseCardView$handleCardClick$5 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Card $card;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCardView$handleCardClick$5(Card card) {
        super(0);
        this.$card = card;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$card.getId(), "Card click was handled by custom listener on card: ");
    }
}
