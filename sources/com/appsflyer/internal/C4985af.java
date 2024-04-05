package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.appsflyer.internal.af */
public class C4985af implements Runnable {
    private final C5056bv AFInAppEventType;

    public C4985af() {
    }

    public C4985af(C5056bv bvVar) {
        this.AFInAppEventType = bvVar;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return valueOf(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.AFKeystoreWrapper(sb.toString(), (Throwable) e);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return AFKeystoreWrapper(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.AFKeystoreWrapper(sb.toString(), (Throwable) e);
            return null;
        }
    }

    public static String valueOf(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return AFKeystoreWrapper(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.AFKeystoreWrapper(sb.toString(), (Throwable) e);
            return null;
        }
    }

    public static String values(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return valueOf(instance.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.AFInAppEventType(e.getMessage(), e);
            return e.getMessage();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection AFInAppEventParameterName() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "AFInAppEventType"
            java.lang.String r2 = ""
            com.appsflyer.internal.bv r3 = r1.AFInAppEventType
            java.lang.String r4 = r3.onInstallConversionFailureNative
            java.lang.String r3 = r3.AFLogger$LogLevel()
            com.appsflyer.internal.bv r5 = r1.AFInAppEventType
            boolean r5 = r5.AFVersionDeclaration()
            com.appsflyer.internal.bv r6 = r1.AFInAppEventType
            boolean r6 = r6.AppsFlyer2dXConversionCallback()
            com.appsflyer.internal.bv r7 = r1.AFInAppEventType
            boolean r7 = r7.getLevel()
            com.appsflyer.internal.bv r8 = r1.AFInAppEventType
            boolean r8 = r8.valueOf()
            byte[] r9 = r3.getBytes()
            r10 = 0
            if (r5 == 0) goto L_0x002e
            return r10
        L_0x002e:
            r5 = 0
            r11 = 1
            java.net.URL r12 = new java.net.URL     // Catch:{ all -> 0x0188 }
            r12.<init>(r4)     // Catch:{ all -> 0x0188 }
            if (r7 == 0) goto L_0x0090
            com.appsflyer.internal.ak r13 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x008c }
            if (r13 != 0) goto L_0x0046
            com.appsflyer.internal.ak r13 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0043 }
            r13.<init>()     // Catch:{ all -> 0x0043 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r13     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            goto L_0x018a
        L_0x0046:
            com.appsflyer.internal.ak r13 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x008c }
            java.lang.String r14 = r12.toString()     // Catch:{ all -> 0x008c }
            java.lang.String r15 = "server_request"
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x008c }
            r10[r5] = r3     // Catch:{ all -> 0x008c }
            r13.valueOf(r15, r14, r10)     // Catch:{ all -> 0x008c }
            java.lang.String r10 = "UTF-8"
            byte[] r10 = r3.getBytes(r10)     // Catch:{ all -> 0x008c }
            int r10 = r10.length     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r14 = "call = "
            r13.<init>(r14)     // Catch:{ all -> 0x008c }
            r13.append(r12)     // Catch:{ all -> 0x008c }
            java.lang.String r14 = "; size = "
            r13.append(r14)     // Catch:{ all -> 0x008c }
            r13.append(r10)     // Catch:{ all -> 0x008c }
            java.lang.String r14 = " byte"
            r13.append(r14)     // Catch:{ all -> 0x008c }
            if (r10 <= r11) goto L_0x0078
            java.lang.String r10 = "s"
            goto L_0x0079
        L_0x0078:
            r10 = r2
        L_0x0079:
            r13.append(r10)     // Catch:{ all -> 0x008c }
            java.lang.String r10 = "; body = "
            r13.append(r10)     // Catch:{ all -> 0x008c }
            r13.append(r3)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x008c }
            com.appsflyer.internal.C5004am.AFInAppEventType(r3)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            r10 = 0
            goto L_0x018a
        L_0x0090:
            java.lang.String r3 = "AppsFlyer"
            int r3 = r3.hashCode()     // Catch:{ all -> 0x0184 }
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ all -> 0x0184 }
            java.net.URLConnection r3 = r12.openConnection()     // Catch:{ all -> 0x0184 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x0184 }
            r10 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r10)     // Catch:{ all -> 0x0181 }
            r3.setConnectTimeout(r10)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "POST"
            r3.setRequestMethod(r10)     // Catch:{ all -> 0x0181 }
            r3.setDoInput(r11)     // Catch:{ all -> 0x0181 }
            r3.setDoOutput(r11)     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = "Content-Type"
            if (r8 == 0) goto L_0x00b9
            java.lang.String r13 = "application/octet-stream"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r13 = "application/json"
        L_0x00bb:
            r3.setRequestProperty(r10, r13)     // Catch:{ all -> 0x0181 }
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch:{ all -> 0x0181 }
            if (r8 == 0) goto L_0x013e
            com.appsflyer.internal.bv r8 = r1.AFInAppEventType     // Catch:{ all -> 0x0181 }
            java.lang.String r8 = r8.init     // Catch:{ all -> 0x0181 }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x0135 }
            r13[r5] = r8     // Catch:{ all -> 0x0135 }
            long r14 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x0135 }
            r16 = -1
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            int r8 = 25 - r8
            int r14 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x0135 }
            int r14 = r14 >> 16
            char r14 = (char) r14     // Catch:{ all -> 0x0135 }
            int r15 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0135 }
            int r15 = r15 >> 16
            int r15 = r15 + 24
            java.lang.Object r8 = com.appsflyer.internal.C5088e.AFKeystoreWrapper(r8, r14, r15)     // Catch:{ all -> 0x0135 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0135 }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x0135 }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r14[r5] = r15     // Catch:{ all -> 0x0135 }
            java.lang.reflect.Method r8 = r8.getMethod(r0, r14)     // Catch:{ all -> 0x0135 }
            r14 = 0
            java.lang.Object r8 = r8.invoke(r14, r13)     // Catch:{ all -> 0x0135 }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x012c }
            r13[r5] = r9     // Catch:{ all -> 0x012c }
            float r9 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x012c }
            r14 = 0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            int r9 = 24 - r9
            int r14 = android.graphics.drawable.Drawable.resolveOpacity(r5, r5)     // Catch:{ all -> 0x012c }
            char r14 = (char) r14     // Catch:{ all -> 0x012c }
            int r15 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x012c }
            int r15 = r15 >> 16
            int r15 = 24 - r15
            java.lang.Object r9 = com.appsflyer.internal.C5088e.AFKeystoreWrapper(r9, r14, r15)     // Catch:{ all -> 0x012c }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x012c }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x012c }
            java.lang.Class<byte[]> r15 = byte[].class
            r14[r5] = r15     // Catch:{ all -> 0x012c }
            java.lang.reflect.Method r0 = r9.getDeclaredMethod(r0, r14)     // Catch:{ all -> 0x012c }
            java.lang.Object r0 = r0.invoke(r8, r13)     // Catch:{ all -> 0x012c }
            r9 = r0
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x012c }
            goto L_0x013e
        L_0x012c:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0181 }
            if (r5 == 0) goto L_0x0134
            throw r5     // Catch:{ all -> 0x0181 }
        L_0x0134:
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0135:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0181 }
            if (r5 == 0) goto L_0x013d
            throw r5     // Catch:{ all -> 0x0181 }
        L_0x013d:
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x013e:
            r10.write(r9)     // Catch:{ all -> 0x0181 }
            r10.close()     // Catch:{ all -> 0x0181 }
            r3.connect()     // Catch:{ all -> 0x0181 }
            int r0 = r3.getResponseCode()     // Catch:{ all -> 0x0181 }
            if (r6 == 0) goto L_0x0154
            com.appsflyer.internal.C4986ag.AFInAppEventType()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = com.appsflyer.internal.C4986ag.AFInAppEventType((java.net.HttpURLConnection) r3)     // Catch:{ all -> 0x0181 }
        L_0x0154:
            if (r7 == 0) goto L_0x0177
            com.appsflyer.internal.ak r6 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0181 }
            if (r6 != 0) goto L_0x0161
            com.appsflyer.internal.ak r6 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0181 }
            r6.<init>()     // Catch:{ all -> 0x0181 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r6     // Catch:{ all -> 0x0181 }
        L_0x0161:
            com.appsflyer.internal.ak r6 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0181 }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x0181 }
            java.lang.String r8 = "server_response"
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0181 }
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0181 }
            r9[r5] = r10     // Catch:{ all -> 0x0181 }
            r9[r11] = r2     // Catch:{ all -> 0x0181 }
            r6.valueOf(r8, r7, r9)     // Catch:{ all -> 0x0181 }
        L_0x0177:
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 != r6) goto L_0x0198
            java.lang.String r0 = "Status 200 ok"
            com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0199
        L_0x0181:
            r0 = move-exception
            r10 = r3
            goto L_0x018a
        L_0x0184:
            r0 = move-exception
            r14 = 0
            r10 = r14
            goto L_0x018a
        L_0x0188:
            r0 = move-exception
            r14 = r10
        L_0x018a:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r3, (java.lang.Throwable) r0)
            r3 = r10
        L_0x0198:
            r5 = r11
        L_0x0199:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Connection "
            r0.<init>(r4)
            if (r5 == 0) goto L_0x01a5
            java.lang.String r4 = "error"
            goto L_0x01a7
        L_0x01a5:
            java.lang.String r4 = "call succeeded"
        L_0x01a7:
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4985af.AFInAppEventParameterName():java.net.HttpURLConnection");
    }

    public void run() {
        HttpURLConnection AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            AFInAppEventParameterName.disconnect();
        }
    }

    private static String AFKeystoreWrapper(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    private static String valueOf(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
