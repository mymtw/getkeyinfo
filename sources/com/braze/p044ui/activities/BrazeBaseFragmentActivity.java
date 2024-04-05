package com.braze.p044ui.activities;

import androidx.fragment.app.FragmentActivity;
import com.braze.Braze;
import p114g4.C6861b;

/* renamed from: com.braze.ui.activities.BrazeBaseFragmentActivity */
public class BrazeBaseFragmentActivity extends FragmentActivity {
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
