package org.apache.commons.cli;

import com.appboy.Constants;
import java.util.Iterator;
import java.util.List;

public class MissingOptionException extends ParseException {
    private List missingOptions;

    public MissingOptionException(String str) {
        super(str);
    }

    private static String createMessage(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public List getMissingOptions() {
        return this.missingOptions;
    }

    public MissingOptionException(List list) {
        this(createMessage(list));
        this.missingOptions = list;
    }
}
