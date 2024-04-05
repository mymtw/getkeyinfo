package com.paypal.android.platform.authsdk.authcommon.network.utils;

import androidx.compose.animation.C0388a;
import com.paypal.android.platform.authsdk.authcommon.model.AccountCredentials;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.apache.commons.cli.HelpFormatter;

public final class ChecksumUtil {
    public static final ChecksumUtil INSTANCE = new ChecksumUtil();
    private static final String KEY_AUTH_NONCE = "authNonce";
    private static final String KEY_TIMESTAMP = "timeStamp";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountCredentials.CredentialsType.values().length];
            iArr[AccountCredentials.CredentialsType.EMAIL_PASSWORD.ordinal()] = 1;
            iArr[AccountCredentials.CredentialsType.PHONE_PIN.ordinal()] = 2;
            iArr[AccountCredentials.CredentialsType.PHONE_PASSWORD.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ChecksumUtil() {
    }

    private final String composeChecksumInputForGrantTypePasswordOrPin(AccountCredentials accountCredentials, long j, ChecksumData checksumData) {
        String str;
        String str2;
        boolean z = true;
        if (j > 0) {
            int i = WhenMappings.$EnumSwitchMapping$0[accountCredentials.getType().ordinal()];
            if (i == 1) {
                str2 = accountCredentials.getUsername();
                str = accountCredentials.getPassword();
            } else if (i == 2) {
                str2 = accountCredentials.getPhone();
                str = accountCredentials.getPin();
            } else if (i != 3) {
                str = null;
                str2 = null;
            } else {
                str2 = C19457k.m33023a1(accountCredentials.getPhone(), HelpFormatter.DEFAULT_OPT_PREFIX, "", false);
                str = accountCredentials.getPassword();
            }
            String appName = checksumData.getAppName();
            String appGuid = checksumData.getAppGuid();
            String deviceInfo = checksumData.getDeviceInfo();
            if (!(str2 == null || str2.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    if (!(appName == null || appName.length() == 0)) {
                        if (!(appGuid == null || appGuid.length() == 0)) {
                            if (!(deviceInfo == null || deviceInfo.length() == 0)) {
                                z = false;
                            }
                            if (!z) {
                                try {
                                    String substring = str.substring(0, 3);
                                    C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    StringBuilder f = C0388a.m1050f(appName, appGuid, deviceInfo, str2, substring);
                                    f.append(String.valueOf(j));
                                    return f.toString();
                                } catch (IndexOutOfBoundsException unused) {
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Timestamp should be non-zero value".toString());
    }

    private final String getAuthCheckSum(String str) {
        if (str == null) {
            return null;
        }
        try {
            return CryptUtil.INSTANCE.sha256(str);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void addAuthApiCheckSumParams(com.paypal.android.platform.authsdk.authcommon.network.GrantType r4, com.paypal.android.platform.authsdk.authcommon.model.AccountCredentials r5, java.util.HashMap<java.lang.String, java.lang.String> r6, com.paypal.android.platform.authsdk.authcommon.network.utils.ChecksumData r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "grantType"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "credentials"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "checksumData"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)     // Catch:{ all -> 0x0052 }
            com.paypal.android.platform.authsdk.authcommon.network.GrantType r0 = com.paypal.android.platform.authsdk.authcommon.network.GrantType.PASSWORD     // Catch:{ all -> 0x0052 }
            if (r0 != r4) goto L_0x0050
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r3.composeChecksumInputForGrantTypePasswordOrPin(r5, r0, r7)     // Catch:{ all -> 0x0052 }
            r5 = 0
            r7 = 1
            if (r4 == 0) goto L_0x002e
            int r2 = r4.length()     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = r5
            goto L_0x002f
        L_0x002e:
            r2 = r7
        L_0x002f:
            if (r2 == 0) goto L_0x0033
            monitor-exit(r3)
            return
        L_0x0033:
            java.lang.String r4 = r3.getAuthCheckSum(r4)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x003f
            int r2 = r4.length()     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x0040
        L_0x003f:
            r5 = r7
        L_0x0040:
            if (r5 != 0) goto L_0x0050
            java.lang.String r5 = "authNonce"
            r6.put(r5, r4)     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = "timeStamp"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0052 }
            r6.put(r4, r5)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r3)
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.utils.ChecksumUtil.addAuthApiCheckSumParams(com.paypal.android.platform.authsdk.authcommon.network.GrantType, com.paypal.android.platform.authsdk.authcommon.model.AccountCredentials, java.util.HashMap, com.paypal.android.platform.authsdk.authcommon.network.utils.ChecksumData):void");
    }
}
