package androidx.core.util;

import android.util.LruCache;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    public final /* synthetic */ C19857l<Object, Object> $create;
    public final /* synthetic */ int $maxSize;
    public final /* synthetic */ C19863r<Boolean, Object, Object, Object, C19394m> $onEntryRemoved;
    public final /* synthetic */ C19861p<Object, Object, Integer> $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(C19861p<Object, Object, Integer> pVar, C19857l<Object, Object> lVar, C19863r<? super Boolean, Object, Object, Object, C19394m> rVar, int i) {
        super(i);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
        this.$maxSize = i;
    }

    public Object create(Object obj) {
        C19383o.m32797g(obj, "key");
        return this.$create.invoke(obj);
    }

    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C19383o.m32797g(obj, "key");
        C19383o.m32797g(obj2, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), obj, obj2, obj3);
    }

    public int sizeOf(Object obj, Object obj2) {
        C19383o.m32797g(obj, "key");
        C19383o.m32797g(obj2, "value");
        return this.$sizeOf.invoke(obj, obj2).intValue();
    }
}
