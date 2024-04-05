package com.paypal.android.platform.authsdk.authinterface;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class EmailConfirmationContext implements AuthenticationContext {
    private final AuthenticationState authState;
    private final String confirmationCode;
    private final String email;
    private final String encryptedCustomerId;
    private final AuthenticationPrompt loginPrompt;
    private final String publicCredential;
    private final String source;
    private final String sourceType;

    public EmailConfirmationContext(String str, String str2, String str3, String str4, String str5, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, String str6) {
        C19383o.m32797g(str, "email");
        C19383o.m32797g(str2, "confirmationCode");
        C19383o.m32797g(authenticationState, "authState");
        C19383o.m32797g(authenticationPrompt, "loginPrompt");
        this.email = str;
        this.confirmationCode = str2;
        this.encryptedCustomerId = str3;
        this.source = str4;
        this.sourceType = str5;
        this.authState = authenticationState;
        this.loginPrompt = authenticationPrompt;
        this.publicCredential = str6;
    }

    public static /* synthetic */ EmailConfirmationContext copy$default(EmailConfirmationContext emailConfirmationContext, String str, String str2, String str3, String str4, String str5, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, String str6, int i, Object obj) {
        EmailConfirmationContext emailConfirmationContext2 = emailConfirmationContext;
        int i2 = i;
        return emailConfirmationContext.copy((i2 & 1) != 0 ? emailConfirmationContext2.email : str, (i2 & 2) != 0 ? emailConfirmationContext2.confirmationCode : str2, (i2 & 4) != 0 ? emailConfirmationContext2.encryptedCustomerId : str3, (i2 & 8) != 0 ? emailConfirmationContext2.source : str4, (i2 & 16) != 0 ? emailConfirmationContext2.sourceType : str5, (i2 & 32) != 0 ? emailConfirmationContext.getAuthState() : authenticationState, (i2 & 64) != 0 ? emailConfirmationContext.getLoginPrompt() : authenticationPrompt, (i2 & 128) != 0 ? emailConfirmationContext.getPublicCredential() : str6);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.confirmationCode;
    }

    public final String component3() {
        return this.encryptedCustomerId;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.sourceType;
    }

    public final AuthenticationState component6() {
        return getAuthState();
    }

    public final AuthenticationPrompt component7() {
        return getLoginPrompt();
    }

    public final String component8() {
        return getPublicCredential();
    }

    public final EmailConfirmationContext copy(String str, String str2, String str3, String str4, String str5, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, String str6) {
        C19383o.m32797g(str, "email");
        C19383o.m32797g(str2, "confirmationCode");
        AuthenticationState authenticationState2 = authenticationState;
        C19383o.m32797g(authenticationState2, "authState");
        AuthenticationPrompt authenticationPrompt2 = authenticationPrompt;
        C19383o.m32797g(authenticationPrompt2, "loginPrompt");
        return new EmailConfirmationContext(str, str2, str3, str4, str5, authenticationState2, authenticationPrompt2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailConfirmationContext)) {
            return false;
        }
        EmailConfirmationContext emailConfirmationContext = (EmailConfirmationContext) obj;
        return C19383o.m32792b(this.email, emailConfirmationContext.email) && C19383o.m32792b(this.confirmationCode, emailConfirmationContext.confirmationCode) && C19383o.m32792b(this.encryptedCustomerId, emailConfirmationContext.encryptedCustomerId) && C19383o.m32792b(this.source, emailConfirmationContext.source) && C19383o.m32792b(this.sourceType, emailConfirmationContext.sourceType) && getAuthState() == emailConfirmationContext.getAuthState() && getLoginPrompt() == emailConfirmationContext.getLoginPrompt() && C19383o.m32792b(getPublicCredential(), emailConfirmationContext.getPublicCredential());
    }

    public AuthenticationState getAuthState() {
        return this.authState;
    }

    public final String getConfirmationCode() {
        return this.confirmationCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEncryptedCustomerId() {
        return this.encryptedCustomerId;
    }

    public AuthenticationPrompt getLoginPrompt() {
        return this.loginPrompt;
    }

    public String getPublicCredential() {
        return this.publicCredential;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.confirmationCode, this.email.hashCode() * 31, 31);
        String str = this.encryptedCustomerId;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceType;
        int hashCode3 = (getLoginPrompt().hashCode() + ((getAuthState().hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        if (getPublicCredential() != null) {
            i = getPublicCredential().hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.email;
        String str2 = this.confirmationCode;
        String str3 = this.encryptedCustomerId;
        String str4 = this.source;
        String str5 = this.sourceType;
        AuthenticationState authState2 = getAuthState();
        AuthenticationPrompt loginPrompt2 = getLoginPrompt();
        String publicCredential2 = getPublicCredential();
        StringBuilder f = C0388a.m1050f("EmailConfirmationContext(email=", str, ", confirmationCode=", str2, ", encryptedCustomerId=");
        C0391c.m1061h(f, str3, ", source=", str4, ", sourceType=");
        f.append(str5);
        f.append(", authState=");
        f.append(authState2);
        f.append(", loginPrompt=");
        f.append(loginPrompt2);
        f.append(", publicCredential=");
        f.append(publicCredential2);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EmailConfirmationContext(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.paypal.android.platform.authsdk.authinterface.AuthenticationState r18, com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0010
            r7 = r2
            goto L_0x0012
        L_0x0010:
            r7 = r16
        L_0x0012:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0018
            r8 = r2
            goto L_0x001a
        L_0x0018:
            r8 = r17
        L_0x001a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r1 = com.paypal.android.platform.authsdk.authinterface.AuthenticationState.LoggedIn
            r9 = r1
            goto L_0x0024
        L_0x0022:
            r9 = r18
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002c
            com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt r1 = com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt.Undefined
            r10 = r1
            goto L_0x002e
        L_0x002c:
            r10 = r19
        L_0x002e:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0034
            r11 = r2
            goto L_0x0036
        L_0x0034:
            r11 = r20
        L_0x0036:
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authinterface.EmailConfirmationContext.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.android.platform.authsdk.authinterface.AuthenticationState, com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
