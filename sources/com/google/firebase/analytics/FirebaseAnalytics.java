package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14622e1;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.android.gms.internal.measurement.C14764p0;
import com.google.android.gms.measurement.internal.C15016k5;
import com.google.firebase.installations.C16560c;
import com.google.firebase.installations.C16563d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p575gm.C17793c;
import p598jm.C18037a;
import p605kk.C18126j;

public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f36719b;

    /* renamed from: a */
    public final C14726m1 f36720a;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(C14726m1 m1Var) {
        Preconditions.checkNotNull(m1Var);
        this.f36720a = m1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f36719b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f36719b == null) {
                    f36719b = new FirebaseAnalytics(C14726m1.m23709d(context, (Bundle) null));
                }
            }
        }
        return f36719b;
    }

    @Keep
    public static C15016k5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C14726m1 d = C14726m1.m23709d(context, bundle);
        if (d == null) {
            return null;
        }
        return new C18037a(d);
    }

    /* renamed from: a */
    public final void mo58990a(String str, String str2) {
        C14726m1 m1Var = this.f36720a;
        m1Var.getClass();
        m1Var.mo50666b(new C14622e1(m1Var, (String) null, str, str2, false));
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C16560c.f36744m;
            C17793c b = C17793c.m29919b();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            b.mo69021a();
            return (String) C18126j.m30614b(((C16560c) b.f38675d.get(C16563d.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C14726m1 m1Var = this.f36720a;
        m1Var.getClass();
        m1Var.mo50666b(new C14764p0(m1Var, activity, str, str2));
    }
}
