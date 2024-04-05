package androidx.compose.material;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements C19861p<DismissValue, DismissValue, C1174c2> {
    public final /* synthetic */ C19857l<DismissDirection, C1174c2> $dismissThresholds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(C19857l<? super DismissDirection, ? extends C1174c2> lVar) {
        super(2);
        this.$dismissThresholds = lVar;
    }

    public final C1174c2 invoke(DismissValue dismissValue, DismissValue dismissValue2) {
        C19383o.m32797g(dismissValue, ResponseConstants.FROM);
        C19383o.m32797g(dismissValue2, ResponseConstants.f19136TO);
        C19857l<DismissDirection, C1174c2> lVar = this.$dismissThresholds;
        DismissDirection dismissDirection = null;
        if (!(dismissValue == dismissValue2 && dismissValue == DismissValue.Default)) {
            if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
                dismissDirection = DismissDirection.StartToEnd;
            } else if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
                dismissDirection = DismissDirection.EndToStart;
            } else {
                DismissValue dismissValue3 = DismissValue.Default;
                if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
                    dismissDirection = DismissDirection.StartToEnd;
                } else if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
                    dismissDirection = DismissDirection.EndToStart;
                } else if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
                    dismissDirection = DismissDirection.StartToEnd;
                } else if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
                    dismissDirection = DismissDirection.EndToStart;
                }
            }
        }
        C19383o.m32794d(dismissDirection);
        return lVar.invoke(dismissDirection);
    }
}
