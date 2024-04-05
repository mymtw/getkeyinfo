package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1 */
public final class InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1 extends Lambda implements C19846a<String> {
    public static final InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1 INSTANCE = new InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1();

    public InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1() {
        super(0);
    }

    public final String invoke() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }
}
