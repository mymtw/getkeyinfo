package androidx.compose.p015ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p122h0.C6906b;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 */
public final class C1783x477bcb35 implements ComponentCallbacks2 {
    public final /* synthetic */ Ref$ObjectRef<Configuration> $currentConfiguration;
    public final /* synthetic */ C6906b $imageVectorCache;

    public C1783x477bcb35(Ref$ObjectRef<Configuration> ref$ObjectRef, C6906b bVar) {
        this.$currentConfiguration = ref$ObjectRef;
        this.$imageVectorCache = bVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C19383o.m32797g(configuration, "configuration");
        Configuration configuration2 = (Configuration) this.$currentConfiguration.element;
        int updateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        Iterator<Map.Entry<C6906b.C6908b, WeakReference<C6906b.C6907a>>> it = this.$imageVectorCache.f15284a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<C6906b.C6908b, WeakReference<C6906b.C6907a>> next = it.next();
            C19383o.m32796f(next, "it.next()");
            C6906b.C6907a aVar = (C6906b.C6907a) ((WeakReference) next.getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f15286b)) {
                it.remove();
            }
        }
        this.$currentConfiguration.element = configuration;
    }

    public void onLowMemory() {
        this.$imageVectorCache.f15284a.clear();
    }

    public void onTrimMemory(int i) {
        this.$imageVectorCache.f15284a.clear();
    }
}
