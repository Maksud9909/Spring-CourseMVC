package com.maksudrustamov.spring.mvc.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // тут говорится, для чего мы будем использовать данную аннотацию, здесь написано для полей(переменных)
@Retention(RetentionPolicy.RUNTIME) // здесь говорится о том, что аннотация должна работать вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class) //именно этот класс будет обрабатывать нашу аннотацию, именно в этом классе будет вся бизнес логика данной аннотции
public @interface CheckEmail {
    public String value() default "xyz.com"; // по дефолтному значению мы написали, то что будет xyz.com
    public String message() default "email must ends with xyz.com"; // это сообщение будет выходить, если сообщение не будет оканчиваться на это


    public Class<?>[] groups() default {}; // помогает программистам разбивать аннотации по группам
    public Class<? extends Payload> [] payload() default {}; // он помогает переносом мета данных клиента
}
