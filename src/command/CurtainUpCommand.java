package command;

	public class CurtainUpCommand implements Command {
		private Curtain curtain;
		public CurtainUpCommand(Curtain curtain) {
		this.curtain = curtain;
		}
		@Override // Command
		public void execute() {
			curtain.pullUp();
		}
}
