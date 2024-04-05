package com.facebook.share.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.widget.LikeView;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p251u1.C8115a;
import p365hg.C12836c;
import p365hg.C12845c0;
import p365hg.C12869i0;
import p365hg.C12885n0;
import p365hg.C12889o;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13426p;
import p461uf.C13519m;

@Deprecated
/* renamed from: com.facebook.share.internal.b */
public final class C12348b {

    /* renamed from: o */
    public static C12889o f27504o;

    /* renamed from: p */
    public static final ConcurrentHashMap<String, C12348b> f27505p = new ConcurrentHashMap<>();

    /* renamed from: q */
    public static C12885n0 f27506q = new C12885n0(1);

    /* renamed from: r */
    public static C12885n0 f27507r = new C12885n0(1);

    /* renamed from: s */
    public static Handler f27508s;

    /* renamed from: t */
    public static String f27509t;

    /* renamed from: u */
    public static boolean f27510u;

    /* renamed from: v */
    public static volatile int f27511v;

    /* renamed from: a */
    public String f27512a;

    /* renamed from: b */
    public LikeView.ObjectType f27513b;

    /* renamed from: c */
    public boolean f27514c;

    /* renamed from: d */
    public String f27515d;

    /* renamed from: e */
    public String f27516e;

    /* renamed from: f */
    public String f27517f;

    /* renamed from: g */
    public String f27518g;

    /* renamed from: h */
    public String f27519h;

    /* renamed from: i */
    public String f27520i;

    /* renamed from: j */
    public boolean f27521j;

    /* renamed from: k */
    public boolean f27522k;

    /* renamed from: l */
    public boolean f27523l;

    /* renamed from: m */
    public Bundle f27524m;

    /* renamed from: n */
    public C13519m f27525n;

    /* renamed from: com.facebook.share.internal.b$a */
    public class C12349a implements C13426p.C13427a {

        /* renamed from: a */
        public final /* synthetic */ C12356g f27526a;

        /* renamed from: b */
        public final /* synthetic */ C12358i f27527b;

        /* renamed from: c */
        public final /* synthetic */ C12364o f27528c;

        public C12349a(C12356g gVar, C12358i iVar, C12364o oVar) {
            this.f27526a = gVar;
            this.f27527b = iVar;
            this.f27528c = oVar;
        }

