package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.ae */
public final class C4978ae {
    public static long AFInAppEventType = 500;
    public static C4984c valueOf;

    /* renamed from: com.appsflyer.internal.ae$c */
    public interface C4984c {
        void AFInAppEventType(Context context);

        void valueOf(Activity activity);
    }

    public static void AFKeystoreWrapper(Context context, final C4984c cVar, final Executor executor) {
        valueOf = cVar;
        C49794 r0 = new Application.ActivityLifecycleCallbacks() {
            public boolean valueOf = true;
            public boolean values;

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C5095j.AFInAppEventParameterName();
                        Intent intent = activity.getIntent();
                        if (C5095j.AFInAppEventType(intent) != null && intent != C5095j.AFInAppEventParameterName) {
                            C5095j.AFInAppEventParameterName = intent;
                        }
                    }
                });
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C49794.this.valueOf = true;
                        final Context applicationContext = activity.getApplicationContext();
                        try {
                            new Timer().schedule(new TimerTask() {
                                public final void run() {
                                    C49794 r0 = C49794.this;
                                    if (r0.values && r0.valueOf) {
                                        r0.values = false;
                                        try {
                                            cVar.AFInAppEventType(applicationContext);
                                        } catch (Exception e) {
                                            AFLogger.AFKeystoreWrapper("Listener threw exception! ", (Throwable) e);
                                        }
                                    }
                                }
                            }, C4978ae.AFInAppEventType);
                        } catch (Throwable th) {
                            AFLogger.AFKeystoreWrapper("Background task failed with a throwable: ", th);
                        }
                    }
                });
            }

            public final void onActivityResumed(final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C49794 r0 = C49794.this;
                        if (!r0.values) {
                            try {
                                cVar.valueOf(activity);
                            } catch (Exception e) {
                                AFLogger.AFInAppEventType("Listener thrown an exception: ", e);
                            }
                        }
                        C49794 r02 = C49794.this;
                        r02.valueOf = false;
                        r02.values = true;
                    }
                });
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }
        };
        if (context instanceof Activity) {
            r0.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r0);
    }
}
