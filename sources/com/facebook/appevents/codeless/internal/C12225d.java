package com.facebook.appevents.codeless.internal;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p401mg.C13080a;

/* renamed from: com.facebook.appevents.codeless.internal.d */
public final class C12225d {

    /* renamed from: a */
    public static final String f27287a = C12225d.class.getCanonicalName();

    /* renamed from: b */
    public static WeakReference<View> f27288b = new WeakReference<>((Object) null);

    /* renamed from: c */
    public static Method f27289c;

    /* renamed from: d */
    public static final C12225d f27290d = new C12225d();

    /* renamed from: a */
    public static final View m20053a(View view) {
        C12225d dVar;
        boolean z;
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        while (view != null) {
            try {
                dVar = f27290d;
                dVar.getClass();
                z = false;
                if (!C13080a.m20762b(dVar)) {
                    z = C19383o.m32792b(view.getClass().getName(), "com.facebook.react.ReactRootView");
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
            if (!z) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final ArrayList m20054b(View view) {
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
        if (r8.isInstance(r3) != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053 A[Catch:{ ClassNotFoundException -> 0x004a, all -> 0x0043, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[Catch:{ ClassNotFoundException -> 0x004a, all -> 0x0043, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0072 A[Catch:{ all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0078 A[Catch:{ all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097 A[Catch:{ all -> 0x00c9 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m20055c(android.view.View r9) {
        /*
            java.lang.Class<com.facebook.appevents.codeless.internal.d> r0 = com.facebook.appevents.codeless.internal.C12225d.class
            boolean r1 = p401mg.C13080a.m20762b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r9, r1)     // Catch:{ all -> 0x00c9 }
            boolean r1 = r9 instanceof android.widget.ImageView     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x0015
            r1 = 2
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            boolean r3 = r9.isClickable()     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x001e
            r1 = r1 | 32
        L_0x001e:
            boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00c9 }
            r4 = 1
            if (r3 == 0) goto L_0x0026
            goto L_0x006f
        L_0x0026:
            android.view.ViewParent r3 = r9.getParent()     // Catch:{ all -> 0x0048 }
            boolean r5 = r3 instanceof android.widget.AdapterView     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x002f
            goto L_0x006a
        L_0x002f:
            com.facebook.appevents.codeless.internal.d r5 = f27290d     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "android.support.v4.view.NestedScrollingChild"
            r5.getClass()     // Catch:{ all -> 0x0048 }
            boolean r7 = p401mg.C13080a.m20762b(r5)     // Catch:{ all -> 0x0048 }
            r8 = 0
            if (r7 == 0) goto L_0x003e
            goto L_0x004a
        L_0x003e:
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x004a, all -> 0x0043 }
            goto L_0x004b
        L_0x0043:
            r6 = move-exception
            p401mg.C13080a.m20761a(r5, r6)     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r3 = move-exception
            goto L_0x006c
        L_0x004a:
            r6 = r8
        L_0x004b:
            if (r6 == 0) goto L_0x0054
            boolean r6 = r6.isInstance(r3)     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0054
            goto L_0x006a
        L_0x0054:
            boolean r6 = p401mg.C13080a.m20762b(r5)     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            java.lang.Class<androidx.core.view.l> r8 = androidx.core.view.C2315l.class
            goto L_0x0062
        L_0x005e:
            r6 = move-exception
            p401mg.C13080a.m20761a(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0062:
            if (r8 == 0) goto L_0x006f
            boolean r3 = r8.isInstance(r3)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x006f
        L_0x006a:
            r3 = r4
            goto L_0x0070
        L_0x006c:
            p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x00c9 }
        L_0x006f:
            r3 = r2
        L_0x0070:
            if (r3 == 0) goto L_0x0074
            r1 = r1 | 512(0x200, float:7.175E-43)
        L_0x0074:
            boolean r3 = r9 instanceof android.widget.TextView     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0097
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r1 = r1 | r4
            boolean r3 = r9 instanceof android.widget.Button     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0090
            r1 = r1 | 4
            boolean r3 = r9 instanceof android.widget.Switch     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0088
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0090
        L_0x0088:
            boolean r3 = r9 instanceof android.widget.CheckBox     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x0090
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r3
        L_0x0090:
            boolean r9 = r9 instanceof android.widget.EditText     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x00c8
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L_0x00c8
        L_0x0097:
            boolean r3 = r9 instanceof android.widget.Spinner     // Catch:{ all -> 0x00c9 }
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r9 instanceof android.widget.DatePicker     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x00a0
            goto L_0x00c6
        L_0x00a0:
            boolean r3 = r9 instanceof android.widget.RatingBar     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x00a8
            r9 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r9
            goto L_0x00c8
        L_0x00a8:
            boolean r3 = r9 instanceof android.widget.RadioGroup     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x00af
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L_0x00c8
        L_0x00af:
            boolean r3 = r9 instanceof android.view.ViewGroup     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x00c8
            com.facebook.appevents.codeless.internal.d r3 = f27290d     // Catch:{ all -> 0x00c9 }
            java.lang.ref.WeakReference<android.view.View> r4 = f27288b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00c9 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x00c9 }
            boolean r9 = r3.mo39323m(r9, r4)     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x00c8
            r1 = r1 | 64
            goto L_0x00c8
        L_0x00c6:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L_0x00c8:
            return r1
        L_0x00c9:
            r9 = move-exception
            p401mg.C13080a.m20761a(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.C12225d.m20055c(android.view.View):int");
    }

    /* renamed from: d */
    public static final JSONObject m20056d(View view) {
        JSONObject jSONObject;
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(view, "view");
            if (C19383o.m32792b(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f27288b = new WeakReference<>(view);
            }
            jSONObject = new JSONObject();
            m20062n(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            ArrayList b = m20054b(view);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                jSONArray.put(m20056d((View) b.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f27287a, "Failed to create JSONObject for view.", e);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static final View.OnClickListener m20057f(View view) {
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            C19383o.m32796f(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            C19383o.m32796f(declaredField2, "Class.forName(\"android.v…Field(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: g */
    public static final View.OnTouchListener m20058g(View view) {
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            C19383o.m32796f(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            C19383o.m32796f(declaredField2, "Class.forName(\"android.v…Field(\"mOnTouchListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (NoSuchFieldException e) {
            C12869i0.m20550F(f27287a, e);
        } catch (ClassNotFoundException e2) {
            C12869i0.m20550F(f27287a, e2);
        } catch (IllegalAccessException e3) {
            C12869i0.m20550F(f27287a, e3);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
        return null;
    }

    /* renamed from: h */
    public static final String m20059h(View view) {
        String obj;
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            return (hint == null || (obj = hint.toString()) == null) ? "" : obj;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: i */
    public static final ViewGroup m20060i(View view) {
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: j */
    public static final String m20061j(View view) {
        Object obj;
        String obj2;
        Object selectedItem;
        Class<C12225d> cls = C12225d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    obj = ((Switch) view).isChecked() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i = 0;
                    if (view instanceof DatePicker) {
                        obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                        C19383o.m32796f(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof TimePicker) {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        C19383o.m32796f(currentHour, "view.currentHour");
                        int intValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        C19383o.m32796f(currentMinute, "view.currentMinute");
                        obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        C19383o.m32796f(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof RadioGroup) {
                        int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                        int childCount = ((RadioGroup) view).getChildCount();
                        while (true) {
                            if (i >= childCount) {
                                break;
                            }
                            View childAt = ((RadioGroup) view).getChildAt(i);
                            C19383o.m32796f(childAt, "child");
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                obj = ((RadioButton) childAt).getText();
                                break;
                            }
                            i++;
                        }
                    } else if (view instanceof RatingBar) {
                        obj = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    obj = selectedItem.toString();
                }
                obj = null;
            }
            return (obj == null || (obj2 = obj.toString()) == null) ? "" : obj2;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: n */
    public static final void m20062n(View view, JSONObject jSONObject) {
        Class<C12225d> cls = C12225d.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(view, "view");
                String j = m20061j(view);
                String h = m20059h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m20055c(view));
                jSONObject.put("id", view.getId());
                if (!C12223b.m20051b(view)) {
                    jSONObject.put("text", C12869i0.m20567f(C12869i0.m20560P(j), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put(ResponseConstants.HINT, C12869i0.m20567f(C12869i0.m20560P(h), ""));
                if (tag != null) {
                    jSONObject.put("tag", C12869i0.m20567f(C12869i0.m20560P(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", C12869i0.m20567f(C12869i0.m20560P(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", f27290d.mo39320e(view));
            } catch (JSONException e) {
                C12869i0.m20550F(f27287a, e);
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: e */
    public final JSONObject mo39320e(View view) {
        JSONObject jSONObject;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put(ResponseConstants.WIDTH, view.getWidth());
            jSONObject.put(ResponseConstants.HEIGHT, view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f27287a, "Failed to create JSONObject for dimension.", e);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: k */
    public final View mo39321k(View view, float[] fArr) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            mo39322l();
            Method method = f27289c;
            if (!(method == null || view == null)) {
                if (method != null) {
                    Object invoke = method.invoke((Object) null, new Object[]{fArr, view});
                    if (invoke != null) {
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } catch (IllegalAccessException e) {
            C12869i0.m20550F(f27287a, e);
        } catch (InvocationTargetException e2) {
            C12869i0.m20550F(f27287a, e2);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
        return null;
    }

    /* renamed from: l */
    public final void mo39322l() {
        if (!C13080a.m20762b(this)) {
            try {
                if (f27289c == null) {
                    Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                    f27289c = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (ClassNotFoundException e) {
                C12869i0.m20550F(f27287a, e);
            } catch (NoSuchMethodException e2) {
                C12869i0.m20550F(f27287a, e2);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo39323m(View view, View view2) {
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            C19383o.m32797g(view, "view");
            if (!C19383o.m32792b(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!C13080a.m20762b(this)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fArr = new float[]{(float) iArr[0], (float) iArr[1]};
            }
            View k = mo39321k(view2, fArr);
            return k != null && k.getId() == view.getId();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }
}
