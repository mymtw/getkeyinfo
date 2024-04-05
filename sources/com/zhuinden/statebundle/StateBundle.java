package com.zhuinden.statebundle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.SparseArray;
import androidx.compose.animation.C0388a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p003a2.C0023f;
import p010a9.C0048b;

public class StateBundle implements Parcelable {
    public static final Parcelable.Creator<StateBundle> CREATOR = new C17548a();
    public static final int type_BooleanArray = 14;
    public static final int type_ByteArray = 15;
    public static final int type_CharArray = 17;
    public static final int type_CharSequence = 9;
    public static final int type_CharSequenceArray = 23;
    public static final int type_CharSequenceArrayList = 13;
    public static final int type_DoubleArray = 21;
    public static final int type_FloatArray = 20;
    public static final int type_IntArray = 18;
    public static final int type_IntegerArrayList = 11;
    public static final int type_LongArray = 19;
    public static final int type_Parcelable = 27;
    public static final int type_ParcelableArray = 28;
    public static final int type_ParcelableArrayList = 29;
    public static final int type_Serializable = 10;
    public static final int type_ShortArray = 16;
    public static final int type_SparseParcelableArray = 30;
    public static final int type_StateBundle = 26;
    public static final int type_String = 8;
    public static final int type_StringArray = 22;
    public static final int type_StringArrayList = 12;
    public static final int type_boolean = 0;
    public static final int type_byte = 1;
    public static final int type_char = 2;
    public static final int type_double = 7;
    public static final int type_float = 6;
    public static final int type_int = 4;
    public static final int type_long = 5;
    public static final int type_short = 3;
    public Map<String, Object> map = new LinkedHashMap();
    public Map<String, Integer> typeMap = new LinkedHashMap();

    public static class TypeElement implements Parcelable {
        public static final Parcelable.Creator<TypeElement> CREATOR = new C17547a();

        /* renamed from: b */
        public String f38381b;

        /* renamed from: c */
        public int f38382c;

        /* renamed from: com.zhuinden.statebundle.StateBundle$TypeElement$a */
        public static class C17547a implements Parcelable.Creator<TypeElement> {
            public final Object createFromParcel(Parcel parcel) {
                return new TypeElement(parcel);
            }

            public final Object[] newArray(int i) {
                return new TypeElement[i];
            }
        }

