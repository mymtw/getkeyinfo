package com.paypal.android.platform.authsdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.C2445e;
import androidx.databinding.C2446f;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.paypal.android.platform.authsdk.C17049R;

public abstract class FragmentOtpErrorBinding extends ViewDataBinding {
    public final AppCompatTextView contentTextView;
    public final AppCompatTextView errorTitle;
    public final MaterialButton usePasswordButton;

    public FragmentOtpErrorBinding(Object obj, View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton) {
        super(obj, view, i);
        this.contentTextView = appCompatTextView;
        this.errorTitle = appCompatTextView2;
        this.usePasswordButton = materialButton;
    }

    public static FragmentOtpErrorBinding bind(View view) {
        C2445e eVar = C2446f.f5711a;
        return bind(view, (Object) null);
    }

    public static FragmentOtpErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C2445e eVar = C2446f.f5711a;
        return inflate(layoutInflater, viewGroup, z, (Object) null);
    }

    @Deprecated
    public static FragmentOtpErrorBinding bind(View view, Object obj) {
        return (FragmentOtpErrorBinding) ViewDataBinding.bind(obj, view, C17049R.C17053layout.fragment_otp_error);
    }

    @Deprecated
    public static FragmentOtpErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentOtpErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, C17049R.C17053layout.fragment_otp_error, viewGroup, z, obj);
    }

    public static FragmentOtpErrorBinding inflate(LayoutInflater layoutInflater) {
        C2445e eVar = C2446f.f5711a;
        return inflate(layoutInflater, (Object) null);
    }

    @Deprecated
    public static FragmentOtpErrorBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentOtpErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, C17049R.C17053layout.fragment_otp_error, (ViewGroup) null, false, obj);
    }
}
