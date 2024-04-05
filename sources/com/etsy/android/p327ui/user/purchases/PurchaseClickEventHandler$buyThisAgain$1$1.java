package com.etsy.android.p327ui.user.purchases;

import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$1 */
final class PurchaseClickEventHandler$buyThisAgain$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FragmentActivity $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseClickEventHandler$buyThisAgain$1$1(FragmentActivity fragmentActivity) {
        super(1);
        this.$it = fragmentActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
        Toast.makeText(this.$it, R.string.cart_error, 0).show();
        LogCatKt.m17045a().error(th);
    }
}
