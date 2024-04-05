package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.lib.models.ListingPartial;
import com.etsy.android.lib.models.TranslatedConversationMessage;
import com.etsy.android.lib.models.conversation.ConversationThread2;
import com.etsy.android.lib.models.datatypes.EtsyId;
import java.util.List;
import okhttp3.C20016y;
import p248tp.C8048a;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20183f;
import p771sr.C20189l;
import p771sr.C20192o;
import p771sr.C20194q;
import p771sr.C20196s;
import p771sr.C20197t;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.h */
public interface C9548h {
    @C20189l
    @C20192o("/etsyapps/v3/member/conversations/get-listing-cards")
    /* renamed from: a */
    C8071s<List<ListingPartial>> mo32146a(@C20194q("listing_ids") C20016y yVar);

    @C20183f("/etsyapps/v3/member/translations/conversations/{conversationId}/messages/{messageOrder}")
    /* renamed from: b */
    C8071s<TranslatedConversationMessage> mo32147b(@C20196s("conversationId") EtsyId etsyId, @C20196s("messageOrder") int i, @C20197t("language") String str);

    @C20192o("/etsyapps/v3/member/conversations/change-tags")
    /* renamed from: c */
    C8048a mo32148c(@C20178a C20016y yVar);

    @C20183f("/etsyapps/v3/bespoke/member/conversations/{conversation_id}/thread?typed_context=true")
    /* renamed from: d */
    C8071s<ConversationThread2> mo32149d(@C20196s("conversation_id") long j);
}