        public TypeElement() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f38381b);
            parcel.writeInt(this.f38382c);
        }

        public TypeElement(String str, int i) {
            this.f38381b = str;
            this.f38382c = i;
        }

        public TypeElement(Parcel parcel) {
            this.f38381b = parcel.readString();
            this.f38382c = parcel.readInt();
        }
    }

    /* renamed from: com.zhuinden.statebundle.StateBundle$a */
    public static class C17548a implements Parcelable.Creator<StateBundle> {
        public final Object createFromParcel(Parcel parcel) {
            return new StateBundle(parcel);
        }

        public final Object[] newArray(int i) {
            return new StateBundle[i];
        }
    }

    public StateBundle() {
    }

    private static boolean objectsEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public StateBundle clear() {
        this.map.clear();
        this.typeMap.clear();
        return this;
    }

    public boolean containsKey(String str) {
        return this.map.containsKey(str);
    }

    public void copyToBundle(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry next : this.map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                Integer num = this.typeMap.get(next.getKey());
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            bundle.putBoolean(str, ((Boolean) value).booleanValue());
                            break;
                        case 1:
                            bundle.putByte(str, ((Byte) value).byteValue());
                            break;
                        case 2:
                            bundle.putChar(str, ((Character) value).charValue());
                            break;
                        case 3:
                            bundle.putShort(str, ((Short) value).shortValue());
                            break;
                        case 4:
                            bundle.putInt(str, ((Integer) value).intValue());
                            break;
                        case 5:
                            bundle.putLong(str, ((Long) value).longValue());
                            break;
                        case 6:
                            bundle.putFloat(str, ((Float) value).floatValue());
                            break;
                        case 7:
                            bundle.putDouble(str, ((Double) value).doubleValue());
                            break;
                        case 8:
                            bundle.putString(str, (String) value);
                            break;
                        case 9:
                            bundle.putCharSequence(str, (CharSequence) value);
                            break;
                        case 10:
                            bundle.putSerializable(str, (Serializable) value);
                            break;
                        case 11:
                            bundle.putIntegerArrayList(str, (ArrayList) value);
                            break;
                        case 12:
                            bundle.putStringArrayList(str, (ArrayList) value);
                            break;
                        case 13:
                            bundle.putCharSequenceArrayList(str, (ArrayList) value);
                            break;
                        case 14:
                            bundle.putBooleanArray(str, (boolean[]) value);
                            break;
                        case 15:
                            bundle.putByteArray(str, (byte[]) value);
                            break;
                        case 16:
                            bundle.putShortArray(str, (short[]) value);
                            break;
                        case 17:
                            bundle.putCharArray(str, (char[]) value);
                            break;
                        case 18:
                            bundle.putIntArray(str, (int[]) value);
                            break;
                        case 19:
                            bundle.putLongArray(str, (long[]) value);
                            break;
                        case 20:
                            bundle.putFloatArray(str, (float[]) value);
                            break;
                        case 21:
                            bundle.putDoubleArray(str, (double[]) value);
                            break;
                        case 22:
                            bundle.putStringArray(str, (String[]) value);
                            break;
                        case 23:
                            bundle.putCharSequenceArray(str, (CharSequence[]) value);
                            break;
                        case 26:
                            bundle.putParcelable(str, (StateBundle) value);
                            break;
                        case 27:
                            bundle.putParcelable(str, (Parcelable) value);
                            break;
                        case 28:
                            bundle.putParcelableArray(str, (Parcelable[]) value);
                            break;
                        case 29:
                            bundle.putParcelableArrayList(str, (ArrayList) value);
                            break;
                        case 30:
                            bundle.putSparseParcelableArray(str, (SparseArray) value);
                            break;
                    }
                } else {
                    throw new IllegalStateException(C0048b.m163a("Unexpected null in [", str, " ]"));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bundle should not be null!");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof StateBundle)) {
            return false;
        }
        StateBundle stateBundle = (StateBundle) obj;
        if ((this.map.isEmpty() && !stateBundle.map.isEmpty()) || ((!this.map.isEmpty() && stateBundle.map.isEmpty()) || this.map.size() != stateBundle.map.size())) {
            return false;
        }
        for (Map.Entry next : this.map.entrySet()) {
            if (!stateBundle.containsKey((String) next.getKey()) || !stateBundle.typeMap.containsKey(next.getKey())) {
                return false;
            }
            Integer num = this.typeMap.get(next.getKey());
            if (num == null) {
                throw new IllegalStateException(C0023f.m110k(C0072d.m201h("Unexpected null in equals for ["), (String) next.getKey(), "]"));
            } else if (!objectsEquals(stateBundle.typeMap.get(next.getKey()), num)) {
                return false;
            } else {
                Object value = next.getValue();
                Object obj2 = stateBundle.get((String) next.getKey());
                if (value != null || obj2 != null) {
                    if ((value == null && obj2 != null) || (value != null && obj2 == null)) {
                        return false;
                    }
                    if (num.intValue() == 14) {
                        if (!Arrays.equals((boolean[]) value, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 15) {
                        if (!Arrays.equals((byte[]) value, (byte[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 16) {
                        if (!Arrays.equals((short[]) value, (short[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 17) {
                        if (!Arrays.equals((char[]) value, (char[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 18) {
                        if (!Arrays.equals((int[]) value, (int[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 19) {
                        if (!Arrays.equals((long[]) value, (long[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 20) {
                        if (!Arrays.equals((float[]) value, (float[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 21) {
                        if (!Arrays.equals((double[]) value, (double[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 22) {
                        if (!Arrays.equals((String[]) value, (String[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 23) {
                        if (!Arrays.equals((CharSequence[]) value, (CharSequence[]) obj2)) {
                            return false;
                        }
                    } else if (num.intValue() == 28) {
                        if (!Arrays.equals((Parcelable[]) value, (Parcelable[]) obj2)) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Object get(String str) {
        return this.map.get(str);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (boolean[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "byte[]", e);
            return null;
        }
    }

    public StateBundle getBundle(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (StateBundle) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "Bundle", e);
            return null;
        }
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0).byteValue();
    }

    public byte[] getByteArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "byte[]", e);
            return null;
        }
    }

    public char getChar(String str) {
        return getChar(str, 0);
    }

    public char[] getCharArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (char[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "char[]", e);
            return null;
        }
    }

    public CharSequence getCharSequence(String str) {
        Object obj = this.map.get(str);
        try {
            return (CharSequence) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "CharSequence", e);
            return null;
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (CharSequence[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "CharSequence[]", e);
            return null;
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<CharSequence>", e);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, ShadowDrawableWrapper.COS_45);
    }

    public double[] getDoubleArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (double[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "double[]", e);
            return null;
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "float[]", e);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (int[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "int[]", e);
            return null;
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "long[]", e);
            return null;
        }
    }

    public <T extends Parcelable> T getParcelable(String str) {
        T t = this.map.get(str);
        if (t == null) {
            return null;
        }
        try {
            return (Parcelable) t;
        } catch (ClassCastException e) {
            typeWarning(str, t, "Parcelable", e);
            return null;
        }
    }

    public Parcelable[] getParcelableArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Parcelable[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "Parcelable[]", e);
            return null;
        }
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList", e);
            return null;
        }
    }

    public Serializable getSerializable(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Serializable) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "Serializable", e);
            return null;
        }
    }

    public short getShort(String str) {
        return getShort(str, 0);
    }

    public short[] getShortArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (short[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "short[]", e);
            return null;
        }
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (SparseArray) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "SparseArray", e);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.map.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "String", e);
            return null;
        }
    }

    public String[] getStringArray(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "String[]", e);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry next : this.map.entrySet()) {
            int hashCode = (((String) next.getKey()).hashCode() * 31) + i;
            Integer num = this.typeMap.get(next.getKey());
            if (num == null) {
                throw new IllegalStateException(C0023f.m110k(C0072d.m201h("Unexpected null in hashCode for ["), (String) next.getKey(), "]"));
            } else if (next.getValue() == null) {
                i = hashCode + 0;
            } else {
                i = ((num.intValue() == 14 ? Arrays.hashCode((boolean[]) next.getValue()) : num.intValue() == 15 ? Arrays.hashCode((byte[]) next.getValue()) : num.intValue() == 16 ? Arrays.hashCode((short[]) next.getValue()) : num.intValue() == 17 ? Arrays.hashCode((char[]) next.getValue()) : num.intValue() == 18 ? Arrays.hashCode((int[]) next.getValue()) : num.intValue() == 19 ? Arrays.hashCode((long[]) next.getValue()) : num.intValue() == 20 ? Arrays.hashCode((float[]) next.getValue()) : num.intValue() == 21 ? Arrays.hashCode((double[]) next.getValue()) : num.intValue() == 22 ? Arrays.hashCode((String[]) next.getValue()) : num.intValue() == 23 ? Arrays.hashCode((CharSequence[]) next.getValue()) : num.intValue() == 28 ? Arrays.hashCode((Parcelable[]) next.getValue()) : next.getValue().hashCode()) * 31) + hashCode;
            }
        }
        return i;
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public StateBundle putAll(StateBundle stateBundle) {
        if (stateBundle != null) {
            Map<String, Object> map2 = stateBundle.map;
            if (map2 != null) {
                this.map.putAll(map2);
                this.typeMap.putAll(stateBundle.typeMap);
            }
            return this;
        }
        throw new IllegalArgumentException("The provided bundle should not be null!");
    }

    public StateBundle putBoolean(String str, boolean z) {
        this.map.put(str, Boolean.valueOf(z));
        this.typeMap.put(str, 0);
        return this;
    }

    public StateBundle putBooleanArray(String str, boolean[] zArr) {
        this.map.put(str, zArr);
        this.typeMap.put(str, 14);
        return this;
    }

    public StateBundle putBundle(String str, StateBundle stateBundle) {
        this.map.put(str, stateBundle);
        this.typeMap.put(str, 26);
        return this;
    }

    public StateBundle putByte(String str, byte b) {
        this.map.put(str, Byte.valueOf(b));
        this.typeMap.put(str, 1);
        return this;
    }

    public StateBundle putByteArray(String str, byte[] bArr) {
        this.map.put(str, bArr);
        this.typeMap.put(str, 15);
        return this;
    }

    public StateBundle putChar(String str, char c) {
        this.map.put(str, Character.valueOf(c));
        this.typeMap.put(str, 2);
        return this;
    }

    public StateBundle putCharArray(String str, char[] cArr) {
        this.map.put(str, cArr);
        this.typeMap.put(str, 17);
        return this;
    }

    public StateBundle putCharSequence(String str, CharSequence charSequence) {
        this.map.put(str, charSequence);
        this.typeMap.put(str, 9);
        return this;
    }

    public StateBundle putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        this.map.put(str, charSequenceArr);
        this.typeMap.put(str, 23);
        return this;
    }

    public StateBundle putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        this.map.put(str, arrayList);
        this.typeMap.put(str, 13);
        return this;
    }

    public StateBundle putDouble(String str, double d) {
        this.map.put(str, Double.valueOf(d));
        this.typeMap.put(str, 7);
        return this;
    }

    public StateBundle putDoubleArray(String str, double[] dArr) {
        this.map.put(str, dArr);
        this.typeMap.put(str, 21);
        return this;
    }

    public StateBundle putFloat(String str, float f) {
        this.map.put(str, Float.valueOf(f));
        this.typeMap.put(str, 6);
        return this;
    }

    public StateBundle putFloatArray(String str, float[] fArr) {
        this.map.put(str, fArr);
        this.typeMap.put(str, 20);
        return this;
    }

    public StateBundle putInt(String str, int i) {
        this.map.put(str, Integer.valueOf(i));
        this.typeMap.put(str, 4);
        return this;
    }

    public StateBundle putIntArray(String str, int[] iArr) {
        this.map.put(str, iArr);
        this.typeMap.put(str, 18);
        return this;
    }

    public StateBundle putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.map.put(str, arrayList);
        this.typeMap.put(str, 11);
        return this;
    }

    public StateBundle putLong(String str, long j) {
        this.map.put(str, Long.valueOf(j));
        this.typeMap.put(str, 5);
        return this;
    }

    public StateBundle putLongArray(String str, long[] jArr) {
        this.map.put(str, jArr);
        this.typeMap.put(str, 19);
        return this;
    }

    public StateBundle putParcelable(String str, Parcelable parcelable) {
        this.map.put(str, parcelable);
        this.typeMap.put(str, 27);
        return this;
    }

    public StateBundle putParcelableArray(String str, Parcelable[] parcelableArr) {
        this.map.put(str, parcelableArr);
        this.typeMap.put(str, 28);
        return this;
    }

    public StateBundle putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.map.put(str, arrayList);
        this.typeMap.put(str, 29);
        return this;
    }

    public StateBundle putSerializable(String str, Serializable serializable) {
        this.map.put(str, serializable);
        this.typeMap.put(str, 10);
        return this;
    }

    public StateBundle putShort(String str, short s) {
        this.map.put(str, Short.valueOf(s));
        this.typeMap.put(str, 3);
        return this;
    }

    public StateBundle putShortArray(String str, short[] sArr) {
        this.map.put(str, sArr);
        this.typeMap.put(str, 16);
        return this;
    }

    public StateBundle putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        this.map.put(str, sparseArray);
        this.typeMap.put(str, 30);
        return this;
    }

    public StateBundle putString(String str, String str2) {
        this.map.put(str, str2);
        this.typeMap.put(str, 8);
        return this;
    }

    public StateBundle putStringArray(String str, String[] strArr) {
        this.map.put(str, strArr);
        this.typeMap.put(str, 22);
        return this;
    }

    public StateBundle putStringArrayList(String str, ArrayList<String> arrayList) {
        this.map.put(str, arrayList);
        this.typeMap.put(str, 12);
        return this;
    }

    public StateBundle remove(String str) {
        this.map.remove(str);
        this.typeMap.remove(str);
        return this;
    }

    public int size() {
        return this.map.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Object>> entrySet = this.map.entrySet();
        if (entrySet.isEmpty()) {
            sb.append("[]");
        } else {
            int i = 0;
            for (Map.Entry next : entrySet) {
                sb.append("{[");
                sb.append((String) next.getKey());
                sb.append("]::[");
                Integer num = this.typeMap.get(next.getKey());
                if (num != null) {
                    if (next.getValue() == null) {
                        sb.append("<null>");
                    } else if (num.intValue() == 14) {
                        sb.append(Arrays.toString((boolean[]) next.getValue()));
                    } else if (num.intValue() == 15) {
                        sb.append(Arrays.toString((byte[]) next.getValue()));
                    } else if (num.intValue() == 16) {
                        sb.append(Arrays.toString((short[]) next.getValue()));
                    } else if (num.intValue() == 17) {
                        sb.append(Arrays.toString((char[]) next.getValue()));
                    } else if (num.intValue() == 18) {
                        sb.append(Arrays.toString((int[]) next.getValue()));
                    } else if (num.intValue() == 19) {
                        sb.append(Arrays.toString((long[]) next.getValue()));
                    } else if (num.intValue() == 20) {
                        sb.append(Arrays.toString((float[]) next.getValue()));
                    } else if (num.intValue() == 21) {
                        sb.append(Arrays.toString((double[]) next.getValue()));
                    } else if (num.intValue() == 22) {
                        sb.append(Arrays.toString((String[]) next.getValue()));
                    } else if (num.intValue() == 23) {
                        sb.append(Arrays.toString((CharSequence[]) next.getValue()));
                    } else if (num.intValue() == 28) {
                        sb.append(Arrays.toString((Parcelable[]) next.getValue()));
                    } else {
                        sb.append(next.getValue());
                    }
                    sb.append("]}");
                    i++;
                    if (i < entrySet.size()) {
                        sb.append(" ");
                    }
                } else {
                    throw new IllegalStateException(C0023f.m110k(C0072d.m201h("Unexpected null in ["), (String) next.getKey(), "]"));
                }
            }
        }
        return sb.toString();
    }

    public void typeWarning(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder f = C0388a.m1050f("Key ", str, " expected ", str2, " but value was a ");
        f.append(obj.getClass().getName());
        f.append(".  The default value ");
        f.append(obj2);
        f.append(" was returned.");
        System.out.println(f.toString());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.map.keySet().size());
        for (String next : this.map.keySet()) {
            Integer num = this.typeMap.get(next);
            if (num != null) {
                parcel.writeParcelable(new TypeElement(next, num.intValue()), 0);
                parcel.writeValue(get(next));
            } else {
                throw new IllegalStateException(C0048b.m163a("Unexpected null in [", next, "]"));
            }
        }
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public Byte getByte(String str, byte b) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return Byte.valueOf(b);
        }
        try {
            return (Byte) obj;
        } catch (ClassCastException e) {
            typeWarning(str, obj, "Byte", Byte.valueOf(b), e);
            return Byte.valueOf(b);
        }
    }

    public char getChar(String str, char c) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Character", Character.valueOf(c), e);
            return c;
        }
    }

    public double getDouble(String str, double d) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public int getInt(String str, int i) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Integer", Integer.valueOf(i), e);
            return i;
        }
    }

    public long getLong(String str, long j) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Long", Long.valueOf(j), e);
            return j;
        }
    }

    public short getShort(String str, short s) {
        Object obj = this.map.get(str);
        if (obj == null) {
            return s;
        }
        try {
            return ((Short) obj).shortValue();
        } catch (ClassCastException e) {
            String str2 = str;
            typeWarning(str2, obj, "Short", Short.valueOf(s), e);
            return s;
        }
    }

    public StateBundle(StateBundle stateBundle) {
        putAll(stateBundle);
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        CharSequence charSequence2 = getCharSequence(str);
        return charSequence2 == null ? charSequence : charSequence2;
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public StateBundle(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            TypeElement typeElement = (TypeElement) parcel.readParcelable(TypeElement.class.getClassLoader());
            Object readValue = parcel.readValue(getClass().getClassLoader());
            int i2 = typeElement.f38382c;
            if (i2 == 26) {
                putBundle(typeElement.f38381b, (StateBundle) readValue);
            } else if (i2 == 27) {
                putParcelable(typeElement.f38381b, (Parcelable) readValue);
            } else if (i2 == 29) {
                putParcelableArrayList(typeElement.f38381b, (ArrayList) readValue);
            } else if (i2 != 30) {
                switch (i2) {
                    case 0:
                        putBoolean(typeElement.f38381b, ((Boolean) readValue).booleanValue());
                        break;
                    case 1:
                        putByte(typeElement.f38381b, ((Byte) readValue).byteValue());
                        break;
                    case 2:
                        putChar(typeElement.f38381b, ((Character) readValue).charValue());
                        break;
                    case 3:
                        putShort(typeElement.f38381b, ((Short) readValue).shortValue());
                        break;
                    case 4:
                        putInt(typeElement.f38381b, ((Integer) readValue).intValue());
                        break;
                    case 5:
                        putLong(typeElement.f38381b, ((Long) readValue).longValue());
                        break;
                    case 6:
                        putFloat(typeElement.f38381b, ((Float) readValue).floatValue());
                        break;
                    case 7:
                        putDouble(typeElement.f38381b, ((Double) readValue).doubleValue());
                        break;
                    case 8:
                        putString(typeElement.f38381b, (String) readValue);
                        break;
                    case 9:
                        putCharSequence(typeElement.f38381b, (CharSequence) readValue);
                        break;
                    case 10:
                        putSerializable(typeElement.f38381b, (Serializable) readValue);
                        break;
                    case 11:
                        putIntegerArrayList(typeElement.f38381b, (ArrayList) readValue);
                        break;
                    case 12:
                        putStringArrayList(typeElement.f38381b, (ArrayList) readValue);
                        break;
                    case 13:
                        putCharSequenceArrayList(typeElement.f38381b, (ArrayList) readValue);
                        break;
                    case 14:
                        putBooleanArray(typeElement.f38381b, (boolean[]) readValue);
                        break;
                    case 15:
                        putByteArray(typeElement.f38381b, (byte[]) readValue);
                        break;
                    case 16:
                        putShortArray(typeElement.f38381b, (short[]) readValue);
                        break;
                    case 17:
                        putCharArray(typeElement.f38381b, (char[]) readValue);
                        break;
                    case 18:
                        putIntArray(typeElement.f38381b, (int[]) readValue);
                        break;
                    case 19:
                        putLongArray(typeElement.f38381b, (long[]) readValue);
                        break;
                    case 20:
                        putFloatArray(typeElement.f38381b, (float[]) readValue);
                        break;
                    case 21:
                        putDoubleArray(typeElement.f38381b, (double[]) readValue);
                        break;
                }
            } else {
                putSparseParcelableArray(typeElement.f38381b, (SparseArray) readValue);
            }
        }
    }

    public void typeWarning(String str, Object obj, String str2, ClassCastException classCastException) {
        typeWarning(str, obj, str2, "<null>", classCastException);
    }
}
