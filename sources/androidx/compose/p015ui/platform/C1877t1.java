package androidx.compose.p015ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.C1324g;
import com.etsy.android.R;
import java.util.LinkedHashMap;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19665q1;
import kotlinx.coroutines.flow.C19670s0;
import kotlinx.coroutines.flow.C19689x1;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.internal.C19721f;
import kotlinx.coroutines.internal.C19729m;
import p001a0.C0005b;
import p002a1.C0009c;
import p568fn.C17782b;
import p768rq.C20153b;

/* renamed from: androidx.compose.ui.platform.t1 */
public final class C1877t1 {

    /* renamed from: a */
    public static final LinkedHashMap f4159a = new LinkedHashMap();

    /* renamed from: a */
    public static final C19689x1 m4117a(Context context) {
        C19689x1 x1Var;
        LinkedHashMap linkedHashMap = f4159a;
        synchronized (linkedHashMap) {
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                AbstractChannel l = C17782b.m29872l(-1, (BufferOverflow) null, 6);
                C19665q1 q1Var = new C19665q1(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C1807x23580bd9(l, C0009c.m83a(Looper.getMainLooper())), l, context, (C19340c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>) null));
                C19838x1 j = C0005b.m44j();
                C20153b bVar = C19760n0.f43719a;
                obj = C19670s0.m33430a(q1Var, new C19721f(j.plus(C19729m.f43681a)), new StartedWhileSubscribed(0, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            x1Var = (C19689x1) obj;
        }
        return x1Var;
    }

    /* renamed from: b */
    public static final C1324g m4118b(View view) {
        C19383o.m32797g(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof C1324g) {
            return (C1324g) tag;
        }
        return null;
    }
}
