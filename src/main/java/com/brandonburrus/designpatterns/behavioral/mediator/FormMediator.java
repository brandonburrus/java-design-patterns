package com.brandonburrus.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class FormMediator {

    private final List<TextField> fields;
    private final List<Button> dependentButtons;
    private boolean dependentButtonsDisabled;

    public FormMediator() {
        this.fields = new ArrayList<>();
        this.dependentButtons = new ArrayList<>();
    }

    public FormMediator addFormField(TextField field) {
        this.fields.add(field);
        field.addInputChangedHandler(textContent -> {
            for (TextField textField : fields) {
                if (textField.getTextContent().isBlank()) {
                    setDependentButtonsDisabled(true);
                    return;
                }
            }
            setDependentButtonsDisabled(false);
        });
        if (field.getTextContent().isBlank()) {
            setDependentButtonsDisabled(true);
        }
        return this;
    }

    public FormMediator addButton(Button button) {
        this.dependentButtons.add(button);
        button.setDisabled(dependentButtonsDisabled);
        return this;
    }

    public boolean isDependentButtonsDisabled() {
        return dependentButtonsDisabled;
    }

    public FormMediator setDependentButtonsDisabled(boolean dependentButtonsDisabled) {
        this.dependentButtonsDisabled = dependentButtonsDisabled;
        for (Button dependentButton : dependentButtons) {
            dependentButton.setDisabled(dependentButtonsDisabled);
        }
        return this;
    }
}
