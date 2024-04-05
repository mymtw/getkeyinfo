package com.etsy.android.p327ui.user.circles;

import android.os.Bundle;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$userId$2 */
public final class CirclesFragment$userId$2 extends Lambda implements C19846a<EtsyId> {
    public final /* synthetic */ CirclesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesFragment$userId$2(CirclesFragment circlesFragment) {
        super(0);
        this.this$0 = circlesFragment;
    }

    public final EtsyId invoke() {
        Bundle requireArguments = this.this$0.requireArguments();
        C19383o.m32796f(requireArguments, "requireArguments()");
        Long M = C15562d.m25175M(requireArguments, "user_id");
        if (M != null) {
            return new EtsyId(M.longValue());
        }
        return new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    }
}
