package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class KnihaSluzba {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .build();
    private final List<Kniha> knihy;

    public KnihaSluzba() throws IOException {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            // var. a, jak udělat  knihy = Arrays.asList(objectMapper.readValue(inputStream, Kniha[].class));
            /* var b */
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {
            });
        }
    }

    public List<Kniha> nactiSeznamVsechKnih() {
        return knihy;
    }

    public List<Kniha> nactiAutora(String autor) {
        return knihy.stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .collect(Collectors.toList());
    }

    public List<Kniha> knihyVydaneVRoce(Integer rokVydani) {
        return knihy.stream()
                .filter(kniha -> kniha.getRokVydani().equals(rokVydani))
                .collect(Collectors.toList());
    }

}
