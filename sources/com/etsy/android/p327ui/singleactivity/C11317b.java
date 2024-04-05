package com.etsy.android.p327ui.singleactivity;

import androidx.appcompat.widget.C0326j;
import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.C17523b;
import com.zhuinden.simplestack.C17527e;
import com.zhuinden.simplestack.C17532i;
import com.zhuinden.simplestack.C17546p;
import com.zhuinden.statebundle.StateBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

/* renamed from: com.etsy.android.ui.singleactivity.b */
public final class C11317b implements C17523b {

    /* renamed from: a */
    public final LinkedHashMap<String, C17518a> f24974a = new LinkedHashMap<>();

    /* renamed from: b */
    public String f24975b;

    /* renamed from: c */
    public C17546p f24976c;

    /* renamed from: a */
    public final StateBundle mo37055a() {
        StateBundle stateBundle = new StateBundle();
        stateBundle.putString("multistack_selectedStack", this.f24975b);
        for (Map.Entry next : this.f24974a.entrySet()) {
            C19383o.m32796f(next, "backstacks.entries");
            stateBundle.putBundle(C0326j.m864i("multistack_identifier_", (String) next.getKey()), ((C17518a) next.getValue()).mo37055a());
        }
        return stateBundle;
    }

    /* renamed from: b */
    public final void mo37056b(StateBundle stateBundle) {
        if (stateBundle != null) {
            this.f24975b = stateBundle.getString("multistack_selectedStack");
            for (Map.Entry next : this.f24974a.entrySet()) {
                C19383o.m32796f(next, "backstacks.entries");
                ((C17518a) next.getValue()).mo37056b(stateBundle.getBundle("multistack_identifier_" + ((String) next.getKey())));
            }
        }
    }

    /* renamed from: c */
    public final void mo37057c(MultistackFragmentKey multistackFragmentKey) {
        String stackIdentifier = multistackFragmentKey.stackIdentifier();
        C19383o.m32797g(stackIdentifier, "identifier");
        if (!this.f24974a.containsKey(stackIdentifier)) {
            if (this.f24975b == null) {
                this.f24975b = stackIdentifier;
            }
            C17518a aVar = new C17518a();
            C17532i iVar = new C17532i(C17527e.m29387e(multistackFragmentKey));
            aVar.f38326h = iVar;
            C17518a.C17520b bVar = aVar.f38322d;
            if (bVar != null) {
                iVar.mo68747a();
                iVar.f38349h.add(bVar);
                this.f24974a.put(stackIdentifier, aVar);
                return;
            }
            throw new IllegalArgumentException("Null completion listener cannot be added!");
        }
        throw new IllegalArgumentException(C0048b.m163a("The identifier [", stackIdentifier, "] is already registered to the multistack"));
    }

    /* renamed from: d */
    public final C17518a mo37058d() {
        C17518a aVar = this.f24974a.get(this.f24975b);
        C19383o.m32794d(aVar);
        return aVar;
    }

    /* renamed from: e */
    public final void mo37059e(C17546p pVar) {
        this.f24976c = pVar;
        for (Map.Entry next : this.f24974a.entrySet()) {
            C17518a aVar = (C17518a) next.getValue();
            if (!C19383o.m32792b((String) next.getKey(), this.f24975b)) {
                aVar.mo68700e();
            } else {
                aVar.mo68705j(pVar);
            }
        }
    }

    public final void finalize() {
        for (Map.Entry<String, C17518a> value : this.f24974a.entrySet()) {
            ((C17518a) value.getValue()).mo68702g();
        }
    }
}
