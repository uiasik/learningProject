package all.SimpleStream;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleStream {
    List<String> streamList = new ArrayList<>();
    public void start(){
        generateStreamList();
        mapStream();
        filterStream();
        reduceStream();
    }

    private void generateStreamList() {
        streamList.add("lev");
        streamList.add("kiril");
        streamList.add("gustav");
        streamList.add("lyoha");
    }

    private void mapStream(){
        streamList.stream().map(String::length).forEach(System.out::println);
    }

    private void filterStream(){
        streamList.stream().filter(e -> !e.equals("lev")).forEach(System.out::println);
    }

    private void reduceStream(){
        String result = streamList.stream().reduce("pupupupu", (accumulator, e) -> accumulator + e.length());
        System.out.println(result);
    }
}
