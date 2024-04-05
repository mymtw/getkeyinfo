package androidx.room;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6573i;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import p112g2.C6831a;
import p120gh.C6898a;
import p146j.C7096a;

/* renamed from: androidx.room.e */
public final /* synthetic */ class C3227e implements C7096a, C6898a.C6899a, SelectedListener {

    /* renamed from: b */
    public final /* synthetic */ Object f7508b;

    /* renamed from: c */
    public final /* synthetic */ Object f7509c;

    public /* synthetic */ C3227e(Object obj, Object obj2) {
        this.f7508b = obj;
        this.f7509c = obj2;
    }

    public final Object apply(Object obj) {
        ((C6831a) obj).mo18958E((String) this.f7508b, (Object[]) this.f7509c);
        return null;
    }

    /* renamed from: e */
    public final Object mo12018e() {
        ((C6573i) this.f7508b).f14521c.mo18783c((Iterable) this.f7509c);
        return null;
    }

    public final void onTaskCompleted(CardUiModel cardUiModel) {
        PayPalSnappingRecyclerView.m35352_init_$lambda7((PayPalSnappingRecyclerView) this.f7508b, (Context) this.f7509c, cardUiModel);
    }
}
