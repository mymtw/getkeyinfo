package p345eg;

import android.app.Activity;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.p332ml.ModelManager;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONObject;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: eg.e */
public final class C12702e {

    /* renamed from: a */
    public static final AtomicBoolean f27987a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final LinkedHashSet f27988b = new LinkedHashSet();

    /* renamed from: c */
    public static final LinkedHashSet f27989c = new LinkedHashSet();

    /* renamed from: d */
    public static final C12702e f27990d = new C12702e();

    /* renamed from: c */
    public static final void m20380c(Activity activity) {
        Class<C12702e> cls = C12702e.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(activity, "activity");
                try {
                    if (f27987a.get()) {
                        Map<String, String> map = C12698a.f27974a;
                        Class<C12698a> cls2 = C12698a.class;
                        boolean z = false;
                        if (!C13080a.m20762b(cls2)) {
                            try {
                                z = C12698a.f27978e;
                            } catch (Throwable th) {
                                C13080a.m20761a(cls2, th);
                            }
                        }
                        if (z && (!f27988b.isEmpty() || !f27989c.isEmpty())) {
                            ViewObserver.Companion.getClass();
                            ViewObserver.C12238a.m20087a(activity);
                            return;
                        }
                    }
                    ViewObserver.Companion.getClass();
                    ViewObserver.C12238a.m20088b(activity);
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C13080a.m20761a(cls, th2);
            }
        }
    }

    /* renamed from: a */
    public final void mo45472a() {
        String str;
        File d;
        if (!C13080a.m20762b(this)) {
            try {
                C12882n f = FetchedAppSettingsManager.m20107f(C13418j.m21107c(), false);
                if (f != null && (str = f.f28410n) != null) {
                    mo45473b(str);
                    if (((!f27988b.isEmpty()) || (!f27989c.isEmpty())) && (d = ModelManager.m20073d(ModelManager.Task.MTML_APP_EVENT_PREDICTION)) != null) {
                        C12698a.m20362d(d);
                        WeakReference<Activity> weakReference = ActivityLifecycleTracker.f27303k;
                        Activity activity = null;
                        if (weakReference != null) {
                            activity = weakReference.get();
                        }
                        if (activity != null) {
                            m20380c(activity);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: b */
    public final void mo45473b(String str) {
        if (!C13080a.m20762b(this)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("production_events")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        LinkedHashSet linkedHashSet = f27988b;
                        String string = jSONArray.getString(i);
                        C19383o.m32796f(string, "jsonArray.getString(i)");
                        linkedHashSet.add(string);
                    }
                }
                if (jSONObject.has("eligible_for_prediction_events")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        LinkedHashSet linkedHashSet2 = f27989c;
                        String string2 = jSONArray2.getString(i2);
                        C19383o.m32796f(string2, "jsonArray.getString(i)");
                        linkedHashSet2.add(string2);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
