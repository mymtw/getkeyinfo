package com.etsy.android.lib.requests.apiv3;

import com.appboy.Constants;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p756lr.C19893f;
import p756lr.C19902n;
import p756lr.C19903o;

public final class GzippedRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String GZIP_ENCODING = "gzip";

    public static final C20016y create(C20002r rVar, String str) {
        return Companion.create(rVar, str);
    }

    public static final C20016y create(C20002r rVar, byte[] bArr) {
        return Companion.create(rVar, bArr);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C20016y create(C20002r rVar, String str) {
            C19383o.m32797g(str, DetailsBottomSheetNavigationKey.PARAM_BODY);
            return C20016y.C20017a.m34283d(C20016y.f44360a, gzip(str).mo72732d0(), rVar, 6);
        }

        public final C19893f gzip(String str) {
            C19383o.m32797g(str, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
            byte[] bytes = str.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            return gzip(bytes);
        }

        public final String ungzipString(C19893f fVar) {
            C19383o.m32797g(fVar, "buffer");
            C19893f fVar2 = new C19893f();
            C19903o oVar = new C19903o(fVar);
            oVar.mo68544J(fVar2, fVar.f43876c);
            oVar.close();
            return new String(fVar2.mo72732d0(), C19446a.f43373b);
        }

        public final C20016y create(C20002r rVar, byte[] bArr) {
            C19383o.m32797g(bArr, DetailsBottomSheetNavigationKey.PARAM_BODY);
            return C20016y.C20017a.m34283d(C20016y.f44360a, gzip(bArr).mo72732d0(), rVar, 6);
        }

        public final C19893f gzip(byte[] bArr) {
            C19383o.m32797g(bArr, "bytes");
            C19893f fVar = new C19893f();
            C19893f fVar2 = new C19893f();
            fVar2.write(bArr);
            C19902n nVar = new C19902n(fVar);
            nVar.mo68512O(fVar2, (long) bArr.length);
            nVar.close();
            return fVar;
        }
    }
}
