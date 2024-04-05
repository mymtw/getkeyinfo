package com.etsy.android.uikit.view;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.C2800y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.logger.referrers.Referrer;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.view.g */
public abstract class C11952g extends C2800y {

    /* renamed from: i */
    public final String f26552i;

    /* renamed from: j */
    public Fragment f26553j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11952g(String str, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        C19383o.m32797g(fragmentManager, "fragmentManager");
        this.f26552i = str;
    }

    /* renamed from: s */
    public final void mo10629s(ViewGroup viewGroup, int i, Object obj) {
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(obj, "itemToSet");
        if (this.f26553j != obj) {
            this.f26553j = obj instanceof Fragment ? (Fragment) obj : null;
        }
        super.mo10629s(viewGroup, i, obj);
    }

    /* renamed from: u */
    public final Fragment mo10631u(int i) {
        String str;
        Fragment w = mo31711w(i);
        C19285c<String> cVar = Referrer.f19131c;
        if (Referrer.C8712a.m17143c(w.getArguments()) == null && (str = this.f26552i) != null && !w.isAdded()) {
            Bundle arguments = w.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                w.setArguments(arguments);
            }
            if (!arguments.containsKey(".ref")) {
                arguments.putString(".ref", str);
            }
        }
        return w;
    }

    /* renamed from: w */
    public abstract Fragment mo31711w(int i);
}
