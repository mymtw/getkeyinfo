package com.etsy.android.p327ui.cart.clicklisteners;

import android.view.KeyEvent;
import android.widget.TextView;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.a */
public final /* synthetic */ class C9270a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ C9274e f20476b;

    /* renamed from: c */
    public final /* synthetic */ CollageTextInput f20477c;

    public /* synthetic */ C9270a(C9274e eVar, CollageTextInput collageTextInput) {
        this.f20476b = eVar;
        this.f20477c = collageTextInput;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C9274e eVar = this.f20476b;
        CollageTextInput collageTextInput = this.f20477c;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(collageTextInput, "$textInput");
        if (i != 6) {
            return false;
        }
        eVar.mo31608c(C19459m.m33035H1(collageTextInput.getText()).toString());
        return true;
    }
}
