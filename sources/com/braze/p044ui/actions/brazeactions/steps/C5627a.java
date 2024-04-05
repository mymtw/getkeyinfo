package com.braze.p044ui.actions.brazeactions.steps;

import android.content.Context;
import androidx.preference.C3039b;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Iterator;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.braze.ui.actions.brazeactions.steps.a */
public final class C5627a extends C3039b {

    /* renamed from: c */
    public static final C5627a f12032c = new C5627a();

    /* renamed from: b */
    public final boolean mo7679b(StepData stepData) {
        return stepData.f12027a.has("steps");
    }

    /* renamed from: i */
    public final void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        JSONArray jSONArray = stepData.f12027a.getJSONArray("steps");
        Iterator it = jSONArray == null ? EmptyList.INSTANCE.iterator() : new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, jSONArray.length())), new ContainerStep$getChildStepIterator$$inlined$iterator$1(jSONArray)), new ContainerStep$getChildStepIterator$$inlined$iterator$2(jSONArray)));
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            BrazeActionParser brazeActionParser = BrazeActionParser.f12018a;
            Channel channel = stepData.f12028b;
            C19383o.m32797g(jSONObject, "srcJson");
            C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
            brazeActionParser.mo16184d(context, new StepData(jSONObject, channel));
        }
    }
}
