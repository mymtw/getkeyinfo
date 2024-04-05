package com.braze.p044ui.actions.brazeactions.steps;

import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p753kq.C19857l;

/* renamed from: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2 */
public final class ContainerStep$getChildStepIterator$$inlined$iterator$2 extends Lambda implements C19857l<Integer, JSONObject> {
    public final /* synthetic */ JSONArray $this_iterator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContainerStep$getChildStepIterator$$inlined$iterator$2(JSONArray jSONArray) {
        super(1);
        this.$this_iterator = jSONArray;
    }

    public final JSONObject invoke(int i) {
        Object obj = this.$this_iterator.get(i);
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
