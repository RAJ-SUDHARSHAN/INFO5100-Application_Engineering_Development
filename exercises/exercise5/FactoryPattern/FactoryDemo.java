
public class FactoryDemo {

    public static void main(String[] args) {
        ProgramFactory programFactory = new ProgramFactory();

        // get an object of Management and call its register method.
        Program program1 = programFactory.getProgram("Management");

        // call register method of Management
        program1.register();

        // get an object of DataVisualization and call its register method.
        Program program2 = programFactory.getProgram("DataVisualization");

        // call register method of DataVisualization
        program2.register();

        // get an object of NeurolinguisticsProgramming and call its register method.
        Program program3 = programFactory.getProgram("NeurolinguisticsProgramming");

        // call register method of NeurolinguisticsProgramming
        program3.register();
    }
}
