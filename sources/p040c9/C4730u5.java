package p040c9;

import com.etsy.android.lib.logger.elk.uploading.C8691k;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListFragment;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19388s;
import p277w8.C8274l;
import p341ec.C12679b;
import p456ua.C13462g;

/* renamed from: c9.u5 */
public final class C4730u5 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10690b;

    /* renamed from: c */
    public C12679b f10691c;

    public C4730u5(C4579j1 j1Var, C19388s sVar) {
        this.f10690b = j1Var;
        this.f10691c = new C12679b(new C8691k(j1Var.f10156Q0, new C8274l(sVar, j1Var.f10091D0, 4), j1Var.f10111H0, 2), C13462g.C13463a.f29482a, j1Var.f10183V2, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ConversationListFragment conversationListFragment = (ConversationListFragment) obj;
        conversationListFragment.qualtricsWrapper = this.f10690b.f10117I1.get();
        conversationListFragment.currentLocale = this.f10690b.f10298q0.get();
        conversationListFragment.viewModelProvider = this.f10691c;
    }
}
