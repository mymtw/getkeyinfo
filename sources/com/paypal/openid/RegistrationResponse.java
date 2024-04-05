package com.paypal.openid;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import p684to.C18571d;

public final class RegistrationResponse {

    /* renamed from: j */
    public static final HashSet f37545j = new HashSet(Arrays.asList(new String[]{"client_id", "client_secret", "client_secret_expires_at", "registration_access_token", "registration_client_uri", "client_id_issued_at", "token_endpoint_auth_method"}));

    /* renamed from: a */
    public final C18571d f37546a;

    /* renamed from: b */
    public final String f37547b;

    /* renamed from: c */
    public final Long f37548c;

    /* renamed from: d */
    public final String f37549d;

    /* renamed from: e */
    public final Long f37550e;

    /* renamed from: f */
    public final String f37551f;

    /* renamed from: g */
    public final Uri f37552g;

    /* renamed from: h */
    public final String f37553h;

    /* renamed from: i */
    public final Map<String, String> f37554i;

    public static class MissingArgumentException extends Exception {

        /* renamed from: a */
        private String f37555a;

        public MissingArgumentException(String str) {
            super(C0326j.m864i("Missing mandatory registration field: ", str));
            this.f37555a = str;
        }

        public String getMissingField() {
            return this.f37555a;
        }
    }

    public RegistrationResponse(C18571d dVar, String str, Long l, String str2, Long l2, String str3, Uri uri, String str4, Map map) {
        this.f37546a = dVar;
        this.f37547b = str;
        this.f37548c = l;
        this.f37549d = str2;
        this.f37550e = l2;
        this.f37551f = str3;
        this.f37552g = uri;
        this.f37553h = str4;
        this.f37554i = map;
    }
}
