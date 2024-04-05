package com.braze.p044ui.actions.brazeactions.steps;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.steps.StepData$isArgOptionalJsonObject$1 */
final class StepData$isArgOptionalJsonObject$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ StepData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepData$isArgOptionalJsonObject$1(int i, StepData stepData) {
        super(0);
        this.$index = i;
        this.this$0 = stepData;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Argument [");
        h.append(this.$index);
        h.append("] is not a JSONObject. Source: ");
        h.append(this.this$0.f12027a);
        return h.toString();
    }
}
