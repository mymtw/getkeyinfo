package com.braze.p044ui.actions.brazeactions.steps;

import android.support.p013v4.media.C0072d;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p764pq.C20057i;

/* renamed from: com.braze.ui.actions.brazeactions.steps.StepData */
public final class StepData {

    /* renamed from: a */
    public final JSONObject f12027a;

    /* renamed from: b */
    public final Channel f12028b;

    /* renamed from: c */
    public final C19285c f12029c = C19350d.m32677b(new StepData$args$2(this));

    /* renamed from: d */
    public final C19285c f12030d = C19350d.m32677b(new StepData$firstArg$2(this));

    /* renamed from: e */
    public final C19285c f12031e = C19350d.m32677b(new StepData$secondArg$2(this));

    public StepData(JSONObject jSONObject, Channel channel) {
        C19383o.m32797g(jSONObject, "srcJson");
        C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
        this.f12027a = jSONObject;
        this.f12028b = channel;
    }

    /* renamed from: c */
    public static boolean m11410c(StepData stepData, int i, C20057i iVar, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            iVar = null;
        }
        if (i != -1 && stepData.mo16198a().size() != i) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, stepData, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgCountInBounds$1(i, stepData), 7);
            return false;
        } else if (iVar == null || iVar.mo74327m(stepData.mo16198a().size())) {
            return true;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, stepData, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgCountInBounds$2(iVar, stepData), 7);
            return false;
        }
    }

    /* renamed from: a */
    public final List<Object> mo16198a() {
        return (List) this.f12029c.getValue();
    }

    /* renamed from: b */
    public final Object mo16199b() {
        return this.f12030d.getValue();
    }

    /* renamed from: d */
    public final boolean mo16200d(int i) {
        if (C19327t.m32641W0(i, mo16198a()) instanceof String) {
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new StepData$isArgString$1(i, this), 7);
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) obj;
        return C19383o.m32792b(this.f12027a, stepData.f12027a) && this.f12028b == stepData.f12028b;
    }

    public final int hashCode() {
        return this.f12028b.hashCode() + (this.f12027a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Channel ");
        h.append(this.f12028b);
        h.append(" and json\n");
        h.append(JsonUtils.m11315f(this.f12027a));
        return h.toString();
    }
}
