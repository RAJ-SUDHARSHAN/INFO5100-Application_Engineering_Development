public class ProgramFactory {

   // use getProgram method to get object of type program
   public Program getProgram(String ProgramType) {
      if (ProgramType == null) {
         return null;
      }
      if (ProgramType.equalsIgnoreCase("Management")) {
         return new Management();
      } else if (ProgramType.equalsIgnoreCase("DataVisualization")) {
         return new DataVisualization();
      } else if (ProgramType.equalsIgnoreCase("NeurolinguisticsProgramming")) {
         return new NeurolinguisticsProgramming();
      }
      return null;
   }
}
