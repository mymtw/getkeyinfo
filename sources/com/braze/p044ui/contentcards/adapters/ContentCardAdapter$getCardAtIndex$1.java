package com.braze.p044ui.contentcards.adapters;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter$getCardAtIndex$1 */
public final class ContentCardAdapter$getCardAtIndex$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ ContentCardAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardAdapter$getCardAtIndex$1(int i, ContentCardAdapter contentCardAdapter) {
        super(0);
        this.$index = i;
        this.this$0 = contentCardAdapter;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Cannot return card at index: ");
        h.append(this.$index);
        h.append(" in cards list of size: ");
        h.append(this.this$0.f12039d.size());
        return h.toString();
    }
}
