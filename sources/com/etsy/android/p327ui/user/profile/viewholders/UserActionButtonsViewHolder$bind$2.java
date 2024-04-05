package com.etsy.android.p327ui.user.profile.viewholders;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.util.C11771a;
import com.etsy.android.p327ui.util.C11772b;
import com.etsy.android.p327ui.util.C11773c;
import com.etsy.android.uikit.util.C11905i;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.operators.single.C19195a;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.internal.operators.single.C19208j;
import p311af.C8516b;
import p311af.C8517c;
import p340ea.C12671l;
import p356ge.C12788a;
import p370ie.C12948h;
import p370ie.C12949i;
import p425q9.C13265p;
import p456ua.C13461f;
import p591im.C17868b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$2 */
public final class UserActionButtonsViewHolder$bind$2 extends TrackingOnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ C11773c $followUtil;
    public final /* synthetic */ UserProfileV3 $profile;
    public final /* synthetic */ C8517c this$0;

    public UserActionButtonsViewHolder$bind$2(C11773c cVar, UserProfileV3 userProfileV3, FragmentActivity fragmentActivity, C8517c cVar2) {
        this.$followUtil = cVar;
        this.$profile = userProfileV3;
        this.$activity = fragmentActivity;
        this.this$0 = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewClick$lambda-0  reason: not valid java name */
    public static final void m35067onViewClick$lambda0(UserProfileV3 userProfileV3, C8517c cVar, boolean z) {
        C19383o.m32797g(userProfileV3, "$profile");
        C19383o.m32797g(cVar, "this$0");
        userProfileV3.setIsFollowing(z);
        int i = C8517c.f18541d;
        cVar.mo21052e(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewClick$lambda-1  reason: not valid java name */
    public static final void m35068onViewClick$lambda1(Throwable th) {
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C13265p pVar = C18263b.f40057V;
        if (pVar == null) {
            C19383o.m32805o("session");
            throw null;
        } else if (pVar.mo45960e()) {
            C11773c cVar = this.$followUtil;
            EtsyId userId = this.$profile.getUserId();
            C19383o.m32796f(userId, "profile.userId");
            cVar.getClass();
            EtsyApplication etsyApplication = EtsyApplication.get();
            C11905i followRepository = etsyApplication.getFollowRepository();
            C19383o.m32796f(followRepository, "etsyApplication.followRepository");
            C19383o.m32796f(etsyApplication.getRxSchedulers(), "etsyApplication.rxSchedulers");
            new C19202e(new C19208j(new C19195a(new C11771a(cVar, userId, !this.$profile.isFollowing(), followRepository)), new C17868b(4)), new C11772b(cVar, userId)).mo20660i(C13461f.m21235b()).mo20657f(C13461f.m21236c()).mo20658g(new C8516b(this.$profile, this.this$0), new C12671l(1));
        } else {
            C12788a.m20424c(this.$activity, new C12949i(new C12948h(C19421p.m32935c0(this.$activity), EtsyAction.FOLLOW, (Bundle) null, this.$profile.getUserId().toString(), (String) null, (String) null, 52), (ShopHomeFragment) null, 6));
        }
    }
}
