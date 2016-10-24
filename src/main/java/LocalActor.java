import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.UntypedActor;

/**
 * Created by chenhao on 2016/10/24.
 */
public class LocalActor extends UntypedActor {

    int count = 0;
    ActorSelection remote = context().actorSelection("akka.tcp://RemoteSystem@127.0.0.1:5050/user/RemoteActor");

    @Override
    public void onReceive(Object message) throws Exception {

        if (message instanceof String) {
            String m = (String) message;

            if (m.startsWith("local")) {
                remote.tell("hello i am from local", getSelf());
                System.out.println(m);
            } else {
                if (count < 5) {
                    remote.tell("hello back to you"+count, getSelf());
                    count++;
                    System.out.println(m);
                }
            }
        }
    }
}
