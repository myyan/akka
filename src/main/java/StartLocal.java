import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

/**
 * Created by chenhao on 2016/10/24.
 */
public class StartLocal {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("LocalSystem", ConfigFactory.load());
        ActorRef local = system.actorOf(Props.create(LocalActor.class), "localActor");
        local.tell("local is start", ActorRef.noSender());
    }
}
