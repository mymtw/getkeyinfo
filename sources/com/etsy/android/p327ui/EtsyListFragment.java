package com.etsy.android.p327ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseListFragment;
import com.etsy.android.util.BOEOptionsMenuItemHelper;

@Deprecated
/* renamed from: com.etsy.android.ui.EtsyListFragment */
public abstract class EtsyListFragment extends TrackingBaseListFragment {
    public BaseActivity mActivity;
    public Context mContext;

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = getActivity().getApplicationContext();
        this.mActivity = (BaseActivity) getActivity();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        onCreateOptionsMenuWithIcons(menu, menuInflater);
        BOEOptionsMenuItemHelper.m19853a(menu);
    }

    public void onCreateOptionsMenuWithIcons(Menu menu, MenuInflater menuInflater) {
    }

    public void onFragmentResume() {
    }
}
