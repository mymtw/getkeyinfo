package com.braze.p044ui.actions.brazeactions.steps;

import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import p753kq.C19857l;

/* renamed from: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$1 */
public final class StepData$args$2$invoke$$inlined$iterator$1 extends Lambda implements C19857l<Integer, Boolean> {
    public final /* synthetic */ JSONArray $this_iterator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepData$args$2$invoke$$inlined$iterator$1(JSONArray jSONArray) {
        super(1);
        this.$this_iterator = jSONArray;
    }

    public final Boolean invoke(int i) {
        return Boolean.valueOf(this.$this_iterator.opt(i) instanceof Object);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
