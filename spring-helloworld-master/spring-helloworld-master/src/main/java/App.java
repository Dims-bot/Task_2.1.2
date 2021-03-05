import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        boolean comparisonHelloWorld = bean == bean1;
        boolean comparisonCats = cat == cat1;

        System.out.println(comparisonHelloWorld);
        System.out.println(comparisonCats);

        System.out.println(bean.getMessage());
    }
}