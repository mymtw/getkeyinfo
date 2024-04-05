package com.bugsnag.android;

import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class DeviceIdStore$loadDeviceId$1 extends Lambda implements C19846a<UUID> {
    public final /* synthetic */ DeviceIdStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceIdStore$loadDeviceId$1(DeviceIdStore deviceIdStore) {
        super(0);
        this.this$0 = deviceIdStore;
    }

    public final UUID invoke() {
        String string = this.this$0.f12112c.f12284a.getString("install.iud", (String) null);
        if (string == null) {
            UUID randomUUID = UUID.randomUUID();
            C19383o.m32793c(randomUUID, "UUID.randomUUID()");
            return randomUUID;
        }
        UUID fromString = UUID.fromString(string);
        C19383o.m32793c(fromString, "UUID.fromString(legacyDeviceId)");
        return fromString;
    }
}
