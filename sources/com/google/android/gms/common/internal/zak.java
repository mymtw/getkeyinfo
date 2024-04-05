package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public interface zak {
    Bundle getConnectionHint();

    boolean isConnected();
}
