package com.usebutton.merchant;

import java.util.HashMap;
import org.json.JSONObject;

public final class ApiRequest {

    /* renamed from: a */
    public final RequestMethod f38211a;

    /* renamed from: b */
    public final String f38212b;

    /* renamed from: c */
    public final HashMap f38213c;

    /* renamed from: d */
    public final JSONObject f38214d;

    public enum RequestMethod {
        POST("POST");
        
        private final String value;

        private RequestMethod(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    /* renamed from: com.usebutton.merchant.ApiRequest$a */
    public static class C17471a {

        /* renamed from: a */
        public final RequestMethod f38215a;

        /* renamed from: b */
        public final String f38216b;

        /* renamed from: c */
        public HashMap f38217c = new HashMap();

        /* renamed from: d */
        public JSONObject f38218d = new JSONObject();

        public C17471a(RequestMethod requestMethod, String str) {
            this.f38215a = requestMethod;
            this.f38216b = str;
        }
    }

    public ApiRequest(C17471a aVar) {
        this.f38211a = aVar.f38215a;
        this.f38212b = aVar.f38216b;
        this.f38213c = aVar.f38217c;
        this.f38214d = aVar.f38218d;
    }
}
