package p040c9;

import com.etsy.android.lib.logger.elk.uploading.C8691k;
import com.etsy.android.p327ui.conversation.details.ccm.C9501j;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import dagger.android.C17550a;
import p277w8.C8269g;
import p334da.C12640i;
import p425q9.C13265p;
import p628nj.C18263b;

/* renamed from: c9.s5 */
public final class C4704s5 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10638b;

    /* renamed from: c */
    public C9501j f10639c;

    public C4704s5(C4579j1 j1Var, C18263b bVar) {
        this.f10638b = j1Var;
        this.f10639c = new C9501j(j1Var.f10141N0, j1Var.f10101F0, j1Var.f10172T1, new C12640i(new C8269g(bVar, j1Var.f10091D0, 5), j1Var.f10156Q0, 3), j1Var.f10209a3, new C8691k(j1Var.f10314t1, j1Var.f10139M3, j1Var.f10114H3, 1), j1Var.f10183V2);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ConversationDetailsFragment conversationDetailsFragment = (ConversationDetailsFragment) obj;
        conversationDetailsFragment.session = (C13265p) this.f10638b.f10101F0.get();
        conversationDetailsFragment.logCat = this.f10638b.f10212b0.get();
        conversationDetailsFragment.translationHelper = C4579j1.m10254e(this.f10638b);
        conversationDetailsFragment.fileSupport = this.f10638b.f10291o3.get();
        conversationDetailsFragment.cameraHelper = this.f10638b.f10296p3.get();
        conversationDetailsFragment.viewModelProvider = this.f10639c;
    }
}
