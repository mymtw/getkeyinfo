package com.etsy.android.uikit;

import android.os.Bundle;
import com.etsy.android.R;

public class CustomViewDemoActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_custom_view_demo);
        setTitle(getString(R.string.custom_view_demo));
    }
}
