package p453tf;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p013v4.media.session.C0087d;
import android.util.Log;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p251u1.C8115a;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13426p;

/* renamed from: tf.c */
public final class C13401c {

    /* renamed from: f */
    public static C13401c f29348f;

    /* renamed from: g */
    public static final C13402a f29349g = new C13402a();

    /* renamed from: a */
    public AccessToken f29350a;

    /* renamed from: b */
    public final AtomicBoolean f29351b = new AtomicBoolean(false);

    /* renamed from: c */
    public Date f29352c = new Date(0);

    /* renamed from: d */
    public final C8115a f29353d;

    /* renamed from: e */
    public final C13399b f29354e;

    /* renamed from: tf.c$a */
    public static final class C13402a {
        /* renamed from: a */
        public final C13401c mo46082a() {
            C13401c cVar;
            C13401c cVar2 = C13401c.f29348f;
            if (cVar2 != null) {
                return cVar2;
            }
            synchronized (this) {
                cVar = C13401c.f29348f;
                if (cVar == null) {
                    C8115a a = C8115a.m16322a(C13418j.m21106b());
                    C19383o.m32796f(a, "LocalBroadcastManager.ge…tance(applicationContext)");
                    C13401c cVar3 = new C13401c(a, new C13399b());
                    C13401c.f29348f = cVar3;
                    cVar = cVar3;
                }
            }
            return cVar;
        }
    }

    /* renamed from: tf.c$b */
    public static final class C13403b implements C13406e {
        /* renamed from: a */
        public final String mo46083a() {
            return "fb_extend_sso_token";
        }

        /* renamed from: b */
        public final String mo46084b() {
            return "oauth/access_token";
        }
    }

    /* renamed from: tf.c$c */
    public static final class C13404c implements C13406e {
        /* renamed from: a */
        public final String mo46083a() {
            return "ig_refresh_token";
        }

        /* renamed from: b */
        public final String mo46084b() {
            return "refresh_access_token";
        }
    }

    /* renamed from: tf.c$d */
    public static final class C13405d {

        /* renamed from: a */
        public String f29355a;

        /* renamed from: b */
        public int f29356b;

        /* renamed from: c */
        public int f29357c;

        /* renamed from: d */
        public Long f29358d;

        /* renamed from: e */
        public String f29359e;
    }

    /* renamed from: tf.c$e */
    public interface C13406e {
        /* renamed from: a */
        String mo46083a();

        /* renamed from: b */
        String mo46084b();
    }

    /* renamed from: tf.c$f */
    public static final class C13407f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C13401c f29360b;

