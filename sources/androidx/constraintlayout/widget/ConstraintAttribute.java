package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.motion.widget.C2114a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.reflect.C19421p;
import p003a2.C0023f;

public final class ConstraintAttribute {

    /* renamed from: a */
    public String f5353a;

    /* renamed from: b */
    public AttributeType f5354b;

    /* renamed from: c */
    public int f5355c;

    /* renamed from: d */
    public float f5356d;

    /* renamed from: e */
    public String f5357e;

    /* renamed from: f */
    public boolean f5358f;

    /* renamed from: g */
    public int f5359g;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$a */
    public static /* synthetic */ class C2232a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5360a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5360a = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5360a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.C2232a.<clinit>():void");
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.f5353a = str;
        this.f5354b = attributeType;
        mo8406h(obj);
    }

    /* renamed from: a */
    public static int m4911a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: e */
    public static void m4912e(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object obj;
        AttributeType attributeType;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43328r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj2 = null;
        AttributeType attributeType2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    attributeType = AttributeType.INT_TYPE;
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    attributeType = AttributeType.STRING_TYPE;
                    obj = obtainStyledAttributes.getString(index);
                }
                Object obj3 = obj;
                attributeType2 = attributeType;
                obj2 = obj3;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj2));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static void m4913f(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            String i = C0326j.m864i("set", next);
            try {
                switch (C2232a.f5360a[constraintAttribute.f5354b.ordinal()]) {
                    case 1:
                        cls.getMethod(i, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f5359g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(i, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f5359g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(i, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f5355c)});
                        break;
                    case 4:
                        cls.getMethod(i, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f5356d)});
                        break;
                    case 5:
                        cls.getMethod(i, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.f5357e});
                        break;
                    case 6:
                        cls.getMethod(i, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.f5358f)});
                        break;
                    case 7:
                        cls.getMethod(i, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f5356d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(i);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                StringBuilder l = C0023f.m111l(" Custom Attribute \"", next, "\" not found on ");
                l.append(cls.getName());
                Log.e("TransitionLayout", l.toString());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                StringBuilder l2 = C0023f.m111l(" Custom Attribute \"", next, "\" not found on ");
                l2.append(cls.getName());
                Log.e("TransitionLayout", l2.toString());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final float mo8402b() {
        switch (C2232a.f5360a[this.f5354b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return (float) this.f5355c;
            case 4:
                return this.f5356d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f5358f ? 1.0f : 0.0f;
            case 7:
                return this.f5356d;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: c */
    public final void mo8403c(float[] fArr) {
        switch (C2232a.f5360a[this.f5354b.ordinal()]) {
            case 1:
            case 2:
                int i = this.f5359g;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 3:
                fArr[0] = (float) this.f5355c;
                return;
            case 4:
                fArr[0] = this.f5356d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f5358f ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f5356d;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public final int mo8404d() {
        int i = C2232a.f5360a[this.f5354b.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* renamed from: g */
    public final void mo8405g(View view, float[] fArr) {
        View view2 = view;
        Class<?> cls = view.getClass();
        StringBuilder h = C0072d.m201h("set");
        h.append(this.f5353a);
        String sb = h.toString();
        try {
            boolean z = true;
            switch (C2232a.f5360a[this.f5354b.ordinal()]) {
                case 1:
                    cls.getMethod(sb, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((m4911a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m4911a((int) (fArr[3] * 255.0f)) << 24) | (m4911a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m4911a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 2:
                    Method method = cls.getMethod(sb, new Class[]{Drawable.class});
                    int a = m4911a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a2 = m4911a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a << 16) | (m4911a((int) (fArr[3] * 255.0f)) << 24) | (a2 << 8) | m4911a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 3:
                    cls.getMethod(sb, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 4:
                    cls.getMethod(sb, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f5353a);
                case 6:
                    Method method2 = cls.getMethod(sb, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view2, objArr);
                    return;
                case 7:
                    cls.getMethod(sb, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            StringBuilder l = C0023f.m111l("no method ", sb, "on View \"");
            l.append(C2114a.m4567c(view));
            l.append("\"");
            Log.e("TransitionLayout", l.toString());
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            StringBuilder l2 = C0023f.m111l("cannot access method ", sb, "on View \"");
            l2.append(C2114a.m4567c(view));
            l2.append("\"");
            Log.e("TransitionLayout", l2.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void mo8406h(Object obj) {
        switch (C2232a.f5360a[this.f5354b.ordinal()]) {
            case 1:
            case 2:
                this.f5359g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f5355c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f5356d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f5357e = (String) obj;
                return;
            case 6:
                this.f5358f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f5356d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f5353a = constraintAttribute.f5353a;
        this.f5354b = constraintAttribute.f5354b;
        mo8406h(obj);
    }
}
