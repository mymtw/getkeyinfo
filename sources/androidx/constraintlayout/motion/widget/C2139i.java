package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.i */
public final class C2139i {

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends C2116c>> f4853b;

    /* renamed from: a */
    public HashMap<Integer, ArrayList<C2116c>> f4854a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C2116c>> hashMap = new HashMap<>();
        f4853b = hashMap;
        try {
            hashMap.put("KeyAttribute", C2117d.class.getConstructor(new Class[0]));
            f4853b.put("KeyPosition", C2140j.class.getConstructor(new Class[0]));
            f4853b.put("KeyCycle", C2120f.class.getConstructor(new Class[0]));
            f4853b.put("KeyTimeCycle", C2143l.class.getConstructor(new Class[0]));
            f4853b.put("KeyTrigger", C2145m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C2139i(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        C2116c cVar;
        Exception e;
        try {
            int eventType = xmlResourceParser.getEventType();
            C2116c cVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (f4853b.containsKey(name)) {
                        try {
                            cVar = (C2116c) f4853b.get(name).newInstance(new Object[0]);
                            try {
                                cVar.mo8138c(context, Xml.asAttributeSet(xmlResourceParser));
                                mo8148b(cVar);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            C2116c cVar3 = cVar2;
                            e = e3;
                            cVar = cVar3;
                            Log.e("KeyFrames", "unable to create ", e);
                            cVar2 = cVar;
                            eventType = xmlResourceParser.next();
                        }
                        cVar2 = cVar;
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || cVar2 == null || (hashMap = cVar2.f4797d) == null)) {
                        ConstraintAttribute.m4912e(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo8147a(C2148o oVar) {
        ArrayList arrayList = this.f4854a.get(Integer.valueOf(oVar.f4922b));
        if (arrayList != null) {
            oVar.f4941u.addAll(arrayList);
        }
        ArrayList arrayList2 = this.f4854a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C2116c cVar = (C2116c) it.next();
                String str = ((ConstraintLayout.LayoutParams) oVar.f4921a.getLayoutParams()).constraintTag;
                String str2 = cVar.f4796c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    oVar.f4941u.add(cVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8148b(C2116c cVar) {
        if (!this.f4854a.containsKey(Integer.valueOf(cVar.f4795b))) {
            this.f4854a.put(Integer.valueOf(cVar.f4795b), new ArrayList());
        }
        this.f4854a.get(Integer.valueOf(cVar.f4795b)).add(cVar);
    }
}
