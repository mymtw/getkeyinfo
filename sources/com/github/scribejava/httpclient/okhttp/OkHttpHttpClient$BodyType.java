package com.github.scribejava.httpclient.okhttp;

import java.io.File;
import okhttp3.C20002r;
import okhttp3.C20016y;

enum OkHttpHttpClient$BodyType {
    BYTE_ARRAY {
        public C20016y createBody(C20002r rVar, Object obj) {
            return C20016y.C20017a.m34283d(C20016y.f44360a, (byte[]) obj, rVar, 6);
        }
    },
    STRING {
        public C20016y createBody(C20002r rVar, Object obj) {
            C20016y.f44360a.getClass();
            return C20016y.C20017a.m34281b((String) obj, rVar);
        }
    },
    FILE {
        public C20016y createBody(C20002r rVar, Object obj) {
            C20016y.f44360a.getClass();
            return C20016y.C20017a.m34280a((File) obj, rVar);
        }
    };

    public abstract C20016y createBody(C20002r rVar, Object obj);
}
