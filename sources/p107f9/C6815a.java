package p107f9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: f9.a */
public final class C6815a {

    /* renamed from: a */
    public static final Pattern f15001a = Pattern.compile("(\\$\\d+)+$");

    /* renamed from: a */
    public static final String m13204a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length > 2) {
            StackTraceElement stackTraceElement = stackTrace[2];
            C19383o.m32796f(stackTraceElement, "stackTrace[CALL_STACK_INDEX]");
            String className = stackTraceElement.getClassName();
            Matcher matcher = f15001a.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            C19383o.m32796f(className, "tag");
            String substring = className.substring(C19459m.m33045n1(className, ClassUtils.PACKAGE_SEPARATOR_CHAR, 0, 6) + 1);
            C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() <= 100) {
                return substring;
            }
            String substring2 = substring.substring(0, 100);
            C19383o.m32796f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
        throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
    }
}
