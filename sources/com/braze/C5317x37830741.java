package com.braze;

import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.BrazeActivityLifecycleCallbackListener$setInAppMessagingRegistrationBlocklist$1 */
public final class C5317x37830741 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Set<Class<?>> $blocklist;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5317x37830741(Set<? extends Class<?>> set) {
        super(0);
        this.$blocklist = set;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$blocklist, "setInAppMessagingRegistrationBlocklist called with blocklist: ");
    }
}
