package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1 INSTANCE = new BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1();

    public BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1() {
        super(0);
    }

    public final String invoke() {
        return "Inline Image Push cannot render without a context";
    }
}
