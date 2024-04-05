package com.braze.p044ui.contentcards.adapters;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter$markOnScreenCardsAsRead$2 */
public final class ContentCardAdapter$markOnScreenCardsAsRead$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $firstVisibleIndex;
    public final /* synthetic */ int $lastVisibleIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$markOnScreenCardsAsRead$2(int i, int i2) {
        super(0);
        this.$firstVisibleIndex = i;
        this.$lastVisibleIndex = i2;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ");
        h.append(this.$firstVisibleIndex);
        h.append(" . Last visible: ");
        h.append(this.$lastVisibleIndex);
        return h.toString();
    }
}
