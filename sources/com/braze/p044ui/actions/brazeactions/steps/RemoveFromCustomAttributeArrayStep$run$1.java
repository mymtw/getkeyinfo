package com.braze.p044ui.actions.brazeactions.steps;

import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep$run$1 */
public final class RemoveFromCustomAttributeArrayStep$run$1 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ StepData $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoveFromCustomAttributeArrayStep$run$1(StepData stepData) {
        super(1);
        this.$data = stepData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15729e(String.valueOf(this.$data.mo16199b()), String.valueOf(this.$data.f12031e.getValue()));
    }
}
