package com.etsy.android.uikit.util;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.lib.models.datatypes.EtsyId;

public abstract class TrackingOnLongClickListener extends C11911m implements View.OnLongClickListener {
    public TrackingOnLongClickListener() {
    }

    public final boolean onLongClick(View view) {
        trackAction(view, ViewClickAnalyticsLog.ViewAction.long_clicked);
        return onViewLongClick(view);
    }

    public abstract boolean onViewLongClick(View view);

    public TrackingOnLongClickListener(AnalyticsProperty analyticsProperty, Object obj) {
        super(analyticsProperty, obj);
    }

    public TrackingOnLongClickListener(AnalyticsProperty analyticsProperty, EtsyId etsyId) {
        super(analyticsProperty, etsyId);
    }

    public TrackingOnLongClickListener(C8698l... lVarArr) {
        super(lVarArr);
    }
}
