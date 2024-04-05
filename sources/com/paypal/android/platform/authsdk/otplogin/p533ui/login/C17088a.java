package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.PhoneNumberViewState;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.a */
public final /* synthetic */ class C17088a implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f37449b;

    /* renamed from: c */
    public final /* synthetic */ PhoneNumberViewState.MultiplePhoneNumbers f37450c;

    /* renamed from: d */
    public final /* synthetic */ OtpLoginFragment f37451d;

    /* renamed from: e */
    public final /* synthetic */ ArrayAdapter f37452e;

    public /* synthetic */ C17088a(AutoCompleteTextView autoCompleteTextView, PhoneNumberViewState.MultiplePhoneNumbers multiplePhoneNumbers, OtpLoginFragment otpLoginFragment, ArrayAdapter arrayAdapter) {
        this.f37449b = autoCompleteTextView;
        this.f37450c = multiplePhoneNumbers;
        this.f37451d = otpLoginFragment;
        this.f37452e = arrayAdapter;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OtpLoginFragment.m35130bindMultiplePhoneNumbersText$lambda14$lambda13(this.f37449b, this.f37450c, this.f37451d, this.f37452e, adapterView, view, i, j);
    }
}