        public C13407f(C13401c cVar, AccessToken.C12173b bVar) {
            this.f29360b = cVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    this.f29360b.mo46079b((AccessToken.C12173b) null);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: tf.c$g */
    public static final class C13408g implements C13426p.C13427a {

        /* renamed from: a */
        public final /* synthetic */ C13401c f29361a;

        /* renamed from: b */
        public final /* synthetic */ C13405d f29362b;

        /* renamed from: c */
        public final /* synthetic */ AccessToken f29363c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f29364d;

        /* renamed from: e */
        public final /* synthetic */ Set f29365e;

        /* renamed from: f */
        public final /* synthetic */ Set f29366f;

        /* renamed from: g */
        public final /* synthetic */ Set f29367g;

        public C13408g(C13401c cVar, C13405d dVar, AccessToken accessToken, AccessToken.C12173b bVar, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
            this.f29361a = cVar;
            this.f29362b = dVar;
            this.f29363c = accessToken;
            this.f29364d = atomicBoolean;
            this.f29365e = hashSet;
            this.f29366f = hashSet2;
            this.f29367g = hashSet3;
        }

        /* renamed from: a */
        public final void mo39759a(C13426p pVar) {
            C19383o.m32797g(pVar, "it");
            C13405d dVar = this.f29362b;
            String str = dVar.f29355a;
            int i = dVar.f29356b;
            Long l = dVar.f29358d;
            String str2 = dVar.f29359e;
            String str3 = null;
            try {
                C13402a aVar = C13401c.f29349g;
                if (aVar.mo46082a().f29350a != null) {
                    AccessToken accessToken = aVar.mo46082a().f29350a;
                    if (accessToken != null) {
                        str3 = accessToken.getUserId();
                    }
                    if (str3 == this.f29363c.getUserId()) {
                        if (this.f29364d.get() || str != null || i != 0) {
                            Date expires = this.f29363c.getExpires();
                            C13405d dVar2 = this.f29362b;
                            if (dVar2.f29356b != 0) {
                                expires = new Date(((long) this.f29362b.f29356b) * 1000);
                            } else if (dVar2.f29357c != 0) {
                                expires = new Date((((long) this.f29362b.f29357c) * 1000) + new Date().getTime());
                            }
                            Date date = expires;
                            if (str == null) {
                                str = this.f29363c.getToken();
                            }
                            String str4 = str;
                            String applicationId = this.f29363c.getApplicationId();
                            String userId = this.f29363c.getUserId();
                            Set<String> permissions = this.f29364d.get() ? this.f29365e : this.f29363c.getPermissions();
                            Set<String> declinedPermissions = this.f29364d.get() ? this.f29366f : this.f29363c.getDeclinedPermissions();
                            Set<String> expiredPermissions = this.f29364d.get() ? this.f29367g : this.f29363c.getExpiredPermissions();
                            AccessTokenSource source = this.f29363c.getSource();
                            Date date2 = new Date();
                            Date date3 = l != null ? new Date(l.longValue() * 1000) : this.f29363c.getDataAccessExpirationTime();
                            if (str2 == null) {
                                str2 = this.f29363c.getGraphDomain();
                            }
                            aVar.mo46082a().mo46081d(new AccessToken(str4, applicationId, userId, permissions, declinedPermissions, expiredPermissions, source, date, date2, date3, str2), true);
                            this.f29361a.f29351b.set(false);
                        }
                    }
                }
            } finally {
                this.f29361a.f29351b.set(false);
            }
        }
    }

    /* renamed from: tf.c$h */
    public static final class C13409h implements GraphRequest.C12195b {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f29368a;

        /* renamed from: b */
        public final /* synthetic */ Set f29369b;

        /* renamed from: c */
        public final /* synthetic */ Set f29370c;

        /* renamed from: d */
        public final /* synthetic */ Set f29371d;

        public C13409h(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
            this.f29368a = atomicBoolean;
            this.f29369b = hashSet;
            this.f29370c = hashSet2;
            this.f29371d = hashSet3;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            JSONArray optJSONArray;
            JSONObject jSONObject = graphResponse.f27244a;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                this.f29368a.set(true);
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString(ResponseConstants.STATUS);
                        if (!C12869i0.m20546B(optString) && !C12869i0.m20546B(optString2)) {
                            C19383o.m32796f(optString2, ResponseConstants.STATUS);
                            Locale locale = Locale.US;
                            String g = C0087d.m237g(locale, "Locale.US", optString2, locale, "(this as java.lang.String).toLowerCase(locale)");
                            int hashCode = g.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && g.equals("declined")) {
                                        this.f29370c.add(optString);
                                    }
                                } else if (g.equals("granted")) {
                                    this.f29369b.add(optString);
                                }
                            } else if (g.equals(Listing.EXPIRED_STATE)) {
                                this.f29371d.add(optString);
                            }
                            Log.w("AccessTokenManager", "Unexpected status: " + g);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: tf.c$i */
    public static final class C13410i implements GraphRequest.C12195b {

        /* renamed from: a */
        public final /* synthetic */ C13405d f29372a;

        public C13410i(C13405d dVar) {
            this.f29372a = dVar;
        }

        /* renamed from: a */
        public final void mo39238a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27244a;
            if (jSONObject != null) {
                this.f29372a.f29355a = jSONObject.optString(AccessToken.ACCESS_TOKEN_KEY);
                this.f29372a.f29356b = jSONObject.optInt("expires_at");
                this.f29372a.f29357c = jSONObject.optInt(AccessToken.EXPIRES_IN_KEY);
                this.f29372a.f29358d = Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME));
                this.f29372a.f29359e = jSONObject.optString(AccessToken.GRAPH_DOMAIN, (String) null);
            }
        }
    }

    public C13401c(C8115a aVar, C13399b bVar) {
        this.f29353d = aVar;
        this.f29354e = bVar;
    }

    /* renamed from: a */
    public final void mo46078a(AccessToken.C12173b bVar) {
        if (C19383o.m32792b(Looper.getMainLooper(), Looper.myLooper())) {
            mo46079b(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C13407f(this, bVar));
        }
    }

    /* renamed from: b */
    public final void mo46079b(AccessToken.C12173b bVar) {
        AccessToken accessToken = this.f29350a;
        if (accessToken == null) {
            if (bVar != null) {
                new FacebookException("No current access token to refresh");
                bVar.mo39094a();
            }
        } else if (this.f29351b.compareAndSet(false, true)) {
            this.f29352c = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C13405d dVar = new C13405d();
            GraphRequest[] graphRequestArr = new GraphRequest[2];
            C13402a aVar = f29349g;
            C13409h hVar = new C13409h(atomicBoolean, hashSet, hashSet2, hashSet3);
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest.f27224o.getClass();
            GraphRequest g = GraphRequest.C12196c.m20007g(accessToken, "me/permissions", hVar);
            g.f27228d = bundle;
            HttpMethod httpMethod = HttpMethod.GET;
            g.f27232h = httpMethod;
            graphRequestArr[0] = g;
            C13410i iVar = new C13410i(dVar);
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            C13406e cVar = (graphDomain.hashCode() == 28903346 && graphDomain.equals(ShopRelatedLink.INSTAGRAM_TITLE)) ? new C13404c() : new C13403b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", cVar.mo46083a());
            bundle2.putString("client_id", accessToken.getApplicationId());
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest g2 = GraphRequest.C12196c.m20007g(accessToken, cVar.mo46084b(), iVar);
            g2.f27228d = bundle2;
            g2.f27232h = httpMethod;
            graphRequestArr[1] = g2;
            C13426p pVar = new C13426p(graphRequestArr);
            pVar.mo46094c(new C13408g(this, dVar, accessToken, bVar, atomicBoolean, hashSet, hashSet2, hashSet3));
            pVar.mo46097e();
        } else if (bVar != null) {
            new FacebookException("Refresh already in progress");
            bVar.mo39094a();
        }
    }

    /* renamed from: c */
    public final void mo46080c(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C13418j.m21106b(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f29353d.mo20709c(intent);
    }

    /* renamed from: d */
    public final void mo46081d(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f29350a;
        this.f29350a = accessToken;
        this.f29351b.set(false);
        this.f29352c = new Date(0);
        if (z) {
            if (accessToken != null) {
                C13399b bVar = this.f29354e;
                bVar.getClass();
                try {
                    bVar.f29347a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.toJSONObject$facebook_core_release().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                this.f29354e.f29347a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                C12869i0.m20565d(C13418j.m21106b());
            }
        }
        if (!C12869i0.m20562a(accessToken2, accessToken)) {
            mo46080c(accessToken2, accessToken);
            Context b = C13418j.m21106b();
            AccessToken.Companion.getClass();
            AccessToken d = AccessToken.C12174c.m19981d();
            AlarmManager alarmManager = (AlarmManager) b.getSystemService("alarm");
            if (AccessToken.C12174c.m19983f()) {
                if ((d != null ? d.getExpires() : null) != null && alarmManager != null) {
                    Intent intent = new Intent(b, CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, d.getExpires().getTime(), PendingIntent.getBroadcast(b, 0, intent, 67108864));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
