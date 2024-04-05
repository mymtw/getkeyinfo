package com.etsy.android.p327ui.user.inappnotifications;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11580v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bindShop$1$dependencies$1 */
final class C11538xaae37f10 extends Lambda implements C19857l<C11580v, C19394m> {
    public final /* synthetic */ String $feedId;
    public final /* synthetic */ Long $feedIndex;
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11538xaae37f10(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted, String str, Long l) {
        super(1);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
        this.$feedId = str;
        this.$feedIndex = l;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11580v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11580v vVar) {
        C19383o.m32797g(vVar, "event");
        NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted = this.this$0;
        String str = this.$feedId;
        Long l = this.$feedIndex;
        int i = NotificationHolderRecommendedShopsHighlighted.f25491m;
        notificationHolderRecommendedShopsHighlighted.getClass();
        if (vVar instanceof C11580v.C11582b) {
            C11580v.C11582b bVar = (C11580v.C11582b) vVar;
            C1993m.m4359T(notificationHolderRecommendedShopsHighlighted.f25492b, new C11540a("notification_tapped_shop", l, str, (Long) null, Long.valueOf(bVar.f25671a), Boolean.TRUE, (String) null, (String) null, 200));
            notificationHolderRecommendedShopsHighlighted.f25493c.invoke(new C11564q.C11572h(bVar.f25671a, (String) null));
        } else if (vVar instanceof C11580v.C11581a) {
            C11580v.C11581a aVar = (C11580v.C11581a) vVar;
            notificationHolderRecommendedShopsHighlighted.f25493c.invoke(new C11564q.C11569e(aVar.f25668a, aVar.f25669b, aVar.f25670c));
        }
    }
}
