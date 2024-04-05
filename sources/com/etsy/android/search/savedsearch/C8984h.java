package com.etsy.android.search.savedsearch;

import android.app.Activity;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8882c;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.stylekit.views.CollageAlert;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8048a;
import p248tp.C8066r;
import p248tp.C8071s;
import p377jf.C12979a;
import p456ua.C13461f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.search.savedsearch.h */
public final class C8984h {

    /* renamed from: a */
    public final C8982f f19827a;

    /* renamed from: b */
    public final C13461f f19828b;

    /* renamed from: c */
    public final C8916o f19829c;

    /* renamed from: d */
    public final C7091a f19830d = new C7091a();

    public C8984h(C8982f fVar, C13461f fVar2, C8916o oVar) {
        this.f19827a = fVar;
        this.f19828b = fVar2;
        this.f19829c = oVar;
    }

    /* renamed from: c */
    public static void m17389c(Activity activity) {
        C12979a a = C12979a.C12980a.m20683a(activity);
        a.mo45785e(activity.getString(R.string.save_search_error));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_heart_v1);
        a.mo45786f();
    }

    /* renamed from: a */
    public final void mo30633a(long j, FragmentActivity fragmentActivity) {
        C8982f fVar = this.f19827a;
        fVar.getClass();
        C8048a b = fVar.f19822a.mo30625b(j);
        this.f19828b.getClass();
        C8066r b2 = C13461f.m21235b();
        b.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(b, b2);
        this.f19828b.getClass();
        this.f19830d.mo19403b(SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new SavedSearchViewDelegate$onDeleteSearch$disposableDelete$1(this, fragmentActivity), new SavedSearchViewDelegate$onDeleteSearch$disposableDelete$2(this, fragmentActivity)));
    }

    /* renamed from: b */
    public final void mo30634b(String str, Map map, FragmentActivity fragmentActivity, List list, Integer num, C19857l lVar) {
        C19383o.m32797g(str, "query");
        C8982f fVar = this.f19827a;
        fVar.getClass();
        C8071s<SaveSearchPutResponse> c = fVar.f19822a.mo30626c(new SavedSearchRequestBody(str, map, list, num));
        C8981e eVar = new C8981e(0);
        c.getClass();
        this.f19830d.mo19403b(C0391c.m1056b(this.f19828b, C0326j.m860e(this.f19828b, new C19208j(c, eVar))).mo20658g(new C8983g(lVar, this, fragmentActivity), new C8882c(1, this, fragmentActivity)));
        C1948d.m4270b(this.f19829c.f19673a, 10);
    }
}
