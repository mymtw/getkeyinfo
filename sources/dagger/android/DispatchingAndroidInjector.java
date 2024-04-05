package dagger.android;

import androidx.compose.foundation.layout.C0761x;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p568fn.C17782b;
import p740eq.C19011a;

public final class DispatchingAndroidInjector<T> implements C17550a<T> {

    /* renamed from: b */
    public final Map<String, C19011a<C17550a.C17551a<?>>> f38384b;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        public InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public DispatchingAndroidInjector(ImmutableMap immutableMap, ImmutableMap immutableMap2) {
        Map map = immutableMap2;
        if (!immutableMap.isEmpty()) {
            LinkedHashMap y0 = C0761x.m1755y0(immutableMap2.size() + immutableMap.size());
            y0.putAll(immutableMap2);
            for (Map.Entry entry : immutableMap.entrySet()) {
                y0.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map = Collections.unmodifiableMap(y0);
        }
        this.f38384b = map;
    }

    /* renamed from: h */
    public final void mo1133h(T t) {
        boolean z;
        String str;
        C19011a aVar = this.f38384b.get(t.getClass().getName());
        if (aVar == null) {
            z = false;
        } else {
            C17550a.C17551a aVar2 = (C17550a.C17551a) aVar.get();
            try {
                C17550a a = aVar2.mo14396a(t);
                C17782b.m29836D(a, "%s.create(I) should not return null.", aVar2.getClass());
                a.mo1133h(t);
                z = true;
            } catch (ClassCastException e) {
                throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar2.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
            }
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (this.f38384b.containsKey(cls.getCanonicalName())) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            if (arrayList.isEmpty()) {
                str = String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
            } else {
                str = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
            }
            throw new IllegalArgumentException(str);
        }
    }
}
