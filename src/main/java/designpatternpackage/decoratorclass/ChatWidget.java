package designpatternpackage.decoratorclass;

public class ChatWidget extends WidgetDecorator {
    int chatWidget = 30;

    public ChatWidget(WebPage widgetDecorator) {
        super(widgetDecorator);
    }

    @Override
    public int rank() {
        System.out.println("The chat widget rank is " + chatWidget);
        return chatWidget;
    }
}