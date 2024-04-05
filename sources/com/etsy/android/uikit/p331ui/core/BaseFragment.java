package com.etsy.android.uikit.p331ui.core;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.uikit.util.C11901e;
import p357gf.C12794c;
import p384kf.C12996a;
import p463v9.C13537b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.ui.core.BaseFragment */
public abstract class BaseFragment extends Fragment implements C12794c {
    private C12996a mBaseFragmentDelegate = new C12996a(this);

    public C13537b getPostManager() {
        this.mBaseFragmentDelegate.getClass();
        return C18263b.f40057V.f29142h;
    }

    public boolean handleBackPressed() {
        this.mBaseFragmentDelegate.getClass();
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mBaseFragmentDelegate.mo45794a(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mBaseFragmentDelegate.getClass();
    }

    public void onDestroyView() {
        C11901e.m19622a(this.mBaseFragmentDelegate.f28614b.getView());
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HIDDEN", this.mBaseFragmentDelegate.f28614b.isHidden());
    }
}
