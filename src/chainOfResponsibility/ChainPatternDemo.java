package chainOfResponsibility;

public class ChainPatternDemo {
	
   private static AbstractRequester getChainOfRequesters(){

      AbstractRequester lowRequester = new LowRequester(AbstractRequester.LOW);
      AbstractRequester mediumRequester = new MediumRequester(AbstractRequester.MEDIUM);
      AbstractRequester highRequester = new HighRequester(AbstractRequester.HIGH);

      lowRequester.setNextRequester(mediumRequester);
      mediumRequester.setNextRequester(highRequester);

      return lowRequester;	
   }

   public static void main(String[] args) {
      AbstractRequester requesterChain = getChainOfRequesters();

      requesterChain.logMessage(AbstractRequester.LOW, 
         "2");

      requesterChain.logMessage(AbstractRequester.MEDIUM, 
         "4");

      requesterChain.logMessage(AbstractRequester.HIGH, 
         "8");
   }
}