package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p365hg.C12861f;
import p365hg.C12864g;
import p365hg.C12882n;
import p453tf.C13418j;

public final class FacebookRequestError implements Parcelable {
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new FacebookRequestError$Companion$CREATOR$1();
    public static final C12189a Companion = new C12189a();
    private static final String ERROR_CODE_FIELD_KEY = "code";
    private static final String ERROR_CODE_KEY = "error_code";
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
    private static final String ERROR_KEY = "error";
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";
    private static final String ERROR_MSG_KEY = "error_msg";
    private static final String ERROR_REASON_KEY = "error_reason";
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";
    private static final String ERROR_TYPE_FIELD_KEY = "type";
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    /* access modifiers changed from: private */
    public static final C12190b HTTP_RANGE_SUCCESS = new C12190b();
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private final Object batchRequestResult;
    private final Category category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final String errorMessage;
    private final String errorRecoveryMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private FacebookException exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$a */
    public static final class C12189a {
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce A[Catch:{ JSONException -> 0x0137 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0104 A[Catch:{ JSONException -> 0x0137 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.facebook.FacebookRequestError m19988a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                kotlin.jvm.internal.C19383o.m32797g(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x0137 }
                if (r5 == 0) goto L_0x0137
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x0137 }
                java.lang.Object r6 = p365hg.C12869i0.m20581t(r3, r2, r9)     // Catch:{ JSONException -> 0x0137 }
                r7 = 1
                r8 = 0
                if (r6 == 0) goto L_0x00f0
                boolean r10 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0137 }
                if (r10 == 0) goto L_0x00f0
                r10 = r6
                org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch:{ JSONException -> 0x0137 }
                boolean r10 = r10.has(r1)     // Catch:{ JSONException -> 0x0137 }
                java.lang.String r11 = "error_subcode"
                r12 = -1
                if (r10 == 0) goto L_0x007e
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0137 }
                java.lang.Object r0 = p365hg.C12869i0.m20581t(r1, r15, r0)     // Catch:{ JSONException -> 0x0137 }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0137 }
                if (r0 == 0) goto L_0x0046
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x0047
            L_0x0046:
                r1 = r15
            L_0x0047:
                if (r0 == 0) goto L_0x0050
                java.lang.String r10 = "message"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x0051
            L_0x0050:
                r10 = r15
            L_0x0051:
                if (r0 == 0) goto L_0x0058
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x0059
            L_0x0058:
                r4 = r12
            L_0x0059:
                if (r0 == 0) goto L_0x005f
                int r12 = r0.optInt(r11, r12)     // Catch:{ JSONException -> 0x0137 }
            L_0x005f:
                if (r0 == 0) goto L_0x0068
                java.lang.String r11 = "error_user_msg"
                java.lang.String r11 = r0.optString(r11, r15)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x0069
            L_0x0068:
                r11 = r15
            L_0x0069:
                if (r0 == 0) goto L_0x0072
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x0073
            L_0x0072:
                r13 = r15
            L_0x0073:
                if (r0 == 0) goto L_0x007c
                java.lang.String r14 = "is_transient"
                boolean r0 = r0.optBoolean(r14, r8)     // Catch:{ JSONException -> 0x0137 }
                goto L_0x00c6
            L_0x007c:
                r0 = r8
                goto L_0x00c6
            L_0x007e:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0137 }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x0137 }
                java.lang.String r4 = "error_msg"
                java.lang.String r10 = "error_reason"
                if (r1 != 0) goto L_0x00a7
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0137 }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x0137 }
                if (r1 != 0) goto L_0x00a7
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0137 }
                boolean r1 = r1.has(r10)     // Catch:{ JSONException -> 0x0137 }
                if (r1 == 0) goto L_0x009e
                goto L_0x00a7
            L_0x009e:
                r0 = r8
                r16 = r0
                r4 = r12
                r10 = r15
                r11 = r10
                r13 = r11
                r14 = r13
                goto L_0x00cc
            L_0x00a7:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0137 }
                java.lang.String r1 = r1.optString(r10, r15)     // Catch:{ JSONException -> 0x0137 }
                r10 = r6
                org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch:{ JSONException -> 0x0137 }
                java.lang.String r10 = r10.optString(r4, r15)     // Catch:{ JSONException -> 0x0137 }
                r4 = r6
                org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x0137 }
                int r4 = r4.optInt(r0, r12)     // Catch:{ JSONException -> 0x0137 }
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0137 }
                int r12 = r0.optInt(r11, r12)     // Catch:{ JSONException -> 0x0137 }
                r0 = r8
                r11 = r15
                r13 = r11
            L_0x00c6:
                r16 = r0
                r0 = r7
                r14 = r11
                r11 = r10
                r10 = r1
            L_0x00cc:
                if (r0 == 0) goto L_0x00f0
                com.facebook.FacebookRequestError r17 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x0137 }
                r8 = r6
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ JSONException -> 0x0137 }
                r18 = 0
                r19 = 0
                r0 = r17
                r1 = r5
                r2 = r4
                r3 = r12
                r4 = r10
                r5 = r11
                r6 = r13
                r7 = r14
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r18
                r13 = r16
                r14 = r19
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0137 }
                return r17
            L_0x00f0:
                com.facebook.FacebookRequestError$b r0 = com.facebook.FacebookRequestError.HTTP_RANGE_SUCCESS     // Catch:{ JSONException -> 0x0137 }
                r0.getClass()     // Catch:{ JSONException -> 0x0137 }
                r0 = 200(0xc8, float:2.8E-43)
                r1 = 299(0x12b, float:4.19E-43)
                if (r0 <= r5) goto L_0x00fe
                goto L_0x0101
            L_0x00fe:
                if (r1 < r5) goto L_0x0101
                goto L_0x0102
            L_0x0101:
                r7 = r8
            L_0x0102:
                if (r7 != 0) goto L_0x0137
                com.facebook.FacebookRequestError r16 = new com.facebook.FacebookRequestError     // Catch:{ JSONException -> 0x0137 }
                r4 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x0137 }
                if (r0 == 0) goto L_0x011a
                java.lang.Object r0 = p365hg.C12869i0.m20581t(r3, r2, r9)     // Catch:{ JSONException -> 0x0137 }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0137 }
                r12 = r0
                goto L_0x011b
            L_0x011a:
                r12 = r15
            L_0x011b:
                r13 = 0
                r14 = 0
                r17 = 0
                r0 = r16
                r1 = r5
                r2 = r4
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r10
                r7 = r11
                r8 = r12
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0137 }
                return r16
            L_0x0137:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.C12189a.m19988a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        /* renamed from: b */
        public final synchronized C12861f mo39220b() {
            C12882n b = FetchedAppSettingsManager.m20104b(C13418j.m21107c());
            if (b != null) {
                return b.f28404h;
            }
            return C12861f.f28351h.mo45639a();
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public static final class C12190b {
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    public static final FacebookRequestError checkResponseAndCreateError(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        Companion.getClass();
        return C12189a.m19988a(jSONObject, obj, httpURLConnection);
    }

    public static final synchronized C12861f getErrorClassification() {
        C12861f b;
        synchronized (FacebookRequestError.class) {
            b = Companion.mo39220b();
        }
        return b;
    }

    public int describeContents() {
        return 0;
    }

    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    public final FacebookException getException() {
        return this.exception;
    }

    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
        C19383o.m32796f(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeInt(this.requestStatusCode);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.subErrorCode);
        parcel.writeString(this.errorType);
        parcel.writeString(getErrorMessage());
        parcel.writeString(this.errorUserTitle);
        parcel.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        Category category2;
        String str5;
        Set set;
        Set set2;
        Set set3;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z2 = true;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            z2 = false;
        }
        if (z2) {
            category2 = Category.OTHER;
        } else {
            C12861f b = Companion.mo39220b();
            if (z) {
                b.getClass();
                category2 = Category.TRANSIENT;
            } else {
                Map<Integer, Set<Integer>> map = b.f28352a;
                if (map == null || !map.containsKey(Integer.valueOf(i2)) || ((set3 = b.f28352a.get(Integer.valueOf(i2))) != null && !set3.contains(Integer.valueOf(i3)))) {
                    Map<Integer, Set<Integer>> map2 = b.f28354c;
                    if (map2 == null || !map2.containsKey(Integer.valueOf(i2)) || ((set2 = b.f28354c.get(Integer.valueOf(i2))) != null && !set2.contains(Integer.valueOf(i3)))) {
                        Map<Integer, Set<Integer>> map3 = b.f28353b;
                        if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set = b.f28353b.get(Integer.valueOf(i2))) != null && !set.contains(Integer.valueOf(i3)))) {
                            category2 = Category.OTHER;
                        } else {
                            category2 = Category.TRANSIENT;
                        }
                    } else {
                        category2 = Category.LOGIN_RECOVERABLE;
                    }
                } else {
                    category2 = Category.OTHER;
                }
            }
        }
        this.category = category2;
        C12861f b2 = Companion.mo39220b();
        b2.getClass();
        if (category2 != null) {
            int i4 = C12864g.f28359a[category2.ordinal()];
            if (i4 == 1) {
                str5 = b2.f28355d;
            } else if (i4 == 2) {
                str5 = b2.f28357f;
            } else if (i4 == 3) {
                str5 = b2.f28356e;
            }
            this.errorRecoveryMessage = str5;
        }
        str5 = null;
        this.errorRecoveryMessage = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FacebookRequestError(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.FacebookException
            if (r1 == 0) goto L_0x000a
            com.facebook.FacebookException r0 = (com.facebook.FacebookException) r0
            r14 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.FacebookException r1 = new com.facebook.FacebookException
            r1.<init>((java.lang.Throwable) r0)
            r14 = r1
        L_0x0010:
            r15 = 0
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r16
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }
}
