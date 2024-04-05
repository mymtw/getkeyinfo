package com.paypal.openid;

import androidx.appcompat.widget.C0326j;
import java.util.Map;

public interface ClientAuthentication {

    public static class UnsupportedAuthenticationMethod extends Exception {

        /* renamed from: a */
        private String f37544a;

        public UnsupportedAuthenticationMethod(String str) {
            super(C0326j.m864i("Unsupported client authentication method: ", str));
            this.f37544a = str;
        }

        public String getUnsupportedAuthenticationMethod() {
            return this.f37544a;
        }
    }

    /* renamed from: g */
    Map<String, String> mo1132g(String str);

    /* renamed from: l */
    Map<String, String> mo1136l(String str);
}
