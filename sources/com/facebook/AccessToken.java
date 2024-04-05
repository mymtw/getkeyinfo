package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p010a9.C0048b;
import p365hg.C12863f0;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p453tf.C13398a;
import p453tf.C13401c;
import p453tf.C13418j;
import p453tf.C13429q;

public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Parcelable.Creator<AccessToken> CREATOR = new AccessToken$Companion$CREATOR$1();
    private static final int CURRENT_JSON_FORMAT = 1;
    public static final C12174c Companion = new C12174c();
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    private static final Date DEFAULT_EXPIRATION_TIME;
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    public static final String GRAPH_DOMAIN = "graph_domain";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Date dataAccessExpirationTime;
    private final Set<String> declinedPermissions;
    private final Set<String> expiredPermissions;
    private final Date expires;
    private final String graphDomain;
    private final Date lastRefresh;
    private final Set<String> permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C12172a {
        /* renamed from: a */
        void mo39092a();

        void onSuccess();
    }

    /* renamed from: com.facebook.AccessToken$b */
    public interface C12173b {
        /* renamed from: a */
        void mo39094a();

        /* renamed from: b */
        void mo39095b();
    }

    /* renamed from: com.facebook.AccessToken$c */
    public static final class C12174c {
        /* renamed from: a */
        public static AccessToken m19978a(Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
            Date n;
            String string;
            Bundle bundle2 = bundle;
            String string2 = bundle2.getString(AccessToken.ACCESS_TOKEN_KEY);
            if (string2 == null || (n = C12869i0.m20575n(bundle2, AccessToken.EXPIRES_IN_KEY, date)) == null || (string = bundle2.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, str, string, (Collection) null, (Collection) null, (Collection) null, accessTokenSource, n, new Date(), C12869i0.m20575n(bundle2, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0)), (String) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public static AccessToken m19979b(JSONObject jSONObject) throws JSONException {
            C19383o.m32797g(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong(AccessToken.EXPIRES_AT_KEY));
                JSONArray jSONArray = jSONObject.getJSONArray(AccessToken.PERMISSIONS_KEY);
                JSONArray jSONArray2 = jSONObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
                JSONArray optJSONArray = jSONObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
                Date date2 = new Date(jSONObject.getLong(AccessToken.LAST_REFRESH_KEY));
                String string2 = jSONObject.getString(AccessToken.SOURCE_KEY);
                C19383o.m32796f(string2, "jsonObject.getString(SOURCE_KEY)");
                AccessTokenSource valueOf = AccessTokenSource.valueOf(string2);
                String string3 = jSONObject.getString(AccessToken.APPLICATION_ID_KEY);
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0));
                String optString = jSONObject.optString(AccessToken.GRAPH_DOMAIN, (String) null);
                C19383o.m32796f(string, "token");
                C19383o.m32796f(string3, "applicationId");
                C19383o.m32796f(string4, "userId");
                C19383o.m32796f(jSONArray, "permissionsArray");
                ArrayList D = C12869i0.m20548D(jSONArray);
                C19383o.m32796f(jSONArray2, "declinedPermissionsArray");
                return new AccessToken(string, string3, string4, D, C12869i0.m20548D(jSONArray2), optJSONArray == null ? new ArrayList() : C12869i0.m20548D(optJSONArray), valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        /* renamed from: c */
        public static void m19980c() {
            C13401c.C13402a aVar = C13401c.f29349g;
            AccessToken accessToken = aVar.mo46082a().f29350a;
            if (accessToken != null) {
                AccessToken accessToken2 = r2;
                AccessToken accessToken3 = new AccessToken(accessToken.getToken(), accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), new Date(), new Date(), accessToken.getDataAccessExpirationTime(), (String) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
                aVar.mo46082a().mo46081d(accessToken2, true);
            }
        }

        /* renamed from: d */
        public static AccessToken m19981d() {
            return C13401c.f29349g.mo46082a().f29350a;
        }

        /* renamed from: e */
        public static List m19982e(Bundle bundle, String str) {
            C19383o.m32797g(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return EmptyList.INSTANCE;
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C19383o.m32796f(unmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
            return unmodifiableList;
        }

        /* renamed from: f */
        public static boolean m19983f() {
            AccessToken accessToken = C13401c.f29349g.mo46082a().f29350a;
            return accessToken != null && !accessToken.isExpired();
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (String) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        Date date4;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        AccessTokenSource accessTokenSource2;
        Date date5;
        Date date6;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Collection<String> collection4 = collection;
        Collection<String> collection5 = collection2;
        Collection<String> collection6 = collection3;
        String str8 = str4;
        C0048b.m167f(str, UriChallengeConstantKt.ACCESS_TOKEN, str2, "applicationId", str3, "userId");
        C12879l0.m20599c(str5, UriChallengeConstantKt.ACCESS_TOKEN);
        C12879l0.m20599c(str6, "applicationId");
        C12879l0.m20599c(str7, "userId");
        if (date != null) {
            date4 = date;
        } else {
            date4 = DEFAULT_EXPIRATION_TIME;
        }
        this.expires = date4;
        if (collection4 == null) {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C19383o.m32796f(unmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.permissions = unmodifiableSet;
        if (collection5 == null) {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        C19383o.m32796f(unmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        if (collection6 == null) {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        C19383o.m32796f(unmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = str5;
        if (accessTokenSource != null) {
            accessTokenSource2 = accessTokenSource;
        } else {
            accessTokenSource2 = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = convertTokenSourceForGraphDomain(accessTokenSource2, str8);
        if (date2 != null) {
            date5 = date2;
        } else {
            date5 = DEFAULT_LAST_REFRESH_TIME;
        }
        this.lastRefresh = date5;
        this.applicationId = str6;
        this.userId = str7;
        if (date3 == null || date3.getTime() == 0) {
            date6 = DEFAULT_EXPIRATION_TIME;
        } else {
            date6 = date3;
        }
        this.dataAccessExpirationTime = date6;
        this.graphDomain = str8 == null ? "facebook" : str8;
    }

    private final void appendPermissions(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource accessTokenSource, String str) {
        if (str == null || !str.equals(ShopRelatedLink.INSTAGRAM_TITLE)) {
            return accessTokenSource;
        }
        int i = C13398a.f29346a[accessTokenSource.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? accessTokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW : AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB : AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    public static final AccessToken createFromJSONObject$facebook_core_release(JSONObject jSONObject) throws JSONException {
        Companion.getClass();
        return C12174c.m19979b(jSONObject);
    }

    public static final AccessToken createFromLegacyCache$facebook_core_release(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        Companion.getClass();
        C19383o.m32797g(bundle2, "bundle");
        List e = C12174c.m19982e(bundle2, "com.facebook.TokenCachingStrategy.Permissions");
        List e2 = C12174c.m19982e(bundle2, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List e3 = C12174c.m19982e(bundle2, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        C13429q.f29415a.getClass();
        String string = bundle2.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        if (C12869i0.m20546B(string)) {
            string = C13418j.m21107c();
        }
        String str2 = string;
        String string2 = bundle2.getString("com.facebook.TokenCachingStrategy.Token");
        if (string2 == null) {
            return null;
        }
        JSONObject jSONObject = C12863f0.f28358a.get(string2);
        if (jSONObject == null) {
            C12869i0.f28375h.getClass();
            GraphResponse c = C12869i0.m20577p(string2).mo39226c();
            jSONObject = c.f27247d != null ? null : c.f27244a;
        }
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("id");
            } catch (JSONException unused) {
                return null;
            }
        } else {
            str = null;
        }
        if (str2 == null || str == null) {
            return null;
        }
        AccessTokenSource accessTokenSource = bundle2.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (AccessTokenSource) bundle2.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle2.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        long j = bundle2.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", Long.MIN_VALUE);
        Date date = j == Long.MIN_VALUE ? null : new Date(j);
        long j2 = bundle2.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate", Long.MIN_VALUE);
        return new AccessToken(string2, str2, str, e, e2, e3, accessTokenSource, date, j2 == Long.MIN_VALUE ? null : new Date(j2), (Date) null, (String) null, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
    }

    public static final void createFromNativeLinkingIntent(Intent intent, String str, C12172a aVar) {
        Companion.getClass();
        C19383o.m32797g(intent, "intent");
        C19383o.m32797g(str, "applicationId");
        C19383o.m32797g(aVar, "accessTokenCallback");
        if (intent.getExtras() == null) {
            new FacebookException("No extras found on intent");
            aVar.mo39092a();
            return;
        }
        Bundle bundle = new Bundle(intent.getExtras());
        String string = bundle.getString(ACCESS_TOKEN_KEY);
        if (string != null) {
            boolean z = true;
            if (!(string.length() == 0)) {
                String string2 = bundle.getString("user_id");
                if (string2 != null) {
                    if (string2.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        C12174c.m19978a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), str);
                        aVar.onSuccess();
                        return;
                    }
                }
                C12869i0.m20578q(new C12206a(bundle, aVar, str), string);
                return;
            }
        }
        new FacebookException("No access token found on intent");
        aVar.mo39092a();
    }

    @SuppressLint({"FieldGetter"})
    public static final AccessToken createFromRefresh$facebook_core_release(AccessToken accessToken, Bundle bundle) {
        Bundle bundle2 = bundle;
        Companion.getClass();
        C19383o.m32797g(accessToken, "current");
        C19383o.m32797g(bundle2, "bundle");
        if (accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_WEB || accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_NATIVE || accessToken.getSource() == AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
            Date n = C12869i0.m20575n(bundle2, EXPIRES_IN_KEY, new Date(0));
            String string = bundle2.getString(ACCESS_TOKEN_KEY);
            if (string == null) {
                return null;
            }
            String string2 = bundle2.getString(GRAPH_DOMAIN);
            Date n2 = C12869i0.m20575n(bundle2, DATA_ACCESS_EXPIRATION_TIME, new Date(0));
            if (C12869i0.m20546B(string)) {
                return null;
            }
            return new AccessToken(string, accessToken.getApplicationId(), accessToken.getUserId(), accessToken.getPermissions(), accessToken.getDeclinedPermissions(), accessToken.getExpiredPermissions(), accessToken.getSource(), n, new Date(), n2, string2);
        }
        StringBuilder h = C0072d.m201h("Invalid token source: ");
        h.append(accessToken.getSource());
        throw new FacebookException(h.toString());
    }

    public static final void expireCurrentAccessToken() {
        Companion.getClass();
        C12174c.m19980c();
    }

    public static final AccessToken getCurrentAccessToken() {
        Companion.getClass();
        return C12174c.m19981d();
    }

    public static final List<String> getPermissionsFromBundle$facebook_core_release(Bundle bundle, String str) {
        Companion.getClass();
        return C12174c.m19982e(bundle, str);
    }

    public static final boolean isCurrentAccessTokenActive() {
        Companion.getClass();
        return C12174c.m19983f();
    }

    public static final boolean isDataAccessActive() {
        Companion.getClass();
        AccessToken accessToken = C13401c.f29349g.mo46082a().f29350a;
        return accessToken != null && !accessToken.isDataAccessExpired();
    }

    public static final boolean isLoggedInWithInstagram() {
        Companion.getClass();
        AccessToken accessToken = C13401c.f29349g.mo46082a().f29350a;
        return accessToken != null && !accessToken.isExpired() && accessToken.isInstagramToken();
    }

    public static final void refreshCurrentAccessTokenAsync() {
        Companion.getClass();
        C13401c.f29349g.mo46082a().mo46078a((C12173b) null);
    }

    public static final void setCurrentAccessToken(AccessToken accessToken) {
        Companion.getClass();
        C13401c.f29349g.mo46082a().mo46081d(accessToken, true);
    }

    private final String tokenToString() {
        return C13418j.m21114j(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (C19383o.m32792b(this.expires, accessToken.expires) && C19383o.m32792b(this.permissions, accessToken.permissions) && C19383o.m32792b(this.declinedPermissions, accessToken.declinedPermissions) && C19383o.m32792b(this.expiredPermissions, accessToken.expiredPermissions) && C19383o.m32792b(this.token, accessToken.token) && this.source == accessToken.source && C19383o.m32792b(this.lastRefresh, accessToken.lastRefresh) && C19383o.m32792b(this.applicationId, accessToken.applicationId) && C19383o.m32792b(this.userId, accessToken.userId) && C19383o.m32792b(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null ? str2 == null : C19383o.m32792b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getGraphDomain() {
        return this.graphDomain;
    }

    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }

    public final AccessTokenSource getSource() {
        return this.source;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.permissions.hashCode();
        int hashCode2 = this.declinedPermissions.hashCode();
        int e = C0023f.m105e(this.token, (this.expiredPermissions.hashCode() + ((hashCode2 + ((hashCode + ((this.expires.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode3 = (this.dataAccessExpirationTime.hashCode() + C0023f.m105e(this.userId, C0023f.m105e(this.applicationId, (this.lastRefresh.hashCode() + ((this.source.hashCode() + e) * 31)) * 31, 31), 31)) * 31;
        String str = this.graphDomain;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals(ShopRelatedLink.INSTAGRAM_TITLE);
    }

    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put(PERMISSIONS_KEY, new JSONArray(this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray(this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray(this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put(SOURCE_KEY, this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put(GRAPH_DOMAIN, str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder k = C0073e.m211k("{AccessToken", " token:");
        k.append(tokenToString());
        appendPermissions(k);
        k.append("}");
        String sb = k.toString();
        C19383o.m32796f(sb, "builder.toString()");
        return sb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    public static final void refreshCurrentAccessTokenAsync(C12173b bVar) {
        Companion.getClass();
        C13401c.f29349g.mo46082a().mo46078a(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? "facebook" : str4);
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        C19383o.m32797g(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C19383o.m32796f(unmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C19383o.m32796f(unmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C19383o.m32796f(unmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        String readString = parcel.readString();
        C12879l0.m20602f(readString, "token");
        this.token = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        C12879l0.m20602f(readString3, "applicationId");
        this.applicationId = readString3;
        String readString4 = parcel.readString();
        C12879l0.m20602f(readString4, "userId");
        this.userId = readString4;
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
