package androidx.compose.p015ui.platform;

import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.activity.C0114h;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1901h;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1903j;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1905l;
import androidx.compose.p015ui.semantics.C1907n;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p015ui.semantics.SemanticsNode;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.core.view.C2273a;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.gms.common.api.Api;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import p088e1.C6689b;
import p088e1.C6693c;
import p193o.C7496d;
import p193o.C7507j;
import p288y.C8343c;
import p288y.C8345d;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C2273a {

    /* renamed from: w */
    public static final int[] f3953w = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: a */
    public final AndroidComposeView f3954a;

    /* renamed from: b */
    public int f3955b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final AccessibilityManager f3956c;

    /* renamed from: d */
    public final Handler f3957d;

    /* renamed from: e */
    public C6693c f3958e;

    /* renamed from: f */
    public int f3959f;

    /* renamed from: g */
    public C7507j<C7507j<CharSequence>> f3960g;

    /* renamed from: h */
    public C7507j<Map<CharSequence, Integer>> f3961h;

    /* renamed from: i */
    public int f3962i;

    /* renamed from: j */
    public Integer f3963j;

    /* renamed from: k */
    public final C7496d<LayoutNode> f3964k;

    /* renamed from: l */
    public final AbstractChannel f3965l;

    /* renamed from: m */
    public boolean f3966m;

    /* renamed from: n */
    public C1766c f3967n;

    /* renamed from: o */
    public Map<Integer, C1814a1> f3968o;

    /* renamed from: p */
    public C7496d<Integer> f3969p;

    /* renamed from: q */
    public LinkedHashMap f3970q;

    /* renamed from: r */
    public C1767d f3971r;

    /* renamed from: s */
    public boolean f3972s;

    /* renamed from: t */
    public final C1864q f3973t;

    /* renamed from: u */
    public final ArrayList f3974u;

    /* renamed from: v */
    public final C19857l<C1892z0, C19394m> f3975v;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            SemanticsNode semanticsNode;
            String str2;
            int i2;
            C8345d dVar;
            RectF rectF;
            String str3 = str;
            Bundle bundle2 = bundle;
            C19383o.m32797g(accessibilityNodeInfo, "info");
            C19383o.m32797g(str3, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.f3953w;
            C1814a1 a1Var = androidComposeViewAccessibilityDelegateCompat.mo7073g().get(Integer.valueOf(i));
            if (a1Var != null && (semanticsNode = a1Var.f4067a) != null) {
                String h = AndroidComposeViewAccessibilityDelegateCompat.m3902h(semanticsNode);
                C1903j jVar = semanticsNode.f4186e;
                C1909p pVar = C1902i.f4230a;
                if (!jVar.mo7343c(pVar) || bundle2 == null || !C19383o.m32792b(str3, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    C1903j jVar2 = semanticsNode.f4186e;
                    C1909p pVar2 = SemanticsProperties.f4207r;
                    if (jVar2.mo7343c(pVar2) && bundle2 != null && C19383o.m32792b(str3, "androidx.compose.ui.semantics.testTag") && (str2 = (String) SemanticsConfigurationKt.m4173a(semanticsNode.f4186e, pVar2)) != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str3, str2);
                        return;
                    }
                    return;
                }
                int i3 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i4 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i4 > 0 && i3 >= 0) {
                    if (i3 < (h != null ? h.length() : Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                        ArrayList arrayList = new ArrayList();
                        C19857l lVar = (C19857l) ((C1894a) semanticsNode.f4186e.mo7344e(pVar)).f4218b;
                        Object obj = null;
                        if (C19383o.m32792b(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                            C2021q qVar = (C2021q) arrayList.get(0);
                            ArrayList arrayList2 = new ArrayList();
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i3 + i5;
                                if (i6 >= qVar.f4589a.f4556a.length()) {
                                    arrayList2.add(obj);
                                    i2 = i4;
                                } else {
                                    C8345d e = qVar.mo7739b(i6).mo20930e(!semanticsNode.f4188g.mo6696c() ? C8343c.f18295b : C0114h.m320t0(semanticsNode.mo7304c()));
                                    C8345d d = semanticsNode.mo7305d();
                                    if (e.mo20928c(d)) {
                                        i2 = i4;
                                        dVar = new C8345d(Math.max(e.f18301a, d.f18301a), Math.max(e.f18302b, d.f18302b), Math.min(e.f18303c, d.f18303c), Math.min(e.f18304d, d.f18304d));
                                    } else {
                                        i2 = i4;
                                        dVar = null;
                                    }
                                    if (dVar != null) {
                                        long r7 = androidComposeViewAccessibilityDelegateCompat.f3954a.m34794localToScreenMKHz9U(C19421p.m32952q(dVar.f18301a, dVar.f18302b));
                                        long r12 = androidComposeViewAccessibilityDelegateCompat.f3954a.m34794localToScreenMKHz9U(C19421p.m32952q(dVar.f18303c, dVar.f18304d));
                                        rectF = new RectF(C8343c.m16642c(r7), C8343c.m16643d(r7), C8343c.m16642c(r12), C8343c.m16643d(r12));
                                    } else {
                                        rectF = null;
                                    }
                                    arrayList2.add(rectF);
                                }
                                i5++;
                                i4 = i2;
                                obj = null;
                            }
                            Bundle extras = accessibilityNodeInfo.getExtras();
                            Object[] array = arrayList2.toArray(new RectF[0]);
                            if (array != null) {
                                extras.putParcelableArray(str3, (Parcelable[]) array);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b6, code lost:
            if ((r2 == 1) != false) goto L_0x04ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r1 = (r1 = r1.f3946a).getLifecycle();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r15) {
            /*
                r14 = this;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this
                androidx.compose.ui.platform.AndroidComposeView r1 = r0.f3954a
                androidx.compose.ui.platform.AndroidComposeView$b r1 = r1.getViewTreeOwners()
                if (r1 == 0) goto L_0x0019
                androidx.lifecycle.s r1 = r1.f3946a
                if (r1 == 0) goto L_0x0019
                androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
                if (r1 == 0) goto L_0x0019
                androidx.lifecycle.Lifecycle$State r1 = r1.mo10734b()
                goto L_0x001a
            L_0x0019:
                r1 = 0
            L_0x001a:
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r1 != r2) goto L_0x001f
                goto L_0x0036
            L_0x001f:
                e1.b r1 = p088e1.C6689b.m13056j()
                java.util.Map r2 = r0.mo7073g()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                java.lang.Object r2 = r2.get(r3)
                androidx.compose.ui.platform.a1 r2 = (androidx.compose.p015ui.platform.C1814a1) r2
                if (r2 != 0) goto L_0x0039
                r1.mo18861k()
            L_0x0036:
                r15 = 0
                goto L_0x0a8b
            L_0x0039:
                androidx.compose.ui.semantics.SemanticsNode r3 = r2.f4067a
                r4 = -1
                if (r15 != r4) goto L_0x0056
                androidx.compose.ui.platform.AndroidComposeView r5 = r0.f3954a
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
                android.view.ViewParent r5 = androidx.core.view.C2364y.C2368d.m5216f(r5)
                boolean r6 = r5 instanceof android.view.View
                if (r6 == 0) goto L_0x004d
                android.view.View r5 = (android.view.View) r5
                goto L_0x004e
            L_0x004d:
                r5 = 0
            L_0x004e:
                r1.f14760b = r4
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setParent(r5)
                goto L_0x007e
            L_0x0056:
                androidx.compose.ui.semantics.SemanticsNode r5 = r3.mo7308g()
                if (r5 == 0) goto L_0x0a8c
                androidx.compose.ui.semantics.SemanticsNode r5 = r3.mo7308g()
                kotlin.jvm.internal.C19383o.m32794d(r5)
                int r5 = r5.f4187f
                androidx.compose.ui.platform.AndroidComposeView r6 = r0.f3954a
                androidx.compose.ui.semantics.n r6 = r6.getSemanticsOwner()
                androidx.compose.ui.semantics.SemanticsNode r6 = r6.mo7355a()
                int r6 = r6.f4187f
                if (r5 != r6) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r4 = r5
            L_0x0075:
                androidx.compose.ui.platform.AndroidComposeView r5 = r0.f3954a
                r1.f14760b = r4
                android.view.accessibility.AccessibilityNodeInfo r6 = r1.f14759a
                r6.setParent(r5, r4)
            L_0x007e:
                androidx.compose.ui.platform.AndroidComposeView r4 = r0.f3954a
                r1.f14761c = r15
                android.view.accessibility.AccessibilityNodeInfo r5 = r1.f14759a
                r5.setSource(r4, r15)
                android.graphics.Rect r2 = r2.f4068b
                androidx.compose.ui.platform.AndroidComposeView r4 = r0.f3954a
                int r5 = r2.left
                float r5 = (float) r5
                int r6 = r2.top
                float r6 = (float) r6
                long r5 = kotlin.reflect.C19421p.m32952q(r5, r6)
                long r4 = r4.m34794localToScreenMKHz9U(r5)
                androidx.compose.ui.platform.AndroidComposeView r6 = r0.f3954a
                int r7 = r2.right
                float r7 = (float) r7
                int r2 = r2.bottom
                float r2 = (float) r2
                long r7 = kotlin.reflect.C19421p.m32952q(r7, r2)
                long r6 = r6.m34794localToScreenMKHz9U(r7)
                android.graphics.Rect r2 = new android.graphics.Rect
                float r8 = p288y.C8343c.m16642c(r4)
                double r8 = (double) r8
                double r8 = java.lang.Math.floor(r8)
                float r8 = (float) r8
                int r8 = (int) r8
                float r4 = p288y.C8343c.m16643d(r4)
                double r4 = (double) r4
                double r4 = java.lang.Math.floor(r4)
                float r4 = (float) r4
                int r4 = (int) r4
                float r5 = p288y.C8343c.m16642c(r6)
                double r9 = (double) r5
                double r9 = java.lang.Math.ceil(r9)
                float r5 = (float) r9
                int r5 = (int) r5
                float r6 = p288y.C8343c.m16643d(r6)
                double r6 = (double) r6
                double r6 = java.lang.Math.ceil(r6)
                float r6 = (float) r6
                int r6 = (int) r6
                r2.<init>(r8, r4, r5, r6)
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setBoundsInScreen(r2)
                java.lang.String r2 = "semanticsNode"
                kotlin.jvm.internal.C19383o.m32797g(r3, r2)
                java.lang.String r2 = "android.view.View"
                r1.mo18867q(r2)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.g> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4206q
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.g r2 = (androidx.compose.p015ui.semantics.C1900g) r2
                r4 = 3
                r5 = 2
                r6 = 4
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L_0x0185
                int r9 = r2.f4226a
                boolean r10 = r3.f4184c
                if (r10 != 0) goto L_0x010a
                java.util.List r10 = r3.mo7306e(r7)
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x0183
            L_0x010a:
                int r10 = r2.f4226a
                if (r10 != r6) goto L_0x0110
                r6 = r8
                goto L_0x0111
            L_0x0110:
                r6 = r7
            L_0x0111:
                if (r6 == 0) goto L_0x0131
                androidx.compose.ui.platform.AndroidComposeView r6 = r0.f3954a
                android.content.Context r6 = r6.getContext()
                android.content.res.Resources r6 = r6.getResources()
                r9 = 2131953636(0x7f1307e4, float:1.9543749E38)
                java.lang.String r6 = r6.getString(r9)
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                android.os.Bundle r9 = r9.getExtras()
                java.lang.String r10 = "AccessibilityNodeInfo.roleDescription"
                r9.putCharSequence(r10, r6)
                goto L_0x0183
            L_0x0131:
                if (r9 != 0) goto L_0x0135
                r6 = r8
                goto L_0x0136
            L_0x0135:
                r6 = r7
            L_0x0136:
                r11 = 5
                if (r6 == 0) goto L_0x013c
                java.lang.String r6 = "android.widget.Button"
                goto L_0x0165
            L_0x013c:
                if (r9 != r8) goto L_0x0140
                r6 = r8
                goto L_0x0141
            L_0x0140:
                r6 = r7
            L_0x0141:
                if (r6 == 0) goto L_0x0146
                java.lang.String r6 = "android.widget.CheckBox"
                goto L_0x0165
            L_0x0146:
                if (r9 != r5) goto L_0x014a
                r6 = r8
                goto L_0x014b
            L_0x014a:
                r6 = r7
            L_0x014b:
                if (r6 == 0) goto L_0x0150
                java.lang.String r6 = "android.widget.Switch"
                goto L_0x0165
            L_0x0150:
                if (r9 != r4) goto L_0x0154
                r6 = r8
                goto L_0x0155
            L_0x0154:
                r6 = r7
            L_0x0155:
                if (r6 == 0) goto L_0x015a
                java.lang.String r6 = "android.widget.RadioButton"
                goto L_0x0165
            L_0x015a:
                if (r9 != r11) goto L_0x015e
                r6 = r8
                goto L_0x015f
            L_0x015e:
                r6 = r7
            L_0x015f:
                if (r6 == 0) goto L_0x0164
                java.lang.String r6 = "android.widget.ImageView"
                goto L_0x0165
            L_0x0164:
                r6 = 0
            L_0x0165:
                if (r10 != r11) goto L_0x0169
                r9 = r8
                goto L_0x016a
            L_0x0169:
                r9 = r7
            L_0x016a:
                if (r9 != 0) goto L_0x0170
                r1.mo18867q(r6)
                goto L_0x0183
            L_0x0170:
                androidx.compose.ui.node.LayoutNode r9 = r3.f4188g
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1 r10 = androidx.compose.p015ui.platform.C1770xe4d02f47.INSTANCE
                androidx.compose.ui.node.LayoutNode r9 = androidx.compose.p015ui.platform.C1875t.m4081d(r9, r10)
                if (r9 == 0) goto L_0x0180
                androidx.compose.ui.semantics.j r9 = r3.f4186e
                boolean r9 = r9.f4247c
                if (r9 == 0) goto L_0x0183
            L_0x0180:
                r1.mo18867q(r6)
            L_0x0183:
                kotlin.m r6 = kotlin.C19394m.f43287a
            L_0x0185:
                boolean r6 = androidx.compose.p015ui.platform.C1875t.m4083f(r3)
                if (r6 == 0) goto L_0x0190
                java.lang.String r6 = "android.widget.EditText"
                r1.mo18867q(r6)
            L_0x0190:
                androidx.compose.ui.semantics.j r6 = r3.mo7307f()
                androidx.compose.ui.semantics.p<java.util.List<androidx.compose.ui.text.a>> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4208s
                boolean r6 = r6.mo7343c(r9)
                if (r6 == 0) goto L_0x01a1
                java.lang.String r6 = "android.widget.TextView"
                r1.mo18867q(r6)
            L_0x01a1:
                androidx.compose.ui.platform.AndroidComposeView r6 = r0.f3954a
                android.content.Context r6 = r6.getContext()
                java.lang.String r6 = r6.getPackageName()
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setPackageName(r6)
                java.util.List r6 = r3.mo7306e(r8)
                int r9 = r6.size()
                r10 = r7
            L_0x01b9:
                if (r10 >= r9) goto L_0x01f7
                java.lang.Object r11 = r6.get(r10)
                androidx.compose.ui.semantics.SemanticsNode r11 = (androidx.compose.p015ui.semantics.SemanticsNode) r11
                java.util.Map r12 = r0.mo7073g()
                int r13 = r11.f4187f
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                boolean r12 = r12.containsKey(r13)
                if (r12 == 0) goto L_0x01f4
                androidx.compose.ui.platform.AndroidComposeView r12 = r0.f3954a
                androidx.compose.ui.platform.AndroidViewsHandler r12 = r12.getAndroidViewsHandler$ui_release()
                java.util.HashMap r12 = r12.getLayoutNodeToHolder()
                androidx.compose.ui.node.LayoutNode r13 = r11.f4188g
                java.lang.Object r12 = r12.get(r13)
                androidx.compose.ui.viewinterop.AndroidViewHolder r12 = (androidx.compose.p015ui.viewinterop.AndroidViewHolder) r12
                if (r12 == 0) goto L_0x01eb
                android.view.accessibility.AccessibilityNodeInfo r11 = r1.f14759a
                r11.addChild(r12)
                goto L_0x01f4
            L_0x01eb:
                androidx.compose.ui.platform.AndroidComposeView r12 = r0.f3954a
                int r11 = r11.f4187f
                android.view.accessibility.AccessibilityNodeInfo r13 = r1.f14759a
                r13.addChild(r12, r11)
            L_0x01f4:
                int r10 = r10 + 1
                goto L_0x01b9
            L_0x01f7:
                int r6 = r0.f3959f
                if (r6 != r15) goto L_0x0204
                r1.mo18863m(r8)
                e1.b$a r6 = p088e1.C6689b.C6690a.f14767j
                r1.mo18851b(r6)
                goto L_0x020c
            L_0x0204:
                r1.mo18863m(r7)
                e1.b$a r6 = p088e1.C6689b.C6690a.f14766i
                r1.mo18851b(r6)
            L_0x020c:
                androidx.compose.ui.platform.AndroidComposeView r6 = r0.f3954a
                androidx.compose.ui.text.font.g$a r6 = r6.getFontFamilyResolver()
                androidx.compose.ui.semantics.j r9 = r3.f4186e
                androidx.compose.ui.text.a r9 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3903i(r9)
                if (r9 == 0) goto L_0x0225
                androidx.compose.ui.platform.AndroidComposeView r10 = r0.f3954a
                m0.b r10 = r10.getDensity()
                android.text.SpannableString r9 = p628nj.C18263b.m30857n0(r9, r10, r6)
                goto L_0x0226
            L_0x0225:
                r9 = 0
            L_0x0226:
                java.lang.CharSequence r9 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3909y(r9)
                android.text.SpannableString r9 = (android.text.SpannableString) r9
                androidx.compose.ui.semantics.j r10 = r3.f4186e
                androidx.compose.ui.semantics.p<java.util.List<androidx.compose.ui.text.a>> r11 = androidx.compose.p015ui.semantics.SemanticsProperties.f4208s
                java.lang.Object r10 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r10, r11)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x024b
                java.lang.Object r10 = kotlin.collections.C19327t.m32640V0(r10)
                androidx.compose.ui.text.a r10 = (androidx.compose.p015ui.text.C1913a) r10
                if (r10 == 0) goto L_0x024b
                androidx.compose.ui.platform.AndroidComposeView r11 = r0.f3954a
                m0.b r11 = r11.getDensity()
                android.text.SpannableString r6 = p628nj.C18263b.m30857n0(r10, r11, r6)
                goto L_0x024c
            L_0x024b:
                r6 = 0
            L_0x024c:
                java.lang.CharSequence r6 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3909y(r6)
                android.text.SpannableString r6 = (android.text.SpannableString) r6
                if (r9 == 0) goto L_0x0255
                goto L_0x0256
            L_0x0255:
                r9 = r6
            L_0x0256:
                r1.mo18874w(r9)
                androidx.compose.ui.semantics.j r6 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.String> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4215z
                boolean r6 = r6.mo7343c(r9)
                if (r6 == 0) goto L_0x0275
                android.view.accessibility.AccessibilityNodeInfo r6 = r1.f14759a
                r6.setContentInvalid(r8)
                androidx.compose.ui.semantics.j r6 = r3.f4186e
                java.lang.Object r6 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r6, r9)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setError(r6)
            L_0x0275:
                androidx.compose.ui.semantics.j r6 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.String> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4191b
                java.lang.Object r6 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r6, r9)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r1.mo18873v(r6)
                androidx.compose.ui.semantics.j r6 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.state.ToggleableState> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4213x
                java.lang.Object r6 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r6, r9)
                androidx.compose.ui.state.ToggleableState r6 = (androidx.compose.p015ui.state.ToggleableState) r6
                if (r6 == 0) goto L_0x0311
                r1.mo18865o(r8)
                int[] r9 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C1768e.f3984a
                int r6 = r6.ordinal()
                r6 = r9[r6]
                if (r6 == r8) goto L_0x02e6
                if (r6 == r5) goto L_0x02bc
                if (r6 == r4) goto L_0x02a1
                goto L_0x030f
            L_0x02a1:
                java.lang.CharSequence r4 = r1.mo18857g()
                if (r4 != 0) goto L_0x030f
                androidx.compose.ui.platform.AndroidComposeView r4 = r0.f3954a
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131952377(0x7f1302f9, float:1.9541195E38)
                java.lang.String r4 = r4.getString(r6)
                r1.mo18873v(r4)
                goto L_0x030f
            L_0x02bc:
                r1.mo18866p(r7)
                if (r2 != 0) goto L_0x02c2
                goto L_0x02c8
            L_0x02c2:
                int r4 = r2.f4226a
                if (r4 != r5) goto L_0x02c8
                r4 = r8
                goto L_0x02c9
            L_0x02c8:
                r4 = r7
            L_0x02c9:
                if (r4 == 0) goto L_0x030f
                java.lang.CharSequence r4 = r1.mo18857g()
                if (r4 != 0) goto L_0x030f
                androidx.compose.ui.platform.AndroidComposeView r4 = r0.f3954a
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131952706(0x7f130442, float:1.9541862E38)
                java.lang.String r4 = r4.getString(r6)
                r1.mo18873v(r4)
                goto L_0x030f
            L_0x02e6:
                r1.mo18866p(r8)
                if (r2 != 0) goto L_0x02ec
                goto L_0x02f2
            L_0x02ec:
                int r4 = r2.f4226a
                if (r4 != r5) goto L_0x02f2
                r4 = r8
                goto L_0x02f3
            L_0x02f2:
                r4 = r7
            L_0x02f3:
                if (r4 == 0) goto L_0x030f
                java.lang.CharSequence r4 = r1.mo18857g()
                if (r4 != 0) goto L_0x030f
                androidx.compose.ui.platform.AndroidComposeView r4 = r0.f3954a
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131952710(0x7f130446, float:1.954187E38)
                java.lang.String r4 = r4.getString(r6)
                r1.mo18873v(r4)
            L_0x030f:
                kotlin.m r4 = kotlin.C19394m.f43287a
            L_0x0311:
                androidx.compose.ui.semantics.j r4 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.Boolean> r6 = androidx.compose.p015ui.semantics.SemanticsProperties.f4212w
                java.lang.Object r4 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r4, r6)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                if (r4 == 0) goto L_0x036a
                boolean r4 = r4.booleanValue()
                if (r2 != 0) goto L_0x0324
                goto L_0x032b
            L_0x0324:
                int r2 = r2.f4226a
                r6 = 4
                if (r2 != r6) goto L_0x032b
                r2 = r8
                goto L_0x032c
            L_0x032b:
                r2 = r7
            L_0x032c:
                if (r2 == 0) goto L_0x0334
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setSelected(r4)
                goto L_0x0368
            L_0x0334:
                r1.mo18865o(r8)
                r1.mo18866p(r4)
                java.lang.CharSequence r2 = r1.mo18857g()
                if (r2 != 0) goto L_0x0368
                if (r4 == 0) goto L_0x0354
                androidx.compose.ui.platform.AndroidComposeView r2 = r0.f3954a
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r4 = 2131953435(0x7f13071b, float:1.954334E38)
                java.lang.String r2 = r2.getString(r4)
                goto L_0x0365
            L_0x0354:
                androidx.compose.ui.platform.AndroidComposeView r2 = r0.f3954a
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r4 = 2131952695(0x7f130437, float:1.954184E38)
                java.lang.String r2 = r2.getString(r4)
            L_0x0365:
                r1.mo18873v(r2)
            L_0x0368:
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x036a:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                boolean r2 = r2.f4247c
                if (r2 == 0) goto L_0x037a
                java.util.List r2 = r3.mo7306e(r7)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0391
            L_0x037a:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.util.List<java.lang.String>> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4190a
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x038d
                java.lang.Object r2 = kotlin.collections.C19327t.m32640V0(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x038e
            L_0x038d:
                r2 = 0
            L_0x038e:
                r1.mo18870t(r2)
            L_0x0391:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                boolean r2 = r2.f4247c
                java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
                r6 = 28
                if (r2 == 0) goto L_0x03b7
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r6) goto L_0x03a5
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setScreenReaderFocusable(r8)
                goto L_0x03b7
            L_0x03a5:
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                android.os.Bundle r2 = r2.getExtras()
                if (r2 == 0) goto L_0x03b7
                int r9 = r2.getInt(r4, r7)
                r9 = r9 & -2
                r9 = r9 | r8
                r2.putInt(r4, r9)
            L_0x03b7:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.String> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4207r
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r9)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x03ea
                r9 = r3
            L_0x03c4:
                if (r9 == 0) goto L_0x03e2
                androidx.compose.ui.semantics.j r10 = r9.f4186e
                androidx.compose.ui.semantics.p<java.lang.Boolean> r11 = androidx.compose.p015ui.semantics.SemanticsPropertiesAndroid.f4216a
                boolean r10 = r10.mo7343c(r11)
                if (r10 == 0) goto L_0x03dd
                androidx.compose.ui.semantics.j r9 = r9.f4186e
                java.lang.Object r9 = r9.mo7344e(r11)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                goto L_0x03e3
            L_0x03dd:
                androidx.compose.ui.semantics.SemanticsNode r9 = r9.mo7308g()
                goto L_0x03c4
            L_0x03e2:
                r9 = r7
            L_0x03e3:
                if (r9 == 0) goto L_0x03ea
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setViewIdResourceName(r2)
            L_0x03ea:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<kotlin.m> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4197h
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r9)
                kotlin.m r2 = (kotlin.C19394m) r2
                if (r2 == 0) goto L_0x0414
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r6) goto L_0x0400
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setHeading(r8)
                goto L_0x0412
            L_0x0400:
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                android.os.Bundle r2 = r2.getExtras()
                if (r2 == 0) goto L_0x0412
                int r9 = r2.getInt(r4, r7)
                r9 = r9 & -3
                r9 = r9 | r5
                r2.putInt(r4, r9)
            L_0x0412:
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0414:
                androidx.compose.ui.semantics.j r2 = r3.mo7307f()
                androidx.compose.ui.semantics.p<kotlin.m> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4214y
                boolean r2 = r2.mo7343c(r4)
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setPassword(r2)
                boolean r2 = androidx.compose.p015ui.platform.C1875t.m4083f(r3)
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setEditable(r2)
                boolean r2 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setEnabled(r2)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.Boolean> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4200k
                boolean r2 = r2.mo7343c(r4)
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setFocusable(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                boolean r2 = r2.isFocusable()
                if (r2 == 0) goto L_0x046a
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                java.lang.Object r2 = r2.mo7344e(r4)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setFocused(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                boolean r2 = r2.isFocused()
                if (r2 == 0) goto L_0x0467
                r1.mo18850a(r5)
                goto L_0x046a
            L_0x0467:
                r1.mo18850a(r8)
            L_0x046a:
                boolean r2 = r3.f4184c
                if (r2 == 0) goto L_0x047b
                androidx.compose.ui.semantics.SemanticsNode r2 = r3.mo7308g()
                if (r2 == 0) goto L_0x0479
                androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.mo7304c()
                goto L_0x047f
            L_0x0479:
                r2 = 0
                goto L_0x047f
            L_0x047b:
                androidx.compose.ui.node.LayoutNodeWrapper r2 = r3.mo7304c()
            L_0x047f:
                if (r2 == 0) goto L_0x0486
                boolean r2 = r2.mo6799j1()
                goto L_0x0487
            L_0x0486:
                r2 = r7
            L_0x0487:
                if (r2 != 0) goto L_0x0495
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<kotlin.m> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4201l
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                if (r2 != 0) goto L_0x0495
                r2 = r8
                goto L_0x0496
            L_0x0495:
                r2 = r7
            L_0x0496:
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setVisibleToUser(r2)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.e> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4199j
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.e r2 = (androidx.compose.p015ui.semantics.C1898e) r2
                if (r2 == 0) goto L_0x04c1
                int r2 = r2.f4221a
                if (r2 != 0) goto L_0x04ad
                r4 = r8
                goto L_0x04ae
            L_0x04ad:
                r4 = r7
            L_0x04ae:
                if (r4 == 0) goto L_0x04b1
                goto L_0x04b9
            L_0x04b1:
                if (r2 != r8) goto L_0x04b5
                r2 = r8
                goto L_0x04b6
            L_0x04b5:
                r2 = r7
            L_0x04b6:
                if (r2 == 0) goto L_0x04b9
                goto L_0x04ba
            L_0x04b9:
                r5 = r8
            L_0x04ba:
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setLiveRegion(r5)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x04c1:
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setClickable(r7)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r4 = androidx.compose.p015ui.semantics.C1902i.f4231b
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                r4 = 16
                if (r2 == 0) goto L_0x04fd
                androidx.compose.ui.semantics.j r5 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.Boolean> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4212w
                java.lang.Object r5 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r5, r9)
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r9)
                r9 = r5 ^ 1
                android.view.accessibility.AccessibilityNodeInfo r10 = r1.f14759a
                r10.setClickable(r9)
                boolean r9 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r9 == 0) goto L_0x04fb
                if (r5 != 0) goto L_0x04fb
                e1.b$a r5 = new e1.b$a
                java.lang.String r2 = r2.f4217a
                r5.<init>((int) r4, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
            L_0x04fb:
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x04fd:
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                r2.setLongClickable(r7)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4232c
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                r5 = 32
                if (r2 == 0) goto L_0x0527
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setLongClickable(r8)
                boolean r9 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r9 == 0) goto L_0x0525
                e1.b$a r9 = new e1.b$a
                java.lang.String r2 = r2.f4217a
                r9.<init>((int) r5, (java.lang.CharSequence) r2)
                r1.mo18851b(r9)
            L_0x0525:
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0527:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4238i
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x0541
                e1.b$a r5 = new e1.b$a
                r9 = 16384(0x4000, float:2.2959E-41)
                java.lang.String r2 = r2.f4217a
                r5.<init>((int) r9, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0541:
                boolean r2 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r2 == 0) goto L_0x05b6
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<androidx.compose.ui.text.a, java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4237h
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x0561
                e1.b$a r5 = new e1.b$a
                r9 = 2097152(0x200000, float:2.938736E-39)
                java.lang.String r2 = r2.f4217a
                r5.<init>((int) r9, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0561:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4239j
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x057b
                e1.b$a r5 = new e1.b$a
                r9 = 65536(0x10000, float:9.18355E-41)
                java.lang.String r2 = r2.f4217a
                r5.<init>((int) r9, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x057b:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4240k
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x05b6
                android.view.accessibility.AccessibilityNodeInfo r5 = r1.f14759a
                boolean r5 = r5.isFocused()
                if (r5 == 0) goto L_0x05b4
                androidx.compose.ui.platform.AndroidComposeView r5 = r0.f3954a
                androidx.compose.ui.platform.k r5 = r5.getClipboardManager()
                android.content.ClipboardManager r5 = r5.f4101a
                android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
                if (r5 == 0) goto L_0x05a4
                java.lang.String r9 = "text/plain"
                boolean r5 = r5.hasMimeType(r9)
                goto L_0x05a5
            L_0x05a4:
                r5 = r7
            L_0x05a5:
                if (r5 == 0) goto L_0x05b4
                e1.b$a r5 = new e1.b$a
                r9 = 32768(0x8000, float:4.5918E-41)
                java.lang.String r2 = r2.f4217a
                r5.<init>((int) r9, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
            L_0x05b4:
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x05b6:
                java.lang.String r2 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3902h(r3)
                if (r2 == 0) goto L_0x05c5
                int r2 = r2.length()
                if (r2 != 0) goto L_0x05c3
                goto L_0x05c5
            L_0x05c3:
                r2 = r7
                goto L_0x05c6
            L_0x05c5:
                r2 = r8
            L_0x05c6:
                if (r2 != 0) goto L_0x0636
                int r2 = r0.mo7072f(r3)
                int r5 = r0.mo7071e(r3)
                android.view.accessibility.AccessibilityNodeInfo r9 = r1.f14759a
                r9.setTextSelection(r2, r5)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.q<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4236g
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                e1.b$a r5 = new e1.b$a
                r9 = 131072(0x20000, float:1.83671E-40)
                if (r2 == 0) goto L_0x05e8
                java.lang.String r2 = r2.f4217a
                goto L_0x05e9
            L_0x05e8:
                r2 = 0
            L_0x05e9:
                r5.<init>((int) r9, (java.lang.CharSequence) r2)
                r1.mo18851b(r5)
                r2 = 256(0x100, float:3.59E-43)
                r1.mo18850a(r2)
                r2 = 512(0x200, float:7.175E-43)
                r1.mo18850a(r2)
                r2 = 11
                android.view.accessibility.AccessibilityNodeInfo r5 = r1.f14759a
                r5.setMovementGranularities(r2)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.util.List<java.lang.String>> r5 = androidx.compose.p015ui.semantics.SemanticsProperties.f4190a
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0615
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0613
                goto L_0x0615
            L_0x0613:
                r2 = r7
                goto L_0x0616
            L_0x0615:
                r2 = r8
            L_0x0616:
                if (r2 == 0) goto L_0x0636
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.util.List<androidx.compose.ui.text.q>, java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4230a
                boolean r2 = r2.mo7343c(r5)
                if (r2 == 0) goto L_0x0636
                boolean r2 = androidx.compose.p015ui.platform.C1875t.m4079b(r3)
                if (r2 != 0) goto L_0x0636
                android.view.accessibility.AccessibilityNodeInfo r2 = r1.f14759a
                int r2 = r2.getMovementGranularities()
                r2 = r2 | 4
                r2 = r2 | r4
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setMovementGranularities(r2)
            L_0x0636:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.CharSequence r4 = r1.mo18858h()
                if (r4 == 0) goto L_0x064a
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0648
                goto L_0x064a
            L_0x0648:
                r4 = r7
                goto L_0x064b
            L_0x064a:
                r4 = r8
            L_0x064b:
                if (r4 != 0) goto L_0x065c
                androidx.compose.ui.semantics.j r4 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.util.List<androidx.compose.ui.text.q>, java.lang.Boolean>>> r5 = androidx.compose.p015ui.semantics.C1902i.f4230a
                boolean r4 = r4.mo7343c(r5)
                if (r4 == 0) goto L_0x065c
                java.lang.String r4 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
                r2.add(r4)
            L_0x065c:
                androidx.compose.ui.semantics.j r4 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.String> r5 = androidx.compose.p015ui.semantics.SemanticsProperties.f4207r
                boolean r4 = r4.mo7343c(r5)
                if (r4 == 0) goto L_0x066b
                java.lang.String r4 = "androidx.compose.ui.semantics.testTag"
                r2.add(r4)
            L_0x066b:
                boolean r4 = r2.isEmpty()
                if (r4 != 0) goto L_0x067d
                androidx.compose.ui.platform.i r4 = androidx.compose.p015ui.platform.C1838i.f4096a
                android.view.accessibility.AccessibilityNodeInfo r5 = r1.f14759a
                java.lang.String r9 = "info.unwrap()"
                kotlin.jvm.internal.C19383o.m32796f(r5, r9)
                r4.mo7262a(r5, r2)
            L_0x067d:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.f> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4192c
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.f r2 = (androidx.compose.p015ui.semantics.C1899f) r2
                r4 = 0
                if (r2 == 0) goto L_0x07d2
                androidx.compose.ui.semantics.j r5 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.lang.Float, java.lang.Boolean>>> r9 = androidx.compose.p015ui.semantics.C1902i.f4235f
                boolean r5 = r5.mo7343c(r9)
                if (r5 == 0) goto L_0x069a
                java.lang.String r5 = "android.widget.SeekBar"
                r1.mo18867q(r5)
                goto L_0x069f
            L_0x069a:
                java.lang.String r5 = "android.widget.ProgressBar"
                r1.mo18867q(r5)
            L_0x069f:
                androidx.compose.ui.semantics.f r5 = androidx.compose.p015ui.semantics.C1899f.f4222d
                if (r2 == r5) goto L_0x075a
                pq.e<java.lang.Float> r5 = r2.f4224b
                java.lang.Comparable r5 = r5.mo74309c()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                pq.e<java.lang.Float> r10 = r2.f4224b
                java.lang.Comparable r10 = r10.mo74311g()
                java.lang.Number r10 = (java.lang.Number) r10
                float r10 = r10.floatValue()
                float r11 = r2.f4223a
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r5 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r8, r5, r10, r11)
                android.view.accessibility.AccessibilityNodeInfo r10 = r1.f14759a
                r11 = r5
                android.view.accessibility.AccessibilityNodeInfo$RangeInfo r11 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r11
                r10.setRangeInfo(r5)
                java.lang.CharSequence r5 = r1.mo18857g()
                if (r5 != 0) goto L_0x0774
                pq.e<java.lang.Float> r5 = r2.f4224b
                java.lang.Comparable r10 = r5.mo74311g()
                java.lang.Number r10 = (java.lang.Number) r10
                float r10 = r10.floatValue()
                java.lang.Comparable r11 = r5.mo74309c()
                java.lang.Number r11 = (java.lang.Number) r11
                float r11 = r11.floatValue()
                float r10 = r10 - r11
                int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r10 != 0) goto L_0x06ec
                r10 = r8
                goto L_0x06ed
            L_0x06ec:
                r10 = r7
            L_0x06ed:
                if (r10 == 0) goto L_0x06f1
                r10 = r4
                goto L_0x0714
            L_0x06f1:
                float r10 = r2.f4223a
                java.lang.Comparable r11 = r5.mo74309c()
                java.lang.Number r11 = (java.lang.Number) r11
                float r11 = r11.floatValue()
                float r10 = r10 - r11
                java.lang.Comparable r11 = r5.mo74311g()
                java.lang.Number r11 = (java.lang.Number) r11
                float r11 = r11.floatValue()
                java.lang.Comparable r5 = r5.mo74309c()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                float r11 = r11 - r5
                float r10 = r10 / r11
            L_0x0714:
                r5 = 1065353216(0x3f800000, float:1.0)
                float r10 = kotlin.jvm.internal.C19388s.m32831L(r10, r4, r5)
                int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r11 != 0) goto L_0x0720
                r11 = r8
                goto L_0x0721
            L_0x0720:
                r11 = r7
            L_0x0721:
                r12 = 100
                if (r11 == 0) goto L_0x0727
                r12 = r7
                goto L_0x073d
            L_0x0727:
                int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r5 != 0) goto L_0x072d
                r5 = r8
                goto L_0x072e
            L_0x072d:
                r5 = r7
            L_0x072e:
                if (r5 == 0) goto L_0x0731
                goto L_0x073d
            L_0x0731:
                float r5 = (float) r12
                float r10 = r10 * r5
                int r5 = p173m.C7279a.m13954l(r10)
                r10 = 99
                int r12 = kotlin.jvm.internal.C19388s.m32833M(r5, r8, r10)
            L_0x073d:
                androidx.compose.ui.platform.AndroidComposeView r5 = r0.f3954a
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                r10 = 2131953643(0x7f1307eb, float:1.9543763E38)
                java.lang.Object[] r11 = new java.lang.Object[r8]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r7] = r12
                java.lang.String r5 = r5.getString(r10, r11)
                r1.mo18873v(r5)
                goto L_0x0774
            L_0x075a:
                java.lang.CharSequence r5 = r1.mo18857g()
                if (r5 != 0) goto L_0x0774
                androidx.compose.ui.platform.AndroidComposeView r5 = r0.f3954a
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                r10 = 2131952374(0x7f1302f6, float:1.9541189E38)
                java.lang.String r5 = r5.getString(r10)
                r1.mo18873v(r5)
            L_0x0774:
                androidx.compose.ui.semantics.j r5 = r3.f4186e
                boolean r5 = r5.mo7343c(r9)
                if (r5 == 0) goto L_0x07d2
                boolean r5 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r5 == 0) goto L_0x07d2
                float r5 = r2.f4223a
                pq.e<java.lang.Float> r9 = r2.f4224b
                java.lang.Comparable r9 = r9.mo74311g()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                pq.e<java.lang.Float> r10 = r2.f4224b
                java.lang.Comparable r10 = r10.mo74309c()
                java.lang.Number r10 = (java.lang.Number) r10
                float r10 = r10.floatValue()
                int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r11 >= 0) goto L_0x07a1
                r9 = r10
            L_0x07a1:
                int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r5 >= 0) goto L_0x07aa
                e1.b$a r5 = p088e1.C6689b.C6690a.f14768k
                r1.mo18851b(r5)
            L_0x07aa:
                float r5 = r2.f4223a
                pq.e<java.lang.Float> r9 = r2.f4224b
                java.lang.Comparable r9 = r9.mo74309c()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                pq.e<java.lang.Float> r2 = r2.f4224b
                java.lang.Comparable r2 = r2.mo74311g()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r10 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r10 <= 0) goto L_0x07c9
                r9 = r2
            L_0x07c9:
                int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r2 <= 0) goto L_0x07d2
                e1.b$a r2 = p088e1.C6689b.C6690a.f14769l
                r1.mo18851b(r2)
            L_0x07d2:
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C1764a.m3928a(r1, r3)
                androidx.compose.ui.semantics.j r2 = r3.mo7307f()
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.b> r5 = androidx.compose.p015ui.semantics.SemanticsProperties.f4195f
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.b r2 = (androidx.compose.p015ui.semantics.C1895b) r2
                if (r2 == 0) goto L_0x07ef
                int r5 = r2.f4219a
                int r2 = r2.f4220b
                e1.b$b r2 = p088e1.C6689b.C6691b.m13081a(r5, r2, r7)
                r1.mo18868r(r2)
                goto L_0x0845
            L_0x07ef:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                androidx.compose.ui.semantics.j r5 = r3.mo7307f()
                androidx.compose.ui.semantics.p<kotlin.m> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4194e
                java.lang.Object r5 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r5, r9)
                if (r5 == 0) goto L_0x0823
                java.util.List r5 = r3.mo7306e(r7)
                int r9 = r5.size()
                r10 = r7
            L_0x0809:
                if (r10 >= r9) goto L_0x0823
                java.lang.Object r11 = r5.get(r10)
                androidx.compose.ui.semantics.SemanticsNode r11 = (androidx.compose.p015ui.semantics.SemanticsNode) r11
                androidx.compose.ui.semantics.j r12 = r11.mo7307f()
                androidx.compose.ui.semantics.p<java.lang.Boolean> r13 = androidx.compose.p015ui.semantics.SemanticsProperties.f4212w
                boolean r12 = r12.mo7343c(r13)
                if (r12 == 0) goto L_0x0820
                r2.add(r11)
            L_0x0820:
                int r10 = r10 + 1
                goto L_0x0809
            L_0x0823:
                boolean r5 = r2.isEmpty()
                r5 = r5 ^ r8
                if (r5 == 0) goto L_0x0845
                boolean r5 = androidx.compose.p015ui.platform.accessibility.C1815a.m3959a(r2)
                if (r5 == 0) goto L_0x0832
                r9 = r8
                goto L_0x0836
            L_0x0832:
                int r9 = r2.size()
            L_0x0836:
                if (r5 == 0) goto L_0x083d
                int r2 = r2.size()
                goto L_0x083e
            L_0x083d:
                r2 = r8
            L_0x083e:
                e1.b$b r2 = p088e1.C6689b.C6691b.m13081a(r9, r2, r7)
                r1.mo18868r(r2)
            L_0x0845:
                androidx.compose.p015ui.platform.accessibility.C1815a.m3961c(r1, r3)
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r5 = androidx.compose.p015ui.semantics.SemanticsProperties.f4202m
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r5)
                androidx.compose.ui.semantics.h r2 = (androidx.compose.p015ui.semantics.C1901h) r2
                androidx.compose.ui.semantics.j r5 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r9 = androidx.compose.p015ui.semantics.C1902i.f4233d
                java.lang.Object r5 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r5, r9)
                androidx.compose.ui.semantics.a r5 = (androidx.compose.p015ui.semantics.C1894a) r5
                if (r2 == 0) goto L_0x08c4
                if (r5 == 0) goto L_0x08c4
                boolean r9 = androidx.compose.p015ui.platform.accessibility.C1815a.m3960b(r3)
                if (r9 != 0) goto L_0x086b
                java.lang.String r9 = "android.widget.HorizontalScrollView"
                r1.mo18867q(r9)
            L_0x086b:
                kq.a<java.lang.Float> r9 = r2.f4228b
                java.lang.Object r9 = r9.invoke()
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x087e
                r1.mo18872u(r8)
            L_0x087e:
                boolean r9 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r9 == 0) goto L_0x08c4
                boolean r9 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3907o(r2)
                if (r9 == 0) goto L_0x08a4
                e1.b$a r9 = p088e1.C6689b.C6690a.f14768k
                r1.mo18851b(r9)
                androidx.compose.ui.node.LayoutNode r9 = r3.f4188g
                androidx.compose.ui.unit.LayoutDirection r9 = r9.f3834s
                androidx.compose.ui.unit.LayoutDirection r10 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
                if (r9 != r10) goto L_0x0899
                r9 = r8
                goto L_0x089a
            L_0x0899:
                r9 = r7
            L_0x089a:
                if (r9 != 0) goto L_0x089f
                e1.b$a r9 = p088e1.C6689b.C6690a.f14776s
                goto L_0x08a1
            L_0x089f:
                e1.b$a r9 = p088e1.C6689b.C6690a.f14774q
            L_0x08a1:
                r1.mo18851b(r9)
            L_0x08a4:
                boolean r2 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3906n(r2)
                if (r2 == 0) goto L_0x08c4
                e1.b$a r2 = p088e1.C6689b.C6690a.f14769l
                r1.mo18851b(r2)
                androidx.compose.ui.node.LayoutNode r2 = r3.f4188g
                androidx.compose.ui.unit.LayoutDirection r2 = r2.f3834s
                androidx.compose.ui.unit.LayoutDirection r9 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
                if (r2 != r9) goto L_0x08b9
                r2 = r8
                goto L_0x08ba
            L_0x08b9:
                r2 = r7
            L_0x08ba:
                if (r2 != 0) goto L_0x08bf
                e1.b$a r2 = p088e1.C6689b.C6690a.f14774q
                goto L_0x08c1
            L_0x08bf:
                e1.b$a r2 = p088e1.C6689b.C6690a.f14776s
            L_0x08c1:
                r1.mo18851b(r2)
            L_0x08c4:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4203n
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r9)
                androidx.compose.ui.semantics.h r2 = (androidx.compose.p015ui.semantics.C1901h) r2
                if (r2 == 0) goto L_0x0916
                if (r5 == 0) goto L_0x0916
                boolean r5 = androidx.compose.p015ui.platform.accessibility.C1815a.m3960b(r3)
                if (r5 != 0) goto L_0x08dd
                java.lang.String r5 = "android.widget.ScrollView"
                r1.mo18867q(r5)
            L_0x08dd:
                kq.a<java.lang.Float> r5 = r2.f4228b
                java.lang.Object r5 = r5.invoke()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x08f0
                r1.mo18872u(r8)
            L_0x08f0:
                boolean r4 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r4 == 0) goto L_0x0916
                boolean r4 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3907o(r2)
                if (r4 == 0) goto L_0x0906
                e1.b$a r4 = p088e1.C6689b.C6690a.f14768k
                r1.mo18851b(r4)
                e1.b$a r4 = p088e1.C6689b.C6690a.f14775r
                r1.mo18851b(r4)
            L_0x0906:
                boolean r2 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3906n(r2)
                if (r2 == 0) goto L_0x0916
                e1.b$a r2 = p088e1.C6689b.C6690a.f14769l
                r1.mo18851b(r2)
                e1.b$a r2 = p088e1.C6689b.C6690a.f14773p
                r1.mo18851b(r2)
            L_0x0916:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.lang.String> r4 = androidx.compose.p015ui.semantics.SemanticsProperties.f4193d
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r6) goto L_0x092a
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                r4.setPaneTitle(r2)
                goto L_0x0935
            L_0x092a:
                android.view.accessibility.AccessibilityNodeInfo r4 = r1.f14759a
                android.os.Bundle r4 = r4.getExtras()
                java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r4.putCharSequence(r5, r2)
            L_0x0935:
                boolean r2 = androidx.compose.p015ui.platform.C1875t.m4078a(r3)
                if (r2 == 0) goto L_0x0a89
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r4 = androidx.compose.p015ui.semantics.C1902i.f4241l
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x0955
                e1.b$a r4 = new e1.b$a
                r5 = 262144(0x40000, float:3.67342E-40)
                java.lang.String r2 = r2.f4217a
                r4.<init>((int) r5, (java.lang.CharSequence) r2)
                r1.mo18851b(r4)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0955:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r4 = androidx.compose.p015ui.semantics.C1902i.f4242m
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x096f
                e1.b$a r4 = new e1.b$a
                r5 = 524288(0x80000, float:7.34684E-40)
                java.lang.String r2 = r2.f4217a
                r4.<init>((int) r5, (java.lang.CharSequence) r2)
                r1.mo18851b(r4)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x096f:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r4 = androidx.compose.p015ui.semantics.C1902i.f4243n
                java.lang.Object r2 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r2, r4)
                androidx.compose.ui.semantics.a r2 = (androidx.compose.p015ui.semantics.C1894a) r2
                if (r2 == 0) goto L_0x0989
                e1.b$a r4 = new e1.b$a
                r5 = 1048576(0x100000, float:1.469368E-39)
                java.lang.String r2 = r2.f4217a
                r4.<init>((int) r5, (java.lang.CharSequence) r2)
                r1.mo18851b(r4)
                kotlin.m r2 = kotlin.C19394m.f43287a
            L_0x0989:
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                androidx.compose.ui.semantics.p<java.util.List<androidx.compose.ui.semantics.d>> r4 = androidx.compose.p015ui.semantics.C1902i.f4245p
                boolean r2 = r2.mo7343c(r4)
                if (r2 == 0) goto L_0x0a89
                androidx.compose.ui.semantics.j r2 = r3.f4186e
                java.lang.Object r2 = r2.mo7344e(r4)
                java.util.List r2 = (java.util.List) r2
                int r3 = r2.size()
                int[] r4 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f3953w
                r5 = 32
                if (r3 >= r5) goto L_0x0a81
                o.j r3 = new o.j
                r3.<init>()
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                o.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r6 = r0.f3961h
                boolean r6 = r6.mo19990c(r15)
                if (r6 == 0) goto L_0x0a4d
                o.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r6 = r0.f3961h
                r8 = 0
                java.lang.Object r6 = r6.mo19993f(r15, r8)
                java.util.Map r6 = (java.util.Map) r6
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 32
                r8.<init>(r9)
                r10 = r7
            L_0x09c8:
                if (r10 >= r9) goto L_0x09d6
                r11 = r4[r10]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r8.add(r11)
                int r10 = r10 + 1
                goto L_0x09c8
            L_0x09d6:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                int r9 = r2.size()
                r10 = r7
            L_0x09e0:
                if (r10 >= r9) goto L_0x0a1e
                java.lang.Object r11 = r2.get(r10)
                androidx.compose.ui.semantics.d r11 = (androidx.compose.p015ui.semantics.C1897d) r11
                kotlin.jvm.internal.C19383o.m32794d(r6)
                r11.getClass()
                r12 = 0
                boolean r13 = r6.containsKey(r12)
                if (r13 == 0) goto L_0x0a18
                java.lang.Object r11 = r6.get(r12)
                java.lang.Integer r11 = (java.lang.Integer) r11
                kotlin.jvm.internal.C19383o.m32794d(r11)
                int r13 = r11.intValue()
                r3.mo19994h(r13, r12)
                r5.put(r12, r11)
                r8.remove(r11)
                e1.b$a r13 = new e1.b$a
                int r11 = r11.intValue()
                r13.<init>((int) r11, (java.lang.CharSequence) r12)
                r1.mo18851b(r13)
                goto L_0x0a1b
            L_0x0a18:
                r4.add(r11)
            L_0x0a1b:
                int r10 = r10 + 1
                goto L_0x09e0
            L_0x0a1e:
                int r2 = r4.size()
            L_0x0a22:
                if (r7 >= r2) goto L_0x0a76
                java.lang.Object r6 = r4.get(r7)
                androidx.compose.ui.semantics.d r6 = (androidx.compose.p015ui.semantics.C1897d) r6
                java.lang.Object r9 = r8.get(r7)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                r6.getClass()
                r6 = 0
                r3.mo19994h(r9, r6)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r5.put(r6, r10)
                e1.b$a r10 = new e1.b$a
                r10.<init>((int) r9, (java.lang.CharSequence) r6)
                r1.mo18851b(r10)
                int r7 = r7 + 1
                goto L_0x0a22
            L_0x0a4d:
                int r4 = r2.size()
            L_0x0a51:
                if (r7 >= r4) goto L_0x0a76
                java.lang.Object r6 = r2.get(r7)
                androidx.compose.ui.semantics.d r6 = (androidx.compose.p015ui.semantics.C1897d) r6
                int[] r8 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f3953w
                r8 = r8[r7]
                r6.getClass()
                r6 = 0
                r3.mo19994h(r8, r6)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r5.put(r6, r9)
                e1.b$a r9 = new e1.b$a
                r9.<init>((int) r8, (java.lang.CharSequence) r6)
                r1.mo18851b(r9)
                int r7 = r7 + 1
                goto L_0x0a51
            L_0x0a76:
                o.j<o.j<java.lang.CharSequence>> r2 = r0.f3960g
                r2.mo19994h(r15, r3)
                o.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r0 = r0.f3961h
                r0.mo19994h(r15, r5)
                goto L_0x0a89
            L_0x0a81:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "Can't have more than 32 custom actions for one widget"
                r15.<init>(r0)
                throw r15
            L_0x0a89:
                android.view.accessibility.AccessibilityNodeInfo r15 = r1.f14759a
            L_0x0a8b:
                return r15
            L_0x0a8c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "semanticsNode "
                java.lang.String r2 = " has null parent"
                java.lang.String r15 = android.support.p013v4.media.C0069a.m175f(r1, r15, r2)
                r0.<init>(r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.MyNodeProvider.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x028f  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x0291  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0296  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0298  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x029e  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x02a0  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x02a8  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x02ae  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x02b0  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x02b6  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x02b8  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0309  */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0326  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x032c  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x032f  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x0335  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x033c  */
        /* JADX WARNING: Removed duplicated region for block: B:369:0x0652  */
        /* JADX WARNING: Removed duplicated region for block: B:370:0x0655  */
        /* JADX WARNING: Removed duplicated region for block: B:393:0x00cd A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5 A[ADDED_TO_REGION] */
        public boolean performAction(int r17, int r18, android.os.Bundle r19) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r16
                r3 = r19
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this
                int[] r5 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f3953w
                java.util.Map r5 = r4.mo7073g()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
                java.lang.Object r5 = r5.get(r6)
                androidx.compose.ui.platform.a1 r5 = (androidx.compose.p015ui.platform.C1814a1) r5
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L_0x06ab
                androidx.compose.ui.semantics.SemanticsNode r5 = r5.f4067a
                if (r5 != 0) goto L_0x0024
                goto L_0x06ab
            L_0x0024:
                r8 = 64
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                r10 = 65536(0x10000, float:9.18355E-41)
                r11 = 12
                r12 = 0
                if (r1 == r8) goto L_0x0686
                r8 = 128(0x80, float:1.794E-43)
                if (r1 == r8) goto L_0x0671
                r8 = 2
                r9 = -1
                r10 = 256(0x100, float:3.59E-43)
                r13 = 512(0x200, float:7.175E-43)
                if (r1 == r10) goto L_0x04a1
                if (r1 == r13) goto L_0x04a1
                r10 = 16384(0x4000, float:2.2959E-41)
                if (r1 == r10) goto L_0x0483
                r10 = 131072(0x20000, float:1.83671E-40)
                if (r1 == r10) goto L_0x0460
                boolean r9 = androidx.compose.p015ui.platform.C1875t.m4078a(r5)
                if (r9 != 0) goto L_0x004d
                goto L_0x06ab
            L_0x004d:
                if (r1 == r6) goto L_0x0442
                if (r1 == r8) goto L_0x0426
                switch(r1) {
                    case 16: goto L_0x0266;
                    case 32: goto L_0x0248;
                    case 4096: goto L_0x028b;
                    case 8192: goto L_0x028b;
                    case 32768: goto L_0x022a;
                    case 65536: goto L_0x020c;
                    case 262144: goto L_0x01ee;
                    case 524288: goto L_0x01d0;
                    case 1048576: goto L_0x01b2;
                    case 2097152: goto L_0x0180;
                    case 16908342: goto L_0x009d;
                    case 16908349: goto L_0x006b;
                    default: goto L_0x0054;
                }
            L_0x0054:
                switch(r1) {
                    case 16908344: goto L_0x028b;
                    case 16908345: goto L_0x028b;
                    case 16908346: goto L_0x028b;
                    case 16908347: goto L_0x028b;
                    default: goto L_0x0057;
                }
            L_0x0057:
                o.j<o.j<java.lang.CharSequence>> r3 = r4.f3960g
                java.lang.Object r0 = r3.mo19993f(r0, r12)
                o.j r0 = (p193o.C7507j) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.mo19993f(r1, r12)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 != 0) goto L_0x03fe
                goto L_0x06ab
            L_0x006b:
                if (r3 == 0) goto L_0x06ab
                java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r1 = r3.containsKey(r0)
                if (r1 != 0) goto L_0x0077
                goto L_0x06ab
            L_0x0077:
                androidx.compose.ui.semantics.j r1 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.lang.Float, java.lang.Boolean>>> r4 = androidx.compose.p015ui.semantics.C1902i.f4235f
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r4)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.p015ui.semantics.C1894a) r1
                if (r1 == 0) goto L_0x06ab
                T r1 = r1.f4218b
                kq.l r1 = (p753kq.C19857l) r1
                if (r1 == 0) goto L_0x06ab
                float r0 = r3.getFloat(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = r1.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x009d:
                androidx.compose.ui.semantics.SemanticsNode r0 = r5.mo7308g()
                if (r0 == 0) goto L_0x00b2
                androidx.compose.ui.semantics.j r1 = r0.mo7307f()
                if (r1 == 0) goto L_0x00b2
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r3 = androidx.compose.p015ui.semantics.C1902i.f4233d
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r3)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.p015ui.semantics.C1894a) r1
                goto L_0x00b3
            L_0x00b2:
                r1 = r12
            L_0x00b3:
                if (r0 == 0) goto L_0x00cd
                if (r1 == 0) goto L_0x00b8
                goto L_0x00cd
            L_0x00b8:
                androidx.compose.ui.semantics.SemanticsNode r0 = r0.mo7308g()
                if (r0 == 0) goto L_0x00b2
                androidx.compose.ui.semantics.j r1 = r0.mo7307f()
                if (r1 == 0) goto L_0x00b2
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r3 = androidx.compose.p015ui.semantics.C1902i.f4233d
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r3)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.p015ui.semantics.C1894a) r1
                goto L_0x00b3
            L_0x00cd:
                if (r0 != 0) goto L_0x00d1
                goto L_0x06ab
            L_0x00d1:
                androidx.compose.ui.node.LayoutNode r3 = r0.f4188g
                androidx.compose.ui.node.d r3 = r3.f3800D
                y.d r3 = androidx.activity.C0114h.m274E(r3)
                androidx.compose.ui.node.LayoutNode r4 = r0.f4188g
                androidx.compose.ui.node.d r4 = r4.f3800D
                androidx.compose.ui.node.LayoutNodeWrapper r4 = r4.mo6682O()
                if (r4 == 0) goto L_0x00e8
                long r8 = androidx.activity.C0114h.m320t0(r4)
                goto L_0x00ea
            L_0x00e8:
                long r8 = p288y.C8343c.f18295b
            L_0x00ea:
                y.d r3 = r3.mo20930e(r8)
                androidx.compose.ui.node.LayoutNode r4 = r5.f4188g
                boolean r4 = r4.mo6696c()
                if (r4 != 0) goto L_0x00f9
                long r8 = p288y.C8343c.f18295b
                goto L_0x0101
            L_0x00f9:
                androidx.compose.ui.node.LayoutNodeWrapper r4 = r5.mo7304c()
                long r8 = androidx.activity.C0114h.m320t0(r4)
            L_0x0101:
                androidx.compose.ui.node.LayoutNodeWrapper r4 = r5.mo7304c()
                long r10 = r4.f3724d
                long r10 = androidx.compose.foundation.layout.C0761x.m1698V0(r10)
                y.d r4 = p001a0.C0005b.m40h(r8, r10)
                androidx.compose.ui.semantics.j r8 = r0.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4202m
                java.lang.Object r8 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r8, r9)
                androidx.compose.ui.semantics.h r8 = (androidx.compose.p015ui.semantics.C1901h) r8
                androidx.compose.ui.semantics.j r0 = r0.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r9 = androidx.compose.p015ui.semantics.SemanticsProperties.f4203n
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r9)
                androidx.compose.ui.semantics.h r0 = (androidx.compose.p015ui.semantics.C1901h) r0
                float r9 = r4.f18301a
                float r10 = r3.f18301a
                float r9 = r9 - r10
                float r10 = r4.f18303c
                float r11 = r3.f18303c
                float r10 = r10 - r11
                float r9 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3905m(r9, r10)
                if (r8 == 0) goto L_0x0139
                boolean r8 = r8.f4229c
                if (r8 != r6) goto L_0x0139
                r8 = r6
                goto L_0x013a
            L_0x0139:
                r8 = r7
            L_0x013a:
                if (r8 == 0) goto L_0x013d
                float r9 = -r9
            L_0x013d:
                androidx.compose.ui.node.LayoutNode r5 = r5.f4188g
                androidx.compose.ui.unit.LayoutDirection r5 = r5.f3834s
                androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
                if (r5 != r8) goto L_0x0147
                r5 = r6
                goto L_0x0148
            L_0x0147:
                r5 = r7
            L_0x0148:
                if (r5 == 0) goto L_0x014b
                float r9 = -r9
            L_0x014b:
                float r5 = r4.f18302b
                float r8 = r3.f18302b
                float r5 = r5 - r8
                float r4 = r4.f18304d
                float r3 = r3.f18304d
                float r4 = r4 - r3
                float r3 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3905m(r5, r4)
                if (r0 == 0) goto L_0x0160
                boolean r0 = r0.f4229c
                if (r0 != r6) goto L_0x0160
                goto L_0x0161
            L_0x0160:
                r6 = r7
            L_0x0161:
                if (r6 == 0) goto L_0x0164
                float r3 = -r3
            L_0x0164:
                if (r1 == 0) goto L_0x06ab
                T r0 = r1.f4218b
                kq.p r0 = (p753kq.C19861p) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Float r1 = java.lang.Float.valueOf(r9)
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                java.lang.Object r0 = r0.invoke(r1, r3)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x0180:
                if (r3 == 0) goto L_0x0189
                java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
                java.lang.String r0 = r3.getString(r0)
                goto L_0x018a
            L_0x0189:
                r0 = r12
            L_0x018a:
                androidx.compose.ui.semantics.j r1 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<androidx.compose.ui.text.a, java.lang.Boolean>>> r3 = androidx.compose.p015ui.semantics.C1902i.f4237h
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r3)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.p015ui.semantics.C1894a) r1
                if (r1 == 0) goto L_0x06ab
                T r1 = r1.f4218b
                kq.l r1 = (p753kq.C19857l) r1
                if (r1 == 0) goto L_0x06ab
                androidx.compose.ui.text.a r3 = new androidx.compose.ui.text.a
                if (r0 != 0) goto L_0x01a2
                java.lang.String r0 = ""
            L_0x01a2:
                r4 = 6
                r3.<init>(r0, r12, r4)
                java.lang.Object r0 = r1.invoke(r3)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x01b2:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4243n
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x01d0:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4242m
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x01ee:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4241l
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x020c:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4239j
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x022a:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4240k
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x0248:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4232c
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x0266:
                androidx.compose.ui.semantics.j r1 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r3 = androidx.compose.p015ui.semantics.C1902i.f4231b
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r3)
                androidx.compose.ui.semantics.a r1 = (androidx.compose.p015ui.semantics.C1894a) r1
                if (r1 == 0) goto L_0x027f
                T r1 = r1.f4218b
                kq.a r1 = (p753kq.C19846a) r1
                if (r1 == 0) goto L_0x027f
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L_0x0280
            L_0x027f:
                r1 = r12
            L_0x0280:
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r0, r6, r12, r11)
                if (r1 == 0) goto L_0x06ab
                boolean r6 = r1.booleanValue()
                goto L_0x06ac
            L_0x028b:
                r0 = 4096(0x1000, float:5.74E-42)
                if (r1 != r0) goto L_0x0291
                r0 = r6
                goto L_0x0292
            L_0x0291:
                r0 = r7
            L_0x0292:
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r1 != r3) goto L_0x0298
                r3 = r6
                goto L_0x0299
            L_0x0298:
                r3 = r7
            L_0x0299:
                r4 = 16908345(0x1020039, float:2.387739E-38)
                if (r1 != r4) goto L_0x02a0
                r4 = r6
                goto L_0x02a1
            L_0x02a0:
                r4 = r7
            L_0x02a1:
                r8 = 16908347(0x102003b, float:2.3877394E-38)
                if (r1 != r8) goto L_0x02a8
                r8 = r6
                goto L_0x02a9
            L_0x02a8:
                r8 = r7
            L_0x02a9:
                r9 = 16908344(0x1020038, float:2.3877386E-38)
                if (r1 != r9) goto L_0x02b0
                r9 = r6
                goto L_0x02b1
            L_0x02b0:
                r9 = r7
            L_0x02b1:
                r10 = 16908346(0x102003a, float:2.3877392E-38)
                if (r1 != r10) goto L_0x02b8
                r1 = r6
                goto L_0x02b9
            L_0x02b8:
                r1 = r7
            L_0x02b9:
                if (r4 != 0) goto L_0x02c4
                if (r8 != 0) goto L_0x02c4
                if (r0 != 0) goto L_0x02c4
                if (r3 == 0) goto L_0x02c2
                goto L_0x02c4
            L_0x02c2:
                r10 = r7
                goto L_0x02c5
            L_0x02c4:
                r10 = r6
            L_0x02c5:
                if (r9 != 0) goto L_0x02d0
                if (r1 != 0) goto L_0x02d0
                if (r0 != 0) goto L_0x02d0
                if (r3 == 0) goto L_0x02ce
                goto L_0x02d0
            L_0x02ce:
                r1 = r7
                goto L_0x02d1
            L_0x02d0:
                r1 = r6
            L_0x02d1:
                if (r0 != 0) goto L_0x02d5
                if (r3 == 0) goto L_0x034f
            L_0x02d5:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.f> r11 = androidx.compose.p015ui.semantics.SemanticsProperties.f4192c
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r11)
                androidx.compose.ui.semantics.f r0 = (androidx.compose.p015ui.semantics.C1899f) r0
                androidx.compose.ui.semantics.j r11 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.lang.Float, java.lang.Boolean>>> r12 = androidx.compose.p015ui.semantics.C1902i.f4235f
                java.lang.Object r11 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r11, r12)
                androidx.compose.ui.semantics.a r11 = (androidx.compose.p015ui.semantics.C1894a) r11
                if (r0 == 0) goto L_0x034f
                if (r11 == 0) goto L_0x034f
                pq.e<java.lang.Float> r1 = r0.f4224b
                java.lang.Comparable r1 = r1.mo74311g()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                pq.e<java.lang.Float> r4 = r0.f4224b
                java.lang.Comparable r4 = r4.mo74309c()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x030a
                r1 = r4
            L_0x030a:
                pq.e<java.lang.Float> r4 = r0.f4224b
                java.lang.Comparable r4 = r4.mo74309c()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                pq.e<java.lang.Float> r5 = r0.f4224b
                java.lang.Comparable r5 = r5.mo74311g()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r8 <= 0) goto L_0x0327
                r4 = r5
            L_0x0327:
                int r5 = r0.f4225c
                float r1 = r1 - r4
                if (r5 <= 0) goto L_0x032f
                int r5 = r5 + r6
                float r4 = (float) r5
                goto L_0x0332
            L_0x032f:
                r4 = 20
                float r4 = (float) r4
            L_0x0332:
                float r1 = r1 / r4
                if (r3 == 0) goto L_0x0336
                float r1 = -r1
            L_0x0336:
                T r3 = r11.f4218b
                kq.l r3 = (p753kq.C19857l) r3
                if (r3 == 0) goto L_0x06ab
                float r0 = r0.f4223a
                float r0 = r0 + r1
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x034f:
                androidx.compose.ui.node.LayoutNode r0 = r5.f4188g
                androidx.compose.ui.node.d r0 = r0.f3800D
                y.d r0 = androidx.activity.C0114h.m274E(r0)
                float r11 = r0.f18303c
                float r12 = r0.f18301a
                float r11 = r11 - r12
                float r12 = r0.f18304d
                float r0 = r0.f18302b
                float r12 = r12 - r0
                long r11 = androidx.activity.C0114h.m319t(r11, r12)
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r13 = androidx.compose.p015ui.semantics.C1902i.f4233d
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r13)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 != 0) goto L_0x0373
                goto L_0x06ab
            L_0x0373:
                androidx.compose.ui.semantics.j r13 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r14 = androidx.compose.p015ui.semantics.SemanticsProperties.f4202m
                java.lang.Object r13 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r13, r14)
                androidx.compose.ui.semantics.h r13 = (androidx.compose.p015ui.semantics.C1901h) r13
                r14 = 0
                if (r13 == 0) goto L_0x03c2
                if (r10 == 0) goto L_0x03c2
                float r10 = p288y.C8347f.m16656d(r11)
                if (r4 != 0) goto L_0x038a
                if (r3 == 0) goto L_0x038b
            L_0x038a:
                float r10 = -r10
            L_0x038b:
                boolean r15 = r13.f4229c
                if (r15 == 0) goto L_0x0390
                float r10 = -r10
            L_0x0390:
                androidx.compose.ui.node.LayoutNode r15 = r5.f4188g
                androidx.compose.ui.unit.LayoutDirection r15 = r15.f3834s
                androidx.compose.ui.unit.LayoutDirection r6 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
                if (r15 != r6) goto L_0x039a
                r6 = 1
                goto L_0x039b
            L_0x039a:
                r6 = r7
            L_0x039b:
                if (r6 == 0) goto L_0x03a2
                if (r4 != 0) goto L_0x03a1
                if (r8 == 0) goto L_0x03a2
            L_0x03a1:
                float r10 = -r10
            L_0x03a2:
                boolean r4 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3904l(r13, r10)
                if (r4 == 0) goto L_0x03c2
                T r0 = r0.f4218b
                kq.p r0 = (p753kq.C19861p) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Float r1 = java.lang.Float.valueOf(r10)
                java.lang.Float r3 = java.lang.Float.valueOf(r14)
                java.lang.Object r0 = r0.invoke(r1, r3)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x03c2:
                androidx.compose.ui.semantics.j r4 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r5 = androidx.compose.p015ui.semantics.SemanticsProperties.f4203n
                java.lang.Object r4 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r4, r5)
                androidx.compose.ui.semantics.h r4 = (androidx.compose.p015ui.semantics.C1901h) r4
                if (r4 == 0) goto L_0x06ab
                if (r1 == 0) goto L_0x06ab
                float r1 = p288y.C8347f.m16654b(r11)
                if (r9 != 0) goto L_0x03d8
                if (r3 == 0) goto L_0x03d9
            L_0x03d8:
                float r1 = -r1
            L_0x03d9:
                boolean r3 = r4.f4229c
                if (r3 == 0) goto L_0x03de
                float r1 = -r1
            L_0x03de:
                boolean r3 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3904l(r4, r1)
                if (r3 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.p r0 = (p753kq.C19861p) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Float r3 = java.lang.Float.valueOf(r14)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                java.lang.Object r0 = r0.invoke(r3, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x03fe:
                androidx.compose.ui.semantics.j r1 = r5.f4186e
                androidx.compose.ui.semantics.p<java.util.List<androidx.compose.ui.semantics.d>> r3 = androidx.compose.p015ui.semantics.C1902i.f4245p
                java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r3)
                java.util.List r1 = (java.util.List) r1
                if (r1 != 0) goto L_0x040c
                goto L_0x06ab
            L_0x040c:
                int r3 = r1.size()
                r4 = r7
            L_0x0411:
                if (r4 >= r3) goto L_0x06ab
                java.lang.Object r5 = r1.get(r4)
                androidx.compose.ui.semantics.d r5 = (androidx.compose.p015ui.semantics.C1897d) r5
                r5.getClass()
                boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r12, r0)
                if (r5 != 0) goto L_0x0425
                int r4 = r4 + 1
                goto L_0x0411
            L_0x0425:
                throw r12
            L_0x0426:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<java.lang.Boolean> r1 = androidx.compose.p015ui.semantics.SemanticsProperties.f4200k
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
                if (r0 == 0) goto L_0x06ab
                androidx.compose.ui.platform.AndroidComposeView r0 = r4.f3954a
                androidx.compose.ui.focus.d r0 = r0.getFocusManager()
                r0.mo6185b(r7)
                r15 = 1
                goto L_0x06a9
            L_0x0442:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4244o
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x0460:
                if (r3 == 0) goto L_0x0469
                java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
                int r0 = r3.getInt(r0, r9)
                goto L_0x046a
            L_0x0469:
                r0 = r9
            L_0x046a:
                if (r3 == 0) goto L_0x0472
                java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
                int r9 = r3.getInt(r1, r9)
            L_0x0472:
                boolean r6 = r4.mo7084x(r5, r0, r9, r7)
                if (r6 == 0) goto L_0x06ac
                int r0 = r5.f4187f
                int r0 = r4.mo7077p(r0)
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r0, r7, r12, r11)
                goto L_0x06ac
            L_0x0483:
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.a<java.lang.Boolean>>> r1 = androidx.compose.p015ui.semantics.C1902i.f4238i
                java.lang.Object r0 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r0, r1)
                androidx.compose.ui.semantics.a r0 = (androidx.compose.p015ui.semantics.C1894a) r0
                if (r0 == 0) goto L_0x06ab
                T r0 = r0.f4218b
                kq.a r0 = (p753kq.C19846a) r0
                if (r0 == 0) goto L_0x06ab
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r6 = r0.booleanValue()
                goto L_0x06ac
            L_0x04a1:
                if (r3 == 0) goto L_0x06ab
                java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
                int r11 = r3.getInt(r0)
                java.lang.String r0 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
                boolean r0 = r3.getBoolean(r0)
                if (r1 != r10) goto L_0x04b3
                r1 = 1
                goto L_0x04b4
            L_0x04b3:
                r1 = r7
            L_0x04b4:
                int r3 = r5.f4187f
                java.lang.Integer r6 = r4.f3963j
                if (r6 != 0) goto L_0x04bb
                goto L_0x04c1
            L_0x04bb:
                int r6 = r6.intValue()
                if (r3 == r6) goto L_0x04cb
            L_0x04c1:
                r4.f3962i = r9
                int r3 = r5.f4187f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.f3963j = r3
            L_0x04cb:
                java.lang.String r3 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3902h(r5)
                if (r3 == 0) goto L_0x04da
                int r6 = r3.length()
                if (r6 != 0) goto L_0x04d8
                goto L_0x04da
            L_0x04d8:
                r6 = r7
                goto L_0x04db
            L_0x04da:
                r6 = 1
            L_0x04db:
                if (r6 == 0) goto L_0x04df
                goto L_0x06ab
            L_0x04df:
                java.lang.String r6 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3902h(r5)
                if (r6 == 0) goto L_0x04ee
                int r14 = r6.length()
                if (r14 != 0) goto L_0x04ec
                goto L_0x04ee
            L_0x04ec:
                r14 = r7
                goto L_0x04ef
            L_0x04ee:
                r14 = 1
            L_0x04ef:
                if (r14 == 0) goto L_0x04f3
                goto L_0x05fa
            L_0x04f3:
                java.lang.String r14 = "view.context.resources.configuration.locale"
                r15 = 1
                if (r11 == r15) goto L_0x05d5
                if (r11 == r8) goto L_0x05a7
                r8 = 4
                java.lang.String r14 = "text"
                if (r11 == r8) goto L_0x0527
                r15 = 8
                if (r11 == r15) goto L_0x0509
                r15 = 16
                if (r11 == r15) goto L_0x0527
                goto L_0x05fa
            L_0x0509:
                androidx.compose.ui.platform.e r8 = androidx.compose.p015ui.platform.C1826e.f4087c
                if (r8 != 0) goto L_0x0514
                androidx.compose.ui.platform.e r8 = new androidx.compose.ui.platform.e
                r8.<init>(r7)
                androidx.compose.p015ui.platform.C1826e.f4087c = r8
            L_0x0514:
                androidx.compose.ui.platform.e r12 = androidx.compose.p015ui.platform.C1826e.f4087c
                if (r12 == 0) goto L_0x051f
                kotlin.jvm.internal.C19383o.m32797g(r6, r14)
                r12.f4064a = r6
                goto L_0x05fa
            L_0x051f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"
                r0.<init>(r1)
                throw r0
            L_0x0527:
                androidx.compose.ui.semantics.j r15 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.a<kq.l<java.util.List<androidx.compose.ui.text.q>, java.lang.Boolean>>> r10 = androidx.compose.p015ui.semantics.C1902i.f4230a
                boolean r15 = r15.mo7343c(r10)
                if (r15 != 0) goto L_0x0533
                goto L_0x05fa
            L_0x0533:
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                androidx.compose.ui.semantics.j r13 = r5.f4186e
                java.lang.Object r10 = r13.mo7344e(r10)
                androidx.compose.ui.semantics.a r10 = (androidx.compose.p015ui.semantics.C1894a) r10
                T r10 = r10.f4218b
                kq.l r10 = (p753kq.C19857l) r10
                if (r10 == 0) goto L_0x054d
                java.lang.Object r10 = r10.invoke(r15)
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                goto L_0x054e
            L_0x054d:
                r10 = r12
            L_0x054e:
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r13)
                if (r10 == 0) goto L_0x05fa
                java.lang.Object r10 = r15.get(r7)
                androidx.compose.ui.text.q r10 = (androidx.compose.p015ui.text.C2021q) r10
                java.lang.String r12 = "layoutResult"
                if (r11 != r8) goto L_0x0582
                androidx.compose.ui.platform.c r8 = androidx.compose.p015ui.platform.C1820c.f4073d
                if (r8 != 0) goto L_0x056b
                androidx.compose.ui.platform.c r8 = new androidx.compose.ui.platform.c
                r8.<init>()
                androidx.compose.p015ui.platform.C1820c.f4073d = r8
            L_0x056b:
                androidx.compose.ui.platform.c r8 = androidx.compose.p015ui.platform.C1820c.f4073d
                if (r8 == 0) goto L_0x057a
                kotlin.jvm.internal.C19383o.m32797g(r6, r14)
                kotlin.jvm.internal.C19383o.m32797g(r10, r12)
                r8.f4064a = r6
                r8.f4076c = r10
                goto L_0x059d
            L_0x057a:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"
                r0.<init>(r1)
                throw r0
            L_0x0582:
                androidx.compose.ui.platform.d r8 = androidx.compose.p015ui.platform.C1823d.f4079e
                if (r8 != 0) goto L_0x058d
                androidx.compose.ui.platform.d r8 = new androidx.compose.ui.platform.d
                r8.<init>()
                androidx.compose.p015ui.platform.C1823d.f4079e = r8
            L_0x058d:
                androidx.compose.ui.platform.d r8 = androidx.compose.p015ui.platform.C1823d.f4079e
                if (r8 == 0) goto L_0x059f
                kotlin.jvm.internal.C19383o.m32797g(r6, r14)
                kotlin.jvm.internal.C19383o.m32797g(r10, r12)
                r8.f4064a = r6
                r8.f4082c = r10
                r8.f4083d = r5
            L_0x059d:
                r12 = r8
                goto L_0x05fa
            L_0x059f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"
                r0.<init>(r1)
                throw r0
            L_0x05a7:
                androidx.compose.ui.platform.AndroidComposeView r8 = r4.f3954a
                android.content.Context r8 = r8.getContext()
                android.content.res.Resources r8 = r8.getResources()
                android.content.res.Configuration r8 = r8.getConfiguration()
                java.util.Locale r8 = r8.locale
                kotlin.jvm.internal.C19383o.m32796f(r8, r14)
                androidx.compose.ui.platform.g r10 = androidx.compose.p015ui.platform.C1832g.f4091d
                if (r10 != 0) goto L_0x05c5
                androidx.compose.ui.platform.g r10 = new androidx.compose.ui.platform.g
                r10.<init>(r8)
                androidx.compose.p015ui.platform.C1832g.f4091d = r10
            L_0x05c5:
                androidx.compose.ui.platform.g r12 = androidx.compose.p015ui.platform.C1832g.f4091d
                if (r12 == 0) goto L_0x05cd
                r12.mo7219e(r6)
                goto L_0x05fa
            L_0x05cd:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"
                r0.<init>(r1)
                throw r0
            L_0x05d5:
                androidx.compose.ui.platform.AndroidComposeView r8 = r4.f3954a
                android.content.Context r8 = r8.getContext()
                android.content.res.Resources r8 = r8.getResources()
                android.content.res.Configuration r8 = r8.getConfiguration()
                java.util.Locale r8 = r8.locale
                kotlin.jvm.internal.C19383o.m32796f(r8, r14)
                androidx.compose.ui.platform.b r10 = androidx.compose.p015ui.platform.C1817b.f4071d
                if (r10 != 0) goto L_0x05f3
                androidx.compose.ui.platform.b r10 = new androidx.compose.ui.platform.b
                r10.<init>(r8)
                androidx.compose.p015ui.platform.C1817b.f4071d = r10
            L_0x05f3:
                androidx.compose.ui.platform.b r12 = androidx.compose.p015ui.platform.C1817b.f4071d
                if (r12 == 0) goto L_0x0669
                r12.mo7196e(r6)
            L_0x05fa:
                if (r12 != 0) goto L_0x05fe
                goto L_0x06ab
            L_0x05fe:
                int r6 = r4.mo7071e(r5)
                if (r6 != r9) goto L_0x060c
                if (r1 == 0) goto L_0x0608
                r6 = r7
                goto L_0x060c
            L_0x0608:
                int r6 = r3.length()
            L_0x060c:
                if (r1 == 0) goto L_0x0613
                int[] r3 = r12.mo7194a(r6)
                goto L_0x0617
            L_0x0613:
                int[] r3 = r12.mo7195b(r6)
            L_0x0617:
                if (r3 != 0) goto L_0x061b
                goto L_0x06ab
            L_0x061b:
                r12 = r3[r7]
                r6 = 1
                r13 = r3[r6]
                if (r0 == 0) goto L_0x064a
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<java.util.List<java.lang.String>> r3 = androidx.compose.p015ui.semantics.SemanticsProperties.f4190a
                boolean r0 = r0.mo7343c(r3)
                if (r0 != 0) goto L_0x0637
                androidx.compose.ui.semantics.j r0 = r5.f4186e
                androidx.compose.ui.semantics.p<androidx.compose.ui.text.a> r3 = androidx.compose.p015ui.semantics.SemanticsProperties.f4209t
                boolean r0 = r0.mo7343c(r3)
                if (r0 == 0) goto L_0x0637
                r7 = 1
            L_0x0637:
                if (r7 == 0) goto L_0x064a
                int r0 = r4.mo7072f(r5)
                if (r0 != r9) goto L_0x0644
                if (r1 == 0) goto L_0x0643
                r0 = r12
                goto L_0x0644
            L_0x0643:
                r0 = r13
            L_0x0644:
                if (r1 == 0) goto L_0x0648
                r3 = r13
                goto L_0x0650
            L_0x0648:
                r3 = r12
                goto L_0x0650
            L_0x064a:
                if (r1 == 0) goto L_0x064e
                r0 = r13
                goto L_0x064f
            L_0x064e:
                r0 = r12
            L_0x064f:
                r3 = r0
            L_0x0650:
                if (r1 == 0) goto L_0x0655
                r10 = 256(0x100, float:3.59E-43)
                goto L_0x0657
            L_0x0655:
                r10 = 512(0x200, float:7.175E-43)
            L_0x0657:
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c r1 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c
                long r14 = android.os.SystemClock.uptimeMillis()
                r8 = r1
                r9 = r5
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r4.f3967n = r1
                r15 = 1
                r4.mo7084x(r5, r0, r3, r15)
                goto L_0x06a9
            L_0x0669:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"
                r0.<init>(r1)
                throw r0
            L_0x0671:
                r15 = r6
                int r1 = r4.f3959f
                if (r1 != r0) goto L_0x0678
                r1 = r15
                goto L_0x0679
            L_0x0678:
                r1 = r7
            L_0x0679:
                if (r1 == 0) goto L_0x06ab
                r4.f3959f = r9
                androidx.compose.ui.platform.AndroidComposeView r1 = r4.f3954a
                r1.invalidate()
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r0, r10, r12, r11)
                goto L_0x06a9
            L_0x0686:
                r15 = r6
                boolean r1 = r4.mo7075j()
                if (r1 != 0) goto L_0x068e
                goto L_0x06ab
            L_0x068e:
                int r1 = r4.f3959f
                if (r1 != r0) goto L_0x0694
                r3 = r15
                goto L_0x0695
            L_0x0694:
                r3 = r7
            L_0x0695:
                if (r3 != 0) goto L_0x06ab
                if (r1 == r9) goto L_0x069c
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r1, r10, r12, r11)
            L_0x069c:
                r4.f3959f = r0
                androidx.compose.ui.platform.AndroidComposeView r1 = r4.f3954a
                r1.invalidate()
                r1 = 32768(0x8000, float:4.5918E-41)
                androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r0, r1, r12, r11)
            L_0x06a9:
                r6 = r15
                goto L_0x06ac
            L_0x06ab:
                r6 = r7
            L_0x06ac:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.MyNodeProvider.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$a */
    public static final class C1764a {
        /* renamed from: a */
        public static final void m3928a(C6689b bVar, SemanticsNode semanticsNode) {
            C19383o.m32797g(bVar, "info");
            C19383o.m32797g(semanticsNode, "semanticsNode");
            if (C1875t.m4078a(semanticsNode)) {
                C1903j jVar = semanticsNode.f4186e;
                C1909p<C1894a<C19857l<List<C2021q>, Boolean>>> pVar = C1902i.f4230a;
                C1894a aVar = (C1894a) SemanticsConfigurationKt.m4173a(jVar, C1902i.f4235f);
                if (aVar != null) {
                    bVar.mo18851b(new C6689b.C6690a(16908349, (CharSequence) aVar.f4217a));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$b */
    public static final class C1765b {
        /* renamed from: a */
        public static final void m3929a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            C19383o.m32797g(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c */
    public static final class C1766c {

        /* renamed from: a */
        public final SemanticsNode f3976a;

        /* renamed from: b */
        public final int f3977b;

        /* renamed from: c */
        public final int f3978c;

        /* renamed from: d */
        public final int f3979d;

        /* renamed from: e */
        public final int f3980e;

        /* renamed from: f */
        public final long f3981f;

        public C1766c(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.f3976a = semanticsNode;
            this.f3977b = i;
            this.f3978c = i2;
            this.f3979d = i3;
            this.f3980e = i4;
            this.f3981f = j;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$d */
    public static final class C1767d {

        /* renamed from: a */
        public final C1903j f3982a;

        /* renamed from: b */
        public final LinkedHashSet f3983b = new LinkedHashSet();

        public C1767d(SemanticsNode semanticsNode, Map<Integer, C1814a1> map) {
            C19383o.m32797g(semanticsNode, "semanticsNode");
            C19383o.m32797g(map, "currentSemanticsNodes");
            this.f3982a = semanticsNode.f4186e;
            List e = semanticsNode.mo7306e(false);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) e.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.f4187f))) {
                    this.f3983b.add(Integer.valueOf(semanticsNode2.f4187f));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$e */
    public /* synthetic */ class C1768e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3984a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f3984a = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "view");
        this.f3954a = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        if (systemService != null) {
            this.f3956c = (AccessibilityManager) systemService;
            this.f3957d = new Handler(Looper.getMainLooper());
            this.f3958e = new C6693c(new MyNodeProvider());
            this.f3959f = Integer.MIN_VALUE;
            this.f3960g = new C7507j<>();
            this.f3961h = new C7507j<>();
            this.f3962i = -1;
            this.f3964k = new C7496d<>();
            this.f3965l = C17782b.m29872l(-1, (BufferOverflow) null, 6);
            this.f3966m = true;
            this.f3968o = C19294b0.m32559p0();
            this.f3969p = new C7496d<>();
            this.f3970q = new LinkedHashMap();
            this.f3971r = new C1767d(androidComposeView.getSemanticsOwner().mo7355a(), C19294b0.m32559p0());
            androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
                public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

                {
                    this.this$0 = r1;
                }

                public void onViewAttachedToWindow(View view) {
                    C19383o.m32797g(view, "view");
                }

                public void onViewDetachedFromWindow(View view) {
                    C19383o.m32797g(view, "view");
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                    androidComposeViewAccessibilityDelegateCompat.f3957d.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.f3973t);
                }
            });
            this.f3973t = new C1864q(this, 0);
            this.f3974u = new ArrayList();
            this.f3975v = new C1772x168b1034(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* renamed from: h */
    public static String m3902h(SemanticsNode semanticsNode) {
        C1913a aVar;
        if (semanticsNode == null) {
            return null;
        }
        C1903j jVar = semanticsNode.f4186e;
        C1909p pVar = SemanticsProperties.f4190a;
        if (jVar.mo7343c(pVar)) {
            return C15588c1.m25319c0((List) semanticsNode.f4186e.mo7344e(pVar));
        }
        if (C1875t.m4083f(semanticsNode)) {
            C1913a i = m3903i(semanticsNode.f4186e);
            if (i != null) {
                return i.f4296b;
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.m4173a(semanticsNode.f4186e, SemanticsProperties.f4208s);
        if (list == null || (aVar = (C1913a) C19327t.m32640V0(list)) == null) {
            return null;
        }
        return aVar.f4296b;
    }

    /* renamed from: i */
    public static C1913a m3903i(C1903j jVar) {
        return (C1913a) SemanticsConfigurationKt.m4173a(jVar, SemanticsProperties.f4209t);
    }

    /* renamed from: l */
    public static final boolean m3904l(C1901h hVar, float f) {
        return (f < 0.0f && hVar.f4227a.invoke().floatValue() > 0.0f) || (f > 0.0f && hVar.f4227a.invoke().floatValue() < hVar.f4228b.invoke().floatValue());
    }

    /* renamed from: m */
    public static final float m3905m(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public static final boolean m3906n(C1901h hVar) {
        return (hVar.f4227a.invoke().floatValue() > 0.0f && !hVar.f4229c) || (hVar.f4227a.invoke().floatValue() < hVar.f4228b.invoke().floatValue() && hVar.f4229c);
    }

    /* renamed from: o */
    public static final boolean m3907o(C1901h hVar) {
        return (hVar.f4227a.invoke().floatValue() < hVar.f4228b.invoke().floatValue() && !hVar.f4229c) || (hVar.f4227a.invoke().floatValue() > 0.0f && hVar.f4229c);
    }

    /* renamed from: s */
    public static /* synthetic */ void m3908s(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.mo7079r(i, i2, num, (List<String>) null);
    }

    /* renamed from: y */
    public static CharSequence m3909y(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ all -> 0x00cd }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e A[Catch:{ all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7067a(kotlin.coroutines.C19340c<? super kotlin.C19394m> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.p015ui.platform.C1769x3d3eeeed
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p015ui.platform.C1769x3d3eeeed) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            o.d r5 = (p193o.C7496d) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ all -> 0x00cd }
        L_0x0035:
            r11 = r5
            r5 = r2
            goto L_0x0063
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0040:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r0.L$1
            o.d r5 = (p193o.C7496d) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ all -> 0x00cd }
            goto L_0x0076
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            o.d r11 = new o.d     // Catch:{ all -> 0x00cf }
            r11.<init>()     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.channels.AbstractChannel r2 = r10.f3965l     // Catch:{ all -> 0x00cf }
            r2.getClass()     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.channels.AbstractChannel$a r5 = new kotlinx.coroutines.channels.AbstractChannel$a     // Catch:{ all -> 0x00cf }
            r5.<init>(r2)     // Catch:{ all -> 0x00cf }
            r6 = r10
        L_0x0063:
            r0.L$0 = r6     // Catch:{ all -> 0x00cd }
            r0.L$1 = r11     // Catch:{ all -> 0x00cd }
            r0.L$2 = r5     // Catch:{ all -> 0x00cd }
            r0.label = r4     // Catch:{ all -> 0x00cd }
            java.lang.Object r2 = r5.mo72148a(r0)     // Catch:{ all -> 0x00cd }
            if (r2 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r9 = r5
            r5 = r11
            r11 = r2
            r2 = r9
        L_0x0076:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x00cd }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x00cd }
            if (r11 == 0) goto L_0x00c5
            r2.next()     // Catch:{ all -> 0x00cd }
            boolean r11 = r6.mo7075j()     // Catch:{ all -> 0x00cd }
            if (r11 == 0) goto L_0x00af
            r11 = 0
            o.d<androidx.compose.ui.node.LayoutNode> r7 = r6.f3964k     // Catch:{ all -> 0x00cd }
            int r7 = r7.f16715d     // Catch:{ all -> 0x00cd }
        L_0x008c:
            if (r11 >= r7) goto L_0x009f
            o.d<androidx.compose.ui.node.LayoutNode> r8 = r6.f3964k     // Catch:{ all -> 0x00cd }
            java.lang.Object[] r8 = r8.f16714c     // Catch:{ all -> 0x00cd }
            r8 = r8[r11]     // Catch:{ all -> 0x00cd }
            kotlin.jvm.internal.C19383o.m32794d(r8)     // Catch:{ all -> 0x00cd }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.p015ui.node.LayoutNode) r8     // Catch:{ all -> 0x00cd }
            r6.mo7083w(r8, r5)     // Catch:{ all -> 0x00cd }
            int r11 = r11 + 1
            goto L_0x008c
        L_0x009f:
            r5.clear()     // Catch:{ all -> 0x00cd }
            boolean r11 = r6.f3972s     // Catch:{ all -> 0x00cd }
            if (r11 != 0) goto L_0x00af
            r6.f3972s = r4     // Catch:{ all -> 0x00cd }
            android.os.Handler r11 = r6.f3957d     // Catch:{ all -> 0x00cd }
            androidx.compose.ui.platform.q r7 = r6.f3973t     // Catch:{ all -> 0x00cd }
            r11.post(r7)     // Catch:{ all -> 0x00cd }
        L_0x00af:
            o.d<androidx.compose.ui.node.LayoutNode> r11 = r6.f3964k     // Catch:{ all -> 0x00cd }
            r11.clear()     // Catch:{ all -> 0x00cd }
            r7 = 100
            r0.L$0 = r6     // Catch:{ all -> 0x00cd }
            r0.L$1 = r5     // Catch:{ all -> 0x00cd }
            r0.L$2 = r2     // Catch:{ all -> 0x00cd }
            r0.label = r3     // Catch:{ all -> 0x00cd }
            java.lang.Object r11 = p628nj.C18263b.m30814I(r7, r0)     // Catch:{ all -> 0x00cd }
            if (r11 != r1) goto L_0x0035
            return r1
        L_0x00c5:
            o.d<androidx.compose.ui.node.LayoutNode> r11 = r6.f3964k
            r11.clear()
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        L_0x00cd:
            r11 = move-exception
            goto L_0x00d1
        L_0x00cf:
            r11 = move-exception
            r6 = r10
        L_0x00d1:
            o.d<androidx.compose.ui.node.LayoutNode> r0 = r6.f3964k
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo7067a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7068b(int r10, long r11, boolean r13) {
        /*
            r9 = this;
            java.util.Map r0 = r9.mo7073g()
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "currentSemanticsNodes"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            long r1 = p288y.C8343c.f18297d
            boolean r1 = p288y.C8343c.m16640a(r11, r1)
            r2 = 0
            if (r1 != 0) goto L_0x00ee
            float r1 = p288y.C8343c.m16642c(r11)
            boolean r1 = java.lang.Float.isNaN(r1)
            r3 = 1
            if (r1 != 0) goto L_0x002d
            float r1 = p288y.C8343c.m16643d(r11)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x002d
            r1 = r3
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r1 == 0) goto L_0x00e2
            if (r13 != r3) goto L_0x0035
            androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r13 = androidx.compose.p015ui.semantics.SemanticsProperties.f4203n
            goto L_0x0039
        L_0x0035:
            if (r13 != 0) goto L_0x00dc
            androidx.compose.ui.semantics.p<androidx.compose.ui.semantics.h> r13 = androidx.compose.p015ui.semantics.SemanticsProperties.f4202m
        L_0x0039:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0041
            goto L_0x00ee
        L_0x0041:
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.platform.a1 r1 = (androidx.compose.p015ui.platform.C1814a1) r1
            android.graphics.Rect r4 = r1.f4068b
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            int r5 = r4.left
            float r5 = (float) r5
            int r6 = r4.top
            float r6 = (float) r6
            int r7 = r4.right
            float r7 = (float) r7
            int r4 = r4.bottom
            float r4 = (float) r4
            float r8 = p288y.C8343c.m16642c(r11)
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0086
            float r5 = p288y.C8343c.m16642c(r11)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0086
            float r5 = p288y.C8343c.m16643d(r11)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0086
            float r5 = p288y.C8343c.m16643d(r11)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0086
            r4 = r3
            goto L_0x0087
        L_0x0086:
            r4 = r2
        L_0x0087:
            if (r4 != 0) goto L_0x008a
            goto L_0x00d7
        L_0x008a:
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.f4067a
            androidx.compose.ui.semantics.j r1 = r1.mo7307f()
            java.lang.Object r1 = androidx.compose.p015ui.semantics.SemanticsConfigurationKt.m4173a(r1, r13)
            androidx.compose.ui.semantics.h r1 = (androidx.compose.p015ui.semantics.C1901h) r1
            if (r1 != 0) goto L_0x0099
            goto L_0x00d7
        L_0x0099:
            boolean r4 = r1.f4229c
            if (r4 == 0) goto L_0x009f
            int r5 = -r10
            goto L_0x00a0
        L_0x009f:
            r5 = r10
        L_0x00a0:
            if (r10 != 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00a5
            r5 = -1
        L_0x00a5:
            if (r5 >= 0) goto L_0x00b9
            kq.a<java.lang.Float> r1 = r1.f4227a
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00b9:
            kq.a<java.lang.Float> r4 = r1.f4227a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            kq.a<java.lang.Float> r1 = r1.f4228b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d7
        L_0x00d5:
            r1 = r3
            goto L_0x00d8
        L_0x00d7:
            r1 = r2
        L_0x00d8:
            if (r1 == 0) goto L_0x0045
            r2 = r3
            goto L_0x00ee
        L_0x00dc:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00e2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Offset argument contained a NaN value."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo7068b(int, long, boolean):boolean");
    }

    /* renamed from: c */
    public final AccessibilityEvent mo7069c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C19383o.m32796f(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f3954a.getContext().getPackageName());
        obtain.setSource(this.f3954a, i);
        C1814a1 a1Var = mo7073g().get(Integer.valueOf(i));
        if (a1Var != null) {
            obtain.setPassword(a1Var.f4067a.mo7307f().mo7343c(SemanticsProperties.f4214y));
        }
        return obtain;
    }

    /* renamed from: d */
    public final AccessibilityEvent mo7070d(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent c = mo7069c(i, 8192);
        if (num != null) {
            c.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            c.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            c.setItemCount(num3.intValue());
        }
        if (str != null) {
            c.getText().add(str);
        }
        return c;
    }

    /* renamed from: e */
    public final int mo7071e(SemanticsNode semanticsNode) {
        if (!semanticsNode.f4186e.mo7343c(SemanticsProperties.f4190a)) {
            C1903j jVar = semanticsNode.f4186e;
            C1909p pVar = SemanticsProperties.f4210u;
            if (jVar.mo7343c(pVar)) {
                return C2022r.m4464c(((C2022r) semanticsNode.f4186e.mo7344e(pVar)).f4597a);
            }
        }
        return this.f3962i;
    }

    /* renamed from: f */
    public final int mo7072f(SemanticsNode semanticsNode) {
        if (!semanticsNode.f4186e.mo7343c(SemanticsProperties.f4190a)) {
            C1903j jVar = semanticsNode.f4186e;
            C1909p pVar = SemanticsProperties.f4210u;
            if (jVar.mo7343c(pVar)) {
                return (int) (((C2022r) semanticsNode.f4186e.mo7344e(pVar)).f4597a >> 32);
            }
        }
        return this.f3962i;
    }

    /* renamed from: g */
    public final Map<Integer, C1814a1> mo7073g() {
        if (this.f3966m) {
            C1907n semanticsOwner = this.f3954a.getSemanticsOwner();
            C19383o.m32797g(semanticsOwner, "<this>");
            SemanticsNode a = semanticsOwner.mo7355a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LayoutNode layoutNode = a.f4188g;
            if (layoutNode.f3837v && layoutNode.mo6696c()) {
                Region region = new Region();
                region.set(C0114h.m330y0(a.mo7305d()));
                C1875t.m4082e(region, a, linkedHashMap, a);
            }
            this.f3968o = linkedHashMap;
            this.f3966m = false;
        }
        return this.f3968o;
    }

    public final C6693c getAccessibilityNodeProvider(View view) {
        C19383o.m32797g(view, "host");
        return this.f3958e;
    }

    /* renamed from: j */
    public final boolean mo7075j() {
        return this.f3956c.isEnabled() && this.f3956c.isTouchExplorationEnabled();
    }

    /* renamed from: k */
    public final void mo7076k(LayoutNode layoutNode) {
        if (this.f3964k.add(layoutNode)) {
            this.f3965l.mo72199l(C19394m.f43287a);
        }
    }

    /* renamed from: p */
    public final int mo7077p(int i) {
        if (i == this.f3954a.getSemanticsOwner().mo7355a().f4187f) {
            return -1;
        }
        return i;
    }

    /* renamed from: q */
    public final boolean mo7078q(AccessibilityEvent accessibilityEvent) {
        if (!mo7075j()) {
            return false;
        }
        return this.f3954a.getParent().requestSendAccessibilityEvent(this.f3954a, accessibilityEvent);
    }

    /* renamed from: r */
    public final boolean mo7079r(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !mo7075j()) {
            return false;
        }
        AccessibilityEvent c = mo7069c(i, i2);
        if (num != null) {
            c.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            c.setContentDescription(C15588c1.m25319c0(list));
        }
        return mo7078q(c);
    }

    /* renamed from: t */
    public final void mo7080t(int i, int i2, String str) {
        AccessibilityEvent c = mo7069c(mo7077p(i), 32);
        c.setContentChangeTypes(i2);
        if (str != null) {
            c.getText().add(str);
        }
        mo7078q(c);
    }

    /* renamed from: u */
    public final void mo7081u(int i) {
        C1766c cVar = this.f3967n;
        if (cVar != null) {
            if (i == cVar.f3976a.f4187f) {
                if (SystemClock.uptimeMillis() - cVar.f3981f <= 1000) {
                    AccessibilityEvent c = mo7069c(mo7077p(cVar.f3976a.f4187f), 131072);
                    c.setFromIndex(cVar.f3979d);
                    c.setToIndex(cVar.f3980e);
                    c.setAction(cVar.f3977b);
                    c.setMovementGranularity(cVar.f3978c);
                    c.getText().add(m3902h(cVar.f3976a));
                    mo7078q(c);
                }
            } else {
                return;
            }
        }
        this.f3967n = null;
    }

    /* renamed from: v */
    public final void mo7082v(SemanticsNode semanticsNode, C1767d dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List e = semanticsNode.mo7306e(false);
        int size = e.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) e.get(i);
            if (mo7073g().containsKey(Integer.valueOf(semanticsNode2.f4187f))) {
                if (!dVar.f3983b.contains(Integer.valueOf(semanticsNode2.f4187f))) {
                    mo7076k(semanticsNode.f4188g);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.f4187f));
            }
        }
        for (Number intValue : dVar.f3983b) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                mo7076k(semanticsNode.f4188g);
                return;
            }
        }
        List e2 = semanticsNode.mo7306e(false);
        int size2 = e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) e2.get(i2);
            if (mo7073g().containsKey(Integer.valueOf(semanticsNode3.f4187f))) {
                Object obj = this.f3970q.get(Integer.valueOf(semanticsNode3.f4187f));
                C19383o.m32794d(obj);
                mo7082v(semanticsNode3, (C1767d) obj);
            }
        }
    }

    /* renamed from: w */
    public final void mo7083w(LayoutNode layoutNode, C7496d<Integer> dVar) {
        LayoutNode d;
        C1904k T;
        if (layoutNode.mo6696c() && !this.f3954a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            C1904k T2 = C18263b.m30825T(layoutNode);
            if (T2 == null) {
                LayoutNode d2 = C1875t.m4081d(layoutNode, C1774xdb31af5f.INSTANCE);
                T2 = d2 != null ? C18263b.m30825T(d2) : null;
                if (T2 == null) {
                    return;
                }
            }
            if (!(T2.mo7349c().f4247c || (d = C1875t.m4081d(layoutNode, C1773x7245ac5.INSTANCE)) == null || (T = C18263b.m30825T(d)) == null)) {
                T2 = T;
            }
            int id = ((C1905l) T2.f3920c).getId();
            if (dVar.add(Integer.valueOf(id))) {
                m3908s(this, mo7077p(id), RecyclerView.C3084b0.FLAG_MOVED, 1, 8);
            }
        }
    }

    /* renamed from: x */
    public final boolean mo7084x(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String h;
        C1903j jVar = semanticsNode.f4186e;
        C1909p pVar = C1902i.f4236g;
        boolean z2 = false;
        if (jVar.mo7343c(pVar) && C1875t.m4078a(semanticsNode)) {
            C19862q qVar = (C19862q) ((C1894a) semanticsNode.f4186e.mo7344e(pVar)).f4218b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.f3962i) || (h = m3902h(semanticsNode)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > h.length()) {
                i = -1;
            }
            this.f3962i = i;
            if (h.length() > 0) {
                z2 = true;
            }
            int p = mo7077p(semanticsNode.f4187f);
            Integer num = null;
            Integer valueOf = z2 ? Integer.valueOf(this.f3962i) : null;
            Integer valueOf2 = z2 ? Integer.valueOf(this.f3962i) : null;
            if (z2) {
                num = Integer.valueOf(h.length());
            }
            mo7078q(mo7070d(p, valueOf, valueOf2, num, h));
            mo7081u(semanticsNode.f4187f);
            return true;
        }
    }

    /* renamed from: z */
    public final void mo7085z(int i) {
        int i2 = this.f3955b;
        if (i2 != i) {
            this.f3955b = i;
            m3908s(this, i, 128, (Integer) null, 12);
            m3908s(this, i2, 256, (Integer) null, 12);
        }
    }
}
