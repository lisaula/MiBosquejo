package luis.isaula.mi.bosquejo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PrincipalClass extends ApplicationAdapter {
	Texture img, img2;
	//Creando imagen
	Stage stag;
	int frame = 0;
	
	@Override
	public void create () {
		img = new Texture("casa.png");
		
		Image per = new Image(img);	
		Image p = new Image(new Texture("Moneda.png"));
		Image v = new Image(new Texture("Estrella.png"));
		
		per.setHeight(500);
		per.setWidth(650);
		
		p.setHeight(100); 
		p.setWidth(80);
		p.setX(0);
		
		v.setHeight(80);
		v.setWidth(100);
		v.setX(200);
		
		stag = new Stage();
		
		
		Gdx.input.setInputProcessor(stag);		
		stag.addActor(per);		
		stag.addActor(p);
		stag.addActor(v);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 5, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stag.draw();
		stag.act();
		
		if(frame % 15 == 0){
			agregarPersona();
		}
		frame++;		
		
	}
	
	
	public void agregarPersona(){
		img2 = new Texture("MultiStar.png");
		Enemigo ene = new Enemigo(img2);
		ene.setHeight(110);
		ene.setWidth(80);
		
		
		stag.addActor(ene);
		ene.setY(0);
		ene.setX(300 +1 );
	}
}
