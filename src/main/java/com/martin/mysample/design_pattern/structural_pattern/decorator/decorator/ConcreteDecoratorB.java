package com.martin.mysample.design_pattern.structural_pattern.decorator.decorator;

import com.martin.mysample.design_pattern.structural_pattern.decorator.component.Component;

public class ConcreteDecoratorB extends Decorator {

    private Integer addedState = 0;

    public ConcreteDecoratorB(Component component, String name) {
        super(component, name);
    }

    @Override
    public void operate() {
        addedBehavior();
    }

    public void addedBehavior() {
        component.operate();
        addedState += 2;
        System.out.println("addedState = " + addedState);
    }
}