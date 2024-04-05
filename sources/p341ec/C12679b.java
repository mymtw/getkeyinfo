package p341ec;

import com.etsy.android.lib.session.C8855a;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.list.ccm.C9582f;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListViewModel;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p425q9.C13265p;
import p456ua.C13461f;
import p740eq.C19011a;

/* renamed from: ec.b */
public final class C12679b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f27957a;

    /* renamed from: b */
    public final C19011a f27958b;

    /* renamed from: c */
    public final C19011a f27959c;

    /* renamed from: d */
    public final C19011a f27960d;

    public /* synthetic */ C12679b(C19011a aVar, C17555d dVar, C19011a aVar2, int i) {
        this.f27957a = i;
        this.f27958b = aVar;
        this.f27959c = dVar;
        this.f27960d = aVar2;
    }

    public final Object get() {
        switch (this.f27957a) {
            case 0:
                return new C12678a((C12741o) this.f27958b.get(), (C13265p) this.f27959c.get(), (C8855a) this.f27960d.get());
            default:
                return new ConversationListViewModel((C9582f) this.f27958b.get(), (C13461f) this.f27959c.get(), (C9532l) this.f27960d.get());
        }
    }
}
