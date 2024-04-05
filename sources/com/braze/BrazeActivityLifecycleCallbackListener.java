package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p114g4.C6861b;
import p753kq.C19846a;

public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    public Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;
    /* access modifiers changed from: private */
    public Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, (Set) null, (Set) null, 15, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set) {
        this((Set) set, (Set) null, 2, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z) {
        this(z, false, (Set) null, (Set) null, 14, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2) {
        this(z, z2, (Set) null, (Set) null, 12, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set) {
        this(z, z2, set, (Set) null, 8, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z;
        this.registerInAppMessageManager = z2;
        this.inAppMessagingRegistrationBlocklist = set == null ? EmptySet.INSTANCE : set;
        this.sessionHandlingBlocklist = set2 == null ? EmptySet.INSTANCE : set2;
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C19846a<String>(this) {
            public final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

            {
                this.this$0 = r1;
            }

            public final String invoke() {
                return C19383o.m32802l(this.this$0.inAppMessagingRegistrationBlocklist, "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: ");
            }
        }, 6);
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C19846a<String>(this) {
            public final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

            {
                this.this$0 = r1;
            }

            public final String invoke() {
                return C19383o.m32802l(this.this$0.sessionHandlingBlocklist, "BrazeActivityLifecycleCallbackListener using session handling blocklist: ");
            }
        }, 6);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityCreated$1(activity), 6);
            C6861b.m13319e().mo18984d(activity.getApplicationContext());
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityPaused$1(activity), 6);
            C6861b.m13319e().mo18988i(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityResumed$1(activity), 6);
            C6861b.m13319e().mo18986g(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityStarted$1(activity), 6);
            Braze.Companion companion = Braze.f11170m;
            Context applicationContext = activity.getApplicationContext();
            C19383o.m32796f(applicationContext, "activity.applicationContext");
            companion.mo15515f(applicationContext).mo15507w(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeActivityLifecycleCallbackListener$onActivityStopped$1(activity), 6);
            Braze.Companion companion = Braze.f11170m;
            Context applicationContext = activity.getApplicationContext();
            C19383o.m32796f(applicationContext, "activity.applicationContext");
            companion.mo15515f(applicationContext).mo15496k(activity);
        }
    }

    public final void setInAppMessagingRegistrationBlocklist(Set<? extends Class<?>> set) {
        C19383o.m32797g(set, "blocklist");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C5317x37830741(set), 6);
        this.inAppMessagingRegistrationBlocklist = set;
    }

    public final void setSessionHandlingBlocklist(Set<? extends Class<?>> set) {
        C19383o.m32797g(set, "blocklist");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C5318xc7714413(set), 6);
        this.sessionHandlingBlocklist = set;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z) {
        C19383o.m32797g(activity, "activity");
        Class<?> cls = activity.getClass();
        if (C19383o.m32792b(cls, NotificationTrampolineActivity.class)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C5319xcce9cc90.INSTANCE, 6);
            return false;
        }
        if (z) {
            if (this.sessionHandlingBlocklist.contains(cls)) {
                return false;
            }
        } else if (this.inAppMessagingRegistrationBlocklist.contains(cls)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) (i & 2) != 0 ? EmptySet.INSTANCE : set2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrazeActivityLifecycleCallbackListener(boolean z, boolean z2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (Set<? extends Class<?>>) (i & 4) != 0 ? EmptySet.INSTANCE : set, (Set<? extends Class<?>>) (i & 8) != 0 ? EmptySet.INSTANCE : set2);
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }
}
