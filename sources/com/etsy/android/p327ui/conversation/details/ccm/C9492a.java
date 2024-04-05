package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.lib.models.TranslatedConversationMessage;
import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.conversation.details.models.Message;
import java.util.List;
import java.util.Map;
import okhttp3.C20004s;
import okhttp3.C20016y;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20183f;
import p771sr.C20189l;
import p771sr.C20191n;
import p771sr.C20192o;
import p771sr.C20194q;
import p771sr.C20196s;
import p771sr.C20197t;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.a */
public interface C9492a {
    @C20189l
    @C20192o("/etsyapps/v3/member/messenger/app/conversations/{other_user_id}/messages")
    /* renamed from: a */
    C8071s<Message> mo32028a(@C20196s("other_user_id") long j, @C20194q("message") C20016y yVar, @C20194q List<C20004s.C20007c> list);

    @C20183f("/etsyapps/v3/member/messenger/conversations/{other_user_id}/messages/{message_id}/translations")
    /* renamed from: b */
    C8071s<TranslatedConversationMessage> mo32029b(@C20196s("other_user_id") long j, @C20196s("message_id") long j2, @C20197t("language") String str);

    @C20183f("/etsyapps/v3/member/messenger/app/legacy-conversations/{conversation_id}/conversation")
    /* renamed from: c */
    C8071s<ConversationResponse> mo32030c(@C20196s("conversation_id") long j);

    @C20183f("/etsyapps/v3/bespoke/member/messenger/conversation-detail/{other_username}")
    /* renamed from: d */
    C8071s<ConversationResponse> mo32031d(@C20196s("other_username") String str, @C20197t("include_legacy_conversation") boolean z, @C20197t("cursor") long j, @C20197t("cursor_direction") CursorDirection cursorDirection);

    @C20183f("/etsyapps/v3/bespoke/member/messenger/conversation-detail/{other_user_id}")
    /* renamed from: e */
    C8071s<ConversationResponse> mo32032e(@C20196s("other_user_id") long j, @C20197t("include_legacy_conversation") boolean z, @C20197t("cursor") long j2, @C20197t("cursor_direction") CursorDirection cursorDirection);

    @C20191n("/etsyapps/v3/member/messenger/app/conversations/{other_user_id}/status")
    /* renamed from: f */
    C8071s<ConversationMetadata> mo32033f(@C20196s("other_user_id") long j, @C20178a Map<String, String> map);
}
