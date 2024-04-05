package com.etsy.android.uikit.util;

import android.widget.CompoundButton;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.lib.models.datatypes.EtsyId;

public abstract class TrackingOnCheckedChangeListener extends C11911m implements CompoundButton.OnCheckedChangeListener {
    public TrackingOnCheckedChangeListener() {
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        trackAction(compoundButton, z ? ViewClickAnalyticsLog.ViewAction.checked : ViewClickAnalyticsLog.ViewAction.unchecked);
        onViewCheckedChanged(compoundButton, z);
    }

    public abstract void onViewCheckedChanged(CompoundButton compoundButton, boolean z);

    public TrackingOnCheckedChangeListener(AnalyticsProperty analyticsProperty, Object obj) {
        super(analyticsProperty, obj);
    }

    public TrackingOnCheckedChangeListener(AnalyticsProperty analyticsProperty, EtsyId etsyId) {
        super(analyticsProperty, etsyId);
    }

    public TrackingOnCheckedChangeListener(C8698l... lVarArr) {
        super(lVarArr);
    }
}
