package com.paypal.android.platform.authsdk.authcommon.utils;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class UriInspector {
    private final Uri uri;

    public UriInspector(Uri uri2) {
        this.uri = uri2;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsPath$auth_sdk_thirdPartyRelease(java.lang.String r6) {
        /*
            r5 = this;
            android.net.Uri r0 = r5.uri
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x002c
        L_0x0006:
            java.lang.String r0 = r0.getPath()
            r2 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0025
        L_0x000e:
            java.lang.String r3 = "/$"
            java.lang.String r4 = ""
            java.lang.String r0 = kotlin.text.C19457k.m33023a1(r0, r3, r4, r1)
            if (r6 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            java.lang.String r2 = kotlin.text.C19457k.m33023a1(r6, r3, r4, r1)
        L_0x001d:
            boolean r6 = r0.equals(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
        L_0x0025:
            if (r2 != 0) goto L_0x0028
            return r1
        L_0x0028:
            boolean r1 = r2.booleanValue()
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.utils.UriInspector.containsPath$auth_sdk_thirdPartyRelease(java.lang.String):boolean");
    }

    public final String getParamValue$auth_sdk_thirdPartyRelease(String str) {
        Uri uri2 = this.uri;
        if (uri2 == null) {
            return null;
        }
        String query = uri2.getQuery();
        if (!TextUtils.isEmpty(query) && query != null) {
            Object[] array = C19459m.m33056y1(query, new String[]{"&"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    i++;
                    Object[] array2 = C19459m.m33056y1(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length >= 2) {
                            String str3 = strArr2[0];
                            String str4 = strArr2[1];
                            if (C19457k.m33019W0(str, str3, true) && !TextUtils.isEmpty(str4)) {
                                return str4;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return null;
    }

    public final boolean isEqualHost$auth_sdk_thirdPartyRelease(Uri uri2, Uri uri3) {
        String host;
        String host2;
        if (uri2 == null || (host = uri2.getHost()) == null || uri3 == null || (host2 = uri3.getHost()) == null) {
            return false;
        }
        return C19457k.m33019W0(host, host2, true);
    }

    public final boolean isEqualPath$auth_sdk_thirdPartyRelease(Uri uri2, Uri uri3) {
        String path;
        String path2;
        if (uri2 == null || (path = uri2.getPath()) == null || uri3 == null || (path2 = uri3.getPath()) == null) {
            return false;
        }
        return C19457k.m33019W0(path, path2, true);
    }

    public final boolean isEqualScheme$auth_sdk_thirdPartyRelease(Uri uri2, Uri uri3) {
        String scheme;
        String scheme2;
        if (uri2 == null || (scheme = uri2.getScheme()) == null || uri3 == null || (scheme2 = uri3.getScheme()) == null) {
            return false;
        }
        return C19457k.m33019W0(scheme, scheme2, true);
    }

    public final boolean isEqualSchemeHostPath$auth_sdk_thirdPartyRelease(Uri uri2) {
        return isEqualScheme$auth_sdk_thirdPartyRelease(this.uri, uri2) && isEqualHost$auth_sdk_thirdPartyRelease(this.uri, uri2) && isEqualPath$auth_sdk_thirdPartyRelease(this.uri, uri2);
    }
}
