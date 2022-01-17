package day04;

//import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrainerProcesses {

    private List<TrainerAndLessons> allTrainerAndLessons;

    public void readFile(Path path) {
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
            allTrainerAndLessons = writeTrainerAndLessons(lines);

        } catch (IOException ioe) {
            throw new IllegalStateException("File is not available!", ioe);
        }
    }

    private List<TrainerAndLessons> writeTrainerAndLessons(List<String> lines)  {
        List<TrainerAndLessons> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i += 4) {

            if ( lines.get(i).isEmpty() || lines.get(i).isEmpty() || lines.get(i).isEmpty() || lines.get(i).isEmpty()) {
                throw new IllegalStateException("The lines cannot be empty!");
            }

            result.add(new TrainerAndLessons(lines.get(i), lines.get(i+1),
                    lines.get(i+2), Integer.parseInt(lines.get(i+3))));
        }
        return result;
    }

    public int countLessonsPerTrainer(String teacher )  {
        int result = 0;
        for ( TrainerAndLessons actual : allTrainerAndLessons) {
            if ( actual.getName().equals(teacher)) {
                result += actual.getNumberOfLessons();
                /*if (actual.getName().equals(teacher)) {
                    throw new EmptyLineException("Itt a tanár");
                }*/
                //System.out.println(actual.getName()+" "+actual.getNumberOfLessons());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TrainerProcesses trainerProcesses = new TrainerProcesses();
        trainerProcesses.readFile(Paths.get("src/test/resources/beosztas.txt"));
        System.out.println(trainerProcesses.countLessonsPerTrainer("Albatrosz Aladin"));
    }
}
