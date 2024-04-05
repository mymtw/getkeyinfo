package p513bj;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bj.c0 */
public final class C14051c0 {
    /* renamed from: a */
    public static String m21655a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m21656b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static boolean m21657c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals(str);
    }
}
