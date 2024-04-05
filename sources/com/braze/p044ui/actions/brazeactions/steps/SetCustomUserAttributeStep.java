package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep */
public final class SetCustomUserAttributeStep extends C3039b {

    /* renamed from: c */
    public static final SetCustomUserAttributeStep f12024c;

    static {
        SetCustomUserAttributeStep setCustomUserAttributeStep = new SetCustomUserAttributeStep();
        f12024c = setCustomUserAttributeStep;
        BrazeLogger.m11280b(setCustomUserAttributeStep);
    }

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return StepData.m11410c(stepData, 2, (C20057i) null, 2) && stepData.mo16200d(0) && stepData.f12031e.getValue() != null;
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Object value = stepData.f12031e.getValue();
        if (value != null) {
            Braze.f11170m.mo15515f(context).mo15498m(new BaseBrazeActionStep$Companion$runOnUser$1(new SetCustomUserAttributeStep$run$1(stepData, value)));
        }
    }
}
