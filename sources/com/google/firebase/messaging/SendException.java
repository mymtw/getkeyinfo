package com.google.firebase.messaging;

public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendException(java.lang.String r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0008
            goto L_0x005f
        L_0x0008:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            int r1 = r7.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1743242157: goto L_0x0042;
                case -1290953729: goto L_0x0038;
                case -920906446: goto L_0x002e;
                case -617027085: goto L_0x0024;
                case -95047692: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x004c
        L_0x001a:
            java.lang.String r1 = "missing_to"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x004c
            r7 = r5
            goto L_0x004d
        L_0x0024:
            java.lang.String r1 = "messagetoobig"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x004c
            r7 = r4
            goto L_0x004d
        L_0x002e:
            java.lang.String r1 = "invalid_parameters"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x004c
            r7 = r0
            goto L_0x004d
        L_0x0038:
            java.lang.String r1 = "toomanymessages"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x004c
            r7 = r2
            goto L_0x004d
        L_0x0042:
            java.lang.String r1 = "service_not_available"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x004c
            r7 = r3
            goto L_0x004d
        L_0x004c:
            r7 = -1
        L_0x004d:
            if (r7 == 0) goto L_0x005e
            if (r7 == r5) goto L_0x005e
            if (r7 == r4) goto L_0x005c
            if (r7 == r3) goto L_0x005a
            if (r7 == r2) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            r0 = r2
            goto L_0x005f
        L_0x005a:
            r0 = r3
            goto L_0x005f
        L_0x005c:
            r0 = r4
            goto L_0x005f
        L_0x005e:
            r0 = r5
        L_0x005f:
            r6.errorCode = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SendException.<init>(java.lang.String):void");
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
