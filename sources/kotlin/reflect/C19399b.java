package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* renamed from: kotlin.reflect.b */
public interface C19399b<R> extends C19398a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    C19418n getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
