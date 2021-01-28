package com.brandonburrus.designpatterns.behavioral.mediator;

public class MediatorApp {

    public static void main(String[] args) {
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();

        Button confirmBtn = new Button("OK")
            .addEventHandler(() -> System.out.println("Form was submitted!"));

        new FormMediator()
            .addFormField(firstNameField)
            .addFormField(lastNameField)
            .addButton(confirmBtn);

        System.out.println("Btn is disabled {" + confirmBtn.isDisabled() + "} until form is filled out");
        confirmBtn.click();

        firstNameField.addToTextContent("Brandon");
        lastNameField.addToTextContent("Burrus");
        System.out.println(firstNameField.getTextContent());
        confirmBtn.click();
    }
}
