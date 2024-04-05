package p040c9;

import com.etsy.android.p327ui.homescreen.HomescreenTabsActivity;
import com.etsy.android.util.C12064u;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.r7 */
public final class C4693r7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10616b;

    public C4693r7(C4579j1 j1Var) {
        this.f10616b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        HomescreenTabsActivity homescreenTabsActivity = (HomescreenTabsActivity) obj;
        homescreenTabsActivity.rxSchedulers = new C13461f();
        homescreenTabsActivity.sharedPreferencesProvider = this.f10616b.f10090D.get();
        homescreenTabsActivity.launchActivityDelegate = new C12064u();
        homescreenTabsActivity.configMap = this.f10616b.mo14404m();
    }
}
