package com.paypal.pyplcheckout.pojo.firebase;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class FirebaseProperties {
    @C18417a("message_data")
    private final MessageData messageData;
    @C18417a("message_name")
    private final String messageName;
    @C18417a("message_status")
    private final String messageStatus;
    @C18417a("message_type")
    private final String messageType;
    @C18417a("message_uid")
    private final String messageUid;
    @C18417a("request_uid")
    private final String requestUid;
    @C18417a("session_uid")
    private final String sessionUid;
    @C18417a("source_app")
    private final String sourceApp;
    @C18417a("source_app_version")
    private final String sourceAppVersion;
    @C18417a("target_app")
    private final String targetApp;

    public FirebaseProperties(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MessageData messageData2) {
        C19383o.m32797g(str, "sourceApp");
        C19383o.m32797g(str2, "targetApp");
        C19383o.m32797g(str3, "sourceAppVersion");
        C19383o.m32797g(str4, "messageType");
        C19383o.m32797g(str6, "messageUid");
        C19383o.m32797g(str7, "requestUid");
        C19383o.m32797g(str8, "messageName");
        C19383o.m32797g(str9, "messageStatus");
        this.sourceApp = str;
        this.targetApp = str2;
        this.sourceAppVersion = str3;
        this.messageType = str4;
        this.sessionUid = str5;
        this.messageUid = str6;
        this.requestUid = str7;
        this.messageName = str8;
        this.messageStatus = str9;
        this.messageData = messageData2;
    }

    public static /* synthetic */ FirebaseProperties copy$default(FirebaseProperties firebaseProperties, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MessageData messageData2, int i, Object obj) {
        FirebaseProperties firebaseProperties2 = firebaseProperties;
        int i2 = i;
        return firebaseProperties.copy((i2 & 1) != 0 ? firebaseProperties2.sourceApp : str, (i2 & 2) != 0 ? firebaseProperties2.targetApp : str2, (i2 & 4) != 0 ? firebaseProperties2.sourceAppVersion : str3, (i2 & 8) != 0 ? firebaseProperties2.messageType : str4, (i2 & 16) != 0 ? firebaseProperties2.sessionUid : str5, (i2 & 32) != 0 ? firebaseProperties2.messageUid : str6, (i2 & 64) != 0 ? firebaseProperties2.requestUid : str7, (i2 & 128) != 0 ? firebaseProperties2.messageName : str8, (i2 & 256) != 0 ? firebaseProperties2.messageStatus : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? firebaseProperties2.messageData : messageData2);
    }

    public final String component1() {
        return this.sourceApp;
    }

    public final MessageData component10() {
        return this.messageData;
    }

    public final String component2() {
        return this.targetApp;
    }

    public final String component3() {
        return this.sourceAppVersion;
    }

    public final String component4() {
        return this.messageType;
    }

    public final String component5() {
        return this.sessionUid;
    }

    public final String component6() {
        return this.messageUid;
    }

    public final String component7() {
        return this.requestUid;
    }

    public final String component8() {
        return this.messageName;
    }

    public final String component9() {
        return this.messageStatus;
    }

    public final FirebaseProperties copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MessageData messageData2) {
        C19383o.m32797g(str, "sourceApp");
        C19383o.m32797g(str2, "targetApp");
        C19383o.m32797g(str3, "sourceAppVersion");
        String str10 = str4;
        C19383o.m32797g(str10, "messageType");
        String str11 = str6;
        C19383o.m32797g(str11, "messageUid");
        String str12 = str7;
        C19383o.m32797g(str12, "requestUid");
        String str13 = str8;
        C19383o.m32797g(str13, "messageName");
        String str14 = str9;
        C19383o.m32797g(str14, "messageStatus");
        return new FirebaseProperties(str, str2, str3, str10, str5, str11, str12, str13, str14, messageData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseProperties)) {
            return false;
        }
        FirebaseProperties firebaseProperties = (FirebaseProperties) obj;
        return C19383o.m32792b(this.sourceApp, firebaseProperties.sourceApp) && C19383o.m32792b(this.targetApp, firebaseProperties.targetApp) && C19383o.m32792b(this.sourceAppVersion, firebaseProperties.sourceAppVersion) && C19383o.m32792b(this.messageType, firebaseProperties.messageType) && C19383o.m32792b(this.sessionUid, firebaseProperties.sessionUid) && C19383o.m32792b(this.messageUid, firebaseProperties.messageUid) && C19383o.m32792b(this.requestUid, firebaseProperties.requestUid) && C19383o.m32792b(this.messageName, firebaseProperties.messageName) && C19383o.m32792b(this.messageStatus, firebaseProperties.messageStatus) && C19383o.m32792b(this.messageData, firebaseProperties.messageData);
    }

    public final MessageData getMessageData() {
        return this.messageData;
    }

    public final String getMessageName() {
        return this.messageName;
    }

    public final String getMessageStatus() {
        return this.messageStatus;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMessageUid() {
        return this.messageUid;
    }

    public final String getRequestUid() {
        return this.requestUid;
    }

    public final String getSessionUid() {
        return this.sessionUid;
    }

    public final String getSourceApp() {
        return this.sourceApp;
    }

    public final String getSourceAppVersion() {
        return this.sourceAppVersion;
    }

    public final String getTargetApp() {
        return this.targetApp;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.messageType, C0023f.m105e(this.sourceAppVersion, C0023f.m105e(this.targetApp, this.sourceApp.hashCode() * 31, 31), 31), 31);
        String str = this.sessionUid;
        int i = 0;
        int e2 = C0023f.m105e(this.messageStatus, C0023f.m105e(this.messageName, C0023f.m105e(this.requestUid, C0023f.m105e(this.messageUid, (e + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        MessageData messageData2 = this.messageData;
        if (messageData2 != null) {
            i = messageData2.hashCode();
        }
        return e2 + i;
    }

    public String toString() {
        String str = this.sourceApp;
        String str2 = this.targetApp;
        String str3 = this.sourceAppVersion;
        String str4 = this.messageType;
        String str5 = this.sessionUid;
        String str6 = this.messageUid;
        String str7 = this.requestUid;
        String str8 = this.messageName;
        String str9 = this.messageStatus;
        MessageData messageData2 = this.messageData;
        StringBuilder f = C0388a.m1050f("FirebaseProperties(sourceApp=", str, ", targetApp=", str2, ", sourceAppVersion=");
        C0391c.m1061h(f, str3, ", messageType=", str4, ", sessionUid=");
        C0391c.m1061h(f, str5, ", messageUid=", str6, ", requestUid=");
        C0391c.m1061h(f, str7, ", messageName=", str8, ", messageStatus=");
        f.append(str9);
        f.append(", messageData=");
        f.append(messageData2);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FirebaseProperties(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.paypal.pyplcheckout.pojo.firebase.MessageData r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = "paypal_native_checkout"
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r14
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = "paypal_smart_payment_buttons"
            r4 = r1
            goto L_0x0014
        L_0x0013:
            r4 = r15
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0020
            com.paypal.pyplcheckout.utils.VersionUtils r1 = com.paypal.pyplcheckout.utils.VersionUtils.INSTANCE
            java.lang.String r1 = r1.getSdkVersion()
            r5 = r1
            goto L_0x0022
        L_0x0020:
            r5 = r16
        L_0x0022:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = "response"
            r6 = r1
            goto L_0x002c
        L_0x002a:
            r6 = r17
        L_0x002c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0033
            r7 = r2
            goto L_0x0035
        L_0x0033:
            r7 = r18
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "success"
            r11 = r1
            goto L_0x003f
        L_0x003d:
            r11 = r22
        L_0x003f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0045
            r12 = r2
            goto L_0x0047
        L_0x0045:
            r12 = r23
        L_0x0047:
            r2 = r13
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.firebase.FirebaseProperties.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.firebase.MessageData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
