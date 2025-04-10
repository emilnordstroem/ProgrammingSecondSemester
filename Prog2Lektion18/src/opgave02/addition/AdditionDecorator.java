package opgave02.addition;

import opgave02.component.AlgorithmComponent;

public abstract class AdditionDecorator extends AlgorithmComponent {
    private final AlgorithmComponent component;
    protected AdditionDecorator(AlgorithmComponent component){
        this.component = component;
    }
    public AlgorithmComponent getComponent() {
        return component;
    }
}
