package command;

	public class CurtainDownCommand implements Command {
		private Curtain curtain;
		public CurtainDownCommand(Curtain curtain) {
		this.curtain = curtain;
		}
		@Override // Command
		public void execute() {
		curtain.putDown();
		}
}
