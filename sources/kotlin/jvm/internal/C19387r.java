package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.r */
public final class C19387r {
    /* renamed from: a */
    public static String m32808a(C19381m mVar) {
        String obj = mVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
