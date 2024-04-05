package p311af;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CirclesTabContainerKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: af.e */
public final class C8519e extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FragmentActivity f18546b;

    /* renamed from: c */
    public final /* synthetic */ UserProfileV3 f18547c;

    public C8519e(FragmentActivity fragmentActivity, UserProfileV3 userProfileV3) {
        this.f18546b = fragmentActivity;
        this.f18547c = userProfileV3;
    }

    public final void onViewClick(View view) {
        CirclesTabContainerKey.C10697a aVar = new CirclesTabContainerKey.C10697a();
        aVar.f23591a = C19421p.m32935c0(this.f18546b);
        EtsyId userId = this.f18547c.getUserId();
        C19383o.m32797g(userId, "userId");
        aVar.f23592b = userId;
        String loginName = this.f18547c.getLoginName();
        C19383o.m32797g(loginName, ResponseConstants.USERNAME);
        aVar.f23593c = loginName;
        String displayName = this.f18547c.getDisplayName();
        C19383o.m32797g(displayName, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        aVar.f23594d = displayName;
        aVar.f23595e.mo72822a(aVar, CirclesTabContainerKey.C10697a.f23590f[0], 0);
        C12788a.m20424c(this.f18546b, aVar.mo34677a());
    }
}
