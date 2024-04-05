package p088e1;

import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityClickableSpanCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p088e1.C6697d;

/* renamed from: e1.b */
public final class C6689b {

    /* renamed from: a */
    public final AccessibilityNodeInfo f14759a;

    /* renamed from: b */
    public int f14760b = -1;

    /* renamed from: c */
    public int f14761c = -1;

    /* renamed from: e1.b$a */
    public static class C6690a {

        /* renamed from: e */
        public static final C6690a f14762e = new C6690a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C6690a f14763f = new C6690a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C6690a f14764g = new C6690a(16, (CharSequence) null);

        /* renamed from: h */
        public static final C6690a f14765h = new C6690a(32, (CharSequence) null);

        /* renamed from: i */
        public static final C6690a f14766i = new C6690a(64, (CharSequence) null);

        /* renamed from: j */
        public static final C6690a f14767j = new C6690a(128, (CharSequence) null);

        /* renamed from: k */
        public static final C6690a f14768k = new C6690a((int) RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT, (CharSequence) null);

        /* renamed from: l */
        public static final C6690a f14769l = new C6690a(8192, (CharSequence) null);

        /* renamed from: m */
        public static final C6690a f14770m = new C6690a((int) PrimitiveArrayBuilder.MAX_CHUNK_SIZE, (CharSequence) null);

        /* renamed from: n */
        public static final C6690a f14771n = new C6690a(524288, (CharSequence) null);

        /* renamed from: o */
        public static final C6690a f14772o = new C6690a(1048576, (CharSequence) null);

        /* renamed from: p */
        public static final C6690a f14773p = new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);

