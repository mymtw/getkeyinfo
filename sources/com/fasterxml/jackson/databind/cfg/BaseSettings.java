package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class BaseSettings implements Serializable {
    private static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = 1;
    public final AnnotationIntrospector _annotationIntrospector;
    public final ClassIntrospector _classIntrospector;
    public final DateFormat _dateFormat;
    public final Base64Variant _defaultBase64;
    public final HandlerInstantiator _handlerInstantiator;
    public final Locale _locale;
    public final PropertyNamingStrategy _propertyNamingStrategy;
    public final TimeZone _timeZone;
    public final TypeFactory _typeFactory;
    public final TypeResolverBuilder<?> _typeResolverBuilder;
    public final PolymorphicTypeValidator _typeValidator;

    public BaseSettings(ClassIntrospector classIntrospector, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator) {
        this._classIntrospector = classIntrospector;
        this._annotationIntrospector = annotationIntrospector;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = typeResolverBuilder;
        this._dateFormat = dateFormat;
        this._handlerInstantiator = handlerInstantiator;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
        this._typeValidator = polymorphicTypeValidator;
    }

    private DateFormat _force(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof StdDateFormat) {
            return ((StdDateFormat) dateFormat).withTimeZone(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }

    public BaseSettings copy() {
        return new BaseSettings(this._classIntrospector.copy(), this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public Base64Variant getBase64Variant() {
        return this._defaultBase64;
    }

    public ClassIntrospector getClassIntrospector() {
        return this._classIntrospector;
    }

    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    public HandlerInstantiator getHandlerInstantiator() {
        return this._handlerInstantiator;
    }

    public Locale getLocale() {
        return this._locale;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._typeValidator;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this._timeZone;
        return timeZone == null ? DEFAULT_TIMEZONE : timeZone;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public TypeResolverBuilder<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    public boolean hasExplicitTimeZone() {
        return this._timeZone != null;
    }

    public BaseSettings with(Locale locale) {
        if (this._locale == locale) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        if (this._annotationIntrospector == annotationIntrospector) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(this._annotationIntrospector, annotationIntrospector));
    }

    public BaseSettings withClassIntrospector(ClassIntrospector classIntrospector) {
        if (this._classIntrospector == classIntrospector) {
            return this;
        }
        return new BaseSettings(classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withDateFormat(DateFormat dateFormat) {
        if (this._dateFormat == dateFormat) {
            return this;
        }
        if (dateFormat != null && hasExplicitTimeZone()) {
            dateFormat = _force(dateFormat, this._timeZone);
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        if (this._handlerInstantiator == handlerInstantiator) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationIntrospector, this._annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        if (this._propertyNamingStrategy == propertyNamingStrategy) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withTypeFactory(TypeFactory typeFactory) {
        if (this._typeFactory == typeFactory) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings withTypeResolverBuilder(TypeResolverBuilder<?> typeResolverBuilder) {
        if (this._typeResolverBuilder == typeResolverBuilder) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator);
    }

    public BaseSettings with(TimeZone timeZone) {
        if (timeZone == null) {
            throw new IllegalArgumentException();
        } else if (timeZone == this._timeZone) {
            return this;
        } else {
            return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, _force(this._dateFormat, timeZone), this._handlerInstantiator, this._locale, timeZone, this._defaultBase64, this._typeValidator);
        }
    }

    public BaseSettings with(Base64Variant base64Variant) {
        if (base64Variant == this._defaultBase64) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, base64Variant, this._typeValidator);
    }

    public BaseSettings with(PolymorphicTypeValidator polymorphicTypeValidator) {
        if (polymorphicTypeValidator == this._typeValidator) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, polymorphicTypeValidator);
    }

    @Deprecated
    public BaseSettings(ClassIntrospector classIntrospector, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator, Locale locale, TimeZone timeZone, Base64Variant base64Variant) {
        this(classIntrospector, annotationIntrospector, propertyNamingStrategy, typeFactory, typeResolverBuilder, dateFormat, handlerInstantiator, locale, timeZone, base64Variant, (PolymorphicTypeValidator) null);
    }
}
