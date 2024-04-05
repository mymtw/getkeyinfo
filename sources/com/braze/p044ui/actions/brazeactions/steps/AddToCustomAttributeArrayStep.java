package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.braze.Braze;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep */
public final class AddToCustomAttributeArrayStep extends C3039b {

    /* renamed from: c */
    public static final AddToCustomAttributeArrayStep f12020c = new AddToCustomAttributeArrayStep();

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return StepData.m11410c(stepData, 2, (C20057i) null, 2) && stepData.mo16200d(0) && stepData.mo16200d(1);
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze.f11170m.mo15515f(context).mo15498m(new BaseBrazeActionStep$Companion$runOnUser$1(new AddToCustomAttributeArrayStep$run$1(String.valueOf(stepData.mo16199b()), String.valueOf(stepData.f12031e.getValue()))));
    }
}
