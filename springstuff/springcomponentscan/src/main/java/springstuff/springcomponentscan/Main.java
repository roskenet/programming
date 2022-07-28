package springstuff.springcomponentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springstuff.beans.AppConfig;
import springstuff.beans.JugglerApp;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        appContext.getBean(JugglerApp.class).doSomething();
    }
}
