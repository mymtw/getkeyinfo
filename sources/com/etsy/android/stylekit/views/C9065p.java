package com.etsy.android.stylekit.views;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.CollectionPrivacyLevel;
import com.etsy.android.p327ui.favorites.createalist.NameAListPresenter;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: com.etsy.android.stylekit.views.p */
public final /* synthetic */ class C9065p implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f19948b;

    /* renamed from: c */
    public final /* synthetic */ Object f19949c;

    public /* synthetic */ C9065p(Object obj, int i) {
        this.f19948b = i;
        this.f19949c = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f19948b) {
            case 0:
                CollageSwitch.m34899setOnCheckedChangeListener$lambda2((C19861p) this.f19949c, compoundButton, z);
                return;
            default:
                NameAListPresenter nameAListPresenter = (NameAListPresenter) this.f19949c;
                C19383o.m32797g(nameAListPresenter, "this$0");
                nameAListPresenter.f21683h = z ? CollectionPrivacyLevel.PRIVATE : CollectionPrivacyLevel.PUBLIC;
                return;
        }
    }
}
