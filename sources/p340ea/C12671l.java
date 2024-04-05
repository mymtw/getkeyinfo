package p340ea;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.p327ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$2;
import p145io.reactivex.functions.Consumer;

/* renamed from: ea.l */
public final /* synthetic */ class C12671l implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f27940b;

    public /* synthetic */ C12671l(int i) {
        this.f27940b = i;
    }

    public final void accept(Object obj) {
        switch (this.f27940b) {
            case 0:
                Throwable th = (Throwable) obj;
                RuntimeException runtimeException = new RuntimeException("Error inserting ErrorLog into Db");
                if (C0326j.m869n(BuildTarget.Companion)) {
                    throw runtimeException;
                }
                return;
            default:
                UserActionButtonsViewHolder$bind$2.m35068onViewClick$lambda1((Throwable) obj);
                return;
        }
    }
}
