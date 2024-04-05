package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.core.JsonFactory;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
public final class C14820t6 {
    /* renamed from: a */
    public static final void m23971a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m23971a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                m23971a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C14794r4.m23910b(zzix.zzm((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzix) {
                sb.append(": \"");
                sb.append(C14794r4.m23910b((zzix) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof C14819t5) {
                sb.append(" {");
                m23973c((C14819t5) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m23971a(sb, i4, "key", entry.getKey());
                m23971a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: b */
    public static final String m23972b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m23973c(C14796r6 r6Var, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : r6Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m23971a(sb, i, m23972b(concat), C14819t5.m23958k(r6Var, method2, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m23971a(sb, i, m23972b(concat2), C14819t5.m23958k(r6Var, method3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object k = C14819t5.m23958k(r6Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (k instanceof Boolean) {
                            if (!((Boolean) k).booleanValue()) {
                            }
                        } else if (k instanceof Integer) {
                            if (((Integer) k).intValue() == 0) {
                            }
                        } else if (k instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) k).floatValue()) == 0) {
                            }
                        } else if (!(k instanceof Double)) {
                            if (k instanceof String) {
                                z = k.equals("");
                            } else if (k instanceof zzix) {
                                z = k.equals(zzix.zzb);
                            } else if (k instanceof C14796r6) {
                                if (k == ((C14796r6) k).mo50805b()) {
                                }
                            } else if ((k instanceof Enum) && ((Enum) k).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) k).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C14819t5.m23958k(r6Var, method5, new Object[0])).booleanValue()) {
                    }
                    m23971a(sb, i, m23972b(concat3), k);
                }
            }
        }
        if (!(r6Var instanceof C14795r5)) {
            C14758o7 o7Var = ((C14819t5) r6Var).zzc;
            if (o7Var != null) {
                for (int i2 = 0; i2 < o7Var.f33021a; i2++) {
                    m23971a(sb, i, String.valueOf(o7Var.f33022b[i2] >>> 3), o7Var.f33023c[i2]);
                }
                return;
            }
            return;
        }
        C14795r5 r5Var = (C14795r5) r6Var;
        throw null;
    }
}
