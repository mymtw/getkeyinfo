package com.braze.p044ui.actions.brazeactions.steps;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.StepData$isArgCountInBounds$2 */
final class StepData$isArgCountInBounds$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ C20057i $rangedArgCount;
    public final /* synthetic */ StepData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepData$isArgCountInBounds$2(C20057i iVar, StepData stepData) {
        super(0);
        this.$rangedArgCount = iVar;
        this.this$0 = stepData;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Expected ");
        h.append(this.$rangedArgCount);
        h.append(" arguments. Got: ");
        h.append(this.this$0.mo16198a());
        return h.toString();
    }
}
