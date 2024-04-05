package p477wg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: wg.d */
public final class C13850d {

    /* renamed from: a */
    public static final Pattern f30479a = Pattern.compile("[0-9a-zA-Z'()+_,-./:=? ]{0,69}[0-9a-zA-Z'()+_,-./:=?]");

    static {
        Pattern.compile("; boundary=\"?([0-9a-zA-Z'()+_,-./:=? ]{0,69}[0-9a-zA-Z'()+_,-./:=?])\"?");
    }

    /* renamed from: a */
    public static ByteArrayOutputStream m21384a(C13849c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.getClass();
        ArrayList<C13847a> arrayList = cVar.f30478c;
        if (!arrayList.isEmpty()) {
            String str = cVar.f30477b;
            byte[] bytes = (HelpFormatter.DEFAULT_LONG_OPT_PREFIX + str + "\r\n").getBytes();
            for (C13847a aVar : arrayList) {
                byteArrayOutputStream.write(bytes);
                Map<String, String> map = aVar.f30476a;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        byteArrayOutputStream.write((((String) next.getKey()) + ": " + ((String) next.getValue()) + "\r\n").getBytes());
                    }
                }
                byteArrayOutputStream.write("\r\n".getBytes());
                if (aVar instanceof C13849c) {
                    m21384a((C13849c) aVar).writeTo(byteArrayOutputStream);
                } else if (aVar instanceof C13848b) {
                    C13848b bVar = (C13848b) aVar;
                    byteArrayOutputStream.write((byte[]) null, 0, 0);
                } else {
                    throw new AssertionError(aVar.getClass());
                }
                byteArrayOutputStream.write("\r\n".getBytes());
            }
            byteArrayOutputStream.write((HelpFormatter.DEFAULT_LONG_OPT_PREFIX + str + HelpFormatter.DEFAULT_LONG_OPT_PREFIX).getBytes());
        }
        return byteArrayOutputStream;
    }
}
