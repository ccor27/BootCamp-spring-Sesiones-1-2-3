import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Se crea el context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //obtenemos el bean saludo
        Saludo saludo = (Saludo) context.getBean("saludo");
        System.out.println(saludo.saludo());

        //obtenemos un bean de otro bean
        UserService userService = (UserService) context.getBean("userservice");
        System.out.println(userService.getNotificacionService().saludoNotificacionService());
    }
}
