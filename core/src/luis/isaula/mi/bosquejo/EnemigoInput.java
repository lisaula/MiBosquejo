package luis.isaula.mi.bosquejo;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener {
	Enemigo enemigo;
	
	public EnemigoInput(Enemigo enemigo){
		super();
		this.enemigo = enemigo;
	}
		@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer,
			int button) {
		System.out.println("Down");
		//Desaparecer enemigo
		enemigo.remove();
		
		return super.touchDown(event, x, y, pointer, button);
	}
}
