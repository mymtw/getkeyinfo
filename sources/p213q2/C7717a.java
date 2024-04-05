package p213q2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: q2.a */
public abstract class C7717a {

    /* renamed from: b */
    public final DataSetObservable f17111b = new DataSetObservable();

    /* renamed from: c */
    public DataSetObserver f17112c;

    /* renamed from: h */
    public void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: i */
    public void mo10624i() {
    }

    /* renamed from: j */
    public abstract int mo20184j();

    /* renamed from: k */
    public int mo20185k(Object obj) {
        return -1;
    }

    /* renamed from: l */
    public CharSequence mo20186l(int i) {
        return null;
    }

    /* renamed from: m */
    public float mo20187m() {
        return 1.0f;
    }

    /* renamed from: n */
    public Object mo10625n(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: o */
    public abstract boolean mo10626o(View view, Object obj);

    /* renamed from: p */
    public final void mo20188p() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f17112c;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f17111b.notifyChanged();
    }

    /* renamed from: q */
    public void mo10627q() {
    }

    /* renamed from: r */
    public void mo10628r() {
    }

    /* renamed from: s */
    public void mo10629s(ViewGroup viewGroup, int i, Object obj) {
    }

    /* renamed from: t */
    public void mo10630t(ViewGroup viewGroup) {
    }
}
