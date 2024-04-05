package p040c9;

import com.etsy.android.p327ui.nav.NotificationActivity;
import dagger.android.C17550a;
import p084d9.C6671a;

/* renamed from: c9.x8 */
public final class C4772x8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10756b;

    public C4772x8(C4579j1 j1Var) {
        this.f10756b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        NotificationActivity notificationActivity = (NotificationActivity) obj;
        notificationActivity.log = this.f10756b.f10212b0.get();
        notificationActivity.button = new C6671a(this.f10756b.f10085C.get());
        notificationActivity.analyticsTracker = this.f10756b.f10198Y2.get();
        notificationActivity.configMap = this.f10756b.mo14404m();
        notificationActivity.deepLinkRouter = this.f10756b.mo14401j();
    }
}
