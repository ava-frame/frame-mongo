package com.ava.frame.mongo.annotation;

/**
 * 实体映射
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Table {
    String name();
}
