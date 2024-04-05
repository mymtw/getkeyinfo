package com.braze.push;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2 */
final class C5511xcfb3563d extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationPayload.ConversationMessage $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5511xcfb3563d(BrazeNotificationPayload.ConversationMessage conversationMessage) {
        super(0);
        this.$message = conversationMessage;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$message, "Message person does not exist in mapping. Not rendering a style. ");
    }
}
