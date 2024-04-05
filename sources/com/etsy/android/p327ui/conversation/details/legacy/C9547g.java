package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.p327ui.conversation.details.C9558n;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p354gc.C12774h;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.g */
public final class C9547g implements C9558n {

    /* renamed from: a */
    public final /* synthetic */ LegacyConversationDetailsPresenter f21166a;

    public C9547g(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        this.f21166a = legacyConversationDetailsPresenter;
    }

    /* renamed from: a */
    public final void mo31994a(int i, List<C12774h> list) {
        C19383o.m32797g(list, "images");
        String a = list.get(i).mo45540a();
        this.f21166a.f21123e.getClass();
        if (C13895a.m21420c(a)) {
            this.f21166a.f21120b.openListingImageGalleryView(i, list);
        } else {
            this.f21166a.f21120b.openNonImageAttachmentView(a);
        }
    }
}
