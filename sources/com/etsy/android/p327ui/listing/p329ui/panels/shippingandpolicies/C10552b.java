package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.KeyEvent;
import android.widget.TextView;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p309ad.C8509e;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.b */
public final /* synthetic */ class C10552b implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ C8509e f23135b;

    /* renamed from: c */
    public final /* synthetic */ CollageTextInput f23136c;

    /* renamed from: d */
    public final /* synthetic */ C10554d f23137d;

    public /* synthetic */ C10552b(C8509e eVar, CollageTextInput collageTextInput, C10554d dVar) {
        this.f23135b = eVar;
        this.f23136c = collageTextInput;
        this.f23137d = dVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C8509e eVar = this.f23135b;
        CollageTextInput collageTextInput = this.f23136c;
        C10554d dVar = this.f23137d;
        C19383o.m32797g(eVar, "$postalCodeValidator");
        C19383o.m32797g(collageTextInput, "$inputView");
        C19383o.m32797g(dVar, "this$0");
        if (keyEvent == null && i != 6) {
            return false;
        }
        if (eVar.mo14c(C19459m.m33035H1(collageTextInput.getText()).toString())) {
            dVar.mo34145a(collageTextInput);
        }
        return true;
    }
}
