package com.braze.p044ui.actions.brazeactions.steps;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19435k;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.steps.StepData$args$2 */
public final class StepData$args$2 extends Lambda implements C19846a<List<? extends Object>> {
    public final /* synthetic */ StepData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepData$args$2(StepData stepData) {
        super(0);
        this.this$0 = stepData;
    }

    public final List<Object> invoke() {
        Iterator it;
        JSONArray optJSONArray = this.this$0.f12027a.optJSONArray("args");
        if (optJSONArray == null) {
            it = EmptyList.INSTANCE.iterator();
        } else {
            it = new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, optJSONArray.length())), new StepData$args$2$invoke$$inlined$iterator$1(optJSONArray)), new StepData$args$2$invoke$$inlined$iterator$2(optJSONArray)));
        }
        return C17782b.m29867g0(SequencesKt___SequencesKt.m32989t1(C19435k.m33000j1(it)));
    }
}
