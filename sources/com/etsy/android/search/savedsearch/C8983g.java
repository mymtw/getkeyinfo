package com.etsy.android.search.savedsearch;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p377jf.C12979a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.search.savedsearch.g */
public final /* synthetic */ class C8983g implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C19857l f19824b;

    /* renamed from: c */
    public final /* synthetic */ C8984h f19825c;

    /* renamed from: d */
    public final /* synthetic */ Activity f19826d;

    public /* synthetic */ C8983g(C19857l lVar, C8984h hVar, FragmentActivity fragmentActivity) {
        this.f19824b = lVar;
        this.f19825c = hVar;
        this.f19826d = fragmentActivity;
    }

    public final void accept(Object obj) {
        C19857l lVar = this.f19824b;
        C8984h hVar = this.f19825c;
        Activity activity = this.f19826d;
        C19383o.m32797g(lVar, "$searchIdCallback");
        C19383o.m32797g(hVar, "this$0");
        C19383o.m32797g(activity, "$activity");
        lVar.invoke((Long) obj);
        C12979a a = C12979a.C12980a.m20683a(activity);
        a.mo45785e(activity.getString(R.string.search_saved));
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.mo45783c(R.drawable.clg_icon_core_heart_fill_v1);
        a.mo45786f();
    }
}
