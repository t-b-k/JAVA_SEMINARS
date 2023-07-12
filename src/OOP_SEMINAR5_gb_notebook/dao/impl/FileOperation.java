package OOP_SEMINAR5_gb_notebook.dao.impl;

import OOP_SEMINAR5_gb_notebook.dao.Operation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperation implements Operation<String> {
    private final String fileName;

    public FileOperation(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //ñîçäàåì îáúåêò FileReader äëÿ îáúåêòà File
            FileReader fr = new FileReader(file);
            //ñîçäàåì BufferedReader ñ ñóùåñòâóþùåãî FileReader äëÿ ïîñòðî÷íîãî ñ÷èòûâàíèÿ
            BufferedReader reader = new BufferedReader(fr);
            // ñ÷èòàåì ñíà÷àëà ïåðâóþ ñòðîêó
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // ñ÷èòûâàåì îñòàëüíûå ñòðîêè â öèêëå
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : data) {
                // çàïèñü âñåé ñòðîêè
                writer.write(line);
                // çàïèñü ïî ñèìâîëàì
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
