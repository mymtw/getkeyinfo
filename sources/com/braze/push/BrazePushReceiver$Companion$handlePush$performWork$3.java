package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazePushReceiver$Companion$handlePush$performWork$3 extends Lambda implements C19846a<String> {
    public static final BrazePushReceiver$Companion$handlePush$performWork$3 INSTANCE = new BrazePushReceiver$Companion$handlePush$performWork$3();

    public BrazePushReceiver$Companion$handlePush$performWork$3() {
        super(0);
    }

    public final String invoke() {
        return "Received a message not sent from Braze. Ignoring the message.";
    }
}
