package p340ea;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import kotlin.C19394m;
import p145io.reactivex.functions.Consumer;

/* renamed from: ea.f */
public final /* synthetic */ class C12665f implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f27931b;

    public /* synthetic */ C12665f(int i) {
        this.f27931b = i;
    }

    public final void accept(Object obj) {
        switch (this.f27931b) {
            case 0:
                C19394m mVar = (C19394m) obj;
                return;
            case 1:
                Throwable th = (Throwable) obj;
                if (C0326j.m869n(BuildTarget.Companion)) {
                    if (th == null) {
                        th = new RuntimeException("throwable was null");
                    }
                    throw th;
                }
                return;
            default:
                ShopHomeFragment.lambda$toggleVacationNotificationSettings$10((Throwable) obj);
                return;
        }
    }
}
