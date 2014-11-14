package luis.isaula.mi.bosquejo;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo extends Image{
	
	public Enemigo (Texture tex){
		super(tex);
		addListener(new EnemigoInput(this));
	}
	
	@Override
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX() + 1);
		
	}
}
