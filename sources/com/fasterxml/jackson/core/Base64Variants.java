package com.fasterxml.jackson.core;

import androidx.appcompat.widget.C0326j;
import com.google.android.gms.common.api.Api;
import com.google.android.material.badge.BadgeDrawable;
import p010a9.C0048b;

public final class Base64Variants {
    public static final Base64Variant MIME;
    public static final Base64Variant MIME_NO_LINEFEEDS;
    public static final Base64Variant MODIFIED_FOR_URL;
    public static final Base64Variant PEM;
    public static final String STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", STD_BASE64_ALPHABET, true, '=', 76);
        MIME = base64Variant;
        MIME_NO_LINEFEEDS = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        PEM = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder(STD_BASE64_ALPHABET);
        sb.setCharAt(sb.indexOf(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, 0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }

    public static Base64Variant valueOf(String str) throws IllegalArgumentException {
        Base64Variant base64Variant = MIME;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = MIME_NO_LINEFEEDS;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = PEM;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = MODIFIED_FOR_URL;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        throw new IllegalArgumentException(C0326j.m864i("No Base64Variant with name ", str == null ? "<null>" : C0048b.m163a("'", str, "'")));
    }
}
