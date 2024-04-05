package com.braze.push.support;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class HtmlUtils$getHtmlSpannedTextIfEnabled$1 extends Lambda implements C19846a<String> {
    public static final HtmlUtils$getHtmlSpannedTextIfEnabled$1 INSTANCE = new HtmlUtils$getHtmlSpannedTextIfEnabled$1();

    public HtmlUtils$getHtmlSpannedTextIfEnabled$1() {
        super(0);
    }

    public final String invoke() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }
}
