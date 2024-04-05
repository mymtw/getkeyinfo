package com.braze.p044ui.contentcards.adapters;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter$onViewDetachedFromWindow$1 */
final class ContentCardAdapter$onViewDetachedFromWindow$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $adapterPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$onViewDetachedFromWindow$1(int i) {
        super(0);
        this.$adapterPosition = i;
    }

    public final String invoke() {
        return C0071c.m191c(C0072d.m201h("The card at position "), this.$adapterPosition, " isn't on screen or does not have a valid adapter position. Not marking as read.");
    }
}
