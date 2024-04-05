package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C19764o1;

/* renamed from: kotlinx.coroutines.internal.l */
public interface C19728l {
    C19764o1 createDispatcher(List<? extends C19728l> list);

    int getLoadPriority();

    String hintOnError();
}
