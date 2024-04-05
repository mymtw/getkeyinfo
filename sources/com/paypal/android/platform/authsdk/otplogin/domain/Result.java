package com.paypal.android.platform.authsdk.otplogin.domain;

import android.support.p013v4.media.C0073e;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

@Keep
public final class Result {
    @C18417a("code")
    private String code;
    @C18417a("debugMessage")
    private String debugMessage;
    @C18417a("kind")
    private String kind;
    @C18417a("message")
    private String message;
    @C18417a("objectType")
    private String objectType;
    @C18417a("title")
    private String title;

    public Result() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public Result(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.message = str2;
        this.code = str3;
        this.kind = str4;
        this.debugMessage = str5;
        this.objectType = str6;
    }

    public static /* synthetic */ Result copy$default(Result result, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = result.title;
        }
        if ((i & 2) != 0) {
            str2 = result.message;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = result.code;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = result.kind;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = result.debugMessage;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = result.objectType;
        }
        return result.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.kind;
    }

    public final String component5() {
        return this.debugMessage;
    }

    public final String component6() {
        return this.objectType;
    }

    public final Result copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new Result(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return C19383o.m32792b(this.title, result.title) && C19383o.m32792b(this.message, result.message) && C19383o.m32792b(this.code, result.code) && C19383o.m32792b(this.kind, result.kind) && C19383o.m32792b(this.debugMessage, result.debugMessage) && C19383o.m32792b(this.objectType, result.objectType);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kind;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.debugMessage;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.objectType;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setDebugMessage(String str) {
        this.debugMessage = str;
    }

    public final void setKind(String str) {
        this.kind = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setObjectType(String str) {
        this.objectType = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        String str3 = this.code;
        String str4 = this.kind;
        String str5 = this.debugMessage;
        String str6 = this.objectType;
        StringBuilder f = C0388a.m1050f("Result(title=", str, ", message=", str2, ", code=");
        C0391c.m1061h(f, str3, ", kind=", str4, ", debugMessage=");
        return C0073e.m210j(f, str5, ", objectType=", str6, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Result(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.domain.Result.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
