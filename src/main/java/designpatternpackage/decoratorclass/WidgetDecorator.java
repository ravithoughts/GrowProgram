package designpatternpackage.decoratorclass;

public abstract class WidgetDecorator implements WebPage {
    protected WebPage widgetDecorator;

    public WidgetDecorator(WebPage widgetDecorator) {
        this.widgetDecorator = widgetDecorator;
    }

    @Override
    public int rank() {
        return widgetDecorator.rank();
    }
}