        /* renamed from: a */
        public final void mo39759a(C13426p pVar) {
            C12348b bVar = C12348b.this;
            String str = this.f27526a.f27544e;
            bVar.f27520i = str;
            if (C12869i0.m20546B(str)) {
                C12348b bVar2 = C12348b.this;
                C12358i iVar = this.f27527b;
                bVar2.f27520i = iVar.f27550e;
                bVar2.f27521j = iVar.f27551f;
            }
            if (C12869i0.m20546B(C12348b.this.f27520i)) {
                LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                C12889o oVar = C12348b.f27504o;
                C12845c0.m20491d(loggingBehavior, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", C12348b.this.f27512a);
                C12348b bVar3 = C12348b.this;
                FacebookRequestError facebookRequestError = this.f27527b.f27534d;
                if (facebookRequestError == null) {
                    facebookRequestError = this.f27526a.f27534d;
                }
                C12348b.m20165a(bVar3, "get_verified_id", facebookRequestError);
            }
            C12364o oVar2 = this.f27528c;
            if (oVar2 != null) {
                oVar2.onComplete();
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$b */
    public static /* synthetic */ class C12350b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27530a;

        static {
            int[] iArr = new int[LikeView.ObjectType.values().length];
            f27530a = iArr;
            try {
                iArr[LikeView.ObjectType.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$c */
    public abstract class C12351c {

        /* renamed from: a */
        public GraphRequest f27531a;

        /* renamed from: b */
        public String f27532b;

        /* renamed from: c */
        public LikeView.ObjectType f27533c;

        /* renamed from: d */
        public FacebookRequestError f27534d;

        /* renamed from: com.facebook.share.internal.b$c$a */
        public class C12352a implements GraphRequest.C12195b {
            public C12352a() {
            }

            /* renamed from: a */
            public final void mo39238a(GraphResponse graphResponse) {
                C12351c cVar = C12351c.this;
                FacebookRequestError facebookRequestError = graphResponse.f27247d;
                cVar.f27534d = facebookRequestError;
                if (facebookRequestError != null) {
                    cVar.mo39760c(facebookRequestError);
                } else {
                    cVar.mo39761d(graphResponse);
                }
            }
        }

        public C12351c(String str, LikeView.ObjectType objectType) {
            this.f27532b = str;
            this.f27533c = objectType;
        }

        /* renamed from: c */
        public abstract void mo39760c(FacebookRequestError facebookRequestError);

        /* renamed from: d */
        public abstract void mo39761d(GraphResponse graphResponse);

        /* renamed from: e */
        public final void mo39762e(GraphRequest graphRequest) {
            this.f27531a = graphRequest;
            graphRequest.f27230f = C13418j.m21109e();
            graphRequest.mo39232j(new C12352a());
        }
    }

    /* renamed from: com.facebook.share.internal.b$d */
    public static class C12353d implements Runnable {

        /* renamed from: b */
        public String f27536b;

        /* renamed from: c */
        public LikeView.ObjectType f27537c;

        /* renamed from: d */
        public C12354e f27538d;

        public C12353d(String str, LikeView.ObjectType objectType, C12354e eVar) {
            this.f27536b = str;
            this.f27537c = objectType;
            this.f27538d = eVar;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    C12348b.m20166b(this.f27536b, this.f27537c, this.f27538d);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.b$e */
    public interface C12354e {
        /* renamed from: a */
        void mo39764a(C12348b bVar, FacebookException facebookException);
    }

    /* renamed from: com.facebook.share.internal.b$f */
    public class C12355f extends C12351c {

        /* renamed from: e */
        public String f27539e;

        /* renamed from: f */
        public String f27540f;

        /* renamed from: g */
        public String f27541g;

        /* renamed from: h */
        public String f27542h;

        public C12355f(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.f27539e = C12348b.this.f27515d;
            this.f27540f = C12348b.this.f27516e;
            this.f27541g = C12348b.this.f27517f;
            this.f27542h = C12348b.this.f27518g;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), str, bundle, HttpMethod.GET));
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error fetching engagement for object '%s' with type '%s' : %s", this.f27532b, this.f27533c, facebookRequestError);
            C12348b.m20165a(C12348b.this, "get_engagement", facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            int i = C12869i0.f28368a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("engagement") : null;
            if (optJSONObject != null) {
                this.f27539e = optJSONObject.optString("count_string_with_like", this.f27539e);
                this.f27540f = optJSONObject.optString("count_string_without_like", this.f27540f);
                this.f27541g = optJSONObject.optString("social_sentence_with_like", this.f27541g);
                this.f27542h = optJSONObject.optString("social_sentence_without_like", this.f27542h);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$g */
    public class C12356g extends C12351c {

        /* renamed from: e */
        public String f27544e;

        public C12356g(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, HttpMethod.GET));
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorMessage().contains("og_object")) {
                this.f27534d = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error getting the FB id for object '%s' with type '%s' : %s", this.f27532b, this.f27533c, facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject optJSONObject;
            JSONObject jSONObject = graphResponse.f27246c;
            String str = this.f27532b;
            int i = C12869i0.f28368a;
            JSONObject optJSONObject2 = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("og_object")) != null) {
                this.f27544e = optJSONObject.optString("id");
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$h */
    public class C12357h extends C12351c implements C12360k {

        /* renamed from: e */
        public boolean f27545e;

        /* renamed from: f */
        public String f27546f;

        /* renamed from: g */
        public final String f27547g;

        /* renamed from: h */
        public final LikeView.ObjectType f27548h;

        public C12357h(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.f27545e = C12348b.this.f27514c;
            this.f27547g = str;
            this.f27548h = objectType;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString(ResponseConstants.OBJECT, str);
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", bundle, HttpMethod.GET));
        }

        /* renamed from: a */
        public final boolean mo39765a() {
            return this.f27545e;
        }

        /* renamed from: b */
        public final String mo39766b() {
            return this.f27546f;
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error fetching like status for object '%s' with type '%s' : %s", this.f27547g, this.f27548h, facebookRequestError);
            C12348b.m20165a(C12348b.this, "get_og_object_like", facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            int i = C12869i0.f28368a;
            JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("data") : null;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        this.f27545e = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                        if (optJSONObject2 != null && AccessToken.isCurrentAccessTokenActive() && C12869i0.m20562a(currentAccessToken.getApplicationId(), optJSONObject2.optString("id"))) {
                            this.f27546f = optJSONObject.optString("id");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$i */
    public class C12358i extends C12351c {

        /* renamed from: e */
        public String f27550e;

        /* renamed from: f */
        public boolean f27551f;

        public C12358i(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, HttpMethod.GET));
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error getting the FB id for object '%s' with type '%s' : %s", this.f27532b, this.f27533c, facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            String str = this.f27532b;
            int i = C12869i0.f28368a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("id");
                this.f27550e = optString;
                this.f27551f = !C12869i0.m20546B(optString);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$j */
    public class C12359j extends C12351c implements C12360k {

        /* renamed from: e */
        public boolean f27552e;

        /* renamed from: f */
        public String f27553f;

        public C12359j(String str) {
            super(str, LikeView.ObjectType.PAGE);
            this.f27552e = C12348b.this.f27514c;
            this.f27553f = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), C0326j.m864i("me/likes/", str), bundle, HttpMethod.GET));
        }

        /* renamed from: a */
        public final boolean mo39765a() {
            return this.f27552e;
        }

        /* renamed from: b */
        public final String mo39766b() {
            return null;
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error fetching like status for page id '%s': %s", this.f27553f, facebookRequestError);
            C12348b.m20165a(C12348b.this, "get_page_like", facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            int i = C12869i0.f28368a;
            JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("data") : null;
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f27552e = true;
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$k */
    public interface C12360k {
        /* renamed from: a */
        boolean mo39765a();

        /* renamed from: b */
        String mo39766b();
    }

    /* renamed from: com.facebook.share.internal.b$l */
    public static class C12361l implements Runnable {

        /* renamed from: d */
        public static ArrayList<String> f27555d = new ArrayList<>();

        /* renamed from: b */
        public String f27556b;

        /* renamed from: c */
        public boolean f27557c;

        public C12361l(String str, boolean z) {
            this.f27556b = str;
            this.f27557c = z;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    String str = this.f27556b;
                    if (str != null) {
                        f27555d.remove(str);
                        f27555d.add(0, this.f27556b);
                    }
                    if (this.f27557c && f27555d.size() >= 128) {
                        while (64 < f27555d.size()) {
                            ArrayList<String> arrayList = f27555d;
                            C12348b.f27505p.remove(arrayList.remove(arrayList.size() - 1));
                        }
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.b$m */
    public class C12362m extends C12351c {

        /* renamed from: e */
        public String f27558e;

        public C12362m(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString(ResponseConstants.OBJECT, str);
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", bundle, HttpMethod.POST));
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorCode() == 3501) {
                this.f27534d = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error liking object '%s' with type '%s' : %s", this.f27532b, this.f27533c, facebookRequestError);
            C12348b.m20165a(C12348b.this, "publish_like", facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f27246c;
            int i = C12869i0.f28368a;
            String str = "";
            if (jSONObject != null) {
                str = jSONObject.optString("id", str);
                C19383o.m32796f(str, "response.optString(propertyName, \"\")");
            }
            this.f27558e = str;
        }
    }

    /* renamed from: com.facebook.share.internal.b$n */
    public class C12363n extends C12351c {

        /* renamed from: e */
        public String f27560e;

        public C12363n(String str) {
            super((String) null, (LikeView.ObjectType) null);
            this.f27560e = str;
            mo39762e(new GraphRequest(AccessToken.getCurrentAccessToken(), str, (Bundle) null, HttpMethod.DELETE));
        }

        /* renamed from: c */
        public final void mo39760c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            C12889o oVar = C12348b.f27504o;
            C12845c0.m20491d(loggingBehavior, "Error unliking object with unlike token '%s' : %s", this.f27560e, facebookRequestError);
            C12348b.m20165a(C12348b.this, "publish_unlike", facebookRequestError);
        }

        /* renamed from: d */
        public final void mo39761d(GraphResponse graphResponse) {
        }
    }

    /* renamed from: com.facebook.share.internal.b$o */
    public interface C12364o {
        void onComplete();
    }

    /* renamed from: com.facebook.share.internal.b$p */
    public static class C12365p implements Runnable {

        /* renamed from: b */
        public String f27562b;

        /* renamed from: c */
        public String f27563c;

        public C12365p(String str, String str2) {
            this.f27562b = str;
            this.f27563c = str2;
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                boolean r0 = p401mg.C13080a.m20762b(r4)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.String r0 = r4.f27562b     // Catch:{ all -> 0x0030 }
                java.lang.String r1 = r4.f27563c     // Catch:{ all -> 0x0030 }
                r2 = 0
                hg.o r3 = com.facebook.share.internal.C12348b.f27504o     // Catch:{ IOException -> 0x001c }
                java.io.BufferedOutputStream r2 = r3.mo45650c(r0, r2)     // Catch:{ IOException -> 0x001c }
                byte[] r0 = r1.getBytes()     // Catch:{ IOException -> 0x001c }
                r2.write(r0)     // Catch:{ IOException -> 0x001c }
                goto L_0x0026
            L_0x001a:
                r0 = move-exception
                goto L_0x002a
            L_0x001c:
                r0 = move-exception
                java.lang.String r1 = "b"
                java.lang.String r3 = "Unable to serialize controller to disk"
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x001a }
                if (r2 == 0) goto L_0x0029
            L_0x0026:
                p365hg.C12869i0.m20566e(r2)     // Catch:{ all -> 0x0030 }
            L_0x0029:
                return
            L_0x002a:
                if (r2 == 0) goto L_0x002f
                p365hg.C12869i0.m20566e(r2)     // Catch:{ all -> 0x0030 }
            L_0x002f:
                throw r0     // Catch:{ all -> 0x0030 }
            L_0x0030:
                r0 = move-exception
                p401mg.C13080a.m20761a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12348b.C12365p.run():void");
        }
    }

    public C12348b(String str, LikeView.ObjectType objectType) {
        this.f27512a = str;
        this.f27513b = objectType;
    }

    /* renamed from: a */
    public static void m20165a(C12348b bVar, String str, FacebookRequestError facebookRequestError) {
        JSONObject requestResult;
        bVar.getClass();
        Bundle bundle = new Bundle();
        if (!(facebookRequestError == null || (requestResult = facebookRequestError.getRequestResult()) == null)) {
            bundle.putString("error", requestResult.toString());
        }
        bVar.mo39755j(bundle, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        p365hg.C12869i0.m20566e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r2 = new com.facebook.share.internal.C12348b(r5, r6);
        m20171m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r5 = m20169h(r5);
        r6 = f27506q;
        r1 = new com.facebook.share.internal.C12348b.C12361l(r5, true);
        r6.getClass();
        p365hg.C12885n0.m20604a(r6, r1);
        f27505p.put(r5, r2);
        f27508s.post(new com.facebook.share.internal.C12367d(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r7 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        f27508s.post(new com.facebook.share.internal.C12369f(r7, r2, (com.facebook.FacebookException) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20166b(java.lang.String r5, com.facebook.share.widget.LikeView.ObjectType r6, com.facebook.share.internal.C12348b.C12354e r7) {
        /*
            java.lang.String r0 = m20169h(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.share.internal.b> r1 = f27505p
            java.lang.Object r1 = r1.get(r0)
            com.facebook.share.internal.b r1 = (com.facebook.share.internal.C12348b) r1
            if (r1 == 0) goto L_0x001c
            hg.n0 r2 = f27506q
            com.facebook.share.internal.b$l r3 = new com.facebook.share.internal.b$l
            r4 = 0
            r3.<init>(r0, r4)
            r2.getClass()
            p365hg.C12885n0.m20604a(r2, r3)
        L_0x001c:
            if (r1 == 0) goto L_0x0023
            m20172o(r1, r6, r7)
            goto L_0x008f
        L_0x0023:
            r0 = 0
            java.lang.String r1 = m20169h(r5)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            hg.o r2 = f27504o     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            java.io.BufferedInputStream r1 = r2.mo45649b(r1, r0)     // Catch:{ IOException -> 0x0047, all -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            java.lang.String r2 = p365hg.C12869i0.m20557M(r1)     // Catch:{ IOException -> 0x003f }
            boolean r3 = p365hg.C12869i0.m20546B(r2)     // Catch:{ IOException -> 0x003f }
            if (r3 != 0) goto L_0x0041
            com.facebook.share.internal.b r2 = m20168e(r2)     // Catch:{ IOException -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r2 = move-exception
            goto L_0x004a
        L_0x0041:
            r2 = r0
        L_0x0042:
            if (r1 == 0) goto L_0x0057
            goto L_0x0054
        L_0x0045:
            r5 = move-exception
            goto L_0x0092
        L_0x0047:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x004a:
            java.lang.String r3 = "b"
            java.lang.String r4 = "Unable to deserialize controller from disk"
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0090 }
            r2 = r0
            if (r1 == 0) goto L_0x0057
        L_0x0054:
            p365hg.C12869i0.m20566e(r1)
        L_0x0057:
            if (r2 != 0) goto L_0x0061
            com.facebook.share.internal.b r2 = new com.facebook.share.internal.b
            r2.<init>(r5, r6)
            m20171m(r2)
        L_0x0061:
            java.lang.String r5 = m20169h(r5)
            hg.n0 r6 = f27506q
            com.facebook.share.internal.b$l r1 = new com.facebook.share.internal.b$l
            r3 = 1
            r1.<init>(r5, r3)
            r6.getClass()
            p365hg.C12885n0.m20604a(r6, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.share.internal.b> r6 = f27505p
            r6.put(r5, r2)
            android.os.Handler r5 = f27508s
            com.facebook.share.internal.d r6 = new com.facebook.share.internal.d
            r6.<init>(r2)
            r5.post(r6)
            if (r7 != 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            android.os.Handler r5 = f27508s
            com.facebook.share.internal.f r6 = new com.facebook.share.internal.f
            r6.<init>(r7, r2, r0)
            r5.post(r6)
        L_0x008f:
            return
        L_0x0090:
            r5 = move-exception
            r0 = r1
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            p365hg.C12869i0.m20566e(r0)
        L_0x0097:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12348b.m20166b(java.lang.String, com.facebook.share.widget.LikeView$ObjectType, com.facebook.share.internal.b$e):void");
    }

    /* renamed from: c */
    public static void m20167c(C12348b bVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (bVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", bVar.f27512a);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C8115a.m16322a(C13418j.m21106b()).mo20709c(intent);
    }

    /* renamed from: e */
    public static C12348b m20168e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            C12348b bVar = new C12348b(jSONObject.getString(ResponseConstants.OBJECT_ID), LikeView.ObjectType.fromInt(jSONObject.optInt(ResponseConstants.OBJECT_TYPE, LikeView.ObjectType.UNKNOWN.getValue())));
            bVar.f27515d = jSONObject.optString("like_count_string_with_like", (String) null);
            bVar.f27516e = jSONObject.optString("like_count_string_without_like", (String) null);
            bVar.f27517f = jSONObject.optString("social_sentence_with_like", (String) null);
            bVar.f27518g = jSONObject.optString("social_sentence_without_like", (String) null);
            bVar.f27514c = jSONObject.optBoolean("is_object_liked");
            bVar.f27519h = jSONObject.optString("unlike_token", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                bVar.f27524m = C12836c.m20473a(optJSONObject);
            }
            return bVar;
        } catch (JSONException e) {
            Log.e("b", "Unable to deserialize controller from JSON", e);
            return null;
        }
    }

    /* renamed from: h */
    public static String m20169h(String str) {
        String token = AccessToken.isCurrentAccessTokenActive() ? AccessToken.getCurrentAccessToken().getToken() : null;
        if (token != null) {
            token = C12869i0.m20553I(token);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, C12869i0.m20567f(token, ""), Integer.valueOf(f27511v)});
    }

    @Deprecated
    /* renamed from: i */
    public static void m20170i(String str, LikeView.ObjectType objectType, C12354e eVar) {
        if (!f27510u) {
            synchronized (C12348b.class) {
                if (!f27510u) {
                    f27508s = new Handler(Looper.getMainLooper());
                    f27511v = C13418j.m21106b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                    f27504o = new C12889o("b", new C12889o.C12895d());
                    new C12370g();
                    CallbackManagerImpl.m20094a(CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), new C12368e());
                    f27510u = true;
                }
            }
        }
        String h = m20169h(str);
        C12348b bVar = f27505p.get(h);
        if (bVar != null) {
            C12885n0 n0Var = f27506q;
            C12361l lVar = new C12361l(h, false);
            n0Var.getClass();
            C12885n0.m20604a(n0Var, lVar);
        }
        if (bVar != null) {
            m20172o(bVar, objectType, eVar);
            return;
        }
        C12885n0 n0Var2 = f27507r;
        C12353d dVar = new C12353d(str, objectType, eVar);
        n0Var2.getClass();
        C12885n0.m20604a(n0Var2, dVar);
    }

    /* renamed from: m */
    public static void m20171m(C12348b bVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put(ResponseConstants.OBJECT_ID, bVar.f27512a);
            jSONObject.put(ResponseConstants.OBJECT_TYPE, bVar.f27513b.getValue());
            jSONObject.put("like_count_string_with_like", bVar.f27515d);
            jSONObject.put("like_count_string_without_like", bVar.f27516e);
            jSONObject.put("social_sentence_with_like", bVar.f27517f);
            jSONObject.put("social_sentence_without_like", bVar.f27518g);
            jSONObject.put("is_object_liked", bVar.f27514c);
            jSONObject.put("unlike_token", bVar.f27519h);
            Bundle bundle = bVar.f27524m;
            if (bundle != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", C12836c.m20474b(bundle));
            }
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e("b", "Unable to serialize controller to JSON", e);
            str = null;
        }
        String h = m20169h(bVar.f27512a);
        if (!C12869i0.m20546B(str) && !C12869i0.m20546B(h)) {
            C12885n0 n0Var = f27507r;
            C12365p pVar = new C12365p(h, str);
            n0Var.getClass();
            C12885n0.m20604a(n0Var, pVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 == r1) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20172o(com.facebook.share.internal.C12348b r5, com.facebook.share.widget.LikeView.ObjectType r6, com.facebook.share.internal.C12348b.C12354e r7) {
        /*
            com.facebook.share.widget.LikeView$ObjectType r0 = r5.f27513b
            java.lang.Class<com.facebook.share.internal.m> r1 = com.facebook.share.internal.C12378m.class
            boolean r2 = p401mg.C13080a.m20762b(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            if (r6 != r0) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            com.facebook.share.widget.LikeView$ObjectType r1 = com.facebook.share.widget.LikeView.ObjectType.UNKNOWN     // Catch:{ all -> 0x0018 }
            if (r6 != r1) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            if (r0 != r1) goto L_0x001c
        L_0x0016:
            r0 = r6
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 != 0) goto L_0x0041
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r4 = r5.f27512a
            r1[r2] = r4
            r2 = 1
            com.facebook.share.widget.LikeView$ObjectType r5 = r5.f27513b
            java.lang.String r5 = r5.toString()
            r1[r2] = r5
            r5 = 2
            java.lang.String r6 = r6.toString()
            r1[r5] = r6
            java.lang.String r5 = "Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\""
            r0.<init>((java.lang.String) r5, (java.lang.Object[]) r1)
            r5 = r3
            r3 = r0
            goto L_0x0043
        L_0x0041:
            r5.f27513b = r0
        L_0x0043:
            if (r7 != 0) goto L_0x0046
            goto L_0x0050
        L_0x0046:
            android.os.Handler r6 = f27508s
            com.facebook.share.internal.f r0 = new com.facebook.share.internal.f
            r0.<init>(r7, r5, r3)
            r6.post(r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C12348b.m20172o(com.facebook.share.internal.b, com.facebook.share.widget.LikeView$ObjectType, com.facebook.share.internal.b$e):void");
    }

    /* renamed from: d */
    public final boolean mo39752d() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        return !this.f27521j && this.f27520i != null && AccessToken.isCurrentAccessTokenActive() && currentAccessToken.getPermissions() != null && currentAccessToken.getPermissions().contains("publish_actions");
    }

    /* renamed from: f */
    public final void mo39753f(C12364o oVar) {
        if (!C12869i0.m20546B(this.f27520i)) {
            oVar.onComplete();
            return;
        }
        C12356g gVar = new C12356g(this.f27512a, this.f27513b);
        C12358i iVar = new C12358i(this.f27512a, this.f27513b);
        C13426p pVar = new C13426p();
        pVar.add(gVar.f27531a);
        pVar.add(iVar.f27531a);
        pVar.mo46094c(new C12349a(gVar, iVar, oVar));
        pVar.mo46097e();
    }

    /* renamed from: g */
    public final C13519m mo39754g() {
        if (this.f27525n == null) {
            this.f27525n = new C13519m(C13418j.m21106b());
        }
        return this.f27525n;
    }

    /* renamed from: j */
    public final void mo39755j(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(ResponseConstants.OBJECT_ID, this.f27512a);
        bundle2.putString(ResponseConstants.OBJECT_TYPE, this.f27513b.toString());
        bundle2.putString("current_action", str);
        mo39754g().mo46175b("fb_like_control_error", bundle2);
    }

    /* renamed from: k */
    public final void mo39756k(boolean z) {
        mo39758n(z, this.f27515d, this.f27516e, this.f27517f, this.f27518g, this.f27519h);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m20167c(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: l */
    public final boolean mo39757l(Bundle bundle, boolean z) {
        if (mo39752d()) {
            if (z) {
                this.f27523l = true;
                mo39753f(new C12371h(this, bundle));
                return true;
            } else if (!C12869i0.m20546B(this.f27519h)) {
                this.f27523l = true;
                C13426p pVar = new C13426p();
                C12363n nVar = new C12363n(this.f27519h);
                pVar.add(nVar.f27531a);
                pVar.mo46094c(new C12373i(this, nVar, bundle));
                pVar.mo46097e();
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo39758n(boolean z, String str, String str2, String str3, String str4, String str5) {
        String f = C12869i0.m20567f(str, (String) null);
        String f2 = C12869i0.m20567f(str2, (String) null);
        String f3 = C12869i0.m20567f(str3, (String) null);
        String f4 = C12869i0.m20567f(str4, (String) null);
        String f5 = C12869i0.m20567f(str5, (String) null);
        if (z != this.f27514c || !C12869i0.m20562a(f, this.f27515d) || !C12869i0.m20562a(f2, this.f27516e) || !C12869i0.m20562a(f3, this.f27517f) || !C12869i0.m20562a(f4, this.f27518g) || !C12869i0.m20562a(f5, this.f27519h)) {
            this.f27514c = z;
            this.f27515d = f;
            this.f27516e = f2;
            this.f27517f = f3;
            this.f27518g = f4;
            this.f27519h = f5;
            m20171m(this);
            m20167c(this, "com.facebook.sdk.LikeActionController.UPDATED", (Bundle) null);
        }
    }
}
