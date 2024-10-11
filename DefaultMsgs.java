
import java.util.Random;

public class DefaultMsgs {

    public void defMsgs(MsgSystem def) {

        Random rand = new Random();

        for (int i = 0; i < def.recNo.length; i++) {

            for (int j = 0; j < 20; j++) {

                if (def.count[i] < def.myMsg[i].length) {

                    def.myMsg[i][j] = new Message(def.recNo[i][0], "Hello", rand.nextBoolean());
                    def.count[i]++;

                }

            }

        }

    }

}
