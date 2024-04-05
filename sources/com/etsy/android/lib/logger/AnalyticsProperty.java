package com.etsy.android.lib.logger;

import android.os.Parcelable;

public interface AnalyticsProperty extends Parcelable {
    String readPropertyName();
}