        /* renamed from: q */
        public static final C6690a f14774q = new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);

        /* renamed from: r */
        public static final C6690a f14775r = new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);

        /* renamed from: s */
        public static final C6690a f14776s = new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);

        /* renamed from: t */
        public static final C6690a f14777t = new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (C6697d) null, C6697d.C6703f.class);

        /* renamed from: a */
        public final Object f14778a;

        /* renamed from: b */
        public final int f14779b;

        /* renamed from: c */
        public final Class<? extends C6697d.C6698a> f14780c;

        /* renamed from: d */
        public final C6697d f14781d;

        static {
            Class<C6697d.C6700c> cls = C6697d.C6700c.class;
            Class<C6697d.C6699b> cls2 = C6697d.C6699b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C6690a(4, (CharSequence) null);
            new C6690a(8, (CharSequence) null);
            new C6690a(256, (Class) cls2);
            new C6690a((int) RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN, (Class) cls2);
            new C6690a((int) RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (Class) cls);
            new C6690a((int) RecyclerView.C3084b0.FLAG_MOVED, (Class) cls);
            new C6690a((int) PrimitiveArrayBuilder.SMALL_CHUNK_SIZE, (CharSequence) null);
            new C6690a(32768, (CharSequence) null);
            new C6690a(65536, (CharSequence) null);
            new C6690a(131072, C6697d.C6704g.class);
            new C6690a(2097152, C6697d.C6705h.class);
            int i = Build.VERSION.SDK_INT;
            new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C6697d) null, C6697d.C6702e.class);
            new C6690a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence) null, (C6697d) null, C6697d.C6701d.class);
            new C6690a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            new C6690a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new C6690a(accessibilityAction, 16908372, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
        }

        public C6690a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C6697d) null, (Class<? extends C6697d.C6698a>) null);
        }

        /* renamed from: a */
        public final int mo18875a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f14778a).getId();
        }

        /* renamed from: b */
        public final CharSequence mo18876b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f14778a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C6690a)) {
                return false;
            }
            C6690a aVar = (C6690a) obj;
            Object obj2 = this.f14778a;
            return obj2 == null ? aVar.f14778a == null : obj2.equals(aVar.f14778a);
        }

        public final int hashCode() {
            Object obj = this.f14778a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C6690a(int i, Class cls) {
            this((Object) null, i, (CharSequence) null, (C6697d) null, cls);
        }

        public C6690a(Object obj, int i, CharSequence charSequence, C6697d dVar, Class<? extends C6697d.C6698a> cls) {
            this.f14779b = i;
            this.f14781d = dVar;
            if (obj == null) {
                this.f14778a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f14778a = obj;
            }
            this.f14780c = cls;
        }
    }

    /* renamed from: e1.b$b */
    public static class C6691b {

        /* renamed from: a */
        public final Object f14782a;

        public C6691b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f14782a = collectionInfo;
        }

        /* renamed from: a */
        public static C6691b m13081a(int i, int i2, int i3) {
            return new C6691b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
        }
    }

    /* renamed from: e1.b$c */
    public static class C6692c {

        /* renamed from: a */
        public final Object f14783a;

        public C6692c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f14783a = collectionItemInfo;
        }

        /* renamed from: a */
        public static C6692c m13082a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C6692c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public C6689b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f14759a = accessibilityNodeInfo;
    }

    /* renamed from: j */
    public static C6689b m13056j() {
        return new C6689b(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a */
    public final void mo18850a(int i) {
        this.f14759a.addAction(i);
    }

    /* renamed from: b */
    public final void mo18851b(C6690a aVar) {
        this.f14759a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f14778a);
    }

    /* renamed from: c */
    public final ArrayList mo18852c(String str) {
        ArrayList<Integer> integerArrayList = this.f14759a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f14759a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public final List<C6690a> mo18853d() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f14759a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C6690a(actionList.get(i), 0, (CharSequence) null, (C6697d) null, (Class<? extends C6697d.C6698a>) null));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: e */
    public final void mo18854e(Rect rect) {
        this.f14759a.getBoundsInParent(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6689b)) {
            return false;
        }
        C6689b bVar = (C6689b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f14759a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f14759a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f14759a)) {
            return false;
        }
        return this.f14761c == bVar.f14761c && this.f14760b == bVar.f14760b;
    }

    /* renamed from: f */
    public final CharSequence mo18856f() {
        return this.f14759a.getContentDescription();
    }

    /* renamed from: g */
    public final CharSequence mo18857g() {
        return Build.VERSION.SDK_INT >= 30 ? this.f14759a.getStateDescription() : this.f14759a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* renamed from: h */
    public final CharSequence mo18858h() {
        if (!(!mo18852c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f14759a.getText();
        }
        ArrayList c = mo18852c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c2 = mo18852c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c3 = mo18852c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c4 = mo18852c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f14759a.getText(), 0, this.f14759a.getText().length()));
        for (int i = 0; i < c.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) c4.get(i)).intValue(), this, this.f14759a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c.get(i)).intValue(), ((Integer) c2.get(i)).intValue(), ((Integer) c3.get(i)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f14759a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final boolean mo18860i() {
        return this.f14759a.isVisibleToUser();
    }

    /* renamed from: k */
    public final void mo18861k() {
        this.f14759a.recycle();
    }

    /* renamed from: l */
    public final void mo18862l(C6690a aVar) {
        this.f14759a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f14778a);
    }

    /* renamed from: m */
    public final void mo18863m(boolean z) {
        this.f14759a.setAccessibilityFocused(z);
    }

    @Deprecated
    /* renamed from: n */
    public final void mo18864n(Rect rect) {
        this.f14759a.setBoundsInParent(rect);
    }

    /* renamed from: o */
    public final void mo18865o(boolean z) {
        this.f14759a.setCheckable(z);
    }

    /* renamed from: p */
    public final void mo18866p(boolean z) {
        this.f14759a.setChecked(z);
    }

    /* renamed from: q */
    public final void mo18867q(CharSequence charSequence) {
        this.f14759a.setClassName(charSequence);
    }

    /* renamed from: r */
    public final void mo18868r(C6691b bVar) {
        this.f14759a.setCollectionInfo(bVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) bVar.f14782a);
    }

    /* renamed from: s */
    public final void mo18869s(C6692c cVar) {
        this.f14759a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a);
    }

    /* renamed from: t */
    public final void mo18870t(CharSequence charSequence) {
        this.f14759a.setContentDescription(charSequence);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo18854e(rect);
        sb.append("; boundsInParent: " + rect);
        this.f14759a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f14759a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f14759a.getClassName());
        sb.append("; text: ");
        sb.append(mo18858h());
        sb.append("; contentDescription: ");
        sb.append(mo18856f());
        sb.append("; viewId: ");
        sb.append(this.f14759a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f14759a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f14759a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f14759a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f14759a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f14759a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f14759a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f14759a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f14759a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f14759a.isPassword());
        sb.append("; scrollable: " + this.f14759a.isScrollable());
        sb.append("; [");
        List<C6690a> d = mo18853d();
        for (int i = 0; i < d.size(); i++) {
            C6690a aVar = d.get(i);
            int a = aVar.mo18875a();
            if (a == 1) {
                str = "ACTION_FOCUS";
            } else if (a != 2) {
                switch (a) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case RecyclerView.C3084b0.FLAG_MOVED:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case PrimitiveArrayBuilder.SMALL_CHUNK_SIZE /*16384*/:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case PrimitiveArrayBuilder.MAX_CHUNK_SIZE /*262144*/:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    case 16908372:
                        str = "ACTION_IME_ENTER";
                        break;
                    default:
                        switch (a) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.mo18876b() != null) {
                str = aVar.mo18876b().toString();
            }
            sb.append(str);
            if (i != d.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo18872u(boolean z) {
        this.f14759a.setScrollable(z);
    }

    /* renamed from: v */
    public final void mo18873v(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f14759a.setStateDescription(charSequence);
        } else {
            this.f14759a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: w */
    public final void mo18874w(CharSequence charSequence) {
        this.f14759a.setText(charSequence);
    }
}
