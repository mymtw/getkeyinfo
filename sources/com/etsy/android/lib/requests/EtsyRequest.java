package com.etsy.android.lib.requests;

import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import androidx.datastore.preferences.protobuf.C2606m;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.scribejava.core.exceptions.OAuthException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import p010a9.C0048b;
import p409o9.C13138q;
import p502zg.C13964a;
import p628nj.C18263b;

@Deprecated
public class EtsyRequest<Result extends BaseModel> implements Serializable {
    public static final String CONTENT_ENCODING = "utf-8";
    public static final int DEFAULT_TIMEOUT = 10000;
    private static final String ENCODING_GZIP = "gzip";
    private static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    private static final String HEADER_DETECTED_LOCALE = "X-Detected-Locale";
    private static final String HEADER_ETSY_DEVICE = "X-Etsy-Device";
    private static final String HEADER_USER_AGENT = "User-agent";
    public static final String JSON_CONTENT_TYPE;
    public static final String PARAM_CURRENCY = "currency";
    public static final String PARAM_LANGUAGE = "language";
    public static final String PARAM_REGION = "region";
    public static final String URL_FORM_CONTENT_TYPE;
    private static final long serialVersionUID = 2715154933950012215L;
    private String mBodyParameters;
    private boolean mCachable;
    private String mContentType;
    private String mEndpoint;
    private EndpointType mEndpointType;
    private boolean mHasQuestionMark;
    private HashMap<String, String> mHeaders;
    private boolean mIsBespoke;
    private boolean mIsNextLink;
    private byte[] mPayload;
    private RequestMethod mRequestMethod;
    private String mRequestParameters;
    private String mRequestUrl;
    private Class<Result> mResponseClass;
    private float mRetryBackOffMultiplier;
    private int mRetryCount;
    private boolean mSigned;
    private int mTimeout;
    private APIv3Scope mV3Scope;

    public enum APIv3Scope {
        PUBLIC("/public"),
        MEMBER("/member"),
        SHOP("/shop");
        
        private String mName;
        private String mPath;

        private APIv3Scope(String str) {
            this.mPath = str;
        }

        public String getIdentifier() {
            return this.mName;
        }

        public void setIdentifier(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mPath;
        }
    }

    public enum EndpointType {
        APIv3,
        ETSY,
        I_CAN_HAZ_TOKEN
    }

    public enum RequestMethod {
        GET,
        PUT,
        POST,
        DELETE
    }

    static {
        Locale locale = Locale.ROOT;
        JSON_CONTENT_TYPE = String.format(locale, "application/json; charset=%s", new Object[]{CONTENT_ENCODING});
        URL_FORM_CONTENT_TYPE = String.format(locale, "application/x-www-form-urlencoded", new Object[0]);
    }

    public EtsyRequest() {
        this.mIsBespoke = false;
        this.mContentType = "application/x-www-form-urlencoded";
        this.mCachable = false;
        this.mHasQuestionMark = false;
    }

    private String concatUrlEncodedParams(String str, String str2, boolean z) {
        String replace = str.replace(' ', '+');
        String replace2 = str2.replace(' ', '+');
        if (replace.length() != 0) {
            return replace2.length() > 0 ? C0048b.m163a(replace, "&", replace2) : replace;
        }
        if (!z) {
            return replace2;
        }
        String i = C0326j.m864i("?", replace2);
        this.mHasQuestionMark = true;
        return i;
    }

    private String createUrlEncodingParam(String str, String str2) {
        StringBuilder k = C0073e.m211k(str, "=");
        Map<String, String> map = C13964a.f30708a;
        C2606m.m6123R(str2, "Cannot encode null object");
        try {
            String encode = URLEncoder.encode(str2, "UTF-8");
            for (Map.Entry next : C13964a.f30708a.entrySet()) {
                encode = encode.replaceAll(Pattern.quote((String) next.getKey()), (String) next.getValue());
            }
            k.append(encode);
            return k.toString();
        } catch (UnsupportedEncodingException e) {
            throw new OAuthException("Charset not found while encoding string: UTF-8", e);
        }
    }

    private String createUrlEncodingParams(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                sb.append(createUrlEncodingParam((String) next.getKey(), (String) next.getValue()));
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        return sb.toString();
    }

    private HashMap<String, String> getDefaultHeaders() {
        HashMap<String, String> hashMap = new HashMap<>();
        C13138q a = C13138q.m20808a();
        a.getClass();
        hashMap.put(HEADER_USER_AGENT, a.mo45852b(System.getProperty("http.agent")));
        hashMap.put(HEADER_ETSY_DEVICE, C13138q.m20808a().f28895a);
        hashMap.put(HEADER_ACCEPT_ENCODING, "gzip");
        return hashMap;
    }

