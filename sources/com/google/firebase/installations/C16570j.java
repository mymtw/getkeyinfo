package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.C16573b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.reflect.C19421p;

/* renamed from: com.google.firebase.installations.j */
public final class C16570j {

    /* renamed from: b */
    public static final long f36766b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f36767c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C16570j f36768d;

    /* renamed from: a */
    public final C19421p f36769a;

    public C16570j(C19421p pVar) {
        this.f36769a = pVar;
    }

    /* renamed from: a */
    public final boolean mo59081a(C16573b bVar) {
        if (TextUtils.isEmpty(bVar.getAuthToken())) {
            return true;
        }
        long tokenCreationEpochInSecs = bVar.getTokenCreationEpochInSecs();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f36769a.getClass();
        return bVar.getExpiresInSecs() + tokenCreationEpochInSecs < timeUnit.toSeconds(System.currentTimeMillis()) + f36766b;
    }
}
