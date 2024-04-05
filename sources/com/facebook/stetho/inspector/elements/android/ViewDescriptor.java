package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.View;
import android.view.ViewDebug;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.ReflectionUtil;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.inspector.helper.IntegerFormatter;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p003a2.C0023f;

final class ViewDescriptor extends AbstractChainedDescriptor<View> implements HighlightableDescriptor<View> {
    private static final String ACCESSIBILITY_STYLE_RULE_NAME = "Accessibility Properties";
    private static final String ID_NAME = "id";
    private static final String NONE_MAPPING = "<no mapping>";
    private static final String NONE_VALUE = "(none)";
    private static final String VIEW_STYLE_RULE_NAME = "<this_view>";
    private static final boolean sHasSupportNodeInfo = (ReflectionUtil.tryGetClassForName("androidx.core.view.accessibility.AccessibilityNodeInfoCompat") != null);
    private final MethodInvoker mMethodInvoker;
    private volatile List<ViewCSSProperty> mViewProperties;
    private Pattern mWordBoundaryPattern;

    public final class FieldBackedCSSProperty extends ViewCSSProperty {
        private final Field mField;

        public FieldBackedCSSProperty(Field field, String str, ViewDebug.ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mField = field;
            field.setAccessible(true);
        }

        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
            return this.mField.get(view);
        }
    }

    public final class MethodBackedCSSProperty extends ViewCSSProperty {
        private final Method mMethod;

        public MethodBackedCSSProperty(Method method, String str, ViewDebug.ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mMethod = method;
            method.setAccessible(true);
        }

        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
            return this.mMethod.invoke(view, new Object[0]);
        }
    }

    public abstract class ViewCSSProperty {
        private final ViewDebug.ExportedProperty mAnnotation;
        private final String mCSSName;

        public ViewCSSProperty(String str, ViewDebug.ExportedProperty exportedProperty) {
            this.mCSSName = str;
            this.mAnnotation = exportedProperty;
        }

        public final ViewDebug.ExportedProperty getAnnotation() {
            return this.mAnnotation;
        }

        public final String getCSSName() {
            return this.mCSSName;
        }

        public abstract Object getValue(View view) throws InvocationTargetException, IllegalAccessException;
    }

    public ViewDescriptor() {
        this(new MethodInvoker());
    }

    private static boolean canFlagsBeMappedToString(ViewDebug.ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.flagMapping() == null || exportedProperty.flagMapping().length <= 0) ? false : true;
    }

    private static boolean canIntBeMappedToString(ViewDebug.ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.mapping() == null || exportedProperty.mapping().length <= 0) ? false : true;
    }

    private static String capitalize(String str) {
        if (str == null || str.length() == 0 || Character.isTitleCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, Character.toTitleCase(sb.charAt(0)));
        return sb.toString();
    }

    private String convertViewPropertyNameToCSSName(String str) {
        String[] split = getWordBoundaryPattern().split(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("get") && !split[i].equals("m")) {
                sb.append(split[i].toLowerCase());
                if (i < split.length - 1) {
                    sb.append('-');
                }
            }
        }
        return sb.toString();
    }

    private static String getIdAttribute(View view) {
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        return ResourcesUtil.getIdStringQuietly(view, view.getResources(), id);
    }

    private void getIdStyle(View view, StyleAccumulator styleAccumulator) {
        String idAttribute = getIdAttribute(view);
        if (idAttribute == null) {
            styleAccumulator.store("id", NONE_VALUE, false);
        } else {
            styleAccumulator.store("id", idAttribute, false);
        }
    }

    private void getStyleFromInteger(String str, Integer num, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        String format = IntegerFormatter.getInstance().format(num, exportedProperty);
        if (canIntBeMappedToString(exportedProperty)) {
            styleAccumulator.store(str, C0023f.m110k(C0073e.m211k(format, " ("), mapIntToStringUsingAnnotation(num.intValue(), exportedProperty), ")"), false);
        } else if (canFlagsBeMappedToString(exportedProperty)) {
            styleAccumulator.store(str, C0023f.m110k(C0073e.m211k(format, " ("), mapFlagsToStringUsingAnnotation(num.intValue(), exportedProperty), ")"), false);
        } else {
            Boolean bool = Boolean.TRUE;
            if (num.intValue() != 0 || canFlagsBeMappedToString(exportedProperty) || canIntBeMappedToString(exportedProperty)) {
                bool = Boolean.FALSE;
            }
            styleAccumulator.store(str, format, bool.booleanValue());
        }
    }

    private void getStyleFromValue(View view, String str, Object obj, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        if (str.equals("id")) {
            getIdStyle(view, styleAccumulator);
        } else if (obj instanceof Integer) {
            getStyleFromInteger(str, (Integer) obj, exportedProperty, styleAccumulator);
        } else {
            boolean z = true;
            if (obj instanceof Float) {
                String valueOf = String.valueOf(obj);
                if (((Float) obj).floatValue() != 0.0f) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf, z);
            } else if (obj instanceof Boolean) {
                styleAccumulator.store(str, String.valueOf(obj), false);
            } else if (obj instanceof Short) {
                String valueOf2 = String.valueOf(obj);
                if (((Short) obj).shortValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf2, z);
            } else if (obj instanceof Long) {
                String valueOf3 = String.valueOf(obj);
                if (((Long) obj).longValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf3, z);
            } else if (obj instanceof Double) {
                String valueOf4 = String.valueOf(obj);
                if (((Double) obj).doubleValue() != ShadowDrawableWrapper.COS_45) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf4, z);
            } else if (obj instanceof Byte) {
                String valueOf5 = String.valueOf(obj);
                if (((Byte) obj).byteValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf5, z);
            } else if (obj instanceof Character) {
                String valueOf6 = String.valueOf(obj);
                if (((Character) obj).charValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf6, z);
            } else if (obj instanceof CharSequence) {
                String valueOf7 = String.valueOf(obj);
                if (((CharSequence) obj).length() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf7, z);
            } else {
                getStylesFromObject(view, str, obj, exportedProperty, styleAccumulator);
            }
        }
    }

    private void getStylesFromObject(View view, String str, Object obj, ViewDebug.ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        String str2;
        Object obj2 = obj;
        if (exportedProperty == null || !exportedProperty.deepExport() || obj2 == null) {
            return;
        }
        for (Field field : obj.getClass().getFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj2);
                    String name = field.getName();
                    name.getClass();
                    name.hashCode();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -599904534:
                            if (name.equals("rightMargin")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -414179485:
                            if (name.equals("topMargin")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1928835221:
                            if (name.equals("leftMargin")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2064613305:
                            if (name.equals("bottomMargin")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = "margin-right";
                            break;
                        case 1:
                            str2 = "margin-top";
                            break;
                        case 2:
                            str2 = "margin-left";
                            break;
                        case 3:
                            str2 = "margin-bottom";
                            break;
                        default:
                            String prefix = exportedProperty.prefix();
                            if (prefix != null) {
                                name = C0326j.m864i(prefix, name);
                            }
                            str2 = convertViewPropertyNameToCSSName(name);
                            break;
                    }
                    getStyleFromValue(view, str2, obj3, (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class), styleAccumulator);
                } catch (IllegalAccessException e) {
                    String str3 = str;
                    StringBuilder l = C0023f.m111l("failed to get property of name: \"", str, "\" of object: ");
                    l.append(String.valueOf(obj));
                    LogUtil.m20239e((Throwable) e, l.toString());
                    return;
                }
            }
        }
    }

    private List<ViewCSSProperty> getViewProperties() {
        if (this.mViewProperties == null) {
            synchronized (this) {
                if (this.mViewProperties == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Method method : View.class.getDeclaredMethods()) {
                        ViewDebug.ExportedProperty exportedProperty = (ViewDebug.ExportedProperty) method.getAnnotation(ViewDebug.ExportedProperty.class);
                        if (exportedProperty != null) {
                            arrayList.add(new MethodBackedCSSProperty(method, convertViewPropertyNameToCSSName(method.getName()), exportedProperty));
                        }
                    }
                    for (Field field : View.class.getDeclaredFields()) {
                        ViewDebug.ExportedProperty exportedProperty2 = (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class);
                        if (exportedProperty2 != null) {
                            arrayList.add(new FieldBackedCSSProperty(field, convertViewPropertyNameToCSSName(field.getName()), exportedProperty2));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<ViewCSSProperty>() {
                        public int compare(ViewCSSProperty viewCSSProperty, ViewCSSProperty viewCSSProperty2) {
                            return viewCSSProperty.getCSSName().compareTo(viewCSSProperty2.getCSSName());
                        }
                    });
                    this.mViewProperties = Collections.unmodifiableList(arrayList);
                }
            }
        }
        return this.mViewProperties;
    }

    private Pattern getWordBoundaryPattern() {
        if (this.mWordBoundaryPattern == null) {
            this.mWordBoundaryPattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})");
        }
        return this.mWordBoundaryPattern;
    }

    private static String mapFlagsToStringUsingAnnotation(int i, ViewDebug.ExportedProperty exportedProperty) {
        if (canFlagsBeMappedToString(exportedProperty)) {
            StringBuilder sb = null;
            boolean z = false;
            for (ViewDebug.FlagToString flagToString : exportedProperty.flagMapping()) {
                if (flagToString.outputIf() == ((flagToString.mask() & i) == flagToString.equals())) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    if (z) {
                        sb.append(" | ");
                    }
                    sb.append(flagToString.name());
                    z = true;
                }
            }
            return z ? sb.toString() : NONE_MAPPING;
        }
        throw new IllegalStateException("Cannot map using this annotation");
    }

    private static String mapIntToStringUsingAnnotation(int i, ViewDebug.ExportedProperty exportedProperty) {
        if (canIntBeMappedToString(exportedProperty)) {
            for (ViewDebug.IntToString intToString : exportedProperty.mapping()) {
                if (intToString.from() == i) {
                    return intToString.to();
                }
            }
            return NONE_MAPPING;
        }
        throw new IllegalStateException("Cannot map using this annotation");
    }

    public View getViewAndBoundsForHighlighting(View view, Rect rect) {
        return view;
    }

    public ViewDescriptor(MethodInvoker methodInvoker) {
        this.mMethodInvoker = methodInvoker;
    }

    public Object getElementToHighlightAtPosition(View view, int i, int i2, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        return view;
    }

    public void onGetAttributes(View view, AttributeAccumulator attributeAccumulator) {
        String idAttribute = getIdAttribute(view);
        if (idAttribute != null) {
            attributeAccumulator.store("id", idAttribute);
        }
    }

    public void onGetComputedStyles(View view, ComputedStyleAccumulator computedStyleAccumulator) {
        computedStyleAccumulator.store("left", Integer.toString(view.getLeft()));
        computedStyleAccumulator.store("top", Integer.toString(view.getTop()));
        computedStyleAccumulator.store("right", Integer.toString(view.getRight()));
        computedStyleAccumulator.store("bottom", Integer.toString(view.getBottom()));
    }

    public String onGetNodeName(View view) {
        String name = view.getClass().getName();
        return StringUtil.removePrefix(name, "android.view.", StringUtil.removePrefix(name, "android.widget."));
    }

    public void onGetStyleRuleNames(View view, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        styleRuleNameAccumulator.store(VIEW_STYLE_RULE_NAME, false);
        if (sHasSupportNodeInfo) {
            styleRuleNameAccumulator.store(ACCESSIBILITY_STYLE_RULE_NAME, false);
        }
    }

    public void onGetStyles(View view, String str, StyleAccumulator styleAccumulator) {
        String str2 = str;
        if (VIEW_STYLE_RULE_NAME.equals(str2)) {
            List<ViewCSSProperty> viewProperties = getViewProperties();
            int size = viewProperties.size();
            for (int i = 0; i < size; i++) {
                ViewCSSProperty viewCSSProperty = viewProperties.get(i);
                try {
                    try {
                        getStyleFromValue(view, viewCSSProperty.getCSSName(), viewCSSProperty.getValue(view), viewCSSProperty.getAnnotation(), styleAccumulator);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    View view2 = view;
                    if ((e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                        StringBuilder h = C0072d.m201h("failed to get style property ");
                        h.append(viewCSSProperty.getCSSName());
                        h.append(" of element= ");
                        h.append(view.toString());
                        LogUtil.m20239e((Throwable) e, h.toString());
                    } else {
                        throw ExceptionUtil.propagate(e);
                    }
                }
            }
            return;
        }
        View view3 = view;
        if (ACCESSIBILITY_STYLE_RULE_NAME.equals(str2) && sHasSupportNodeInfo) {
            boolean ignored = AccessibilityNodeInfoWrapper.getIgnored(view);
            getStyleFromValue(view, "ignored", Boolean.valueOf(ignored), (ViewDebug.ExportedProperty) null, styleAccumulator);
            if (ignored) {
                getStyleFromValue(view, "ignored-reasons", AccessibilityNodeInfoWrapper.getIgnoredReasons(view), (ViewDebug.ExportedProperty) null, styleAccumulator);
            }
            getStyleFromValue(view, "focusable", Boolean.valueOf(!ignored), (ViewDebug.ExportedProperty) null, styleAccumulator);
            if (!ignored) {
                View view4 = view;
                StyleAccumulator styleAccumulator2 = styleAccumulator;
                getStyleFromValue(view4, "focusable-reasons", AccessibilityNodeInfoWrapper.getFocusableReasons(view), (ViewDebug.ExportedProperty) null, styleAccumulator2);
                getStyleFromValue(view4, "focused", Boolean.valueOf(AccessibilityNodeInfoWrapper.getIsAccessibilityFocused(view)), (ViewDebug.ExportedProperty) null, styleAccumulator2);
                getStyleFromValue(view4, "description", AccessibilityNodeInfoWrapper.getDescription(view), (ViewDebug.ExportedProperty) null, styleAccumulator2);
                getStyleFromValue(view4, ResponseConstants.ACTIONS, AccessibilityNodeInfoWrapper.getActions(view), (ViewDebug.ExportedProperty) null, styleAccumulator2);
            }
        }
    }

    public void onSetAttributesAsText(View view, String str) {
        for (Map.Entry next : Descriptor.parseSetAttributesAsTextArg(str).entrySet()) {
            StringBuilder h = C0072d.m201h("set");
            h.append(capitalize((String) next.getKey()));
            this.mMethodInvoker.invoke(view, h.toString(), (String) next.getValue());
        }
    }
}
