package kotlin.reflect;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.C19431g;
import kotlin.sequences.C19435k;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C19457k;
import p753kq.C19857l;

final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements C19857l<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, C19421p.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    public final String invoke(Type type) {
        String str;
        C19383o.m32797g(type, "p0");
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C19431g k1 = C19435k.m33001k1(TypesJVMKt$typeToString$unwrap$1.INSTANCE, type);
            StringBuilder sb = new StringBuilder();
            Iterator it = k1.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = it.next();
                }
                sb.append(((Class) next).getName());
                sb.append(C19457k.m33022Z0(SequencesKt___SequencesKt.m32982m1(k1), "[]"));
                str = sb.toString();
            } else {
                throw new NoSuchElementException("Sequence is empty.");
            }
        } else {
            str = cls.getName();
        }
        C19383o.m32796f(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
