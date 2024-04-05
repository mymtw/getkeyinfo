package p471wa;

import com.etsy.android.lib.models.apiv3.TestAccountToolResponse;
import com.etsy.android.lib.requests.apiv3.TestAccountToolEndpoint;
import p248tp.C8071s;

/* renamed from: wa.b */
public final class C13798b implements C13797a {

    /* renamed from: a */
    public final TestAccountToolEndpoint f30360a;

    public C13798b(TestAccountToolEndpoint testAccountToolEndpoint) {
        this.f30360a = testAccountToolEndpoint;
    }

    /* renamed from: a */
    public final C8071s<TestAccountToolResponse> mo46656a(String str) {
        return this.f30360a.getTestAccountToolAuthTokenAndSecret(str);
    }
}
