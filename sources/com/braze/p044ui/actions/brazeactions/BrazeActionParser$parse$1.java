package com.braze.p044ui.actions.brazeactions;

import android.support.p013v4.media.C0072d;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.braze.p044ui.actions.brazeactions.steps.StepData;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$1 */
public final class BrazeActionParser$parse$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeActionParser.ActionType $actionType;
    public final /* synthetic */ StepData $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$parse$1(BrazeActionParser.ActionType actionType, StepData stepData) {
        super(0);
        this.$actionType = actionType;
        this.$data = stepData;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Performing Braze Action type ");
        h.append(this.$actionType);
        h.append(" with data ");
        h.append(this.$data);
        return h.toString();
    }
}
