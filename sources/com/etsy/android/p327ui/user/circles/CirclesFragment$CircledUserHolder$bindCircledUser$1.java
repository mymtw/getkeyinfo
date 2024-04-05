package com.etsy.android.p327ui.user.circles;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$CircledUserHolder$bindCircledUser$1 */
final class CirclesFragment$CircledUserHolder$bindCircledUser$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11506a $user;
    public final /* synthetic */ CirclesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesFragment$CircledUserHolder$bindCircledUser$1(CirclesFragment circlesFragment, C11506a aVar) {
        super(1);
        this.this$0 = circlesFragment;
        this.$user = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C12788a.m20424c(this.this$0.getActivity(), new UserProfileKey(C19421p.m32935c0(this.this$0.getActivity()), new EtsyId(this.$user.f25386a), (Bundle) null));
    }
}
