package designpatternpackage.decoratorclass;

public class OnlineReviewWidget extends WidgetDecorator {
    int onlineWidget = 15;

    public OnlineReviewWidget(WebPage widgetDecorator) {
        super(widgetDecorator);
    }

    @Override
    public int rank() {
        System.out.println("The online widget rank is " + onlineWidget);
        return onlineWidget;
    }
}