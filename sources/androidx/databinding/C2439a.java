package androidx.databinding;

import androidx.databinding.C2451i;

/* renamed from: androidx.databinding.a */
public class C2439a implements C2451i {
    private transient C2461n mCallbacks;

    public void addOnPropertyChangedCallback(C2451i.C2452a aVar) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new C2461n();
            }
        }
        this.mCallbacks.mo9282a(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            C2461n nVar = this.mCallbacks;
            if (nVar != null) {
                nVar.mo9284c(0, this, (Object) null);
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            C2461n nVar = this.mCallbacks;
            if (nVar != null) {
                nVar.mo9284c(i, this, (Object) null);
            }
        }
    }

    public void removeOnPropertyChangedCallback(C2451i.C2452a aVar) {
        synchronized (this) {
            C2461n nVar = this.mCallbacks;
            if (nVar != null) {
                nVar.mo9288h(aVar);
            }
        }
    }
}
