import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.PixelFormat;


public class test {
	public void start() throws LWJGLException{
		Display.setDisplayMode(new DisplayMode(800, 600));
		Display.create(new PixelFormat());
		initGL();
		while(!Display.isCloseRequested()){
		
			
			Display.update();Display.sync(60);
		}
	}
	
	public void display(){
		glBegin(GL_QUADS);
		glVertex2d(200, 200);
		glVertex2d(400, 200);
		glVertex2d(400, 400);
		glVertex2d(200, 400);
		glEnd();
	}
	
	public void initGL(){
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 800, 0, 600, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glViewport(0, 0, 800, 600);
	}
	
	public static void main(String[] args){
		test tst = new test();
		try {
			tst.start();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
