package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.lib.models.Conversation3;
import java.util.List;
import p248tp.C8071s;
import p765pr.C20064d;
import p771sr.C20183f;
import p771sr.C20197t;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.b */
public interface C9594b {
    @C20183f("/etsyapps/v3/member/conversations")
    /* renamed from: a */
    C8071s<C20064d<List<Conversation3>>> mo32228a(@C20197t("limit") int i, @C20197t("offset") int i2, @C20197t("typed_context") boolean z);
}
