package com.braze.p044ui.actions.brazeactions;

import com.braze.p044ui.actions.brazeactions.steps.StepData;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$2 */
public final class BrazeActionParser$parse$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ StepData $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$parse$2(StepData stepData) {
        super(0);
        this.$data = stepData;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$data, "Failed to run with data ");
    }
}
