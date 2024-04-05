package com.appboy.p043ui.activities;

import android.app.Activity;
import com.braze.Braze;
import p114g4.C6861b;

@Deprecated
/* renamed from: com.appboy.ui.activities.AppboyBaseActivity */
public class AppboyBaseActivity extends Activity {
    public void onPause() {
        super.onPause();
        C6861b.m13319e().mo18988i(this);
    }

    public void onResume() {
        super.onResume();
        C6861b.m13319e().mo18986g(this);
    }

    public void onStart() {
        super.onStart();
        Braze.f11170m.mo15515f(this).mo15507w(this);
    }

    public void onStop() {
        super.onStop();
        Braze.f11170m.mo15515f(this).mo15496k(this);
    }
}
