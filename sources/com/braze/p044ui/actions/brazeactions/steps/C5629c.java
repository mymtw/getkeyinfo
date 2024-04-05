package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.c */
public final class C5629c extends C3039b {

    /* renamed from: c */
    public static final C5629c f12033c = new C5629c();

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        boolean z;
        if (StepData.m11410c(stepData, 0, new C20057i(1, 2), 1) && stepData.mo16200d(0)) {
            Object W0 = C19327t.m32641W0(1, stepData.mo16198a());
            if (W0 == null || (W0 instanceof JSONObject)) {
                z = true;
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, stepData, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgOptionalJsonObject$1(1, stepData), 7);
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze f = Braze.f11170m.mo15515f(context);
        String valueOf = String.valueOf(stepData.mo16199b());
        Object W0 = C19327t.m32641W0(1, stepData.mo16198a());
        f.mo15501q(valueOf, (W0 == null || !(W0 instanceof JSONObject)) ? null : new BrazeProperties((JSONObject) W0));
    }
}
