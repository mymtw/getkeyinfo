package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1 */
final class BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1 extends Lambda implements C19846a<String> {
    public static final BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1 INSTANCE = new BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1();

    public BackgroundInAppMessagePreparer$prepareInAppMessageWithHtml$1() {
        super(0);
    }

    public final String invoke() {
        return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
    }
}
