package com.etsy.android.lib.util;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.lib.util.p */
public final /* synthetic */ class C8917p implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C8918q f19674b;

    public /* synthetic */ C8917p(C8918q qVar) {
        this.f19674b = qVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C8918q qVar = this.f19674b;
        C19383o.m32797g(qVar, "this$0");
        if (z) {
            Iterator it = qVar.f19675a.iterator();
            while (it.hasNext()) {
                RadioButton radioButton = (RadioButton) it.next();
                if (!C19383o.m32792b(radioButton, compoundButton)) {
                    radioButton.setChecked(false);
                }
            }
            C19857l<? super CompoundButton, C19394m> lVar = qVar.f19676b;
            if (lVar != null) {
                C19383o.m32796f(compoundButton, "buttonView");
                lVar.invoke(compoundButton);
            }
        }
    }
}
