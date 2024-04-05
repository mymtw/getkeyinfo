package com.etsy.android.p327ui.user.profile.viewholders;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19456j;
import p356ge.C12788a;
import p370ie.C12948h;
import p370ie.C12949i;
import p425q9.C13265p;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$1 */
public final class UserActionButtonsViewHolder$bind$1 extends TrackingOnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserProfileV3 $profile;

    public UserActionButtonsViewHolder$bind$1(UserProfileV3 userProfileV3, FragmentActivity fragmentActivity) {
        this.$profile = userProfileV3;
        this.$activity = fragmentActivity;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        String loginName = this.$profile.getLoginName();
        C13265p pVar = C18263b.f40057V;
        if (pVar == null) {
            C19383o.m32805o("session");
            throw null;
        } else if (pVar.mo45960e()) {
            C13265p pVar2 = C18263b.f40057V;
            if (pVar2 == null) {
                C19383o.m32805o("session");
                throw null;
            } else if (pVar2.f29153s.mo30407a()) {
                C12788a.m20424c(this.$activity, new ConversationDetailsNavigationKey(C19421p.m32935c0(this.$activity), (Bundle) null, C19456j.m33017U0(this.$profile.getUserId().getId()), (String) null, this.$profile.getDisplayName(), (Long) null, false, true, (String) null, false, 874, (DefaultConstructorMarker) null));
            } else {
                C12788a.m20424c(this.$activity, new ConversationComposeNavigationKey(C19421p.m32935c0(this.$activity), false, loginName, (String) null, Long.valueOf(this.$profile.getUserId().getIdAsLongDeprecated()), (String) null, (String) null, false, (Bundle) null, 490, (DefaultConstructorMarker) null));
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(ResponseConstants.USERNAME, loginName);
            bundle.putLong(ConversationComposeNavigationKey.USER_ID, this.$profile.getUserId().getIdAsLongDeprecated());
            bundle.putString("DISPLAY_NAME", this.$profile.getDisplayName());
            C12788a.m20424c(this.$activity, new C12949i(new C12948h(C19421p.m32935c0(this.$activity), EtsyAction.CONTACT_USER, bundle, (String) null, (String) null, (String) null, 56), (ShopHomeFragment) null, 6));
        }
    }
}