    private void updateEndpointForType() {
        EndpointType endpointType = this.mEndpointType;
        EndpointType endpointType2 = EndpointType.APIv3;
        if (endpointType == endpointType2 && this.mIsNextLink) {
            List<String> list = C8591a.f18700r;
            this.mEndpoint = C18263b.f40056T.f18706f.mo21136f(C8592b.f18828s0);
        } else if (endpointType == endpointType2) {
            StringBuilder sb = new StringBuilder();
            List<String> list2 = C8591a.f18700r;
            sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18825r0));
            if (this.mIsBespoke) {
                sb.append("/bespoke");
            }
            sb.append(this.mV3Scope.toString());
            APIv3Scope aPIv3Scope = this.mV3Scope;
            APIv3Scope aPIv3Scope2 = APIv3Scope.SHOP;
            if (aPIv3Scope.equals(aPIv3Scope2)) {
                if (aPIv3Scope2.getIdentifier() != null) {
                    sb.append("/");
                    sb.append(aPIv3Scope2.getIdentifier());
                } else {
                    throw new IllegalArgumentException("Attempting to use shop scope for API v3 without setting the APIv3Scope.SHOP identifier id");
                }
            }
            this.mEndpoint = sb.toString();
        } else if (endpointType == EndpointType.ETSY) {
            List<String> list3 = C8591a.f18700r;
            this.mEndpoint = C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0);
        } else if (endpointType == EndpointType.I_CAN_HAZ_TOKEN) {
            List<String> list4 = C8591a.f18700r;
            this.mEndpoint = C18263b.f40056T.f18706f.mo21136f(C8592b.f18834u0);
        }
    }

    public void addBodyParam(String str, String str2) {
        this.mBodyParameters = concatUrlEncodedParams(this.mBodyParameters, createUrlEncodingParam(str, str2), false);
        setContentType(URL_FORM_CONTENT_TYPE);
        try {
            setPayload(this.mBodyParameters.getBytes(CONTENT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            C8694h.f19097a.error(e);
        }
    }

    public void addBodyParams(Map<String, String> map) {
        this.mBodyParameters = concatUrlEncodedParams(this.mBodyParameters, createUrlEncodingParams(map), false);
        setContentType(URL_FORM_CONTENT_TYPE);
        try {
            setPayload(this.mBodyParameters.getBytes(CONTENT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            C8694h.f19097a.error(e);
        }
    }

    public void addParams(Map<String, String> map) {
        this.mRequestParameters = concatUrlEncodedParams(this.mRequestParameters, createUrlEncodingParams(map), !this.mHasQuestionMark);
    }

    public String getAllParameters() {
        return concatUrlEncodedParams(this.mRequestParameters, this.mBodyParameters, false);
    }

    public String getContentType() {
        return this.mContentType;
    }

    public String getEndpoint() {
        return this.mEndpoint;
    }

    public EndpointType getEndpointType() {
        return this.mEndpointType;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public byte[] getPayload() {
        return this.mPayload;
    }

    public RequestMethod getRequestMethod() {
        return this.mRequestMethod;
    }

    public String getRequestUrl() {
        return this.mRequestUrl;
    }

    public Class<Result> getResponseClass() {
        return this.mResponseClass;
    }

    public float getRetryBackOffMultiplier() {
        return this.mRetryBackOffMultiplier;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public String getUrl() {
        return this.mEndpoint + this.mRequestUrl;
    }

    @JsonIgnore
    public String getUrlWithParams() {
        if (this.mIsNextLink) {
            return this.mRequestUrl;
        }
        return this.mRequestUrl + this.mRequestParameters;
    }

    public boolean isCachable() {
        return this.mCachable;
    }

    public boolean isSigned() {
        return this.mSigned;
    }

    public void setCachable(boolean z) {
        this.mCachable = z;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public void setPayload(byte[] bArr) {
        this.mPayload = bArr;
    }

    public void setResponseClass(Class<Result> cls) {
        this.mResponseClass = cls;
    }

    public void setRetryBackOffMultiplier(float f) {
        this.mRetryBackOffMultiplier = f;
    }

    public void setRetryCount(int i) {
        this.mRetryCount = i;
    }

    public void setSigned(boolean z) {
        this.mSigned = z;
    }

    public void setTimeout(int i) {
        this.mTimeout = i;
    }

    public void setV3Bespoke(boolean z) {
        if (this.mEndpointType == EndpointType.APIv3) {
            this.mIsBespoke = z;
            updateEndpointForType();
            return;
        }
        throw new IllegalStateException("Bespoke endpoints are only available on APIv3");
    }

    public void setV3Scope(APIv3Scope aPIv3Scope) {
        if (this.mEndpointType == EndpointType.APIv3) {
            this.mV3Scope = aPIv3Scope;
            updateEndpointForType();
            return;
        }
        throw new IllegalStateException("A v3 scope can only be used with an APIv3 endpoint");
    }

    public EtsyRequest(String str, RequestMethod requestMethod, Class<Result> cls) {
        this(str, requestMethod, cls, EndpointType.APIv3);
    }

    public EtsyRequest(String str, RequestMethod requestMethod, Class<Result> cls, EndpointType endpointType) {
        this.mIsBespoke = false;
        this.mContentType = "application/x-www-form-urlencoded";
        this.mCachable = false;
        this.mHasQuestionMark = false;
        this.mRequestUrl = str;
        this.mRequestMethod = requestMethod;
        this.mResponseClass = cls;
        this.mHasQuestionMark = str.contains("?");
        this.mRequestParameters = "";
        this.mBodyParameters = "";
        this.mSigned = true;
        this.mV3Scope = APIv3Scope.PUBLIC;
        this.mIsNextLink = false;
        this.mEndpointType = endpointType;
        updateEndpointForType();
        this.mTimeout = DEFAULT_TIMEOUT;
        this.mHeaders = getDefaultHeaders();
    }
}
