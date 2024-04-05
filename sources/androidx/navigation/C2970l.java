package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.animation.C0388a;
import androidx.navigation.C2949a;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C19388s;
import org.xmlpull.v1.XmlPullParserException;
import p193o.C7507j;
import p514bk.C14088a;
import p772tq.C20203a;

/* renamed from: androidx.navigation.l */
public final class C2970l {

    /* renamed from: c */
    public static final ThreadLocal<TypedValue> f6746c = new ThreadLocal<>();

    /* renamed from: a */
    public Context f6747a;

    /* renamed from: b */
    public C2992q f6748b;

    public C2970l(Context context, C2992q qVar) {
        this.f6747a = context;
        this.f6748b = qVar;
    }

    /* renamed from: a */
    public static C2972n m6922a(TypedValue typedValue, C2972n nVar, C2972n nVar2, String str, String str2) throws XmlPullParserException {
        if (nVar == null || nVar == nVar2) {
            return nVar != null ? nVar : nVar2;
        }
        StringBuilder f = C0388a.m1050f("Type is ", str, " but found ", str2, ": ");
        f.append(typedValue.data);
        throw new XmlPullParserException(f.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: androidx.navigation.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: androidx.navigation.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: androidx.navigation.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: androidx.navigation.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: androidx.navigation.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: androidx.navigation.n$a} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:113|114|115|116|117|118) */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r1 = androidx.navigation.C2972n.f6759e;
        r1.mo10983c(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r1 = androidx.navigation.C2972n.f6761g;
        r1.mo10983c(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = androidx.navigation.C2972n.f6763i;
        r1.mo10983c(r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026e, code lost:
        r1 = androidx.navigation.C2972n.f6765k;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x025c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0262 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0268 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.navigation.C2952c m6923d(android.content.res.TypedArray r16, android.content.res.Resources r17, int r18) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r16
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = f6746c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001a:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r6 = "reference"
            java.lang.String r7 = "boolean"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "float"
            if (r4 == 0) goto L_0x0147
            java.lang.String r10 = r17.getResourcePackageName(r18)
            androidx.navigation.n$c r11 = androidx.navigation.C2972n.f6756b
            boolean r12 = r8.equals(r4)
            if (r12 == 0) goto L_0x0037
            goto L_0x0148
        L_0x0037:
            androidx.navigation.n$e r11 = androidx.navigation.C2972n.f6758d
            java.lang.String r12 = "integer[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0043
            goto L_0x0148
        L_0x0043:
            androidx.navigation.n$f r11 = androidx.navigation.C2972n.f6759e
            java.lang.String r12 = "long"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x004f
            goto L_0x0148
        L_0x004f:
            androidx.navigation.n$g r11 = androidx.navigation.C2972n.f6760f
            java.lang.String r12 = "long[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x005b
            goto L_0x0148
        L_0x005b:
            androidx.navigation.n$j r11 = androidx.navigation.C2972n.f6763i
            boolean r12 = r7.equals(r4)
            if (r12 == 0) goto L_0x0065
            goto L_0x0148
        L_0x0065:
            androidx.navigation.n$k r11 = androidx.navigation.C2972n.f6764j
            java.lang.String r12 = "boolean[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0071
            goto L_0x0148
        L_0x0071:
            androidx.navigation.n$a r11 = androidx.navigation.C2972n.f6765k
            java.lang.String r12 = "string"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x007d
            goto L_0x0148
        L_0x007d:
            androidx.navigation.n$b r12 = androidx.navigation.C2972n.f6766l
            java.lang.String r13 = "string[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x008a
        L_0x0087:
            r11 = r12
            goto L_0x0148
        L_0x008a:
            androidx.navigation.n$h r12 = androidx.navigation.C2972n.f6761g
            boolean r13 = r9.equals(r4)
            if (r13 == 0) goto L_0x0093
            goto L_0x0087
        L_0x0093:
            androidx.navigation.n$i r12 = androidx.navigation.C2972n.f6762h
            java.lang.String r13 = "float[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x009e
            goto L_0x0087
        L_0x009e:
            androidx.navigation.n$d r12 = androidx.navigation.C2972n.f6757c
            boolean r13 = r6.equals(r4)
            if (r13 == 0) goto L_0x00a7
            goto L_0x0087
        L_0x00a7:
            boolean r12 = r4.isEmpty()
            if (r12 != 0) goto L_0x0148
            java.lang.String r11 = "."
            boolean r11 = r4.startsWith(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r11 == 0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.<init>()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.append(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.append(r4)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r10 = r11.toString()     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x00c8
        L_0x00c7:
            r10 = r4
        L_0x00c8:
            java.lang.String r11 = "[]"
            boolean r11 = r4.endsWith(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r11 == 0) goto L_0x00fa
            int r11 = r10.length()     // Catch:{ ClassNotFoundException -> 0x0140 }
            int r11 = r11 + -2
            java.lang.String r10 = r10.substring(r2, r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x00ec
            androidx.navigation.n$m r10 = new androidx.navigation.n$m     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x00ec:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x0129
            androidx.navigation.n$o r10 = new androidx.navigation.n$o     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x00fa:
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x010d
            androidx.navigation.n$n r10 = new androidx.navigation.n$n     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
        L_0x010b:
            r11 = r10
            goto L_0x0148
        L_0x010d:
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x011b
            androidx.navigation.n$l r10 = new androidx.navigation.n$l     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x011b:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x0129
            androidx.navigation.n$p r10 = new androidx.navigation.n$p     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x0129:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0140 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r1.append(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0140 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0147:
            r11 = 0
        L_0x0148:
            r10 = 1
            boolean r12 = r0.getValue(r10, r5)
            if (r12 == 0) goto L_0x0276
            androidx.navigation.n$d r12 = androidx.navigation.C2972n.f6757c
            java.lang.String r13 = "' for "
            java.lang.String r14 = "unsupported value '"
            r15 = 16
            if (r11 != r12) goto L_0x0193
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0163
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0277
        L_0x0163:
            int r0 = r5.type
            if (r0 != r15) goto L_0x0171
            int r0 = r5.data
            if (r0 != 0) goto L_0x0171
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0277
        L_0x0171:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo10982b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0193:
            int r2 = r5.resourceId
            if (r2 == 0) goto L_0x01c4
            if (r11 != 0) goto L_0x01a0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r11 = r12
            goto L_0x0277
        L_0x01a0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo10982b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \""
            r1.append(r2)
            java.lang.String r2 = "\" type to reference other resources."
            java.lang.String r1 = p003a2.C0023f.m110k(r1, r6, r2)
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            androidx.navigation.n$a r2 = androidx.navigation.C2972n.f6765k
            if (r11 != r2) goto L_0x01ce
            java.lang.String r0 = r0.getString(r10)
            goto L_0x0277
        L_0x01ce:
            int r0 = r5.type
            if (r0 == r1) goto L_0x024d
            r1 = 4
            if (r0 == r1) goto L_0x023e
            r1 = 5
            if (r0 == r1) goto L_0x0228
            r1 = 18
            if (r0 == r1) goto L_0x0216
            if (r0 < r15) goto L_0x0201
            r1 = 31
            if (r0 > r1) goto L_0x0201
            androidx.navigation.n$h r0 = androidx.navigation.C2972n.f6761g
            if (r11 != r0) goto L_0x01f3
            androidx.navigation.n r11 = m6922a(r5, r11, r0, r4, r9)
            int r0 = r5.data
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0277
        L_0x01f3:
            androidx.navigation.n$c r0 = androidx.navigation.C2972n.f6756b
            androidx.navigation.n r11 = m6922a(r5, r11, r0, r4, r8)
            int r0 = r5.data
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0277
        L_0x0201:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "unsupported argument type "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0216:
            androidx.navigation.n$j r0 = androidx.navigation.C2972n.f6763i
            androidx.navigation.n r11 = m6922a(r5, r11, r0, r4, r7)
            int r0 = r5.data
            if (r0 == 0) goto L_0x0222
            r0 = r10
            goto L_0x0223
        L_0x0222:
            r0 = 0
        L_0x0223:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0277
        L_0x0228:
            androidx.navigation.n$c r0 = androidx.navigation.C2972n.f6756b
            java.lang.String r1 = "dimension"
            androidx.navigation.n r11 = m6922a(r5, r11, r0, r4, r1)
            android.util.DisplayMetrics r0 = r17.getDisplayMetrics()
            float r0 = r5.getDimension(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0277
        L_0x023e:
            androidx.navigation.n$h r0 = androidx.navigation.C2972n.f6761g
            androidx.navigation.n r11 = m6922a(r5, r11, r0, r4, r9)
            float r0 = r5.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0277
        L_0x024d:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r11 != 0) goto L_0x0271
            androidx.navigation.n$c r1 = androidx.navigation.C2972n.f6756b     // Catch:{ IllegalArgumentException -> 0x025c }
            r1.mo10983c(r0)     // Catch:{ IllegalArgumentException -> 0x025c }
        L_0x025a:
            r11 = r1
            goto L_0x0271
        L_0x025c:
            androidx.navigation.n$f r1 = androidx.navigation.C2972n.f6759e     // Catch:{ IllegalArgumentException -> 0x0262 }
            r1.mo10983c(r0)     // Catch:{ IllegalArgumentException -> 0x0262 }
            goto L_0x025a
        L_0x0262:
            androidx.navigation.n$h r1 = androidx.navigation.C2972n.f6761g     // Catch:{ IllegalArgumentException -> 0x0268 }
            r1.mo10983c(r0)     // Catch:{ IllegalArgumentException -> 0x0268 }
            goto L_0x025a
        L_0x0268:
            androidx.navigation.n$j r1 = androidx.navigation.C2972n.f6763i     // Catch:{ IllegalArgumentException -> 0x026e }
            r1.mo10983c(r0)     // Catch:{ IllegalArgumentException -> 0x026e }
            goto L_0x025a
        L_0x026e:
            androidx.navigation.n$a r1 = androidx.navigation.C2972n.f6765k
            goto L_0x025a
        L_0x0271:
            java.lang.Object r0 = r11.mo10983c(r0)
            goto L_0x0277
        L_0x0276:
            r0 = 0
        L_0x0277:
            if (r0 == 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r0 = 0
            r10 = 0
        L_0x027c:
            if (r11 == 0) goto L_0x027f
            goto L_0x0280
        L_0x027f:
            r11 = 0
        L_0x0280:
            if (r11 != 0) goto L_0x035f
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x028b
            androidx.navigation.n$c r1 = androidx.navigation.C2972n.f6756b
        L_0x0288:
            r11 = r1
            goto L_0x035f
        L_0x028b:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x0292
            androidx.navigation.n$e r1 = androidx.navigation.C2972n.f6758d
            goto L_0x0288
        L_0x0292:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x0299
            androidx.navigation.n$f r1 = androidx.navigation.C2972n.f6759e
            goto L_0x0288
        L_0x0299:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x02a0
            androidx.navigation.n$g r1 = androidx.navigation.C2972n.f6760f
            goto L_0x0288
        L_0x02a0:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x02a7
            androidx.navigation.n$h r1 = androidx.navigation.C2972n.f6761g
            goto L_0x0288
        L_0x02a7:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02ae
            androidx.navigation.n$i r1 = androidx.navigation.C2972n.f6762h
            goto L_0x0288
        L_0x02ae:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02b5
            androidx.navigation.n$j r1 = androidx.navigation.C2972n.f6763i
            goto L_0x0288
        L_0x02b5:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02bc
            androidx.navigation.n$k r1 = androidx.navigation.C2972n.f6764j
            goto L_0x0288
        L_0x02bc:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x035b
            if (r0 != 0) goto L_0x02c4
            goto L_0x035b
        L_0x02c4:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x02cb
            androidx.navigation.n$b r1 = androidx.navigation.C2972n.f6766l
            goto L_0x0288
        L_0x02cb:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x02f3
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x02f3
            androidx.navigation.n$m r1 = new androidx.navigation.n$m
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x0288
        L_0x02f3:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x031c
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x031c
            androidx.navigation.n$o r1 = new androidx.navigation.n$o
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x0288
        L_0x031c:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x032b
            androidx.navigation.n$n r1 = new androidx.navigation.n$n
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x0288
        L_0x032b:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x033a
            androidx.navigation.n$l r1 = new androidx.navigation.n$l
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x0288
        L_0x033a:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x0349
            androidx.navigation.n$p r1 = new androidx.navigation.n$p
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x0288
        L_0x0349:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object of type "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = " is not supported for navigation arguments."
            java.lang.String r0 = p504ai.C13983i.m21493l(r0, r2, r3)
            r1.<init>(r0)
            throw r1
        L_0x035b:
            androidx.navigation.n$a r1 = androidx.navigation.C2972n.f6765k
            goto L_0x0288
        L_0x035f:
            androidx.navigation.c r1 = new androidx.navigation.c
            r1.<init>(r11, r3, r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C2970l.m6923d(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.c");
    }

    /* renamed from: b */
    public final C2964h mo10977b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int i2;
        int depth;
        int i3;
        int i4;
        String str;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        C2964h a = this.f6748b.mo10998c(xmlResourceParser.getName()).mo10951a();
        a.mo10954g(this.f6747a, attributeSet2);
        int i5 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i5) {
                break;
            }
            int depth3 = xmlResourceParser.getDepth();
            int i6 = 3;
            if (depth3 < depth2 && next == 3) {
                break;
            } else if (next == 2 && depth3 <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, C20203a.f44789s);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        C2952c d = m6923d(obtainAttributes, resources2, i);
                        if (a.f6733i == null) {
                            a.f6733i = new HashMap<>();
                        }
                        a.f6733i.put(string, d);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else {
                    int i7 = i;
                    if ("deepLink".equals(name)) {
                        TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, C20203a.f44790t);
                        String string2 = obtainAttributes2.getString(3);
                        String string3 = obtainAttributes2.getString(i5);
                        String string4 = obtainAttributes2.getString(2);
                        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                            String str2 = null;
                            String replace = string2 != null ? string2.replace("${applicationId}", this.f6747a.getPackageName()) : null;
                            if (!TextUtils.isEmpty(string3)) {
                                str = string3.replace("${applicationId}", this.f6747a.getPackageName());
                                if (str.isEmpty()) {
                                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                                }
                            } else {
                                str = null;
                            }
                            if (string4 != null) {
                                str2 = string4.replace("${applicationId}", this.f6747a.getPackageName());
                            }
                            C2957f fVar = new C2957f(replace, str, str2);
                            if (a.f6731g == null) {
                                a.f6731g = new ArrayList<>();
                            }
                            a.f6731g.add(fVar);
                            obtainAttributes2.recycle();
                        } else {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                    } else {
                        if (ResponseConstants.ACTION.equals(name)) {
                            TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, C20203a.f44788r);
                            int resourceId = obtainAttributes3.getResourceId(0, 0);
                            obtainAttributes3.getResourceId(i5, 0);
                            C14088a aVar = new C14088a();
                            obtainAttributes3.getBoolean(4, false);
                            obtainAttributes3.getResourceId(7, -1);
                            obtainAttributes3.getBoolean(8, false);
                            obtainAttributes3.getResourceId(2, -1);
                            obtainAttributes3.getResourceId(3, -1);
                            obtainAttributes3.getResourceId(5, -1);
                            obtainAttributes3.getResourceId(6, -1);
                            Bundle bundle = new Bundle();
                            int i8 = 1;
                            int depth4 = xmlResourceParser.getDepth() + 1;
                            int i9 = i7;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 == i8 || ((depth = xmlResourceParser.getDepth()) < depth4 && next2 == i6)) {
                                    i2 = depth2;
                                    bundle.isEmpty();
                                    i5 = 1;
                                } else {
                                    if (next2 == 2 && depth <= depth4) {
                                        if ("argument".equals(xmlResourceParser.getName())) {
                                            TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, C20203a.f44789s);
                                            String string5 = obtainAttributes4.getString(0);
                                            if (string5 != null) {
                                                C2952c d2 = m6923d(obtainAttributes4, resources2, i9);
                                                i3 = depth2;
                                                boolean z = d2.f6686c;
                                                if (z && z) {
                                                    d2.f6684a.mo10984d(bundle, d2.f6687d, string5);
                                                }
                                                obtainAttributes4.recycle();
                                            } else {
                                                throw new XmlPullParserException("Arguments must have a name");
                                            }
                                        } else {
                                            i3 = depth2;
                                        }
                                        i4 = i7;
                                    } else {
                                        int i10 = i9;
                                        i3 = depth2;
                                        i4 = i10;
                                    }
                                    i6 = 3;
                                    i8 = 1;
                                    int i11 = i3;
                                    i9 = i4;
                                    depth2 = i11;
                                }
                            }
                            i2 = depth2;
                            bundle.isEmpty();
                            i5 = 1;
                            if (!(!(a instanceof C2949a.C2950a))) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            } else if (resourceId != 0) {
                                if (a.f6732h == null) {
                                    a.f6732h = new C7507j<>();
                                }
                                a.f6732h.mo19994h(resourceId, aVar);
                                obtainAttributes3.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            i2 = depth2;
                            if ("include".equals(name) && (a instanceof C2966i)) {
                                TypedArray obtainAttributes5 = resources2.obtainAttributes(attributeSet2, C19388s.f43274e);
                                ((C2966i) a).mo10972l(mo10978c(obtainAttributes5.getResourceId(0, 0)));
                                obtainAttributes5.recycle();
                            } else if (a instanceof C2966i) {
                                ((C2966i) a).mo10972l(mo10977b(resources, xmlResourceParser, attributeSet, i));
                            }
                        }
                        depth2 = i2;
                    }
                }
                i2 = depth2;
                depth2 = i2;
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.C2966i mo10978c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f6747a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.h r2 = r6.mo10977b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.C2966i     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.i r2 = (androidx.navigation.C2966i) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C2970l.mo10978c(int):androidx.navigation.i");
    }
}
