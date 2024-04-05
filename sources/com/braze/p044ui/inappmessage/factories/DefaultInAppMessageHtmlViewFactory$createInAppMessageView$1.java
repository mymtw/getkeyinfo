package com.braze.p044ui.inappmessage.factories;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1 */
final class DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1 extends Lambda implements C19846a<String> {
    public static final DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1 INSTANCE = new DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1();

    public DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1() {
        super(0);
    }

    public final String invoke() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly.";
    }
}
