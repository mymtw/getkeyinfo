package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import java.util.Random;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class IntentUtils {

    /* renamed from: a */
    public static final IntentUtils f11948a = new IntentUtils();

    /* renamed from: b */
    public static final C19285c f11949b = C19350d.m32676a(LazyThreadSafetyMode.NONE, C5577b.f11952b);

    /* renamed from: com.braze.support.IntentUtils$a */
    public static final class C5576a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ ComponentName f11950b;

        /* renamed from: c */
        public final /* synthetic */ Intent f11951c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5576a(ComponentName componentName, Intent intent) {
            super(0);
            this.f11950b = componentName;
            this.f11951c = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Sent intent with component ");
            h.append(this.f11950b);
            h.append(" and explicit intent ");
            h.append(this.f11951c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.IntentUtils$b */
    public static final class C5577b extends Lambda implements C19846a<Random> {

        /* renamed from: b */
        public static final C5577b f11952b = new C5577b();

        public C5577b() {
            super(0);
        }

        /* renamed from: a */
        public final Random invoke() {
            return new Random();
        }
    }

    /* renamed from: a */
    public static final void m11306a(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        List<ResolveInfo> queryBroadcastReceivers = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0)) : context.getPackageManager().queryBroadcastReceivers(intent, 0);
        C19383o.m32796f(queryBroadcastReceivers, "if (Build.VERSION.SDK_IN…vers(intent, 0)\n        }");
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11948a, BrazeLogger.Priority.V, (Throwable) null, new C5576a(componentName, intent2), 6);
        }
    }

    /* renamed from: b */
    public static final int m11307b() {
        return ((Random) f11949b.getValue()).nextInt(1073741823) + 100000;
    }
}
