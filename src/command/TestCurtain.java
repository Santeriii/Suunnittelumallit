package command;

public class TestCurtain {
	public static void main(String[] args){
		Curtain curtain = new Curtain();
		Command putDown = new CurtainDownCommand(curtain);
		Command pullUp = new CurtainUpCommand(curtain);
		WallButton button1 = new WallButton(putDown);
		WallButton button2 = new WallButton(pullUp);
		button1.push();
		button2.push();
		}
}
