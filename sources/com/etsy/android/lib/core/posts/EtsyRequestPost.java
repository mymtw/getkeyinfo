package com.etsy.android.lib.core.posts;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.requests.EtsyRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.IOException;
import okhttp3.C19994o;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20015x;
import okhttp3.C20016y;
import okhttp3.internal.connection.C19971e;
import p340ea.C12673n;
import p425q9.C13254f;
import p425q9.C13255g;
import p433r9.C13332a;
import p628nj.C18263b;

@Deprecated
public abstract class EtsyRequestPost<Result extends BaseModel> implements PersistentRequest<EtsyRequest<Result>, C13254f<Result>> {
    private static final long serialVersionUID = -4739648392270657437L;
    @JsonIgnore
    public boolean mIsAdded;
    private PostInfo mPostInfo;
    private EtsyRequest<Result> mRequest;

    public EtsyRequestPost() {
    }

    public PostInfo getPostInfo() {
        return this.mPostInfo;
    }

    public abstract int getVersionCode();

    public boolean isPersisted() {
        return this.mIsAdded;
    }

    public boolean isValidRequest() {
        return true;
    }

    public void onAdded(Context context) {
    }

    public boolean onError(Context context, C13254f<Result> fVar) {
        if (getRequest() == null) {
            return false;
        }
        C12673n nVar = C18263b.f40052P;
        StringBuilder h = C0072d.m201h("Dropping Post Request, not retrying. URL: ");
        h.append(getRequest().getUrl());
        nVar.mo45451c("etsy-post-manager", h.toString());
        return false;
    }

    public final void onPersisted(Context context) {
        this.mIsAdded = true;
        onAdded(context);
    }

    public void onSuccess(Context context, C13254f<Result> fVar) {
    }

    public void onUpgraded(int i, int i2) {
    }

    public void setPersisted(boolean z) {
        this.mIsAdded = z;
    }

    public EtsyRequestPost(EtsyRequest<Result> etsyRequest) {
        this.mRequest = etsyRequest;
    }

    public EtsyRequest<Result> getRequest() {
        return this.mRequest;
    }

    public boolean onPersistentResult(Context context, C13254f<Result> fVar) {
        if (fVar == null || !fVar.f29115e) {
            C8694h.f19097a.mo21310e("runPost error");
            if (onError(context, fVar)) {
                return true;
            }
            if (getRequest() != null) {
                C12673n nVar = C18263b.f40052P;
                StringBuilder h = C0072d.m201h("Dropping Post Request, not retrying. URL: ");
                h.append(getRequest().getUrl());
                nVar.mo45451c("etsy-post-manager", h.toString());
            }
            return false;
        }
        C8694h.f19097a.mo21310e("runPost success");
        onSuccess(context, fVar);
        return false;
    }

    public C13254f<Result> onPersistentRun(OkHttpClientHolder okHttpClientHolder) {
        EtsyRequest request = getRequest();
        if (request != null) {
            request.getHeaders().remove("Accept-Encoding");
            try {
                byte[] payload = request.getPayload();
                if (payload == null) {
                    payload = new byte[0];
                }
                String contentType = request.getContentType();
                C20002r.f44260f.getClass();
                C20002r a = C20002r.C20003a.m34243a(contentType);
                int length = payload.length;
                C20016y.f44360a.getClass();
                C20015x c = C20016y.C20017a.m34282c(payload, a, 0, length);
                C20011u.C20012a aVar = new C20011u.C20012a();
                aVar.mo73003f(request.getEndpoint() + request.getUrlWithParams());
                aVar.mo73001d(request.getRequestMethod().name(), c);
                aVar.f44349c = C19994o.m34201l(request.getHeaders()).mo72952g();
                C20011u b = aVar.mo72999b();
                if (request.getEndpointType() == EtsyRequest.EndpointType.APIv3) {
                    return new C13332a(C13255g.C13256a.m20917a(((C19971e) okHttpClientHolder.f18996a.mo20743a(b)).mo72859e()), request.getResponseClass());
                }
            } catch (IOException e) {
                return new C13254f<>(e);
            }
        }
        return new C13254f<>(new UnsupportedOperationException("Deserialized persistent request was null."));
    }

    public EtsyRequestPost(EtsyRequest<Result> etsyRequest, PostInfo postInfo) {
        this.mRequest = etsyRequest;
        this.mPostInfo = postInfo;
    }
}
