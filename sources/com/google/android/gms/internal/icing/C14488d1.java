package com.google.android.gms.internal.icing;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.internal.icing.d1 */
public final class C14488d1 {
    /* renamed from: a */
    public static final void m22942a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m22942a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                m22942a(sb, i, str, a2);
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
                sb.append(C17782b.m29897y0(zzcf.zzj((String) obj)));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof zzcf) {
                sb.append(": \"");
                sb.append(C17782b.m29897y0((zzcf) obj));
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (obj instanceof C14491e0) {
                sb.append(" {");
                m22943b((C14491e0) obj, sb, i + 2);
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
                m22942a(sb, i4, "key", entry.getKey());
                m22942a(sb, i4, "value", entry.getValue());
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
    public static void m22943b(C14480b1 b1Var, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : b1Var.getClass().getDeclaredMethods()) {
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
                    m22942a(sb, i, m22944c(concat), C14491e0.m22951h(b1Var, method2, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m22942a(sb, i, m22944c(concat2), C14491e0.m22951h(b1Var, method3, new Object[0]));
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
                    Object h = C14491e0.m22951h(b1Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (h instanceof Boolean) {
                            if (!((Boolean) h).booleanValue()) {
                            }
                        } else if (h instanceof Integer) {
                            if (((Integer) h).intValue() == 0) {
                            }
                        } else if (h instanceof Float) {
                            if (((Float) h).floatValue() == 0.0f) {
                            }
                        } else if (!(h instanceof Double)) {
                            if (h instanceof String) {
                                z = h.equals("");
                            } else if (h instanceof zzcf) {
                                z = h.equals(zzcf.zzb);
                            } else if (h instanceof C14480b1) {
                                if (h == ((C14480b1) h).mo49737b()) {
                                }
                            } else if ((h instanceof Enum) && ((Enum) h).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) h).doubleValue() == ShadowDrawableWrapper.COS_45) {
                        }
                    } else if (!((Boolean) C14491e0.m22951h(b1Var, method5, new Object[0])).booleanValue()) {
                    }
                    m22942a(sb, i, m22944c(concat3), h);
                }
            }
        }
        if (!(b1Var instanceof C14483c0)) {
            C14491e0 e0Var = (C14491e0) b1Var;
        } else {
            C14483c0 c0Var = (C14483c0) b1Var;
            throw null;
        }
    }

    /* renamed from: c */
    public static final String m22944c(String str) {
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
}
