package com.etsy.android.p327ui.feedback;

import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.C8901g0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p314ba.C8545d;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.feedback.AppFeedbackPresenter$sendFeedback$1$2 */
final class AppFeedbackPresenter$sendFeedback$1$2 extends Lambda implements C19857l<C8545d, C19394m> {
    public final /* synthetic */ C9903a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppFeedbackPresenter$sendFeedback$1$2(C9903a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8545d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8545d dVar) {
        if (dVar instanceof C8545d.C8547b) {
            C9903a aVar = this.this$0;
            aVar.f21850e = null;
            FragmentActivity fragmentActivity = aVar.f21849d;
            if (fragmentActivity != null) {
                C8901g0.m17337c(fragmentActivity, R.string.feedback_sent);
                C12788a.m20426e(fragmentActivity);
            }
        } else if (dVar instanceof C8545d.C8546a) {
            RuntimeException runtimeException = new RuntimeException(((C8545d.C8546a) dVar).f18613a);
            if (C0326j.m869n(BuildTarget.Companion)) {
                throw runtimeException;
            }
        }
    }
}
