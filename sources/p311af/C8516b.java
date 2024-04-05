package p311af;

import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.p327ui.user.profile.viewholders.UserActionButtonsViewHolder$bind$2;
import p145io.reactivex.functions.Consumer;

/* renamed from: af.b */
public final /* synthetic */ class C8516b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ UserProfileV3 f18539b;

    /* renamed from: c */
    public final /* synthetic */ C8517c f18540c;

    public /* synthetic */ C8516b(UserProfileV3 userProfileV3, C8517c cVar) {
        this.f18539b = userProfileV3;
        this.f18540c = cVar;
    }

    public final void accept(Object obj) {
        UserActionButtonsViewHolder$bind$2.m35067onViewClick$lambda0(this.f18539b, this.f18540c, ((Boolean) obj).booleanValue());
    }
}
