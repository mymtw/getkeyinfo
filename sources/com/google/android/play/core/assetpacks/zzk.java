package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;

final class zzk extends ResultReceiver {
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            throw null;
        } else if (i != 2) {
            new AssetPackException(-100);
            throw null;
        } else {
            throw null;
        }
    }
}
