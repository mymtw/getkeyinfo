package com.paypal.android.platform.authsdk.authcommon.model;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AuthenticationError extends IOException {
    private final String code;
    private final String debugId;
    private final String message;
    private final String name;
    private final String title;

    public static final class Network extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Network(String str, String str2, Throwable th, String str3) {
            super(str2, (String) null, str, str3, (String) null, th, 18, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Network(String str, String str2, Throwable th, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str3);
        }
    }

    public static final class Service extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Service(String str, String str2, Throwable th) {
            super(str2, (String) null, str, (String) null, (String) null, th, 26, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Service(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
        }
    }

    public static final class Unknown extends AuthenticationError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unknown(String str, String str2, Throwable th) {
            super(str2, (String) null, str, (String) null, (String) null, th, 26, (DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuthenticationError(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r12
        L_0x0024:
            r6 = r14 & 32
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r13
        L_0x002a:
            r6 = 0
            r8 = r7
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r1
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ AuthenticationError(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, th);
    }

    public static /* synthetic */ void getCode$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDebugId() {
        return this.debugId;
    }

    public String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    private AuthenticationError(String str, String str2, String str3, String str4, String str5, Throwable th) {
        super(str, th);
        this.name = str;
        this.title = str2;
        this.message = str3;
        this.code = str4;
        this.debugId = str5;
    }
}
