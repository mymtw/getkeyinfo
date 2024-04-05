package com.etsy.android.p327ui.user.circles;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$isTypeFollowing$2 */
public final class CirclesFragment$isTypeFollowing$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ CirclesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesFragment$isTypeFollowing$2(CirclesFragment circlesFragment) {
        super(0);
        this.this$0 = circlesFragment;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.requireArguments().getBoolean("CIRCLE_FOLLOWING"));
    }
}
