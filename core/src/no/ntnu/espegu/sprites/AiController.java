package no.ntnu.espegu.sprites;

import no.ntnu.espegu.CurrentDirectionY;

public class AiController extends Controller {

    public AiController(float x, float y) {
        super(x, y);
    }

    @Override
    public void update(Sprite... siblings) {
        Ball ball = null;

        for (Sprite sibling : siblings) {
            if (sibling instanceof Ball) {
                ball = (Ball) sibling;
                break;
            }
        }

        if (ball == null) {
            return;
        }

        if (ball.getCurrentDirectionY() == CurrentDirectionY.DOWN) {
            return;
        }

        if (ball.getX() > getX()) {
            setX(x + 25);
        } else if (ball.getX() < getX()) {
            setX(x - 25);
        }
    }
}
