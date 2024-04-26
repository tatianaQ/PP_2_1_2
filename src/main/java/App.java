import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);


        //привет мир
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        //котики
        Cat cat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getCat());

        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getCat());

        // сравнение
        System.out.println(bean == bean2);
        System.out.println(cat == cat2);
    }
}