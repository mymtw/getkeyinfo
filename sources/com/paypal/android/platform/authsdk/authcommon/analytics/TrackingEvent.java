package com.paypal.android.platform.authsdk.authcommon.analytics;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class TrackingEvent {

    public static final class Click extends TrackingEvent {
        private String appGuid;
        private String appName;
        private String authSdkVersion;
        private String deviceId;
        private final String eventName;
        private final String fieldName;
        private final String infoMessage;
        private final String outcome;
        private String tenant;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Click(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r16
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r17
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                r8 = r2
                goto L_0x001b
            L_0x0019:
                r8 = r18
            L_0x001b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0021
                r9 = r2
                goto L_0x0023
            L_0x0021:
                r9 = r19
            L_0x0023:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0029
                r10 = r2
                goto L_0x002b
            L_0x0029:
                r10 = r20
            L_0x002b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0031
                r11 = r2
                goto L_0x0033
            L_0x0031:
                r11 = r21
            L_0x0033:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0039
                r12 = r2
                goto L_0x003b
            L_0x0039:
                r12 = r22
            L_0x003b:
                r3 = r13
                r4 = r14
                r5 = r15
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent.Click.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAppGuid() {
            return this.appGuid;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getAuthSdkVersion() {
            return this.authSdkVersion;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final String getInfoMessage() {
            return this.infoMessage;
        }

        public final String getOutcome() {
            return this.outcome;
        }

        public final String getTenant() {
            return this.tenant;
        }

        public final void setAppGuid(String str) {
            this.appGuid = str;
        }

        public final void setAppName(String str) {
            this.appName = str;
        }

        public final void setAuthSdkVersion(String str) {
            this.authSdkVersion = str;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setTenant(String str) {
            this.tenant = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Click(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(str2, "outcome");
            this.eventName = str;
            this.outcome = str2;
            this.infoMessage = str3;
            this.fieldName = str4;
            this.authSdkVersion = str5;
            this.tenant = str6;
            this.appName = str7;
            this.deviceId = str8;
            this.appGuid = str9;
        }
    }

    public static final class Error extends TrackingEvent {
        private String appGuid;
        private String appName;
        private String authSdkVersion;
        private final String correlationId;
        private String deviceId;
        private final String errorCode;
        private final String errorMessage;
        private final String eventName;
        private final String infoMessage;
        private final String outcome;
        private String tenant;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Error(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r18
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r19
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                r8 = r2
                goto L_0x001b
            L_0x0019:
                r8 = r20
            L_0x001b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0021
                r9 = r2
                goto L_0x0023
            L_0x0021:
                r9 = r21
            L_0x0023:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0029
                r10 = r2
                goto L_0x002b
            L_0x0029:
                r10 = r22
            L_0x002b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0031
                r11 = r2
                goto L_0x0033
            L_0x0031:
                r11 = r23
            L_0x0033:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0039
                r12 = r2
                goto L_0x003b
            L_0x0039:
                r12 = r24
            L_0x003b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0041
                r13 = r2
                goto L_0x0043
            L_0x0041:
                r13 = r25
            L_0x0043:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0049
                r14 = r2
                goto L_0x004b
            L_0x0049:
                r14 = r26
            L_0x004b:
                r3 = r15
                r4 = r16
                r5 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent.Error.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAppGuid() {
            return this.appGuid;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getAuthSdkVersion() {
            return this.authSdkVersion;
        }

        public final String getCorrelationId() {
            return this.correlationId;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getInfoMessage() {
            return this.infoMessage;
        }

        public final String getOutcome() {
            return this.outcome;
        }

        public final String getTenant() {
            return this.tenant;
        }

        public final void setAppGuid(String str) {
            this.appGuid = str;
        }

        public final void setAppName(String str) {
            this.appName = str;
        }

        public final void setAuthSdkVersion(String str) {
            this.authSdkVersion = str;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setTenant(String str) {
            this.tenant = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(str2, "errorMessage");
            this.eventName = str;
            this.errorMessage = str2;
            this.outcome = str3;
            this.infoMessage = str4;
            this.errorCode = str5;
            this.correlationId = str6;
            this.authSdkVersion = str7;
            this.tenant = str8;
            this.appName = str9;
            this.deviceId = str10;
            this.appGuid = str11;
        }
    }

    public static final class Impression extends TrackingEvent {
        private String appGuid;
        private String appName;
        private String authSdkVersion;
        private String deviceId;
        private final String eventName;
        private final String infoMessage;
        private final String outcome;
        private String tenant;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Impression(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
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
                if (r1 == 0) goto L_0x0020
                r9 = r2
                goto L_0x0022
            L_0x0020:
                r9 = r18
            L_0x0022:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0028
                r10 = r2
                goto L_0x002a
            L_0x0028:
                r10 = r19
            L_0x002a:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0030
                r11 = r2
                goto L_0x0032
            L_0x0030:
                r11 = r20
            L_0x0032:
                r3 = r12
                r4 = r13
                r5 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent.Impression.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAppGuid() {
            return this.appGuid;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getAuthSdkVersion() {
            return this.authSdkVersion;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getInfoMessage() {
            return this.infoMessage;
        }

        public final String getOutcome() {
            return this.outcome;
        }

        public final String getTenant() {
            return this.tenant;
        }

        public final void setAppGuid(String str) {
            this.appGuid = str;
        }

        public final void setAppName(String str) {
            this.appName = str;
        }

        public final void setAuthSdkVersion(String str) {
            this.authSdkVersion = str;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setTenant(String str) {
            this.tenant = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Impression(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(str2, "outcome");
            this.eventName = str;
            this.outcome = str2;
            this.infoMessage = str3;
            this.authSdkVersion = str4;
            this.tenant = str5;
            this.appName = str6;
            this.deviceId = str7;
            this.appGuid = str8;
        }
    }

    private TrackingEvent() {
    }

    public /* synthetic */ TrackingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
