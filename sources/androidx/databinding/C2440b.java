package androidx.databinding;

import androidx.databinding.C2451i;

/* renamed from: androidx.databinding.b */
public abstract class C2440b extends C2439a {

    /* renamed from: androidx.databinding.b$a */
    public class C2441a extends C2451i.C2452a {
        public C2441a() {
        }

        /* renamed from: e */
        public final void mo9270e(int i, C2451i iVar) {
            C2440b.this.notifyChange();
        }
    }

    public C2440b() {
    }

    public C2440b(C2451i... iVarArr) {
        if (iVarArr != null && iVarArr.length != 0) {
            C2441a aVar = new C2441a();
            for (C2451i addOnPropertyChangedCallback : iVarArr) {
                addOnPropertyChangedCallback.addOnPropertyChangedCallback(aVar);
            }
        }
    }
}
