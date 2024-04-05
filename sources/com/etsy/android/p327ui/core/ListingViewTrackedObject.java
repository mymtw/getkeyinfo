package com.etsy.android.p327ui.core;

import android.content.Context;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.ListingViewTrackedObject */
public final class ListingViewTrackedObject implements ITrackedObject, Serializable {
    public static final int $stable = 8;
    private boolean isHapticEnabled;

    public ListingViewTrackedObject(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.isHapticEnabled = C1948d.m4276h(context) != 0;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    @JsonIgnore
    public String getTrackingName() {
        return "";
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.HAPTIC_PREF, Boolean.valueOf(this.isHapticEnabled)));
    }

    public final boolean isHapticEnabled() {
        return this.isHapticEnabled;
    }

    public final void setHapticEnabled(boolean z) {
        this.isHapticEnabled = z;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }
}
