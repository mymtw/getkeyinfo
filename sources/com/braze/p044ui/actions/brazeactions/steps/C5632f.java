package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.braze.support.PermissionUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p114g4.C6861b;

/* renamed from: com.braze.ui.actions.brazeactions.steps.f */
public final class C5632f extends C3039b {

    /* renamed from: c */
    public static final C5632f f12036c = new C5632f();

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return true;
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        PermissionUtils.m11332b(C6861b.m13319e().f15220b);
    }
}
