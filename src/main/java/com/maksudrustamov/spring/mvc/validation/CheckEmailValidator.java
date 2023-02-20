package com.maksudrustamov.spring.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


// здесь нужно обязательно имплементировать ConstraintValidator и внутри написать название аннотации и ее тип данных, также ввести эти два метода
public class CheckEmailValidator implements ConstraintValidator<CheckEmail,String> {


    private String endOfEmail; // эта переменная будет содержать хвост нашего имела

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value(); // мы придали значение конца email
        //ConstraintValidator.super.initialize(checkEmail);
    }




    // именно здесь будет проходить проверка нашего бизнес правила
    // здесь мы можем совершить проверку
    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOfEmail); // мы здесь проверили оканчивается ли наш введеный имейл на то, что мы прописали в value
    }
}
