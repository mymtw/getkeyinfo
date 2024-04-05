package com.google.firebase.remoteconfig.internal;

import androidx.appcompat.widget.C0326j;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.installations.C16563d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p607km.C18144a;
import p641on.C18325d;
import p641on.C18327e;
import p722ym.C18895a;

/* renamed from: com.google.firebase.remoteconfig.internal.a */
public final class C16688a {

    /* renamed from: j */
    public static final long f36899j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    public static final int[] f36900k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final C16563d f36901a;

    /* renamed from: b */
    public final C18895a<C18144a> f36902b;

    /* renamed from: c */
    public final Executor f36903c;

    /* renamed from: d */
    public final Clock f36904d;

    /* renamed from: e */
    public final Random f36905e;

    /* renamed from: f */
    public final C18325d f36906f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f36907g;

    /* renamed from: h */
    public final C16690b f36908h;

    /* renamed from: i */
    public final Map<String, String> f36909i;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a */
    public static class C16689a {

        /* renamed from: a */
        public final int f36910a;

        /* renamed from: b */
        public final C18327e f36911b;

        /* renamed from: c */
        public final String f36912c;

        public C16689a(int i, C18327e eVar, String str) {
            this.f36910a = i;
            this.f36911b = eVar;
            this.f36912c = str;
        }
    }

    public C16688a(C16563d dVar, C18895a aVar, ExecutorService executorService, Clock clock, Random random, C18325d dVar2, ConfigFetchHttpClient configFetchHttpClient, C16690b bVar, HashMap hashMap) {
        this.f36901a = dVar;
        this.f36902b = aVar;
        this.f36903c = executorService;
        this.f36904d = clock;
        this.f36905e = random;
        this.f36906f = dVar2;
        this.f36907g = configFetchHttpClient;
        this.f36908h = bVar;
        this.f36909i = hashMap;
    }

    /* renamed from: a */
    public final C16689a mo59443a(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        String str3;
        boolean z = false;
        try {
            C16689a fetch = this.f36907g.fetch(this.f36907g.mo59441b(), str, str2, mo59444b(), this.f36908h.f36915a.getString("last_fetch_etag", (String) null), this.f36909i, date);
            String str4 = fetch.f36912c;
            if (str4 != null) {
                C16690b bVar = this.f36908h;
                synchronized (bVar.f36916b) {
                    bVar.f36915a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f36908h.mo59446b(C16690b.f36914e, 0);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int httpStatusCode = e.getHttpStatusCode();
            if (httpStatusCode == 429 || httpStatusCode == 502 || httpStatusCode == 503 || httpStatusCode == 504) {
                int i = this.f36908h.mo59445a().f36918a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f36900k;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
                this.f36908h.mo59446b(new Date(date.getTime() + (millis / 2) + ((long) this.f36905e.nextInt((int) millis))), i);
            }
            C16690b.C16691a a = this.f36908h.mo59445a();
            int httpStatusCode2 = e.getHttpStatusCode();
            if (a.f36918a > 1 || httpStatusCode2 == 429) {
                z = true;
            }
            if (!z) {
                int httpStatusCode3 = e.getHttpStatusCode();
                if (httpStatusCode3 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (httpStatusCode3 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (httpStatusCode3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (httpStatusCode3 != 500) {
                    switch (httpStatusCode3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new FirebaseRemoteConfigServerException(e.getHttpStatusCode(), C0326j.m864i("Fetch failed: ", str3), e);
            }
            throw new FirebaseRemoteConfigFetchThrottledException(a.f36919b.getTime());
        }
    }

    /* renamed from: b */
    public final HashMap mo59444b() {
        HashMap hashMap = new HashMap();
        C18144a aVar = this.f36902b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.mo69693e().entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
