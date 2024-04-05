package p040c9;

import com.etsy.android.push.BOENotificationSettingsFragment;
import com.etsy.android.push.BOENotificationSettingsPresenter;
import dagger.android.C17550a;
import p346fa.C12703a;
import p456ua.C13461f;

/* renamed from: c9.t4 */
public final class C4716t4 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10657b;

    public C4716t4(C4579j1 j1Var) {
        this.f10657b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ((BOENotificationSettingsFragment) obj).presenter = new BOENotificationSettingsPresenter(new C13461f(), this.f10657b.f10212b0.get(), (C12703a) this.f10657b.f10308s0.get(), this.f10657b.f10279m1.get());
    }
}
