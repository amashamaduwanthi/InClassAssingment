package lk.ijse;

import lk.ijse.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
    }
}
