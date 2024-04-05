package com.etsy.android.lib.models.apiv3.conversation;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

@C17403o(generateAdapter = true)
public final class NewConversation {
    public static final int $stable = 8;
    private String message;
    private String recipientLoginName;
    private String subject;

    public NewConversation() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public NewConversation(@C17402n(name = "recipient_loginname") String str, @C17402n(name = "subject") String str2, @C17402n(name = "message") String str3) {
        C0048b.m167f(str, "recipientLoginName", str2, ResponseConstants.SUBJECT, str3, "message");
        this.recipientLoginName = str;
        this.subject = str2;
        this.message = str3;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRecipientLoginName() {
        return this.recipientLoginName;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final void setMessage(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.message = str;
    }

    public final void setRecipientLoginName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.recipientLoginName = str;
    }

    public final void setSubject(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.subject = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewConversation(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
