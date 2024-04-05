package com.braze;

import android.app.Activity;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeActivityLifecycleCallbackListener$onActivityCreated$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Activity $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActivityLifecycleCallbackListener$onActivityCreated$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$activity.getClass(), "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ");
    }
}
