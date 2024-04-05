package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeHuaweiPushHandler$handleHmsRemoteMessageData$3 extends Lambda implements C19846a<String> {
    public static final BrazeHuaweiPushHandler$handleHmsRemoteMessageData$3 INSTANCE = new BrazeHuaweiPushHandler$handleHmsRemoteMessageData$3();

    public BrazeHuaweiPushHandler$handleHmsRemoteMessageData$3() {
        super(0);
    }

    public final String invoke() {
        return "Remote message did not originate from Braze. Not consuming remote message";
    }
}
