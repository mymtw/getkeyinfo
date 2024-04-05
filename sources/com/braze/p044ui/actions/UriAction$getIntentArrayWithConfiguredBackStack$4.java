package com.braze.p044ui.actions;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$4 */
public final class UriAction$getIntentArrayWithConfiguredBackStack$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $activityClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$getIntentArrayWithConfiguredBackStack$4(String str) {
        super(0);
        this.$activityClass = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$activityClass, "Not adding unregistered activity to the back stack while opening uri from push: ");
    }
}
