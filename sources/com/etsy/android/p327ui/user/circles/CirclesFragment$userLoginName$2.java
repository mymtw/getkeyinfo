package com.etsy.android.p327ui.user.circles;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$userLoginName$2 */
public final class CirclesFragment$userLoginName$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ CirclesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesFragment$userLoginName$2(CirclesFragment circlesFragment) {
        super(0);
        this.this$0 = circlesFragment;
    }

    public final String invoke() {
        return this.this$0.requireArguments().getString(ResponseConstants.USERNAME, "");
    }
}
