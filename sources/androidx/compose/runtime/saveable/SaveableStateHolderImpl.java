package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19861p;

public final class SaveableStateHolderImpl implements C1367c {

    /* renamed from: d */
    public static final C1374h f2960d = SaverKt.m2861a(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final Map<Object, Map<String, List<Object>>> f2961a;

    /* renamed from: b */
    public final LinkedHashMap f2962b;

    /* renamed from: c */
    public C1369e f2963c;

    public final class RegistryHolder {

        /* renamed from: a */
        public final Object f2964a;

        /* renamed from: b */
        public boolean f2965b = true;

        /* renamed from: c */
        public final C1371f f2966c;

        public RegistryHolder(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            C19383o.m32797g(obj, "key");
            this.f2964a = obj;
            SaveableStateHolderImpl$RegistryHolder$registry$1 saveableStateHolderImpl$RegistryHolder$registry$1 = new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl);
            C1345l1 l1Var = SaveableStateRegistryKt.f2970a;
            this.f2966c = new C1371f(saveableStateHolderImpl.f2961a.get(obj), saveableStateHolderImpl$RegistryHolder$registry$1);
        }

        /* renamed from: a */
        public final void mo5917a(Map<Object, Map<String, List<Object>>> map) {
            C19383o.m32797g(map, "map");
            if (this.f2965b) {
                Map<String, List<Object>> c = this.f2966c.mo5925c();
                if (c.isEmpty()) {
                    map.remove(this.f2964a);
                } else {
                    map.put(this.f2964a, c);
                }
            }
        }
    }

    public SaveableStateHolderImpl() {
        this(0);
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        C19383o.m32797g(map, "savedStates");
        this.f2961a = map;
        this.f2962b = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void mo5916a(Object obj, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        C19383o.m32797g(obj, "key");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1198538093);
        h.mo5465u(444418301);
        h.mo5473y(obj);
        h.mo5465u(-642722479);
        h.mo5465u(-492369756);
        Object c0 = h.mo5431c0();
        if (c0 == C1302d.C1303a.f2828a) {
            C1369e eVar = this.f2963c;
            if (eVar != null ? eVar.mo5923a(obj) : true) {
                c0 = new RegistryHolder(this, obj);
                h.mo5407H0(c0);
            } else {
                throw new IllegalArgumentException(C13983i.m21494m("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        h.mo5418R(false);
        RegistryHolder registryHolder = (RegistryHolder) c0;
        CompositionLocalKt.m2530a(new C1412t0[]{SaveableStateRegistryKt.f2970a.mo5908b(registryHolder.f2966c)}, pVar, h, (i & 112) | 8);
        C1415u.m3028b(C19394m.f43287a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), h);
        h.mo5418R(false);
        h.mo5463t();
        h.mo5418R(false);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, pVar, i);
        }
    }

    public /* synthetic */ SaveableStateHolderImpl(int i) {
        this((Map<Object, Map<String, List<Object>>>) new LinkedHashMap());
    }
}
