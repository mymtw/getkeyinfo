package androidx.fragment.app;

import android.os.Bundle;
import androidx.preference.Preference;
import com.braze.Braze;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.util.C12043f;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.VmLogoutListener;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.utils.DialogMaker;
import kotlin.jvm.internal.C19383o;
import p112g2.C6831a;
import p146j.C7096a;
import p248tp.C8049b;
import p248tp.C8051d;
import p402n9.C13092l;
import p605kk.C18122f;
import p605kk.C18123g;
import p605kk.C18126j;
import p632nn.C18275a;
import p632nn.C18276b;
import p641on.C18327e;
import p753kq.C19861p;

/* renamed from: androidx.fragment.app.s */
public final /* synthetic */ class C2783s implements C2801z, Preference.C3010d, C18122f, DialogMaker.NegativeClickListener, C7096a, C8051d, VmLogoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f6337b;

    /* renamed from: c */
    public final /* synthetic */ Object f6338c;

    public /* synthetic */ C2783s(Object obj, int i) {
        this.f6337b = i;
        this.f6338c = obj;
    }

    public Object apply(Object obj) {
        ((C6831a) obj).mo18966q((String) this.f6338c);
        return null;
    }

    /* renamed from: c */
    public void mo10428c(Bundle bundle, String str) {
        switch (this.f6337b) {
            case 0:
                C19861p pVar = (C19861p) this.f6338c;
                C19383o.m32797g(pVar, "$tmp0");
                C19383o.m32797g(str, "p0");
                pVar.invoke(str, bundle);
                return;
            default:
                MultiShopCartFragment.m34917onViewCreated$lambda1((MultiShopCartFragment) this.f6338c, str, bundle);
                return;
        }
    }

    /* renamed from: d */
    public void mo10586d(C8049b bVar) {
        switch (this.f6337b) {
            case 1:
                C13092l lVar = (C13092l) this.f6338c;
                C19383o.m32797g(lVar, "this$0");
                Braze.f11170m.mo15512b(lVar.f28780a);
                return;
            default:
                C12043f fVar = (C12043f) this.f6338c;
                C19383o.m32797g(fVar, "this$0");
                C12043f.m19857d().stop(true, fVar.f26845c);
                bVar.onComplete();
                return;
        }
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34835addConfigFlagsPreference$lambda16((FragmentManager) this.f6338c, preference);
    }

    public void onNegativeClick(DialogMaker dialogMaker) {
        PayPalContinueButton.m35300showOfferDialog$lambda8((PEnums.TransitionName) this.f6338c, dialogMaker);
    }

    public void onTaskCompleted() {
        switch (this.f6337b) {
            case 3:
                ((MainPaysheetViewModel) this.f6338c).lambda$onLifeCycleCreate$5();
                return;
            default:
                PayPalLogoutView.m35451initViewModelObservers$lambda0((PayPalLogoutView) this.f6338c);
                return;
        }
    }

    public C18123g then(Object obj) {
        C18276b bVar = (C18276b) this.f6338c;
        Void voidR = (Void) obj;
        C18123g<C18327e> b = bVar.f40114c.mo69860b();
        C18123g<C18327e> b2 = bVar.f40115d.mo69860b();
        return C18126j.m30618f(b, b2).mo69662i(bVar.f40113b, new C18275a(bVar, b, b2));
    }
}
