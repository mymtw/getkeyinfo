package com.etsy.android.p327ui.conversation.list.ccm;

import com.etsy.android.lib.models.conversation.ccm.ConversationMetadataListResult;
import p248tp.C8071s;
import p765pr.C20064d;
import p771sr.C20183f;
import p771sr.C20197t;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.b */
public interface C9578b {
    @C20183f("/etsyapps/v3/bespoke/member/messenger/conversations")
    /* renamed from: a */
    C8071s<C20064d<ConversationMetadataListResult>> mo32209a(@C20197t("limit") int i, @C20197t("page") int i2);
}
