package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.C0114h;
import androidx.preference.C3045f;
import com.etsy.android.R;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import p088e1.C6689b;
import p280x0.C8299j;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public boolean f6806A;

    /* renamed from: B */
    public boolean f6807B;

    /* renamed from: C */
    public boolean f6808C;

    /* renamed from: D */
    public boolean f6809D;

    /* renamed from: E */
    public boolean f6810E;

    /* renamed from: F */
    public boolean f6811F;

    /* renamed from: G */
    public int f6812G;

    /* renamed from: H */
    public int f6813H;

    /* renamed from: I */
    public C3008b f6814I;

    /* renamed from: J */
    public ArrayList f6815J;

    /* renamed from: K */
    public PreferenceGroup f6816K;

    /* renamed from: L */
    public boolean f6817L;

    /* renamed from: M */
    public C3011e f6818M;

    /* renamed from: N */
    public C3012f f6819N;

    /* renamed from: O */
    public final C3007a f6820O;

    /* renamed from: b */
    public Context f6821b;

    /* renamed from: c */
    public C3045f f6822c;

    /* renamed from: d */
    public long f6823d;

    /* renamed from: e */
    public boolean f6824e;

    /* renamed from: f */
    public C3009c f6825f;

    /* renamed from: g */
    public C3010d f6826g;

    /* renamed from: h */
    public int f6827h;

    /* renamed from: i */
    public CharSequence f6828i;

    /* renamed from: j */
    public CharSequence f6829j;

    /* renamed from: k */
    public int f6830k;

    /* renamed from: l */
    public Drawable f6831l;

    /* renamed from: m */
    public String f6832m;

    /* renamed from: n */
    public Intent f6833n;

    /* renamed from: o */
    public String f6834o;

    /* renamed from: p */
    public Bundle f6835p;

    /* renamed from: q */
    public boolean f6836q;

    /* renamed from: r */
    public boolean f6837r;

    /* renamed from: s */
    public boolean f6838s;

    /* renamed from: t */
    public boolean f6839t;

    /* renamed from: u */
    public String f6840u;

    /* renamed from: v */
    public Object f6841v;

    /* renamed from: w */
    public boolean f6842w;

    /* renamed from: x */
    public boolean f6843x;

    /* renamed from: y */
    public boolean f6844y;

    /* renamed from: z */
    public boolean f6845z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C3006a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        public static class C3006a implements Parcelable.Creator<BaseSavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    public class C3007a implements View.OnClickListener {
        public C3007a() {
        }

        public final void onClick(View view) {
            Preference.this.mo11001v(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public interface C3008b {
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C3009c {
        boolean onPreferenceChange(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C3010d {
        /* renamed from: g */
        boolean mo412g(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    public static class C3011e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final Preference f6847b;

        public C3011e(Preference preference) {
            this.f6847b = preference;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence h = this.f6847b.mo11030h();
            if (this.f6847b.f6810E && !TextUtils.isEmpty(h)) {
                contextMenu.setHeaderTitle(h);
                contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence h = this.f6847b.mo11030h();
            ((ClipboardManager) this.f6847b.f6821b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", h));
            Context context = this.f6847b.f6821b;
            Toast.makeText(context, context.getString(R.string.preference_copied, new Object[]{h}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$f */
    public interface C3012f<T extends Preference> {
        /* renamed from: c */
        CharSequence mo11017c(T t);
    }

    public Preference() {
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f6827h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6836q = true;
        this.f6837r = true;
        this.f6839t = true;
        this.f6842w = true;
        this.f6843x = true;
        this.f6844y = true;
        this.f6845z = true;
        this.f6806A = true;
        this.f6808C = true;
        this.f6811F = true;
        this.f6812G = R.layout.preference;
        this.f6820O = new C3007a();
        this.f6821b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f171h, i, 0);
        this.f6830k = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        this.f6832m = C8299j.m16594g(obtainStyledAttributes, 26, 6);
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f6828i = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f6829j = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f6827h = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        this.f6834o = C8299j.m16594g(obtainStyledAttributes, 22, 13);
        this.f6812G = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f6813H = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f6836q = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.f6837r = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.f6839t = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        this.f6840u = C8299j.m16594g(obtainStyledAttributes, 19, 10);
        this.f6845z = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.f6837r));
        this.f6806A = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.f6837r));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f6841v = mo11010q(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f6841v = mo11010q(obtainStyledAttributes, 11);
        }
        this.f6811F = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f6807B = hasValue;
        if (hasValue) {
            this.f6808C = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.f6809D = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.f6844y = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.f6810E = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public static void m7034B(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    m7034B(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo11044C() {
        if (this.f6809D) {
            this.f6809D = false;
            mo11005j();
        }
    }

    /* renamed from: D */
    public final void mo11045D(String str) {
        this.f6832m = str;
        if (this.f6838s && !(!TextUtils.isEmpty(str))) {
            if (!TextUtils.isEmpty(this.f6832m)) {
                this.f6838s = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    /* renamed from: E */
    public final void mo11046E(int i) {
        mo11026F(this.f6821b.getString(i));
    }

    /* renamed from: F */
    public void mo11026F(CharSequence charSequence) {
        if (this.f6819N != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f6829j, charSequence)) {
            this.f6829j = charSequence;
            mo11005j();
        }
    }

    /* renamed from: G */
    public final void mo11047G(int i) {
        mo11048H(this.f6821b.getString(i));
    }

    /* renamed from: H */
    public final void mo11048H(String str) {
        if ((str == null && this.f6828i != null) || (str != null && !str.equals(this.f6828i))) {
            this.f6828i = str;
            mo11005j();
        }
    }

    /* renamed from: I */
    public boolean mo11008I() {
        return !mo11057i();
    }

    /* renamed from: J */
    public final boolean mo11049J() {
        return this.f6822c != null && this.f6839t && (TextUtils.isEmpty(this.f6832m) ^ true);
    }

    /* renamed from: K */
    public final void mo11050K() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f6840u;
        if (str != null) {
            C3045f fVar = this.f6822c;
            Preference preference = null;
            if (!(fVar == null || (preferenceScreen = fVar.f6943h) == null)) {
                preference = preferenceScreen.mo11149M(str);
            }
            if (preference != null && (arrayList = preference.f6815J) != null) {
                arrayList.remove(this);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11051a(Object obj) {
        C3009c cVar = this.f6825f;
        return cVar == null || cVar.onPreferenceChange(this, obj);
    }

    /* renamed from: c */
    public void mo11052c(Bundle bundle) {
        Parcelable parcelable;
        if ((!TextUtils.isEmpty(this.f6832m)) && (parcelable = bundle.getParcelable(this.f6832m)) != null) {
            this.f6817L = false;
            mo11011s(parcelable);
            if (!this.f6817L) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f6827h;
        int i2 = preference.f6827h;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f6828i;
        CharSequence charSequence2 = preference.f6828i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f6828i.toString());
    }

    /* renamed from: e */
    public void mo11054e(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f6832m)) {
            this.f6817L = false;
            Parcelable t = mo11012t();
            if (!this.f6817L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (t != null) {
                bundle.putParcelable(this.f6832m, t);
            }
        }
    }

    /* renamed from: f */
    public long mo11055f() {
        return this.f6823d;
    }

    /* renamed from: g */
    public final String mo11056g(String str) {
        return !mo11049J() ? str : this.f6822c.mo11205b().getString(this.f6832m, str);
    }

    /* renamed from: h */
    public CharSequence mo11030h() {
        C3012f fVar = this.f6819N;
        return fVar != null ? fVar.mo11017c(this) : this.f6829j;
    }

    /* renamed from: i */
    public boolean mo11057i() {
        return this.f6836q && this.f6842w && this.f6843x;
    }

    /* renamed from: j */
    public void mo11005j() {
        C3008b bVar = this.f6814I;
        if (bVar != null) {
            C3040c cVar = (C3040c) bVar;
            int indexOf = cVar.f6920d.indexOf(this);
            if (indexOf != -1) {
                cVar.notifyItemChanged(indexOf, this);
            }
        }
    }

    /* renamed from: k */
    public void mo11058k(boolean z) {
        ArrayList arrayList = this.f6815J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) arrayList.get(i);
                if (preference.f6842w == z) {
                    preference.f6842w = !z;
                    preference.mo11058k(preference.mo11008I());
                    preference.mo11005j();
                }
            }
        }
    }

    /* renamed from: l */
    public void mo11059l() {
        PreferenceScreen preferenceScreen;
        if (!TextUtils.isEmpty(this.f6840u)) {
            String str = this.f6840u;
            C3045f fVar = this.f6822c;
            Preference preference = null;
            if (!(fVar == null || (preferenceScreen = fVar.f6943h) == null)) {
                preference = preferenceScreen.mo11149M(str);
            }
            if (preference != null) {
                if (preference.f6815J == null) {
                    preference.f6815J = new ArrayList();
                }
                preference.f6815J.add(this);
                boolean I = preference.mo11008I();
                if (this.f6842w == I) {
                    this.f6842w = !I;
                    mo11058k(mo11008I());
                    mo11005j();
                    return;
                }
                return;
            }
            StringBuilder h = C0072d.m201h("Dependency \"");
            h.append(this.f6840u);
            h.append("\" not found for preference \"");
            h.append(this.f6832m);
            h.append("\" (title: \"");
            h.append(this.f6828i);
            h.append("\"");
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: m */
    public final void mo11060m(C3045f fVar) {
        long j;
        this.f6822c = fVar;
        if (!this.f6824e) {
            synchronized (fVar) {
                j = fVar.f6937b;
                fVar.f6937b = 1 + j;
            }
            this.f6823d = j;
        }
        if (mo11049J()) {
            C3045f fVar2 = this.f6822c;
            if ((fVar2 != null ? fVar2.mo11205b() : null).contains(this.f6832m)) {
                mo11013u((Object) null);
                return;
            }
        }
        Object obj = this.f6841v;
        if (obj != null) {
            mo11013u(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11000n(androidx.preference.C3051h r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.itemView
            androidx.preference.Preference$a r1 = r8.f6820O
            r0.setOnClickListener(r1)
            r1 = 0
            r0.setId(r1)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r9.mo11208e(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 0
            r4 = 8
            if (r2 == 0) goto L_0x0035
            java.lang.CharSequence r5 = r8.mo11030h()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r1)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0032:
            r2.setVisibility(r4)
        L_0x0035:
            r2 = r3
        L_0x0036:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo11208e(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r6 = r8.f6828i
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x006c
            r5.setText(r6)
            r5.setVisibility(r1)
            boolean r6 = r8.f6807B
            if (r6 == 0) goto L_0x0058
            boolean r6 = r8.f6808C
            r5.setSingleLine(r6)
        L_0x0058:
            boolean r6 = r8.f6837r
            if (r6 != 0) goto L_0x006f
            boolean r6 = r8.mo11057i()
            if (r6 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x006f
        L_0x006c:
            r5.setVisibility(r4)
        L_0x006f:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r9.mo11208e(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            if (r2 == 0) goto L_0x00a8
            int r6 = r8.f6830k
            if (r6 != 0) goto L_0x0083
            android.graphics.drawable.Drawable r7 = r8.f6831l
            if (r7 == 0) goto L_0x0096
        L_0x0083:
            android.graphics.drawable.Drawable r7 = r8.f6831l
            if (r7 != 0) goto L_0x008f
            android.content.Context r7 = r8.f6821b
            android.graphics.drawable.Drawable r6 = p075d.C6614a.m12981a(r7, r6)
            r8.f6831l = r6
        L_0x008f:
            android.graphics.drawable.Drawable r6 = r8.f6831l
            if (r6 == 0) goto L_0x0096
            r2.setImageDrawable(r6)
        L_0x0096:
            android.graphics.drawable.Drawable r6 = r8.f6831l
            if (r6 == 0) goto L_0x009e
            r2.setVisibility(r1)
            goto L_0x00a8
        L_0x009e:
            boolean r6 = r8.f6809D
            if (r6 == 0) goto L_0x00a4
            r6 = r5
            goto L_0x00a5
        L_0x00a4:
            r6 = r4
        L_0x00a5:
            r2.setVisibility(r6)
        L_0x00a8:
            r2 = 2131428643(0x7f0b0523, float:1.8478936E38)
            android.view.View r2 = r9.mo11208e(r2)
            if (r2 != 0) goto L_0x00b8
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r9.mo11208e(r2)
        L_0x00b8:
            if (r2 == 0) goto L_0x00ca
            android.graphics.drawable.Drawable r6 = r8.f6831l
            if (r6 == 0) goto L_0x00c2
            r2.setVisibility(r1)
            goto L_0x00ca
        L_0x00c2:
            boolean r1 = r8.f6809D
            if (r1 == 0) goto L_0x00c7
            r4 = r5
        L_0x00c7:
            r2.setVisibility(r4)
        L_0x00ca:
            boolean r1 = r8.f6811F
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r8.mo11057i()
            m7034B(r0, r1)
            goto L_0x00da
        L_0x00d6:
            r1 = 1
            m7034B(r0, r1)
        L_0x00da:
            boolean r1 = r8.f6837r
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r8.f6845z
            r9.f6952c = r2
            boolean r2 = r8.f6806A
            r9.f6953d = r2
            boolean r9 = r8.f6810E
            if (r9 == 0) goto L_0x00f9
            androidx.preference.Preference$e r2 = r8.f6818M
            if (r2 != 0) goto L_0x00f9
            androidx.preference.Preference$e r2 = new androidx.preference.Preference$e
            r2.<init>(r8)
            r8.f6818M = r2
        L_0x00f9:
            if (r9 == 0) goto L_0x00fe
            androidx.preference.Preference$e r2 = r8.f6818M
            goto L_0x00ff
        L_0x00fe:
            r2 = r3
        L_0x00ff:
            r0.setOnCreateContextMenuListener(r2)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x010e
            if (r1 != 0) goto L_0x010e
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r9 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5227q(r0, r3)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo11000n(androidx.preference.h):void");
    }

    /* renamed from: o */
    public void mo11003o() {
    }

    /* renamed from: p */
    public void mo11061p() {
        mo11050K();
    }

    /* renamed from: q */
    public Object mo11010q(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    /* renamed from: r */
    public void mo11062r(C6689b bVar) {
    }

    /* renamed from: s */
    public void mo11011s(Parcelable parcelable) {
        this.f6817L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: t */
    public Parcelable mo11012t() {
        this.f6817L = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f6828i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence h = mo11030h();
        if (!TextUtils.isEmpty(h)) {
            sb.append(h);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo11013u(Object obj) {
    }

    /* renamed from: v */
    public void mo11001v(View view) {
        Intent intent;
        C3045f.C3048c cVar;
        if (mo11057i() && this.f6837r) {
            mo11003o();
            C3010d dVar = this.f6826g;
            if (dVar == null || !dVar.mo412g(this)) {
                C3045f fVar = this.f6822c;
                if ((fVar == null || (cVar = fVar.f6944i) == null || !cVar.onPreferenceTreeClick(this)) && (intent = this.f6833n) != null) {
                    this.f6821b.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo11064w(String str) {
        if (mo11049J() && !TextUtils.equals(str, mo11056g((String) null))) {
            SharedPreferences.Editor a = this.f6822c.mo11204a();
            a.putString(this.f6832m, str);
            if (!this.f6822c.f6940e) {
                a.apply();
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8299j.m16588a(R.attr.preferenceStyle, context, 16842894));
    }
}
