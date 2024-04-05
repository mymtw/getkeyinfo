package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import p075d.C6614a;

/* renamed from: androidx.preference.c */
public final class C3040c extends RecyclerView.Adapter<C3051h> implements Preference.C3008b, PreferenceGroup.C3031b {

    /* renamed from: b */
    public PreferenceGroup f6918b;

    /* renamed from: c */
    public ArrayList f6919c;

    /* renamed from: d */
    public ArrayList f6920d;

    /* renamed from: e */
    public ArrayList f6921e;

    /* renamed from: f */
    public Handler f6922f;

    /* renamed from: g */
    public C3041a f6923g = new C3041a();

    /* renamed from: androidx.preference.c$a */
    public class C3041a implements Runnable {
        public C3041a() {
        }

        public final void run() {
            C3040c.this.mo11194n();
        }
    }

    /* renamed from: androidx.preference.c$b */
    public static class C3042b {

        /* renamed from: a */
        public int f6925a;

        /* renamed from: b */
        public int f6926b;

        /* renamed from: c */
        public String f6927c;

        public C3042b(Preference preference) {
            this.f6927c = preference.getClass().getName();
            this.f6925a = preference.f6812G;
            this.f6926b = preference.f6813H;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C3042b)) {
                return false;
            }
            C3042b bVar = (C3042b) obj;
            return this.f6925a == bVar.f6925a && this.f6926b == bVar.f6926b && TextUtils.equals(this.f6927c, bVar.f6927c);
        }

        public final int hashCode() {
            return this.f6927c.hashCode() + ((((527 + this.f6925a) * 31) + this.f6926b) * 31);
        }
    }

    public C3040c(PreferenceGroup preferenceGroup) {
        this.f6918b = preferenceGroup;
        this.f6922f = new Handler();
        this.f6918b.f6814I = this;
        this.f6919c = new ArrayList();
        this.f6920d = new ArrayList();
        this.f6921e = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f6918b;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).f6884Y);
        } else {
            setHasStableIds(true);
        }
        mo11194n();
    }

    /* renamed from: m */
    public static boolean m7200m(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f6880W != Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final int mo11158c(Preference preference) {
        int size = this.f6920d.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.f6920d.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public final int mo11159g(String str) {
        int size = this.f6920d.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.f6920d.get(i)).f6832m)) {
                return i;
            }
        }
        return -1;
    }

    public final int getItemCount() {
        return this.f6920d.size();
    }

    public final long getItemId(int i) {
        if (!hasStableIds()) {
            return -1;
        }
        return mo11193l(i).mo11055f();
    }

    public final int getItemViewType(int i) {
        C3042b bVar = new C3042b(mo11193l(i));
        int indexOf = this.f6921e.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f6921e.size();
        this.f6921e.add(bVar);
        return size;
    }

    /* renamed from: j */
    public final ArrayList mo11191j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int O = preferenceGroup.mo11151O();
        int i = 0;
        for (int i2 = 0; i2 < O; i2++) {
            Preference N = preferenceGroup.mo11150N(i2);
            if (N.f6844y) {
                if (!m7200m(preferenceGroup) || i < preferenceGroup.f6880W) {
                    arrayList.add(N);
                } else {
                    arrayList2.add(N);
                }
                if (!(N instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) N;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else if (!m7200m(preferenceGroup) || !m7200m(preferenceGroup2)) {
                        Iterator it = mo11191j(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!m7200m(preferenceGroup) || i < preferenceGroup.f6880W) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (m7200m(preferenceGroup) && i > preferenceGroup.f6880W) {
            C3038a aVar = new C3038a(preferenceGroup.f6821b, arrayList2, preferenceGroup.f6823d);
            aVar.f6826g = new C3043d(this, preferenceGroup);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo11192k(PreferenceGroup preferenceGroup, ArrayList arrayList) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f6876R);
        }
        int O = preferenceGroup.mo11151O();
        for (int i = 0; i < O; i++) {
            Preference N = preferenceGroup.mo11150N(i);
            arrayList.add(N);
            C3042b bVar = new C3042b(N);
            if (!this.f6921e.contains(bVar)) {
                this.f6921e.add(bVar);
            }
            if (N instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) N;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    mo11192k(preferenceGroup2, arrayList);
                }
            }
            N.f6814I = this;
        }
    }

    /* renamed from: l */
    public final Preference mo11193l(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (Preference) this.f6920d.get(i);
    }

    /* renamed from: n */
    public final void mo11194n() {
        Iterator it = this.f6919c.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f6814I = null;
        }
        ArrayList arrayList = new ArrayList(this.f6919c.size());
        this.f6919c = arrayList;
        mo11192k(this.f6918b, arrayList);
        this.f6920d = mo11191j(this.f6918b);
        C3045f fVar = this.f6918b.f6822c;
        notifyDataSetChanged();
        Iterator it2 = this.f6919c.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        mo11193l(i).mo11000n((C3051h) b0Var);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3042b bVar = (C3042b) this.f6921e.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0114h.f165b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C6614a.m12981a(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.f6925a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5227q(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = bVar.f6926b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C3051h(inflate);
    }
}
