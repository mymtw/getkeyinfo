package com.etsy.android.search.savedsearch;

import android.app.Activity;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p377jf.C12979a;
import p753kq.C19846a;

final class SavedSearchViewDelegate$onDeleteSearch$disposableDelete$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C8984h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedSearchViewDelegate$onDeleteSearch$disposableDelete$2(C8984h hVar, Activity activity) {
        super(0);
        this.this$0 = hVar;
        this.$activity = activity;
    }

    public final void invoke() {
        C8984h hVar = this.this$0;
        Activity activity = this.$activity;
        hVar.getClass();
        C12979a a = C12979a.C12980a.m20683a(activity);
        a.mo45785e(activity.getString(R.string.search_unsaved));
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.mo45783c(R.drawable.clg_icon_core_heart_v1);
        a.mo45786f();
    }
}
