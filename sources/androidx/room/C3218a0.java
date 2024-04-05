package androidx.room;

import android.graphics.Bitmap;
import androidx.activity.result.C0118a;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import p112g2.C6831a;
import p146j.C7096a;
import p248tp.C8072t;
import p248tp.C8074v;
import p337de.C12647a;
import p455u9.C13452f;
import p466vc.C13597g;

/* renamed from: androidx.room.a0 */
public final /* synthetic */ class C3218a0 implements C7096a, C8074v, StructuredShopPoliciesView.C11958c, BottomNavigationView.C15213b, C0118a {

    /* renamed from: b */
    public final /* synthetic */ int f7487b;

    /* renamed from: c */
    public final /* synthetic */ Object f7488c;

    public /* synthetic */ C3218a0(Object obj, int i) {
        this.f7487b = i;
        this.f7488c = obj;
    }

    /* renamed from: a */
    public void mo413a(Object obj) {
        switch (this.f7487b) {
            case 0:
                ConversationDetailsFragment.m34947signInForContactUserResult$lambda0((ConversationDetailsFragment) this.f7488c, (C12647a) obj);
                return;
            default:
                CreateReviewActivity.m35080recordVideoLauncher$lambda5((CreateReviewActivity) this.f7488c, (Boolean) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        C6831a aVar = (C6831a) obj;
        ((RoomDatabase) this.f7488c).mo11980i();
        return null;
    }

    /* renamed from: f */
    public void mo11996f(C8072t tVar) {
        switch (this.f7487b) {
            case 1:
                File file = (File) this.f7488c;
                Bitmap c = C13452f.m21226c(C13452f.m21228e(file), file.getAbsolutePath(), true);
                if (c == null) {
                    tVar.tryOnError(new Throwable("Got null bitmap"));
                    return;
                } else {
                    tVar.onSuccess(c);
                    return;
                }
            default:
                NotificationSettings.m17238a((NotificationSettings) this.f7488c, tVar);
                return;
        }
    }

    public void onExpanded() {
        ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f7488c;
        int i = ShippingAndPoliciesPanelViewHolder.f23196x;
        C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
        shippingAndPoliciesPanelViewHolder.f23197b.mo38043a(C13597g.C13687m4.f30187a);
    }
}
