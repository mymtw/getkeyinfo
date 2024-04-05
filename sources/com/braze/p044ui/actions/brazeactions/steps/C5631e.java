package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.C3039b;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.p044ui.actions.UriAction;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.e */
public final class C5631e extends C3039b {

    /* renamed from: c */
    public static final C5631e f12035c = new C5631e();

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return StepData.m11410c(stepData, 1, (C20057i) null, 2) && stepData.mo16200d(0);
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        UriAction a = BrazeDeeplinkHandler.f12011a.mo16169a(String.valueOf(stepData.mo16199b()), (Bundle) null, true, stepData.f12028b);
        if (a != null) {
            a.mo16178a(context);
        }
    }
}
