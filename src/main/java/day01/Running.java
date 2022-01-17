package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {

    List<RunningItem> runnings = new ArrayList<>();

    public void readRunningData(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            runnings = transformIntoRunning(lines);

        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }

    }

    public double filterRunnings(int year, int month) {
        double totalDistance = 0;
        for ( RunningItem actual: runnings) {
            if ( actual.getTimeOfRunning().getYear() == year && actual.getTimeOfRunning().getMonthValue() == month ) {
                totalDistance += actual.getDistance();
            }
        }
        return totalDistance;
    }

    private List<RunningItem> transformIntoRunning(List<String> lines) {
        List<RunningItem> result = new ArrayList<>();
        lines.remove(0);
        for (String actual: lines) {
            String[] tmp = actual.split(";");
            LocalDate tmpLocalDate = transformIntoLocalDate(tmp[1]);
            String tempdist = tmp[0].substring(0, tmp[0].length()-3);
            result.add(new RunningItem(Double.parseDouble(tempdist), tmpLocalDate));
        }
        return result;
    }

    private LocalDate transformIntoLocalDate(String date ) {
        String[] tmpDate = date.split("-");
        return LocalDate.of(Integer.parseInt(tmpDate[0]), Integer.parseInt(tmpDate[1]), Integer.parseInt(tmpDate[2]));
    }


    public static void main(String[] args) {
        Running run = new Running();
        run.readRunningData(Paths.get("src/test/resources/running.csv"));
        System.out.println("Teljes lefutott távolság: "+run.filterRunnings(2022, 01));
    }
}
