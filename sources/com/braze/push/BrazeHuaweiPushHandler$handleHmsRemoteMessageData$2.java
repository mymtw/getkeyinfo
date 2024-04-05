package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeHuaweiPushHandler$handleHmsRemoteMessageData$2 extends Lambda implements C19846a<String> {
    public static final BrazeHuaweiPushHandler$handleHmsRemoteMessageData$2 INSTANCE = new BrazeHuaweiPushHandler$handleHmsRemoteMessageData$2();

    public BrazeHuaweiPushHandler$handleHmsRemoteMessageData$2() {
        super(0);
    }

    public final String invoke() {
        return "Remote message data was null. Remote message did not originate from Braze.";
    }
}
