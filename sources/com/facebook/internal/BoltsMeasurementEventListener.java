package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.apache.commons.cli.HelpFormatter;
import p251u1.C8115a;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;

public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
    public static final C12246a Companion = new C12246a();
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private static BoltsMeasurementEventListener singleton;
    private final Context applicationContext;

    /* renamed from: com.facebook.internal.BoltsMeasurementEventListener$a */
    public static final class C12246a {
        /* renamed from: a */
        public static BoltsMeasurementEventListener m20093a(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            if (BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, (DefaultConstructorMarker) null);
            BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.access$getSingleton$cp();
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext2 = context.getApplicationContext();
        C19383o.m32796f(applicationContext2, "context.applicationContext");
        this.applicationContext = applicationContext2;
    }

    public static final /* synthetic */ String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (C13080a.m20762b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (Throwable th) {
            C13080a.m20761a(BoltsMeasurementEventListener.class, th);
            return null;
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener access$getSingleton$cp() {
        if (C13080a.m20762b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (Throwable th) {
            C13080a.m20761a(BoltsMeasurementEventListener.class, th);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (!C13080a.m20762b(BoltsMeasurementEventListener.class)) {
            try {
                boltsMeasurementEventListener.open();
            } catch (Throwable th) {
                C13080a.m20761a(BoltsMeasurementEventListener.class, th);
            }
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (!C13080a.m20762b(BoltsMeasurementEventListener.class)) {
            try {
                singleton = boltsMeasurementEventListener;
            } catch (Throwable th) {
                C13080a.m20761a(BoltsMeasurementEventListener.class, th);
            }
        }
    }

    private final void close() {
        if (!C13080a.m20762b(this)) {
            try {
                C8115a a = C8115a.m16322a(this.applicationContext);
                C19383o.m32796f(a, "LocalBroadcastManager.ge…tance(applicationContext)");
                a.mo20710d(this);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public static final BoltsMeasurementEventListener getInstance(Context context) {
        if (C13080a.m20762b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            Companion.getClass();
            return C12246a.m20093a(context);
        } catch (Throwable th) {
            C13080a.m20761a(BoltsMeasurementEventListener.class, th);
            return null;
        }
    }

    private final void open() {
        if (!C13080a.m20762b(this)) {
            try {
                C8115a a = C8115a.m16322a(this.applicationContext);
                C19383o.m32796f(a, "LocalBroadcastManager.ge…tance(applicationContext)");
                a.mo20708b(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public final void finalize() throws Throwable {
        if (!C13080a.m20762b(this)) {
            try {
                close();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!C13080a.m20762b(this)) {
            try {
                Set<String> set = null;
                C13511h hVar = new C13511h(context, (String) null);
                StringBuilder sb = new StringBuilder();
                sb.append(BOLTS_MEASUREMENT_EVENT_PREFIX);
                sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                String sb2 = sb.toString();
                Bundle bundleExtra = intent != null ? intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY) : null;
                Bundle bundle = new Bundle();
                if (bundleExtra != null) {
                    set = bundleExtra.keySet();
                }
                if (set != null) {
                    for (String next : set) {
                        C19383o.m32796f(next, "key");
                        bundle.putString(new Regex("[ -]*$").replace((CharSequence) new Regex("^[ -]*").replace((CharSequence) new Regex("[^0-9a-zA-Z _-]").replace((CharSequence) next, HelpFormatter.DEFAULT_OPT_PREFIX), ""), ""), (String) bundleExtra.get(next));
                    }
                }
                String str = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    hVar.mo46168d(bundle, sb2);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
