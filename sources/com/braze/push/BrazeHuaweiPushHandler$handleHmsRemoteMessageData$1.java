package com.braze.push;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeHuaweiPushHandler$handleHmsRemoteMessageData$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Map<String, String> $hmsRemoteMessageData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeHuaweiPushHandler$handleHmsRemoteMessageData$1(Map<String, String> map) {
        super(0);
        this.$hmsRemoteMessageData = map;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$hmsRemoteMessageData, "Handling Huawei remote message: ");
    }
}
