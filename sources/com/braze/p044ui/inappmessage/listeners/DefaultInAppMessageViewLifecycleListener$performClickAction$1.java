package com.braze.p044ui.inappmessage.listeners;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$performClickAction$1 */
public final class DefaultInAppMessageViewLifecycleListener$performClickAction$1 extends Lambda implements C19846a<String> {
    public static final DefaultInAppMessageViewLifecycleListener$performClickAction$1 INSTANCE = new DefaultInAppMessageViewLifecycleListener$performClickAction$1();

    public DefaultInAppMessageViewLifecycleListener$performClickAction$1() {
        super(0);
    }

    public final String invoke() {
        return "Can't perform click action because the cached activity is null.";
    }
}
