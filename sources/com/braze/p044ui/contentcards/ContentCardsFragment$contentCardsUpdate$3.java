package com.braze.p044ui.contentcards;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$3 */
public final class ContentCardsFragment$contentCardsUpdate$3 extends Lambda implements C19846a<String> {
    public static final ContentCardsFragment$contentCardsUpdate$3 INSTANCE = new ContentCardsFragment$contentCardsUpdate$3();

    public ContentCardsFragment$contentCardsUpdate$3() {
        super(0);
    }

    public final String invoke() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }
}
