package com.braze.p044ui.contentcards.adapters;

import com.appboy.models.cards.Card;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter$logImpression$1 */
final class ContentCardAdapter$logImpression$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Card $card;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$logImpression$1(Card card) {
        super(0);
        this.$card = card;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$card.getId(), "Logged impression for card ");
    }
}
